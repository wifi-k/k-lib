package tbcloud.node.protocol.codec;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import tbcloud.node.protocol.PacketConst;

/**
 * @author dzh
 * @date 2018-11-16 17:46
 */
public class JsonDataCodec<T> implements DataCodec<T> {

    static final Gson GSON = new GsonBuilder().create();

    @Override
    public byte[] encode(T data) {
        return GSON.toJson(data).getBytes(PacketConst.CHARSET);
    }

    @Override
    public T decode(byte[] bytes) {
        //
        return null;
    }
}
