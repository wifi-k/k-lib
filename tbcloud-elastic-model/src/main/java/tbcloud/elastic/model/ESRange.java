/**
 *
 */
package tbcloud.elastic.model;

/**
 * @author dzh
 * @date Oct 24, 2016 6:29:58 PM
 * @since 1.0
 */
public class ESRange extends ESObject {

    private ESPairVal range;

    public static final ESRange create(String field) {
        ESRange range = new ESRange();
        range.range = ESPairVal.create(field, ESMapVal.create());
        return range;
    }

    public ESRange gte(Object val) {
        ((ESMapVal) range.getPairVal()).append("gte", val);
        return this;
    }

    public ESRange gt(Object val) {
        ((ESMapVal) range.getPairVal()).append("gt", val);
        return this;
    }

    public ESRange lte(Object val) {
        ((ESMapVal) range.getPairVal()).append("lte", val);
        return this;
    }

    public ESRange lt(Object val) {
        ((ESMapVal) range.getPairVal()).append("lt", val);
        return this;
    }

    public ESRange boost(Object val) {
        ((ESMapVal) range.getPairVal()).append("boost", val);
        return this;
    }

    public ESRange format(Object val) {
        ((ESMapVal) range.getPairVal()).append("format", val);
        return this;
    }

}
