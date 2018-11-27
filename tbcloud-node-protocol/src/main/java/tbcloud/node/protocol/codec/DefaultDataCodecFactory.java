package tbcloud.node.protocol.codec;

import tbcloud.node.protocol.PacketConst;

/**
 * @author dzh
 * @date 2018-11-23 17:49
 */
public class DefaultDataCodecFactory implements DataCodecFactory {

    private DataCodec json = new JsonDataCodec();

    static DefaultDataCodecFactory Instance = new DefaultDataCodecFactory();

    public DataCodec codec(PacketConst.DataFormat format) {
        if (format.equals(PacketConst.DataFormat.JSON)) {
            return Instance.json;
        }

        throw new NullPointerException("Not found DataCodec for format:" + format.ordinal());
    }

}
