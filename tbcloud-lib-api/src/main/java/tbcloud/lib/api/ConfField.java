package tbcloud.lib.api;

/**
 * @author dzh
 * @date 2018-11-11 21:59
 */
public interface ConfField {

    String HTTP_PORT = "api.http.port";
    String HTTP_HOST = "api.http.host";
    String HTTP_BOSS_THREADS = "api.http.boss.threads";
    String HTTP_WORK_THREADS = "api.http.work.threads";
    String HTTPS_ENABLED = "api.https.enabled";
    String HTTP_ROOT = "api.http.root";

    String WX_APPID = "wx.appid";
    String WX_APPSECRET = "wx.appsecret";

    //七牛
    String QINIU_DOMAIN = "qiniu.domain";
    String QINIU_BUCKET = "quniu.bucket";

    String ENV_NAME = "env.name";
    String DEBUG_ENABLED = "debug.enabled";


    String NDOE_API_IP = "node.api.ip";
    String NODE_API_PORT = "node.api.port";
    String NODE_API_AUTH_ENABLED = "node.api.auth.enabled";
    String NODE_API_INS_HOST = "node.api.ins.host";
    String NODE_API_TOKEN_EXPIRED = "node.api.token.expired";
}
