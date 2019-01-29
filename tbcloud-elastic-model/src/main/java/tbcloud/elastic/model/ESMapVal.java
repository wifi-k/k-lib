/**
 *
 */
package tbcloud.elastic.model;

import java.util.HashMap;

/**
 * @author dzh
 * @date Oct 24, 2016 6:34:36 PM
 * @since 1.0
 */
public class ESMapVal extends HashMap<String, Object> {

    /**
     *
     */
    private static final long serialVersionUID = -8324516633548251002L;

    private ESMapVal(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    private ESMapVal() {
        super();
    }

    public static ESMapVal create(int initialCapacity, float loadFactor) {
        ESMapVal pair = new ESMapVal(initialCapacity, loadFactor);
        return pair;
    }

    public static ESMapVal create() {
        ESMapVal pair = new ESMapVal();
        return pair;
    }

    public ESMapVal append(String key, Object value) {
        put(key, value);
        return this;
    }

}
