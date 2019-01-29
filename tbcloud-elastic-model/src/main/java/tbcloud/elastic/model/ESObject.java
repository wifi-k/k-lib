/**
 *
 */
package tbcloud.elastic.model;

import tbcloud.lib.api.util.GsonUtil;

import java.lang.reflect.Type;

/**
 * @author dzh
 * @date Oct 20, 2016 1:52:53 AM
 * @since 1.0
 */
public class ESObject implements Fields {

    public String toJson() {
        return GsonUtil.toJson(this);
    }

    public static <T> T fromJson(String json, Type type) {
        if (json == null) return null;
        return GsonUtil.fromJson(json, type);
    }

    public static <T> T fromJson(String json, Class<T> type) {
        if (json == null) return null;
        return GsonUtil.fromJson(json, type);
    }

}
