package tbcloud.httpproxy.protocol.codec;

import tbcloud.httpproxy.protocol.data.*;
import tbcloud.node.protocol.PacketConst;
import tbcloud.node.protocol.codec.DataCodec;
import tbcloud.node.protocol.data.Data;

import java.lang.reflect.Type;
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

        //nodeIdSize[1] + nodeId[] + IdSize[1] + Id[] + Seq[2] + Scheme[1] + HostSize[2] + Host[] + Port[4] + HttpSize[4] + Http[]
        if (data instanceof HttpProxyRequest) { //TODO
            byte[] nodeId = ((HttpProxyRequest) data).getNodeId().getBytes(PacketConst.UTF_8);
            byte[] id = ((HttpProxyRequest) data).getId().getBytes(PacketConst.UTF_8);
            String hostStr = ((HttpProxyRequest) data).getHost();
            byte[] host = hostStr == null ? new byte[0] : hostStr.getBytes(PacketConst.UTF_8);

            ByteBuffer http = ((HttpProxyRequest) data).getHttp();
            int httpSize = http.remaining();
            ByteBuffer buf = ByteBuffer.allocate(1 + nodeId.length + 1 + id.length + 5 + host.length + 8 + httpSize);
            buf.put((byte) nodeId.length).put(nodeId); //nodeId
            buf.put((byte) id.length).put(id);//id
            buf.putShort(((HttpProxyRequest) data).getSeq());//seq
            buf.put(((HttpProxyRequest) data).getScheme());//scheme
            buf.putShort((short) host.length).put(host);//host
            buf.putInt(((HttpProxyRequest) data).getPort());//port
            if (httpSize > 0)
                buf.putInt(http.remaining()).put(http);//http
            return buf.flip();
        }
        if (data instanceof DataAck) {
            ByteBuffer buf = ByteBuffer.allocate(4);
            return buf.putInt(((DataAck) data).getCode()).flip();
        }

        return ByteBuffer.allocate(0);
    }

    @Override
    public <T extends Data> T decode(ByteBuffer bytes, Class<? extends Data> data) {
        if (data.equals(JoinHttpProxy.class)) {
            JoinHttpProxy req = new JoinHttpProxy();
            req.setNodeId(decodeString(bytes, bytes.get()));
            return (T) req;
        }

        if (data.equals(Heartbeat.class)) {
            Heartbeat req = new Heartbeat();
            req.setNodeId(decodeString(bytes, bytes.get()));
            return (T) req;
        }

        //nodeIdSize[1] + nodeId[] + idSize[1] + id[] + Seq[2] + ProxyStatus[4] + ProxyCost[4] + HttpSize[4] + Http[]
        if (data.equals(HttpProxyResponse.class)) {
            HttpProxyResponse req = new HttpProxyResponse();
            req.setNodeId(decodeString(bytes, bytes.get()));
            req.setId(decodeString(bytes, bytes.get()));
            req.setSeq(bytes.getShort());
            req.setProxyStatus(bytes.get());
            req.setProxyCost(bytes.getInt());
            bytes.getInt(); // discard HttpSize
            req.setHttp(bytes);
            return (T) req;
        }

        if (data.equals(QuitHttpProxy.class)) {
            QuitHttpProxy req = new QuitHttpProxy();
            req.setNodeId(decodeString(bytes, bytes.get()));
            return (T) req;
        }
        throw new IllegalArgumentException("couldn't decode for data " + data.getName());
    }

//    @Override
//    public <T extends Data> T decode(ByteBuffer bytes, Type type) {
//        return null; //TODO
//    }
}
