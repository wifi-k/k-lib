package tbcloud.node.protocol.data.ins;

/**
 * @author dzh
 * @date 2018-11-29 17:41
 */
public class HttpProxy extends InsVal {

    public static final int OP_ENABLE = 1;
    public static final int OP_DISABLE = 0;


    private int op; // 0-disable 1-enable
    private String host;

    public int getOp() {
        return op;
    }

    public void setOp(int op) {
        this.op = op;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

}
