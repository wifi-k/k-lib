package tbcloud.lib.api.msg;

/**
 * 消息定义
 *
 * @author dzh
 * @date 2018-11-19 19:46
 */
public interface MsgType {

    /************************* user产生的事件 [1,1000)*****************************/
    int MOBILE_VCODE = 1; //发送手机验证码消息
    int EMAIL_MODIFY = 2; //email修改消息
    int LOGIN_OUT = 3; //用户登录离线消息
    int NODE_JOIN_SHARE = 4; //节点加入共享计算
    int NODE_QUIT_SHARE = 5; //节点离开共享计算
    int DELETE_QINIU_OBJECT = 6; //删除七牛对象

    /************************* node产生的事件 (1000,2000)*****************************/
    int NODE_ONLINE = 1001; //节点认证UDP
    int NODE_OFFLINE = 1002; //节点离线
    int NODE_JOIN_HTTPPROXY = 1003;//加入http代理
    int NODE_QUIT_HTTPPROXY = 1004;//离开http代理
    int NODE_INFO_UPDATE = 1005;//更新nodeInfo
    int NODE_RT_UPDATE = 1006;//更新nodeRt
    int NODE_INS_UPDATE = 1007;//更新nodeIns


    default boolean isUserMsg(int type) {
        return type > 0 && type < 1000 ? true : false;
    }

    default boolean isNodeMsg(int type) {
        return type > 1000 && type < 2000 ? true : false;
    }
}
