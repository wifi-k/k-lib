package tbcloud.node.protocol.data.ins;

/**
 * @author dzh
 * @date 2019-04-01 11:40
 */
public class DeviceAllow extends InsVal {

    private long id;
    private String mac; //json数组["mac地址","a4:5e:60:bd:bb:1d"]
    private int op; // 1-allow 0-close
    private String st; //09:00
    private String et; //18:00
    private int wt; // 1-Mon Tue-2 Wen-4 Thu-8 Fri-16 Sat-32 Sun-64

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public String getEt() {
        return et;
    }

    public void setEt(String et) {
        this.et = et;
    }

    public int getWt() {
        return wt;
    }

    public void setWt(int wt) {
        this.wt = wt;
    }
}
