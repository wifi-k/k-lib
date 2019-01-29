/**
 *
 */
package tbcloud.elastic.model;

import java.util.Map;

/**
 * @author dzh
 * @date Oct 20, 2016 8:02:47 PM
 * @since 1.0
 */
public class ESSearchResult<T> extends ESObject {

    private Long took;
    private Boolean timed_out;
    private Map<String, Object> _shards;
    private ESHits<T> hits;

    private String _scroll_id;

    public String get_scroll_id() {
        return _scroll_id;
    }

    public void set_scroll_id(String _scroll_id) {
        this._scroll_id = _scroll_id;
    }

    public long getTook() {
        return took;
    }

    public void setTook(long took) {
        this.took = took;
    }

    public boolean isTimed_out() {
        return timed_out;
    }

    public void setTimed_out(boolean timed_out) {
        this.timed_out = timed_out;
    }

    public Map<String, Object> get_shards() {
        return _shards;
    }

    public void set_shards(Map<String, Object> _shards) {
        this._shards = _shards;
    }

    public ESHits<T> getHits() {
        return hits;
    }

    public void setHits(ESHits<T> hits) {
        this.hits = hits;
    }

}
