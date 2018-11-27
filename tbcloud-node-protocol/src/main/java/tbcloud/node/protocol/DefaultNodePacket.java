package tbcloud.node.protocol;

/**
 * @author dzh
 * @date 2018-11-24 23:21
 */
public class DefaultNodePacket<T> implements NodePacket<T> {

    private int magic;
    private int version;
    private String id;
    private String token;
    private int dataType;
    private byte dataFormat;
    private T data;
    private long hash;

    @Override
    public int magic() {
        return magic;
    }

    @Override
    public int version() {
        return version;
    }

    @Override
    public int dataType() {
        return dataType;
    }

    @Override
    public String id() {
        return id;
    }

    @Override
    public String token() {
        return token;
    }

    @Override
    public byte dataFormat() {
        return dataFormat;
    }

    @Override
    public T data() {
        return data;
    }

    @Override
    public long hash() {
        return hash;
    }

    @Override
    public NodePacket<T> magic(int m) {
        this.magic = m;
        return this;
    }

    @Override
    public NodePacket<T> version(int v) {
        this.version = v;
        return this;
    }

    @Override
    public NodePacket<T> dataType(int dataType) {
        this.dataType = dataType;
        return this;
    }

    @Override
    public NodePacket<T> id(String id) {
        this.id = id;
        return this;
    }

    @Override
    public NodePacket<T> token(String token) {
        this.token = token;
        return this;
    }

    @Override
    public NodePacket<T> dataFormat(byte dataFormat) {
        this.dataFormat = dataFormat;
        return this;
    }

    @Override
    public NodePacket<T> data(T data) {
        this.data = data;
        return this;
    }

    @Override
    public NodePacket<T> hash(long hash) {
        this.hash = hash;
        return this;
    }
}
