package tbcloud.node.protocol.data.ins;

/**
 * @author dzh
 * @date 2018-11-25 14:17
 */
public class Ins {

    private String id; //唯一识别号
    private int ins;
    private String val; // InsVal's string


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getIns() {
        return ins;
    }

    public void setIns(int ins) {
        this.ins = ins;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    /**************************指令定义*****************************/
    public static final int INS_HTTPPROXY = 1; //http代理

    /**************************指令状态*****************************/
//    public static final int STATUS_RECV = 0; //发送指令
//    public static final int STATUS_RECV = 1; //收到指令
//    public static final int STATUS_SUCC = 2; //执行成功
//    public static final int STATUS_FAIL = 3; //执行失败

    public static enum Status {
        SEND, RECV, SUCC, FAIL;
    }

}
