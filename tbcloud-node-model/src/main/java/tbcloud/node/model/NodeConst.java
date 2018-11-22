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

    int STATUS_UNKNOWN = -1; // unknown
    int STATUS_OFFLINE = 0;
    int STATUS_NORMAIL = 1;
    int STATUS_WARN = 2;
    int STATUS_ERROR = 3;

}
