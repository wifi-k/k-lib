package tbcloud.node.protocol.util;

import tbcloud.node.protocol.data.rsp.Ins;
import tbcloud.node.protocol.data.rsp.HttpProxy;
import tbcloud.node.protocol.data.rsp.InsVal;

/**
 * @author dzh
 * @date 2018-11-30 00:28
 */
public class InsUtil {

    public static final <T extends InsVal> T decodeVal(int ins, String val) {
        if (ins == Ins.INS_HTTPPROXY) {
            return (T) GsonUtil.fromJson(val, HttpProxy.class);
        }
        throw new IllegalArgumentException("not found rsp:" + ins);
    }

}