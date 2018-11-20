package tbcloud.node.protocol;

/**
 * Packet Binary Format([byte size]):
 * Packet -&gt; Magic[4] + Version[4] + Type[4] + IdSize[1] + Id[] + TokenSize[1] + Token[] + DataType[1] + DataSize[4] + Data[] + Hash[4]
 * |
 *
 * @author dzh
 * @date 2018-11-16 16:30
 */
public interface NodePacket {

    int magic();

    int version();

    int type();

    String id();

    String token();

    byte dataType();

    byte[] data();

    int hash();

}
