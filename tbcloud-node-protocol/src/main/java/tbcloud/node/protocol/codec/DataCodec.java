package tbcloud.node.protocol.codec;

import tbcloud.node.protocol.PacketConst;
import tbcloud.node.protocol.data.Data;

import java.lang.reflect.Type;
import java.nio.ByteBuffer;

/**
 * @author dzh
 * @date 2018-11-16 17:45
 */
public interface DataCodec {

    PacketConst.DataFormat dataFormat();

    <T extends Data> ByteBuffer encode(T data);

    <T extends Data> T decode(ByteBuffer bytes, Class<? extends Data> data);

    //<T extends Data> T decode(ByteBuffer bytes, Type type);

    default String decodeString(ByteBuffer bytes, int size) {
        byte[] r = new byte[size];
        bytes.get(r);
        return new String(r, PacketConst.UTF_8);
    }

}
