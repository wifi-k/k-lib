/**
 * 
 */
package tbcloud.elastic.model;

/**
 * @author dzh
 * @date Oct 25, 2016 12:59:14 AM
 * @since 1.0
 */
public class ESMissing extends ESObject {

	ESPairVal missing;

	public static final ESMissing create(String field) {
		ESMissing m = new ESMissing();
		m.missing = ESPairVal.create("field", field);
		return m;
	}

}
