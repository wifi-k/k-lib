package tbcloud.node.protocol.codec;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tbcloud.node.protocol.ByteBufNodePacket;
import tbcloud.node.protocol.DataType;
import tbcloud.node.protocol.PacketConst;
import tbcloud.node.protocol.data.InsStatus;
import tbcloud.node.protocol.util.GsonUtil;

import java.nio.ByteBuffer;
import java.util.zip.CRC32;

/**
 * @author dzh
 * @date 2018-11-30 09:59
 */
public class TestPacketCodec {

    static Logger LOG = LoggerFactory.getLogger(TestPacketCodec.class);

    DataCodecFactory dataCodecFactory = DefaultDataCodecFactory.Instance;

    @Test
    public void codecTest() {
        InsStatus data = new InsStatus();
        data.setId("000000");
        data.setIns(1);
        data.setStatus(1);
        data.setNodeId("123456");

        ByteBufNodePacket packet = new ByteBufNodePacket();
        packet.magic(PacketConst.M);
        packet.version(PacketConst.V_20181130);
        packet.id("111111");
        packet.token("222222");
        packet.dataFormat((byte) PacketConst.DataFormat.JSON.ordinal());
        packet.dataType(DataType.INS_STATUS);
        ByteBuffer dataBuf = dataCodecFactory.codec(DataType.INS_STATUS, PacketConst.DataFormat.JSON.ordinal()).encode(data);
        packet.data(dataBuf);

        PacketCodec codec = new PacketCodecV20181130();
        ByteBuffer bytes = codec.encode(packet);
        LOG.info("{} {} {}", bytes.position(), bytes.limit(), bytes.capacity());

        packet = codec.decode(bytes);
        LOG.info("{} {} {} {}", packet.magic(), packet.version(), packet.id(), packet.token());
        dataBuf = packet.data();
        data = dataCodecFactory.codec(DataType.INS_STATUS, packet.dataFormat()).
                decode(dataBuf, InsStatus.class);
        LOG.info("{}", GsonUtil.toJson(data));

        CRC32 crc = new CRC32();
        crc.update(bytes.array(), 0, bytes.capacity() - 8);
        long hashCode = crc.getValue();
        LOG.info("{} {}", hashCode, packet.hash());
    }

}
