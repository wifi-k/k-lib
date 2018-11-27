package tbcloud.node.protocol;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * @author dzh
 * @date 2018-11-16 17:01
 */
public interface PacketConst extends DataType {

    int M = 0xBC201811;

    int V_20181130 = 20181130;

    enum DataFormat {
        NIL, JSON, KEY_VALUE;

        public static final DataFormat valueOf(int type) {
            switch (type) {
                case 1:
                    return DataFormat.JSON;
                case 2:
                    return DataFormat.KEY_VALUE;
            }
            return DataFormat.NIL;
        }
    }

    Charset CHARSET = StandardCharsets.UTF_8;
}
