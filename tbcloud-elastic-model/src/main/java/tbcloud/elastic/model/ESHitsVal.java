/**
 * 
 */
package tbcloud.elastic.model;

/**
 * @author dzh
 * @date Oct 20, 2016 8:06:45 PM
 * @since 1.0
 */
public class ESHitsVal<T> extends ESObject {

	private String _index;
	private String _type;
	private String _id;
	private Double _score;
	private T _source;
	private Boolean found;

	public Boolean getFound() {
		return found;
	}

	public void setFound(Boolean found) {
		this.found = found;
	}

	public String get_index() {
		return _index;
	}

	public void set_index(String _index) {
		this._index = _index;
	}

	public String get_type() {
		return _type;
	}

	public void set_type(String _type) {
		this._type = _type;
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public Double get_score() {
		return _score;
	}

	public void set_score(Double _score) {
		this._score = _score;
	}

	public T get_source() {
		return _source;
	}

	public void set_source(T _source) {
		this._source = _source;
	}

}
