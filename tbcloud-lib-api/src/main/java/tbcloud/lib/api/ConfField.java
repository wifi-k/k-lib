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


}
