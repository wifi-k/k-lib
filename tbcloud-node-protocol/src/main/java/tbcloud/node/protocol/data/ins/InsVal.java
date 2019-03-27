package tbcloud.node.protocol.data.ins;

import tbcloud.node.protocol.util.GsonUtil;

/**
 * @author dzh
 * @date 2018-11-30 00:26
 */
public class InsVal {

    public static final int OP_ENABLE = 1;
    public static final int OP_DISABLE = 0;

    @Override
    public String toString() {
        return GsonUtil.toJson(this);
    }
}
