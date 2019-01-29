/**
 *
 */
package tbcloud.elastic.model;

import java.util.Arrays;
import java.util.List;

/**
 * {"_source":["mobile","city"],"query":{"bool":{"should":[{"term":{"mobile":"18616020610"}},{"term":{"mobile":"18616020611"}}]}}}
 *
 * @author dzh
 * @date Oct 21, 2016 1:27:54 PM
 * @since 1.0
 */
public class SearchBuilder extends ESObject {

    Object _source;

    Integer from;

    Integer size;

    Object query;

    Object script;

    Object upsert;

    Object doc;

    Boolean doc_as_upsert;

    List<?> sort;

    List<Object> search_after;

    public static final SearchBuilder create() {
        return new SearchBuilder();
    }

    public SearchBuilder doc(Object doc) {
        this.doc = doc;
        return this;
    }

    public SearchBuilder doc_as_upsert(boolean upsert) {
        this.doc_as_upsert = upsert;
        return this;
    }

    public SearchBuilder sort(List<?> sort) {
        this.sort = sort;
        return this;
    }

    public SearchBuilder source(Object source) {
        _source = source;
        return this;
    }

    public SearchBuilder upsert(Object upsert) {
        this.upsert = upsert;
        return this;
    }

    public SearchBuilder query(Object query) {
        this.query = query;
        if (sort == null) {
            sort = Arrays.asList("_doc");
        }
        return this;
    }

    public SearchBuilder from(Integer from) {
        this.from = from;
        return this;
    }

    public SearchBuilder size(Integer size) {
        this.size = size;
        return this;
    }

    public SearchBuilder script(Object script) {
        this.script = script;
        return this;
    }

    public SearchBuilder searchAfter(List<Object> searchAfter) {
        this.search_after = searchAfter;
        return this;
    }

}
