/**
 *
 */
package tbcloud.elastic.model;

import org.elasticsearch.client.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tbcloud.elastic.model.client.ESClient;

import java.io.IOException;

/**
 * <pre>
 * while(context.hasNext()){
 *     SearchScroll<T> scroll = context.current
 * 	   ...
 *     context.next()
 * }
 * context.close()
 * </pre>
 *
 * @author dzh
 * @date Oct 20, 2016 3:41:44 PM
 * @since 1.0
 */
public abstract class SearchScrollContext<T> {

    static Logger LOG = LoggerFactory.getLogger(SearchScrollContext.class);

    @SuppressWarnings("rawtypes")
    private static final SearchScrollContext NIL = new SearchScrollContext() {

        public boolean hasNext() {
            return false;
        }

        @Override
        public ESSearchResult consumeRespose(String json) {
            return null;
        }
    };

    @SuppressWarnings("unchecked")
    public static final <E> SearchScrollContext<E> emptyContext() {
        return NIL;
    }

    private SearchScroll<T> current;

    private long total;

    private ESClient client;

    public SearchScroll<T> next() throws IOException {
        if (current == null) return null;

        SearchScroll<T> prev = current;
        try {
            Response r = client.httpReq("GET", "/_search/scroll", null, prev.toString());
            if (client.isSuccess(r)) {
                ESSearchResult<T> result = consumeRespose(client.consumeResponse(r));
                SearchScroll<T> cur = new SearchScroll<T>();
                cur.scroll(prev.getScroll()).result(result);
                current = cur;

                return current;
            }
        } catch (Exception e) {
            LOG.error("", e);
            throw new IOException(e);
        }
        close();
        return null;
    }

    public boolean hasNext() {
        return !(current == null || current.isEmpty());
    }

    /**
     * clear scroll_id
     */
    public void close() {
        if (current != null) try {
            client.deleteScroll(current.getScroll_id());
            current = null;
            client = null;
        } catch (IOException e) {
            LOG.error("", e);
        }
    }

    public SearchScrollContext<T> current(SearchScroll<T> scroll) {
        this.current = scroll;
        return this;
    }

    public SearchScrollContext<T> total(long total) {
        this.total = total;
        return this;
    }

    public SearchScroll<T> getCurrent() {
        return current;
    }

    public long getTotal() {
        return total;
    }

    public void setClient(ESClient client) {
        this.client = client;
    }

    public abstract ESSearchResult<T> consumeRespose(String json);

    // public ESSearchResult<T> consumeRespose(String json) {
    // return ESSearchResult.<ESSearchResult<T>>fromJson(json, new
    // TypeToken<ESSearchResult<T>>() {
    // }.getType());
    // }

}
