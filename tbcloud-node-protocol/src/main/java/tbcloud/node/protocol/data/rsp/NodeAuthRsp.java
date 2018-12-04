package tbcloud.node.protocol.data.rsp;

/**
 * @author dzh
 * @date 2018-11-25 13:44
 */
public class NodeAuthRsp {
    private int tokenExpired; // token expired hours
    private String token;
    private String insHost; //host:port,host:port
    //private String httpsvr;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getInsHost() {
        return insHost;
    }

    public void setInsHost(String insHost) {
        this.insHost = insHost;
    }

    public int getTokenExpired() {
        return tokenExpired;
    }

    public void setTokenExpired(int tokenExpired) {
        this.tokenExpired = tokenExpired;
    }
}
