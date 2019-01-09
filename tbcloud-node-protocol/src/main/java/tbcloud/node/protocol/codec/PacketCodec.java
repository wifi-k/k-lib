package tbcloud.node.protocol.codec;

import tbcloud.node.protocol.ByteBufNodePacket;

import java.nio.ByteBuffer;

/**
 * @author dzh
 * @date 2018-11-16 16:56
 */
public interface PacketCodec {

    ByteBuffer encode(ByteBufNodePacket packet);

    /**
     * @param bytes
     * @return null if invalid bytes
     */
    ByteBufNodePacket decode(ByteBuffer bytes);

}