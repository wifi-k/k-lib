package tbcloud.lib.api.msg;

/**
 * @author dzh
 * @date 2018-11-19 20:05
 */
public class MobileVCode {

    private int type; //  1-注册，2-忘记密码,3-修改手机号
    private String mobile;
    private String code; // vcode

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
