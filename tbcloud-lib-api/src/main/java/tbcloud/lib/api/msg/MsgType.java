package tbcloud.lib.api.msg;

/**
 * @author dzh
 * @date 2018-11-19 19:46
 */
public interface MsgType {

    /************************* user [1,1000)*****************************/
    int MOBILE_VCODE = 1; //发送手机验证码消息
    int EMAIL_MODIFY = 2; //email修改消息
    int USER_LOGIN = 3; //用户登录离线消息
    int NODE_JOIN_SHARE = 4; //节点加入共享计算
    int NODE_QUIT_SHARE = 5; //节点离开共享计算

    /************************* node (1000,2000)*****************************/


    default boolean isUserMsg(int type) {
        return type > 0 && type < 1000 ? true : false;
    }

    default boolean isNodeMsg(int type) {
        return type > 1000 && type < 2000 ? true : false;
    }
}
