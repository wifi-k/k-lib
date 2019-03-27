package tbcloud.node.protocol.data.ins;

/**
 * @author dzh
 * @date 2019-03-27 11:37
 */
public class WifiTimer extends InsVal {

    private int op;
    private String wifi;

    public int getOp() {
        return op;
    }

    public void setOp(int op) {
        this.op = op;
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }
}
