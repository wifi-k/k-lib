package tbcloud.node.protocol.data;

/**
 * @author dzh
 * @date 2018-11-25 14:25
 */
public class InsStatus extends DataReq {

    private String id;
    private int ins;
    private int status;

    public int getIns() {
        return ins;
    }

    public void setIns(int ins) {
        this.ins = ins;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
