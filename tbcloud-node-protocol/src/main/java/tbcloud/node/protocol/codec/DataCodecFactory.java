package tbcloud.node.protocol.codec;

/**
 * @author dzh
 * @date 2018-11-23 18:11
 */
public interface DataCodecFactory {

    DataCodec codec(int dataType, int format);

}
