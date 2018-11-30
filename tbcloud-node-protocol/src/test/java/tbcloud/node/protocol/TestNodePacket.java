package tbcloud.node.protocol;

import com.google.gson.Gson;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tbcloud.node.protocol.data.rsp.Ins;

/**
 * @author dzh
 * @date 2018-11-23 18:17
 */
public class TestNodePacket {

    static Logger LOG = LoggerFactory.getLogger(TestNodePacket.class);

    @Test
    public void dataTypeTest() {
        LOG.info("{} {}", PacketConst.DataFormat.JSON.ordinal(), PacketConst.DataFormat.KEY_VALUE.ordinal());

        String json = "{}";
        Gson gson = new Gson();
        Ins ins = gson.fromJson(json, Ins.class);
        LOG.info("{} {}", ins.getIns(), ins.getVal());
    }
}
