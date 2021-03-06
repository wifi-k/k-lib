package tbcloud.node.model;

/**
 * @author dzh
 * @date 2018-11-12 17:08
 */
public interface NodeConst {

    byte IS_BIND = 1;
    byte IS_UNBIND = 0;

    byte IS_SHARE = 1;
    byte IS_UNSHARE = 0;

    // node status
    int STATUS_UNKNOWN = -1; // unknown
    int STATUS_OFFLINE = 0;
    int STATUS_NORMAIL = 1;
    int STATUS_WARN = 2;
    int STATUS_ERROR = 3;

    // node health
    int HEALTH_NORMAL = 1;
    int HEALTH_WARN = 2;
    int HEALTH_ERROR = 3;

    // ins status
    int INS_STATUS_SEND = 0;
    int INS_STATUS_RECV = 1;
    int INS_STATUS_SUCC = 2;
    int INS_STATUS_FAIL = 3;

    int INS_MAX_RETRY = 10;// TODO

}
