package tbcloud.lib.api;

/**
 * @author dzh
 * @date 2018-11-08 20:56
 */
public interface ApiCode {

    int SUCC = 0;

    int TOKEN_EXPIRED = 1; // token过期

    int TOKEN_INVALID = 2; // token非法

    int HTTP_MISS_PARAM = 3; // 缺少必要请求参数

    int DB_NOT_FOUND_RECORD = 4; // 数据库没有找到字段

    int USR_AREA_INVALID = 5; // 用户的地理区域不满足条件

    int AUTH_PASSED = 6; // 审核已通过，不能在更新

    int TEXT_SIZE_OVER = 7; // 文本内容超过限制

    int USR_INVALID = 8; // 非法用户

    int DB_INSERT_ERROR = 9; // 数据库插入失败，可能已存在

    int INVALID_PARAM = 10; // 非法参数

    int INVALID_PERM = 11; // 非法权限

    int LIMIT_SEND_OVER = 12; // 超过发送限制

    int AUTH_NOT_PASSED = 13; // 审核未通过

    int DB_UPDATE_ERROR = 14;// 数据库更新失败

    int OP_MORE_THAN_LIMIT = 15; //操作超过限制次数

    /******************* 第三方请求 *******************/
    int WX_API = 100;

    /******************* 中间件请求 *******************/
    int REDIS_GET_NULL = 200; // redis获取失败
    int ELASTIC_SEARCH_IO = 201; // elasticsearch网络异常


}
