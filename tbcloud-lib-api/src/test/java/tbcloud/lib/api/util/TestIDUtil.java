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

        LOG.info("{}", Integer.toHexString("".hashCode()));
        LOG.info("{}", Long.parseLong("600", 16));

        long userId = 1L;
        String token = IDUtil.genToken(userId);
        LOG.info("{} {}", token, IDUtil.decodeUserIDFromToken(token));

    }

    @Test
    public void testAppId() {
        long userId = 1L;
        String appId = IDUtil.genAppId(userId, "tbcloud");
        LOG.info("{} {}", appId, IDUtil.decodeUserIDFromAppId(appId));
    }

    @Test
    public void testAppKey() {
        long userId = 101L;
        String appKey = IDUtil.genApikeyV1(userId);
        LOG.info("{} {}", appKey, IDUtil.decodeUserIDFromAppId(appKey));
    }


}
