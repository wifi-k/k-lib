package tbcloud.lib.api;

/**
 * @author dzh
 * @date 2018-11-08 20:54
 */
public interface ApiConst extends ConfField {

    String API_TOKEN = "Api-Token";
    String API_VERSION = "Api-Version";

    String UTF8 = "utf-8";

    Integer REDIS_EXPIRED_24H = 24 * 3600;
    Integer REDIS_EXPIRED_1H = 3600;
    // redis expired seconds
    Integer REDIS_USER_TOKEN_EXPIRED = 12 * 3600; // 12 hours TODO config
    Integer REDIS_STAT_PRODUCT_EXPIRED = 3600; // 1 hour
    Integer REDIS_USER_INFO_EXPIRED = 3600;// 1 hour

    Integer REDIS_BASIC_AREA_EXPIRED = 48 * 3600;// 24 hours province city area
    Integer REDIS_PRODUCT_EXPIRED = 24 * 3600; // 1 hour
    Integer REDIS_DATA_VERSION_EXPIRED = 7 * 24 * 3600; // 1 hour

    // redis group ids
    String REDIS_ID_USER = "user";  // 用户缓存
    String REDIS_ID_NODE = "node"; // 节点缓存

    // redis key
    String REDIS_KEY_USER_IMGCODE_ = "user.imgcode.";//id
    String REDIS_KEY_USER_VCODE_ = "user.vcode."; // mobile
    String REDIS_KEY_USER_TOKEN_ = "user.token.";

    String REDIS_KEY_NODE_TOKEN_ = "node.token.";
    String REDIS_KEY_NODE_INS_ = "node.rsp.";
    int REDIS_MAX_NODE_INS = 100;

    String REDIS_KEY_USER_INFO_ = "user.info.";
    String REDIS_KEY_USER_EMAIL_TOKEN_ = "user.email.token.";
    String REDIS_KEY_BASIC_PROVINCE_ALL = "basic.province.all";
    String REDIS_KEY_BASIC_CITY_ALL = "basic.city.all";
    String REDIS_KEY_BASIC_AREA_ALL = "basic.area.all";
    String REDIS_KEY_PRODUCT_ALL = "product.all";
    String REDIS_KEY_SYS_DATA_VERSION = "sys.data.version";

    String REDIS_KEY_NOTICE_INFO_ = "notice.info.";

    String REDIS_KEY_NOTICE_PUB_ = "notice.pub."; // 发布限制 notice.pub.yyyyMMdd.USERId

    // httpclient service group ids
    String HTTP_CLIENT_ID_WXAPI = "wxApi";

    // 审核状态
    int AUTH_STATUS_WAIT = 0;
    int AUTH_STATUS_PASS = 1;
    int AUTH_STATUS_PASS_NOT = 2;

    // USER role 1-user 2-developer 4-company 8-admin
    int USER_ROLE_USER = 1;
    int USER_ROLE_DEVELOPER = 2;
    int USER_ROLE_COMPANY = 4;
    int uSER_ROLE_ADMIN = 8;

    // USER sex
    int USER_SEX_UNKONW = 0;
    int USER_SEX_MAN = 1;
    int USER_SEX_WOMEN = 2;

    // suggestion is_reply
    int IS_REPLY_N = 0;
    int IS_REPLY_Y = 1;

    // online
    int USER_ONLINE = 1;
    int USER_OFFLINE = 0;

    // product used
    int PRODUCT_NOT_USE = 0; // 产品未被用户添加
    int PRODUCT_IS_USE = 1; // 产品被用户添加过

    // region type
    int REGION_TYPE_COUNTRY = 0;
    int REGION_TYPE_PROVINCE = 1;
    int REGION_TYPE_CITY = 2;
    int REGION_TYPE_AREA = 3;

    // job min thread count
    String JOB_THREADPOOL_SIZE = "job.threadpool.size";

    String ENV_DEV = "dev";
    String ENV_TEST = "test";
    String ENV_ONLINE = "online";

    int IMGCODE_MAX_ID = 10000; //TODO config

    // mysql database name
    String MYSQL_TBCLOUD = "tbcloud";
    //String MYSQL_USER = "tbc_user";
    //String MYSQL_NODE = "tbc_node";
    //String MYSQL_COMMON = "tbc_common";


    byte IS_DELETE_N = 0;
    byte IS_DELETE_Y = 1;

    String USER_PASSWD_SALT_1 = "TBCLOUD2018";

    // mobile vcode type
    int MOBILE_VCODE_USER_REG = 1;//注册
    int MOBILE_VCODE_PASSWD_RESET = 2;//忘记密码
    int MOBILE_VCODE_MOBILE_RESET = 3;//修改手机号

    String ALISMS_ID_TBC = "tbc";

}
