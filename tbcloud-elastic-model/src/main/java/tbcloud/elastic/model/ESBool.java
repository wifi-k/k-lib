/**
 *
 */
package tbcloud.elastic.model;

/**
 * @author dzh
 * @date Oct 21, 2016 1:37:29 PM
 * @since 1.0
 */
public class ESBool extends ESObject {

    public Object should;

    public Object must;

    public Object must_not;

    public Object filter;

    public ESBool should(Object should) {
        this.should = should;
        return this;
    }

    public ESBool must(Object must) {
        this.must = must;
        return this;
    }

    public ESBool must_not(Object must_not) {
        this.must_not = must_not;
        return this;
    }

    public static final ESBool create() {
        return new ESBool();
    }

    public ESBool filter(Object filter) {
        this.filter = filter;
        return this;
    }

}
