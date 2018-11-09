package tbcloud.lib.api;

/**
 * @author dzh
 * @date 2018-11-08 20:54
 */
public interface ApiConst {

    String API_TOKEN = "Api-Token";
    String API_VERSION = "Api-Version";

    String HTTP_PORT = "api.http.port";
    String HTTP_HOST = "api.http.host";
    String HTTP_BOSS_THREADS = "api.http.boss.threads";
    String HTTP_WORK_THREADS = "api.http.work.threads";
    String HTTPS_ENABLED = "api.https.enabled";
    String HTTP_ROOT = "api.http.root";

    String WX_APPID = "wx.appid";
    String WX_APPSECRET = "wx.appsecret";

    String UTF8 = "utf-8";

    Integer REDIS_EXPIRED_24H = 24 * 3600;
    Integer REDIS_EXPIRED_1H = 3600;
    // redis expired seconds
    Integer REDIS_USR_TOKEN_EXPIRED = 12 * 3600; // 12 hours TODO config
    Integer REDIS_STAT_PRODUCT_EXPIRED = 3600; // 1 hour
    Integer REDIS_USR_INFO_EXPIRED = 3600;// 1 hour

    Integer REDIS_BASIC_AREA_EXPIRED = 48 * 3600;// 24 hours province city area
    Integer REDIS_PRODUCT_EXPIRED = 24 * 3600; // 1 hour
    Integer REDIS_DATA_VERSION_EXPIRED = 7 * 24 * 3600; // 1 hour

    // redis group ids
    String REDIS_ID_USR = "usr";  // 用户缓存
    String REDIS_ID_STAT = "stat"; // 统计缓存

    // redis key
    String REDIS_KEY_STAT_AMOUNT_COUNTRY_ = "stat.amount.country."; // 全国的统计数据
    String REDIS_KEY_STAT_AMOUNT_PROVINCES_ = "stat.amount.provinces."; // 各省的统计数据
    String REDIS_KEY_TOKEN_ = "token.";
    String REDIS_KEY_PRODUCT_ = "product.";

    String REDIS_KEY_USR_INFO_ = "usr.info.";
    String REDIS_KEY_BASIC_PROVINCE_ALL = "basic.province.all";
    String REDIS_KEY_BASIC_CITY_ALL = "basic.city.all";
    String REDIS_KEY_BASIC_AREA_ALL = "basic.area.all";
    String REDIS_KEY_PRODUCT_ALL = "product.all";
    String REDIS_KEY_SYS_DATA_VERSION = "sys.data.version";

    String REDIS_KEY_NOTICE_INFO_ = "notice.info.";

    String REDIS_KEY_NOTICE_PUB_ = "notice.pub."; // 发布限制 notice.pub.yyyyMMdd.usrId

    // httpclient service group ids
    String HTTP_CLIENT_ID_WXAPI = "wxApi";

    // int PRODUCT_STATUS_ //TODO 正常 逾期 展期 清退

    // 审核状态
    int AUTH_STATUS_WAIT = 0;
    int AUTH_STATUS_PASS = 1;
    int AUTH_STATUS_PASS_NOT = 2;

    // usr role
    int USR_ROLE_COMMON = 0;
    int USR_ROLE_ADMIN = 1;

    // usr sex
    int USR_SEX_UNKONW = 0;
    int USR_SEX_MAN = 1;
    int USR_SEX_WOMEN = 2;

    // suggestion is_reply
    int IS_REPLY_N = 0;
    int IS_REPLY_Y = 1;

    // product used
    int PRODUCT_NOT_USE = 0; // 产品未被用户添加
    int PRODUCT_IS_USE = 1; // 产品被用户添加过

    // region type
    int REGION_TYPE_COUNTRY = 0;
    int REGION_TYPE_PROVINCE = 1;
    int REGIOIN_TYPE_CITY = 2;
    int REGION_TYPE_AREA = 3;

    //
    String JOB_THREADPOOL_SIZE = "job.threadpool.size";

    String ENV_LOCAL = "local";
    String ENV_TEST = "test";
    String ENV_ONLINE = "online";

    int IMGCODE_MAX_ID = 10000; //

}
