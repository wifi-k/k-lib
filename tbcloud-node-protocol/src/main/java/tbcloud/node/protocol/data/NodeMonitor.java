package tbcloud.node.protocol.data;

/**
 * @author dzh
 * @date 2018-11-25 14:33
 */
public class NodeMonitor extends DataReq {

    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
