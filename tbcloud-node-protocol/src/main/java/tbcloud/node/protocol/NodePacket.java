package tbcloud.node.protocol;

/**
 * <pre>
 * Packet Binary Format([byte size]):
 * Packet -&gt; Magic[4] + Version[4] + IdSize[1] + Id[] + TokenSize[1] + Token[] + DataType[4] + DataFormat[1] + DataSize[4] + Data[] + Hash[8]
 *                                                                                                                                |
 * </pre>
 *
 * @author dzh
 * @date 2018-11-16 16:30
 */
public interface NodePacket<T> {

    int magic();

    int version();

    String id();

    String token();

    int dataType();

    byte dataFormat();

    T data();

    long hash(); // crc32

    NodePacket<T> magic(int m);

    NodePacket<T> version(int v);

    NodePacket<T> dataType(int t);

    NodePacket<T> id(String id);

    NodePacket<T> token(String token);

    NodePacket<T> dataFormat(byte dataType);

    NodePacket<T> data(T data);

    NodePacket<T> hash(long hash); // crc32

//    NodePacket<T> fork();// new NodePacket with the same id

}
