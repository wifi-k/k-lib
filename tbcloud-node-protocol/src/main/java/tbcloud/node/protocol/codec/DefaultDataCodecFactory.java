package tbcloud.node.protocol.codec;

import tbcloud.node.protocol.PacketConst;

import java.util.IllegalFormatException;

/**
 * @author dzh
 * @date 2018-11-23 17:49
 */
public class DefaultDataCodecFactory implements DataCodecFactory {

    public final static DefaultDataCodecFactory Instance = new DefaultDataCodecFactory();

    public DataCodec codec(int dataType, int format) throws IllegalFormatException {
        if (format == PacketConst.DataFormat.JSON.ordinal()) {
            return new JsonDataCodec();
        }
        if ((dataType >= 200 && dataType < 300) || (dataType >= 10200 && dataType < 10300)) { //http proxy
            if (format == PacketConst.DataFormat.BINARY.ordinal())
                return new HttpProxyDataCodec();
        }

        throw new IllegalArgumentException("Not found DataCodec for format:" + format);
    }

}
