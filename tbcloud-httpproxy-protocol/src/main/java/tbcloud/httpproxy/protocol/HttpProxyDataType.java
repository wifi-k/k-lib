package tbcloud.httpproxy.protocol;

import tbcloud.node.protocol.DataType;

/**
 * @author dzh
 * @date 2018-12-15 17:24
 */
public interface HttpProxyDataType extends DataType {

    /**************** HTTP PROXY [200,300) *******************/
    int HPROXY_NIL = 200; //未定义类型
    int HPROXY_JOIN = 201;
    int HPROXY_HEARTBEAT = 202;
    int HPROXY_RESPONSE = 203;
    int HPROXY_QUIT = 204;

    int PUSH_HPROXY_REQUEST = 10205;


}
