package tbcloud.node.protocol;

/**
 * @author dzh
 * @date 2018-11-25 15:44
 */
public interface DataType {

    int NIL = 0;

    /**************** UDP Node Req [1,1000] *******************/
    int NODE_AUTH = 1;
    int HEARTBEAT = 2;
    int NODE_MONITOR = 3;
    int INS_STATUS = 4;

    /**************** UDP Server RSP [10000,11000] *******************/

}
