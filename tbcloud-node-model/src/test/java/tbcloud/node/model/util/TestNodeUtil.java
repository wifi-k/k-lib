package tbcloud.node.model.util;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author dzh
 * @date 2019-03-21 15:06
 */
public class TestNodeUtil {

    static final Logger LOG = LoggerFactory.getLogger(TestNodeUtil.class);

    @Test
    public void compareFirmwareTest() {
        String v1 = "SX_K1_V2.0.0.1";
        String v2 = "SX_K1_V2.1.0.1";
        LOG.info("compareFirmware {}", NodeUtil.compareFireware(v1, v2));
        LOG.info("compareFirmware {}", NodeUtil.compareFireware(v2, v1));
        LOG.info("compareFirmware {}", NodeUtil.compareFireware(v1, v1));
    }
}
