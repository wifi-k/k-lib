package tbcloud.node.protocol.codec;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import tbcloud.node.protocol.PacketConst;
import tbcloud.node.protocol.data.Data;

import java.nio.ByteBuffer;

/**
 * @author dzh
 * @date 2018-11-16 17:46
 */
public class JsonDataCodec implements DataCodec {

    static final Gson GSON = new GsonBuilder().create();

    @Override
    public PacketConst.DataFormat dataFormat() {
        return PacketConst.DataFormat.JSON;
    }

    @Override
    public <T extends Data> ByteBuffer encode(T data) {
        return ByteBuffer.wrap(GSON.toJson(data).getBytes(PacketConst.CHARSET));
    }

    @Override
    public <T extends Data> T decode(ByteBuffer bytes, Class<? extends Data> data) {
        return (T) GSON.fromJson(new String(bytes.array(), PacketConst.CHARSET), data);
    }

}
