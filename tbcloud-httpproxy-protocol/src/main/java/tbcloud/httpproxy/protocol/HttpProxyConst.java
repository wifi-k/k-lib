package tbcloud.httpproxy.protocol;

/**
 * @author dzh
 * @date 2018-12-15 15:37
 */
public interface HttpProxyConst {

    byte PROXY_STATUS_SUCC = 0;
    byte PROXY_STATUS_FAIL = 1;
    byte PROXY_STATUS_TIMEOUT = 2;

    byte SCHEME_HTTP = 1;
    byte SCHEME_HTTPS = 2;

    short SEQ_LAST_NUM = 0; //数据端结束序列号

}
