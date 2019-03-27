package tbcloud.node.protocol.data.ins;

/**
 * @author dzh
 * @date 2019-03-25 20:32
 */
public class DeviceBlock extends InsVal {

    private String mac;
    private int op; // 1-block 0-allow

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public int getOp() {
        return op;
    }

    public void setOp(int op) {
        this.op = op;
    }
}
