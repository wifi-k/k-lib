package tbcloud.node.protocol.data;

/**
 * @author dzh
 * @date 2018-11-25 14:17
 */
public class Ins {

    private int ins;
    private String data;

    public int getIns() {
        return ins;
    }

    public void setIns(int ins) {
        this.ins = ins;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    /**************************指令定义*****************************/
    public static final int INS_HTTPPROXY_START = 1; //开启http代理
    public static final int INS_HTTPPROXY_CLOSE = 10001; //关闭http代理

    /**************************指令状态*****************************/
//    public static final int STATUS_RECV = 0; //发送指令
//    public static final int STATUS_RECV = 1; //收到指令
//    public static final int STATUS_SUCC = 2; //执行成功
//    public static final int STATUS_FAIL = 3; //执行失败

    public static enum Status {
        SEND, RECV, SUCC, FAIL;
    }

}
