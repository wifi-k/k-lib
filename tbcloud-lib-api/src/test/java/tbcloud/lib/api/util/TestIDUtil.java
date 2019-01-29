package tbcloud.lib.api.util;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

/**
 * @author dzh
 * @date 2018-11-11 23:42
 */
public class TestIDUtil {

    static Logger LOG = LoggerFactory.getLogger(TestIDUtil.class);

    @Test
    public void genApikeyTest() {
        LOG.info("{} {}", Long.toHexString(Long.MAX_VALUE), Long.toHexString(Long.MAX_VALUE).length());
        LOG.info("{}", Integer.parseInt("e", 16));
        // LOG.info("{} {} ", 15L * 15 * 15 * 15 * 15 * 15, 15L * 15 * 15 * 15 * 15 * 15 - Long.MAX_VALUE / (15 * 15 * 15 * 15 * 15 * 15 * 15 * 15 * 15));
        String hex = Long.toHexString(Long.MAX_VALUE);
        LOG.info("{} {} {} {}", Long.MAX_VALUE, hex, hex.length(), Long.parseLong(hex.substring(1), 16));
        LOG.info("{} {}", Integer.toHexString(Integer.MAX_VALUE).length(), Integer.toHexString(Integer.MIN_VALUE).length());

        LOG.info("{}", Integer.toHexString(Integer.MAX_VALUE).length());
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
        String appId = IDUtil.genAppId(userId, "tbcloud-httpproxy");
        LOG.info("{} {}", appId, IDUtil.readUserIDFromAppId(appId));
    }

    @Test
    public void testAppKey() {
        long userId = 101L;
        String appKey = IDUtil.genApikeyV1(userId);
        LOG.info("{} {}", appKey, IDUtil.readUserIDFromAppId(appKey));
    }

    @Test
    public void genNodeToken() {
        LOG.info("{}{}", Integer.toHexString(100), Long.toHexString(System.currentTimeMillis()));

        LOG.info("{}", IDUtil.genNodeToken("1231245"));
    }

    @Test
    public void genInsId() {
        long ts = System.currentTimeMillis();
        String id = null;
        for (int i = 0; i < 100; i++) {
            id = IDUtil.genInsId("1232312", 1);
        }
        LOG.info("{}", System.currentTimeMillis() - ts);

        ts = System.currentTimeMillis();
        id = null;
        for (int i = 0; i < 100; i++) {
            id = UUID.randomUUID().toString();
        }
        LOG.info("{}", System.currentTimeMillis() - ts);

        LOG.info("{}", IDUtil.uuid());
    }


    @Test
    public void genHttpProxyId() {
        int serverId = 100;
        long userId = Long.MAX_VALUE;
        String id = IDUtil.genHttpProxyId(serverId, userId);
        LOG.info("{}", 32 - 2 - 3 - Long.toHexString(Long.MAX_VALUE).length() - Integer
                .toHexString(Integer.MAX_VALUE).length());
        LOG.info("id-{} serverId-{} userId-{} read {} {}", id, serverId, userId,
                IDUtil.readServerIdFromHttpProxyId(id), IDUtil.readUserIdFromHttpProxyId(id));
    }

}
