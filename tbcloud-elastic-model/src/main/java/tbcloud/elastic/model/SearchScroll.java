/**
 *
 */
package tbcloud.elastic.model;

/**
 * @author dzh
 * @date Oct 20, 2016 3:17:52 PM
 * @since 1.0
 */
public class SearchScroll<T> extends ESObject {

    /**
     * 1m
     */
    private String scroll = "1m";

    private ESSearchResult<T> result;

    // private SearchScroll<T> prev;

    public boolean isEmpty() {
        return result == null || result.getHits() == null || result.getHits().getHits() == null || result.getHits().getHits().isEmpty();
    }

    // public SearchScroll<T> prev(SearchScroll<T> prev) {
    // this.prev = prev;
    // return this;
    // }
    // public SearchScroll<T> getPrev() {
    // return prev;
    // }

    public SearchScroll<T> scroll(String scroll) {
        this.scroll = scroll;
        return this;
    }

    public SearchScroll<T> result(ESSearchResult<T> result) {
        this.result = result;
        return this;
    }

    public String getScroll() {
        return scroll;
    }

    public String getScroll_id() {
        return result.get_scroll_id();
    }

    public ESSearchResult<T> getResult() {
        return result;
    }

    @Override
    public String toString() {
        return toJson(new StringBuilder(72)).toString();
    }

    private StringBuilder toJson(StringBuilder buf) {
        return buf.append("{\"scroll\":\"").append(scroll).append("\",\"scroll_id\":\"").append(getScroll_id()).append("\"}");
    }

}
