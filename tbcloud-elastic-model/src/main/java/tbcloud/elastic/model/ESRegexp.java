/**
 *
 */
package tbcloud.elastic.model;

/**
 * @author dzh
 * @date Oct 21, 2016 2:22:07 PM
 * @since 1.0
 */
public class ESRegexp extends ESObject {

    ESPairVal regexp;

    public ESRegexp regexp(ESPairVal regexp) {
        this.regexp = regexp;
        return this;
    }

    public static ESRegexp create(ESPairVal pair) {
        ESRegexp regexp = new ESRegexp();
        regexp.regexp = pair;
        return regexp;
    }

}
