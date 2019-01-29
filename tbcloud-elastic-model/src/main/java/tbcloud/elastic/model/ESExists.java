/**
 * 
 */
package tbcloud.elastic.model;

/**
 * @author dzh
 * @date Oct 21, 2016 2:19:07 PM
 * @since 1.0
 */
public class ESExists extends ESObject {

	public ESPairVal exists;

	public ESExists exists(ESPairVal exists) {
		this.exists = exists;
		return this;
	}

	public static ESExists create(String key, Object val) {
		ESExists exists = new ESExists();
		exists.exists = ESPairVal.create(key, val);
		return exists;
	}

}
