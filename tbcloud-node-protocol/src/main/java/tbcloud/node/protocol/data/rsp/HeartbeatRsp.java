package tbcloud.node.protocol.data.rsp;

import tbcloud.node.protocol.data.ins.Ins;

/**
 * @author dzh
 * @date 2018-11-30 13:54
 */
public class HeartbeatRsp {
    private Ins ins;

    public Ins getIns() {
        return ins;
    }

    public void setIns(Ins ins) {
        this.ins = ins;
    }
}
