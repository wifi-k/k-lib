/**
 *
 */
package tbcloud.elastic.model;

/**
 * @author dzh
 * @date Oct 20, 2016 2:04:11 AM
 * @since 1.0
 */
public class JsonBuilder {

    private StringBuilder buf;

    private JsonBuilder() {
    }

    public static final JsonBuilder start(int size) {
        StringBuilder buf = new StringBuilder(size);
        buf.append("{");

        JsonBuilder json = new JsonBuilder();
        json.buf = buf;
        return json;
    }

    public JsonBuilder append(String str) {
        buf.append(str);
        return this;
    }

    public JsonBuilder append(long l) {
        buf.append(l);
        return this;
    }

    public JsonBuilder append(int i) {
        buf.append(i);
        return this;
    }

    public String end() {
        buf.append("}");
        return buf.toString();
    }

    public static JsonBuilder start() {
        return start(32);
    }

    public static final String toJson(int size, String... str) {
        StringBuilder buf = new StringBuilder(size);
        for (String s : str) {
            buf.append(s);
        }
        return buf.toString();
    }

}
