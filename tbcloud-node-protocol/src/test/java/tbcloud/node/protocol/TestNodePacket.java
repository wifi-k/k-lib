package tbcloud.node.protocol;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author dzh
 * @date 2018-11-23 18:17
 */
public class TestNodePacket {

    static Logger LOG = LoggerFactory.getLogger(TestNodePacket.class);

    @Test
    public void dataTypeTest() {
        LOG.info("{} {}", PacketConst.DataFormat.JSON.ordinal(), PacketConst.DataFormat.KEY_VALUE.ordinal());
    }
}
