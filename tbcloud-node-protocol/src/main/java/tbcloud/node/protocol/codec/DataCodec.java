package tbcloud.node.protocol.codec;

/**
 * @author dzh
 * @date 2018-11-16 17:45
 */
public interface DataCodec<T> {

    byte[] encode(T data);

    T decode(byte[] bytes);
}
