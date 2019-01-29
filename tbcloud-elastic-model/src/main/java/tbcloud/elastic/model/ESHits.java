/**
 * 
 */
package tbcloud.elastic.model;

import java.util.List;

/**
 * @author dzh
 * @date Oct 20, 2016 8:05:04 PM
 * @since 1.0
 */
public class ESHits<T> extends ESObject {

	private Integer total;
	private Double max_score;
	private List<ESHitsVal<T>> hits;

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Double getMax_score() {
		return max_score;
	}

	public void setMax_score(Double max_score) {
		this.max_score = max_score;
	}

	public List<ESHitsVal<T>> getHits() {
		return hits;
	}

	public void setHits(List<ESHitsVal<T>> hits) {
		this.hits = hits;
	}

}
