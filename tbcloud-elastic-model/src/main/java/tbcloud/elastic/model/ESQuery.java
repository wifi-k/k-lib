/**
 *
 */
package tbcloud.elastic.model;

/**
 * @author dzh
 * @date Oct 21, 2016 1:35:35 PM
 * @since 1.0
 */
public class ESQuery extends ESObject {

    Object bool;

    Object terms;

    Object term;

    public ESQuery bool(Object bool) {
        this.bool = bool;
        return this;
    }

    public static final ESQuery create() {
        return new ESQuery();
    }

    public ESQuery terms(Object terms) {
        this.terms = terms;
        return this;
    }

    public ESQuery term(Object term) {
        this.term = term;
        return this;
    }

}
