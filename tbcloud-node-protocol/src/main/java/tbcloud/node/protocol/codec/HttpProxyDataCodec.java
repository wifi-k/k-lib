package tbcloud.node.protocol.codec;

import tbcloud.node.protocol.PacketConst;
import tbcloud.node.protocol.data.*;

import java.nio.ByteBuffer;

/**
 * @author dzh
 * @date 2018-12-05 10:59
 */
public class HttpProxyDataCodec implements DataCodec {
    @Override
    public PacketConst.DataFormat dataFormat() {
        return PacketConst.DataFormat.BINARY;
    }

    @Override
    public <T extends Data> ByteBuffer encode(T data) {
        if (data == null) return ByteBuffer.allocate(0);

        if (data instanceof HttpProxyReq) {
            byte[] nodeId = ((HttpProxyReq) data).getNodeId().getBytes(PacketConst.CHARSET);
            byte[] id = ((HttpProxyReq) data).getId().getBytes(PacketConst.CHARSET);
            byte[] host = ((HttpProxyReq) data).getHost().getBytes(PacketConst.CHARSET);
            ByteBuffer http = ((HttpProxyReq) data).getHttp();
            ByteBuffer buf = ByteBuffer.allocate(1 + nodeId.length + 1 + id.length + 3 + host.length + 8 + http.remaining());
            buf.put((byte) nodeId.length).put(nodeId); //nodeId
            buf.put((byte) id.length).put(id);//id
            buf.put(((HttpProxyReq) data).getScheme());//scheme
            buf.putShort((short) host.length).put(host);//host
            buf.putInt(((HttpProxyReq) data).getPort());//port
            buf.putInt(http.remaining()).put(http);//http
            return buf.flip();
        }
        if (data instanceof DataRsp) {
            ByteBuffer buf = ByteBuffer.allocate(4);
            return buf.putInt(((DataRsp) data).getCode()).flip();
        }

        return ByteBuffer.allocate(0);
    }

    @Override
    public <T extends Data> T decode(ByteBuffer bytes, Class<? extends Data> data) {
        if (data.equals(DataReq.class)) {
            DataReq req = new DataReq();
            req.setNodeId(decodeString(bytes, bytes.get()));
            return (T) req;
        }
        if (data.equals(HttpProxyResult.class)) {
            HttpProxyResult req = new HttpProxyResult();
            req.setNodeId(decodeString(bytes, bytes.get()));
            req.setId(decodeString(bytes, bytes.get()));
            req.setHttp(bytes);
            return (T) req;
        }
        if (data.equals(DataRsp.class)) {
            DataRsp req = new DataRsp();
            req.setCode(bytes.getInt());
            return (T) req;
        }

        return null;
    }
}
