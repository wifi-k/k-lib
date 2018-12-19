package tbcloud.node.protocol;

/**
 * @author dzh
 * @date 2018-11-25 15:44
 */
public interface DataType {
    DataType I = new DataType() {
    };


    int NIL = 0;

    /**************** UDP Node [1,200) *******************/
    int AUTH = 1;
    int HEARTBEAT = 2;
    int MONITOR = 3;
    int INS_STATUS = 4;

    default int rspType(int reqType) {
        return 10000 + reqType;
    }

}
