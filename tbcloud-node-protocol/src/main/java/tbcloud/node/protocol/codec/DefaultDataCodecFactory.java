package tbcloud.node.protocol.codec;

import tbcloud.node.protocol.PacketConst;

/**
 * @author dzh
 * @date 2018-11-23 17:49
 */
public class DefaultDataCodecFactory implements DataCodecFactory {

    private DataCodec json = new JsonDataCodec();

    public final static DefaultDataCodecFactory Instance = new DefaultDataCodecFactory();

    public DataCodec codec(int dataType, int format) {
        if (PacketConst.DataFormat.JSON.ordinal() == format) {
            return json;
        }

        throw new NullPointerException("Not found DataCodec for format:" + format);
    }

}
