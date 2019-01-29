/**
 *
 */
package tbcloud.elastic.model;

import java.util.Arrays;
import java.util.List;

/**
 * @author dzh
 * @date Oct 25, 2016 1:03:44 AM
 * @since 1.0
 */
public class ESOr extends ESObject {

    List<ESObject> or;

    public static final ESOr create(ESObject... obj) {
        ESOr or = new ESOr();
        or.or = Arrays.asList(obj);
        return or;
    }

}
