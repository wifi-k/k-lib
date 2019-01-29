/**
 *
 */
package tbcloud.elastic.model;

/**
 * @author dzh
 * @date Oct 21, 2016 1:40:41 PM
 * @since 1.0
 */
public class ESTerm extends ESObject {

    public ESPairVal term;

    public static final ESTerm create(String key, Object val) {
        ESTerm t = new ESTerm();
        t.term = ESPairVal.create(key, val);
        return t;
    }

}
