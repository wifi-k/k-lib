/**
 *
 */
package tbcloud.elastic.model;

import tbcloud.lib.api.util.GsonUtil;

import java.util.LinkedList;
import java.util.List;

/**
 * @author dzh
 * @date Oct 19, 2016 8:01:10 PM
 * @since 1.0
 */
public class ESIndexAlias extends ESObject {

    private List<String> index = new LinkedList<>();
    private String alias;
    private String index_routing;
    private String search_routing;

    public static final ESIndexAlias create() {
        return new ESIndexAlias();
    }

    public ESIndexAlias index(String index) {
        this.index.add(index);
        return this;
    }

    public ESIndexAlias alias(String alias) {
        this.alias = alias;
        return this;
    }

    public ESIndexAlias routing(String routing) {
        if (routing.equals("")) routing = null;

        this.index_routing = routing;
        this.search_routing = routing;
        return this;
    }

    public ESIndexAlias index_routing(String index_routing) {
        this.index_routing = index_routing;
        return this;
    }

    public ESIndexAlias search_routing(String search_routing) {
        this.search_routing = search_routing;
        return this;
    }

    /**
     * "{ \"add\" : { \"index\" : \"test1\", \"alias\" : \"alias2\"
     * ,\"index_routing\" : \"2\",\"search_routing\" : \"1\"} }"
     *
     * @param action
     *            add or remove
     * @return
     */
    public String toAction(String action) {
        return toAction(action, new StringBuilder(128)).toString();
    }

    public StringBuilder toAction(String action, StringBuilder buf) {
        buf.append("{\"").append(action).append("\":");
        toJson(buf);
        buf.append("}");
        return buf;
    }

    @Override
    public String toString() {
        return toJson();
    }

    private StringBuilder toJson(StringBuilder buf) {
        buf.append("{\"index\": ").append(GsonUtil.toJson(getIndex())).append(", \"alias\": \"").append(alias);
        if (search_routing != null && !"".equals(search_routing))
            buf.append("\",\"search_routing\" : \"").append(search_routing);
        if (index_routing != null && !"".equals(index_routing))
            buf.append("\",\"index_routing\" : \"").append(index_routing);
        return buf.append("\"}");
    }

    public List<String> getIndex() {
        return index;
    }

    public String getAlias() {
        return alias;
    }

    public String getIndex_routing() {
        return index_routing;
    }

    public String getSearch_routing() {
        return search_routing;
    }

    @Deprecated
    public static final class Actions {

        private StringBuilder buf;

        private Actions() {
        }

        public static Actions start(int size) {
            StringBuilder buf = new StringBuilder(size);
            buf.append("{\"actions\" : [");

            Actions actions = new Actions();
            actions.buf = buf;
            return actions;
        }

        public Actions first(String action, ESIndexAlias alias) {
            return action(action, alias);
        }

        private Actions comma() {
            buf.append(",");
            return this;
        }

        public Actions next(String action, ESIndexAlias alias) {
            return comma().action(action, alias);
        }

        public String end() {
            buf.append("]}");
            return buf.toString();
        }

        private Actions action(String action, ESIndexAlias alias) {
            alias.toAction(action, buf);
            return this;
        }
    }

}
