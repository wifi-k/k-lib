package tbcloud.node.protocol.data;

import tbcloud.node.protocol.util.GsonUtil;

/**
 * @author dzh
 * @date 2018-11-26 10:14
 */
public class Data {

    @Override
    public String toString() {
        return GsonUtil.toJson(this);
    }
}
