package tbcloud.lib.api.msg;

/**
 * @author dzh
 * @date 2018-11-19 19:46
 */
public interface MsgType {

    int MOBILE_VCODE = 1; //发送手机验证码消息
    int EMAIL_MODIFY = 2; //email修改消息
    int USER_LOGIN = 3; //用户登录离线消息

}
