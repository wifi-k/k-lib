package tbcloud.lib.api;

import tbcloud.lib.api.util.GsonUtil;

/**
 * @author dzh
 * @date 2018-11-08 20:55
 */
public class Result<T> {


    private int code = ApiCode.SUCC;

    private T data;

    private String msg;

    private Integer count; // if data is array, count is the array's size

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

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String toString() {
        return GsonUtil.toJson(this);
    }

}
