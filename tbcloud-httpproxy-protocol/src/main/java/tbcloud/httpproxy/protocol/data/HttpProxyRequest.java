package tbcloud.httpproxy.protocol.data;

import tbcloud.node.protocol.data.DataReq;

import java.nio.ByteBuffer;

/**
 * from Server to node
 *
 * @author dzh
 * @date 2018-12-05 14:23
 */
public class HttpProxyRequest extends DataReq implements HttpProxyData {

    private String id;
    private short seq;// sequence number
    private byte scheme; //1-http 2-https
    private String host;
    private int port;
    private ByteBuffer http; // http content

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

    public byte getScheme() {
        return scheme;
    }

    public void setScheme(byte scheme) {
        this.scheme = scheme;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public ByteBuffer getHttp() {
        return http;
    }

    public void setHttp(ByteBuffer http) {
        this.http = http;
    }
}
