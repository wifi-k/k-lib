/**
 *
 */
package tbcloud.elastic.model;

import java.util.List;

/**
 * @author dzh
 * @date Oct 21, 2016 1:32:02 PM
 * @since 1.0
 */
public class ESSource extends ESObject {

    List<String> include;

    List<String> exclude;

    public ESSource include(List<String> include) {
        this.include = include;
        return this;
    }

    public ESSource exclude(List<String> exclude) {
        this.exclude = exclude;
        return this;
    }

    public static final ESSource create(List<String> include) {
        ESSource source = create();
        source.include = include;
        return source;
    }

    public static final ESSource create() {
        return new ESSource();
    }

}
