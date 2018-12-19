package tbcloud.node.protocol.codec;

import tbcloud.node.protocol.PacketConst;

import java.util.IllegalFormatException;

/**
 * @author dzh
 * @date 2018-11-23 17:49
 */
public class DefaultDataCodecFactory implements DataCodecFactory {

    public final static DefaultDataCodecFactory Instance = new DefaultDataCodecFactory();

    private DataCodec jsonDataCodec = new JsonDataCodec();

    public DataCodec codec(int dataType, int format) throws IllegalFormatException {
        if (format == PacketConst.DataFormat.JSON.ordinal()) {
            return jsonDataCodec;
        }
        throw new IllegalArgumentException("Not found DataCodec for format:" + format);
    }

}
