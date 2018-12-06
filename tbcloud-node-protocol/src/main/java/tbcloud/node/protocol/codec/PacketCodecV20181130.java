package tbcloud.node.protocol.codec;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tbcloud.node.protocol.ByteBufNodePacket;
import tbcloud.node.protocol.PacketConst;

import java.nio.ByteBuffer;
import java.util.zip.CRC32;

/**
 * @author dzh
 * @date 2018-11-16 16:58
 */
public class PacketCodecV20181130 implements PacketCodec {

    static Logger LOG = LoggerFactory.getLogger(PacketCodecV20181130.class);

    public PacketCodecV20181130() {
    }

    @Override
    public ByteBuffer encode(ByteBufNodePacket packet) {
        // int dataType = packet.dataType();
        byte[] id = packet.id().getBytes(PacketConst.CHARSET);
        byte[] token = packet.token() == null ? new byte[0] : packet.token().getBytes(PacketConst.CHARSET);
        byte[] data = packet.data() == null ? new byte[0] : packet.data().array();
        ByteBuffer buf = ByteBuffer.allocate(9 + id.length + 1 + token.length + 9 + data.length + 8);
        buf.putInt(PacketConst.M).putInt(PacketConst.V_20181130); // M+V
        buf.put((byte) id.length).put(id); // id
        buf.put((byte) token.length); // token
        if (token.length > 0) buf.put(token);
        // dataType + dataFormat + dataSize
        buf.putInt(packet.dataType()).put(packet.dataFormat()).putInt(data.length);
        if (data.length > 0) buf.put(data); //TODO limit
        // crc32
        CRC32 crc32 = new CRC32(); //TODO 32 or 32c
        crc32.update(buf.array(), 0, buf.capacity() - 8);
        buf.putLong(crc32.getValue());
//        LOG.info("{} {} {}", buf.position(), buf.limit(), buf.capacity());
        return buf.flip();
    }

//    private ByteBuffer encodeData(NodePacket<?> packet) {
//        return codecFactory.codec(PacketConst.DataType.valueOf(packet.dataType())).encode(packet.data());
//    }

    @Override
    public ByteBufNodePacket decode(ByteBuffer bytes) {
        ByteBufNodePacket packet = new ByteBufNodePacket();
        int m = bytes.getInt();  // M
        packet.magic(m);
        int v = bytes.getInt(); // V
        packet.version(v);
        String id = decodeString(bytes, bytes.get()); // id
        packet.id(id);
        String token = decodeString(bytes, bytes.get());//token
        packet.token(token);
        int dataType = bytes.getInt(); //dataType
        packet.dataType(dataType);
        byte dataFormat = bytes.get(); //dataFormat
        packet.dataFormat(dataFormat);
        int dataSize = bytes.getInt();// dataSize
        if (dataSize > 0) {
            ByteBuffer data = ByteBuffer.allocate(dataSize);
            bytes.get(data.array());
            packet.data(data);
        }
        long hash = bytes.getLong();
        packet.hash(hash);
        return packet;
    }

    private String decodeString(ByteBuffer bytes, int size) {
        byte[] r = new byte[size];
        bytes.get(r);
        return new String(r, PacketConst.CHARSET);
    }
}
