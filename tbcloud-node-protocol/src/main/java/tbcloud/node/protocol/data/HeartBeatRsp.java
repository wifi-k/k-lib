package tbcloud.node.protocol.data;

/**
 * @author dzh
 * @date 2018-11-25 14:14
 */
public class HeartBeatRsp extends DataRsp {

    private Ins ins;

    public Ins getIns() {
        return ins;
    }

    public void setIns(Ins ins) {
        this.ins = ins;
    }
}
