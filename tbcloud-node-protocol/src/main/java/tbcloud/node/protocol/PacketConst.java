package tbcloud.node.protocol;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * @author dzh
 * @date 2018-11-16 17:01
 */
public interface PacketConst {

    int M = 0xBC201811;

    int V20181130 = 20181130;

    enum DataType {
        JSON, KEY_VALUE
    }

    Charset CHARSET = StandardCharsets.UTF_8;
}
