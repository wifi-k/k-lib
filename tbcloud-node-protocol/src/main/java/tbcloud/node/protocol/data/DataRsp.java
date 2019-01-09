package tbcloud.node.protocol.data;

import tbcloud.node.protocol.util.GsonUtil;

/**
 * @author dzh
 * @date 2018-11-25 13:43
 */
public class DataRsp<T> implements Data {

    private int code = 0;

    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return GsonUtil.toJson(this);
    }
}
