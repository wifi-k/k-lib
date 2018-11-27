package tbcloud.node.protocol.data;

/**
 * @author dzh
 * @date 2018-11-25 13:44
 */
public class NodeAuthRsp extends DataRsp {
    private String token;
    private String udpsvr; //host:port,host:port
    //private String httpsvr;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUdpsvr() {
        return udpsvr;
    }

    public void setUdpsvr(String udpsvr) {
        this.udpsvr = udpsvr;
    }
}
