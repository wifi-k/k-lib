package tbcloud.httpproxy.protocol.codec;

import tbcloud.node.protocol.PacketConst;
import tbcloud.node.protocol.codec.DataCodec;
import tbcloud.node.protocol.codec.DefaultDataCodecFactory;

/**
 * @author dzh
 * @date 2018-12-14 01:50
 */
public class HttpProxyDataCodecFactory extends DefaultDataCodecFactory {

    private HttpProxyDataCodec httpProxyDataCodec = new HttpProxyDataCodec();

    @Override
    public DataCodec codec(int dataType, int format) {
        if ((dataType >= 200 && dataType < 300) || (dataType >= 10200 && dataType < 10300)) { //http proxy
            if (format == PacketConst.DataFormat.BINARY.ordinal())
                return httpProxyDataCodec;
        }
        return super.codec(dataType, format);
    }
}
