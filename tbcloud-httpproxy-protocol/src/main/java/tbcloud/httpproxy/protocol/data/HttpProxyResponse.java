package tbcloud.httpproxy.protocol.data;

import tbcloud.node.protocol.data.DataReq;

import java.nio.ByteBuffer;

/**
 * @author dzh
 * @date 2018-12-05 16:23
 */
public class HttpProxyResponse extends DataReq implements HttpProxyData {
    private String id;
    private short seq; // sequence number
    private ByteBuffer http; // http content
    private Integer proxyCost; //http cost time ms
    private Byte proxyStatus;// 0-succ 1-failed 2-timeout

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public short getSeq() {
        return seq;
    }

    public void setSeq(short seq) {
        this.seq = seq;
    }

    public ByteBuffer getHttp() {
        return http;
    }

    public void setHttp(ByteBuffer http) {
        this.http = http;
    }

    public Integer getProxyCost() {
        return proxyCost;
    }

    public void setProxyCost(Integer proxyCost) {
        this.proxyCost = proxyCost;
    }

    public Byte getProxyStatus() {
        return proxyStatus;
    }

    public void setProxyStatus(Byte proxyStatus) {
        this.proxyStatus = proxyStatus;
    }
}
