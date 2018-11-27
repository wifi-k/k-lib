package tbcloud.node.protocol.data;

/**
 * @author dzh
 * @date 2018-11-25 13:43
 */
public class DataRsp extends Data {

    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static enum Code {
        SUCC,
    }
}
