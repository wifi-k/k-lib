package tbcloud.lib.api;

/**
 * @author dzh
 * @date 2018-11-11 21:59
 */
public interface ConfField {

    /********************* common ************************/
    String FILE_ES = "file.es";//elasticsearch conf file path

    /********************* user ************************/
    String HTTP_PORT = "api.http.port";
    String HTTP_HOST = "api.http.host";
    String HTTP_IO_THREADS = "api.http.io.threads";
    String HTTP_WORK_THREADS = "api.http.work.threads";
    //    String HTTPS_ENABLED = "api.https.enabled";
    String HTTP_ROOT = "api.http.root";

    String WX_APPID = "wx.appid";
    String WX_APPSECRET = "wx.appsecret";

    //七牛
//    String QINIU_DOMAIN = "qiniu.domain";
//    String QINIU_BUCKET = "quniu.bucket";
    String QINIU_ID_IMGCODE = "imgcode";  //store imgcode images
    String QINIU_ID_DEVELOPER = "developer"; //store personal auth images

    String ENV_NAME = "env.name";
    String DEBUG_ENABLED = "debug.enabled";
    String USER_EMAIL_MODIFY_FROM = "user.email.modify.from";
    String USER_EMAIL_MODIFY_LINK = "user.email.modify.link";

    String FTL_DIR = "ftl.dir";

    /********************* node udp************************/
    String NDOE_API_HOST = "node.api.host";
    String NODE_API_PORT = "node.api.port";
    String NODE_API_AUTH_ENABLED = "node.api.auth.enabled";
    String NODE_API_INS_HOST = "node.api.ins.host";
    String NODE_API_TOKEN_EXPIRED = "node.api.token.expired";
    String NODE_API_TICK_TIME = "node.api.tick.time";

    /********************* node httproxy********************/
    String NODE_HTTPPROXY_DOMAIN = "node.httpproxy.domain"; // 通知节点的连接地址
    String NODE_HTTPPROXY_TCP_HOST = "node.httpproxy.tcp.host";//服务器启动地址，默认0.0.0.0
    String NODE_HTTPPROXY_TCP_PORT = "node.httpproxy.tcp.port";
    String NODE_HTTPPROXY_HTTP_HOST = "node.httpproxy.http.host";
    String NODE_HTTPPROXY_HTTP_PORT = "node.httpproxy.http.port";

    /********************* open httpproxy************************/
    String OPEN_HTTPPROXY_HOST = "open.httpproxy.host";
    String OPEN_HTTPPROXY_PORT = "open.httpproxy.port";

}
