package tbcloud.lib.api.util;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.UnknownHostException;

/**
 * @author dzh
 * @date 2018-12-15 21:54
 */
public class TestStringUtil {

    static Logger LOG = LoggerFactory.getLogger(TestStringUtil.class);

    @Test
    public void localIpTest() {
        try {
            LOG.info("local ip {}", StringUtil.localIp());
        } catch (UnknownHostException e) {
            LOG.error(e.getMessage(), e);
        }
    }
}
