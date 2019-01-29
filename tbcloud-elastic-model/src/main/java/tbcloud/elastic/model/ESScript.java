/**
 *
 */
package tbcloud.elastic.model;

/**
 * @author dzh
 * @date Oct 21, 2016 4:53:07 PM
 * @since 1.0
 */
public class ESScript extends ESObject {

    String lang;

    String inline;

    ESMapVal params;

    public static final ESScript create(String script) {
        ESScript obj = new ESScript();
        obj.inline = script;
        return obj;
    }

    public static final ESScript create() {
        return new ESScript();
    }

    public ESScript lang(String lang) {
        this.lang = lang;
        return this;
    }

    public ESScript inline(String script) {
        this.inline = script;
        return this;
    }

    public ESScript addParam(String key, Object val) {
        if (params == null) {
            this.params = ESMapVal.create();
        }
        params.append(key, val);
        return this;
    }

}
