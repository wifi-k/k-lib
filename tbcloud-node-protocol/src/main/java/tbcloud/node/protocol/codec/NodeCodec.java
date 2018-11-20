package tbcloud.node.protocol.codec;

import tbcloud.node.protocol.NodePacket;

import java.nio.ByteBuffer;

/**
 * @author dzh
 * @date 2018-11-16 16:56
 */
public interface NodeCodec {

    ByteBuffer encode(NodePacket packet);

    NodePacket decode(ByteBuffer bytes);

}
