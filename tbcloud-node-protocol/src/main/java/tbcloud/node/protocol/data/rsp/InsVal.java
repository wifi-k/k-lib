package tbcloud.node.protocol.data.rsp;

import tbcloud.node.protocol.util.GsonUtil;

/**
 * @author dzh
 * @date 2018-11-30 00:26
 */
public class InsVal {

    @Override
    public String toString() {
        return GsonUtil.toJson(this);
    }
}
