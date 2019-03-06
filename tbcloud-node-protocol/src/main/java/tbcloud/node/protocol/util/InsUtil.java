package tbcloud.node.protocol.util;

import tbcloud.node.protocol.data.ins.FirmwareUpgrade;
import tbcloud.node.protocol.data.ins.HttpProxy;
import tbcloud.node.protocol.data.ins.Ins;
import tbcloud.node.protocol.data.ins.InsVal;

/**
 * @author dzh
 * @date 2018-11-30 00:28
 */
public class InsUtil {

    public static final <T extends InsVal> T decodeVal(int ins, String val) {
        switch (ins) {
            case Ins.INS_HTTPPROXY:
                return (T) GsonUtil.fromJson(val, HttpProxy.class);
            case Ins.INS_FIRMWAREUPGRADE:
                return (T) GsonUtil.fromJson(val, FirmwareUpgrade.class);
        }
        throw new IllegalArgumentException("not found rsp:" + ins);
    }

}
