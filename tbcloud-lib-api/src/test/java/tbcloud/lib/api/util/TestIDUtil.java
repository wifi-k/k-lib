package tbcloud.lib.api.util;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author dzh
 * @date 2018-11-11 23:42
 */
public class TestIDUtil {

    static Logger LOG = LoggerFactory.getLogger(TestIDUtil.class);

    public void genApikeyTest() {
        LOG.info("{} {}", Long.toHexString(Long.MAX_VALUE), Long.toHexString(Long.MAX_VALUE).length());
        LOG.info("{}", Integer.parseInt("e", 16));
        LOG.info("{} {} ", 36L * 36 * 36 * 36 * 36 * 36 * 36, 36L * 36 * 36 * 36 * 36 - Long.MAX_VALUE / 36);
        LOG.info("{} {} ", 16L * 16 * 16 * 16 * 16 * 16, 16L * 16 * 16 * 16 * 16 * 16 - Long.MAX_VALUE);
    }

    @Test
    public void testMD5() {
        String md5 = StringUtil.MD5Encode("abcd");
        LOG.info(md5);
    }


}
