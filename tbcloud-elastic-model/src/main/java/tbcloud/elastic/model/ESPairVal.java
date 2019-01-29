/**
 * 
 */
package tbcloud.elastic.model;

import java.util.HashMap;

/**
 * @author dzh
 * @date Oct 21, 2016 2:24:43 PM
 * @since 1.0
 */
public class ESPairVal extends HashMap<String, Object> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ESPairVal() {
		super(1, 1);
	}

	public static ESPairVal create(String key, Object val) {
		ESPairVal pair = new ESPairVal();
		pair.put(key, val);
		return pair;
	}

	public String getPairKey() {
		return entrySet().iterator().next().getKey();
	}

	public Object getPairVal() {
		return entrySet().iterator().next().getValue();
	}

}
