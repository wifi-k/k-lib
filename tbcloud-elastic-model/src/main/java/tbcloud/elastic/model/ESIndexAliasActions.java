/**
 *
 */
package tbcloud.elastic.model;

import java.util.LinkedList;
import java.util.List;

/**
 * @author dzh
 * @date Oct 21, 2016 7:16:29 PM
 * @since 1.0
 */
public class ESIndexAliasActions extends ESObject {

    List<ESPairVal> actions;

    public static final ESIndexAliasActions create(ESPairVal... actions) {
        ESIndexAliasActions obj = new ESIndexAliasActions();
        obj.actions = new LinkedList<ESPairVal>();
        for (ESPairVal val : actions) {
            obj.actions.add(val);
        }
        return obj;
    }

    public ESIndexAliasActions addIndexAlias(ESIndexAlias alias) {
        appendAlias("add", alias);
        return this;
    }

    public ESIndexAliasActions removeIndexAlias(ESIndexAlias alias) {
        appendAlias("remove", alias);
        return this;
    }

    public ESIndexAliasActions appendAlias(String action, ESIndexAlias alias) {
        if (actions == null) {
            actions = new LinkedList<ESPairVal>();
        }
        actions.add(ESPairVal.create(action, alias));
        return this;
    }

}
