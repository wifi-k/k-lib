package tbcloud.node.protocol.codec;

import tbcloud.node.protocol.PacketConst;

/**
 * @author dzh
 * @date 2018-11-23 18:11
 */
public interface DataCodecFactory {

    DataCodec codec(PacketConst.DataFormat format);

}
