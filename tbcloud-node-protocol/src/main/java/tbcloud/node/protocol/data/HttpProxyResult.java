package tbcloud.node.protocol.data;

import java.nio.ByteBuffer;

/**
 * @author dzh
 * @date 2018-12-05 16:23
 */
public class HttpProxyResult extends DataReq {
    private String id;
    private ByteBuffer http; // http content

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ByteBuffer getHttp() {
        return http;
    }

    public void setHttp(ByteBuffer http) {
        this.http = http;
    }
}
