/**
 *
 */
package tbcloud.elastic.model;

import java.util.Collection;
import java.util.Collections;

/**
 * @author dzh
 * @date Oct 24, 2016 7:58:36 PM
 * @since 1.0
 */
public class ESTerms extends ESObject {

    public ESPairVal terms;

    public static final ESTerms create(String key, Collection<?> val) {
        ESTerms t = new ESTerms();
        val = val == null ? Collections.emptyList() : val;
        t.terms = ESPairVal.create(key, val);
        return t;
    }

}
