package tbcloud.elastic.model.client;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tbcloud.httpproxy.model.HttpProxyRecord;
import tbcloud.lib.api.util.IDUtil;

import java.io.IOException;

/**
 * @author dzh
 * @date 2019-01-29 15:21
 */
public class TestTbcloudESClient {

    static Logger LOG = LoggerFactory.getLogger(TestTbcloudESClient.class);

    static TbcloudESClient client;

    static int serverId = 0;

    static long userId = 15L;

    @BeforeClass
    public static void init() {
        try {
            client = new TbcloudESClient(TestTbcloudESClient.class.getResourceAsStream("/elastic.properties"));
        } catch (IOException e) {
            LOG.error(e.getMessage(), e);
        }
    }

    @Test
    public void indexRecordTest() {
        HttpProxyRecord record = new HttpProxyRecord();
        record.setUserId(userId);
        record.setId(IDUtil.genHttpProxyId(serverId, userId));
        record.setNodeId("123456");
        record.setProxyStatus((byte) 0);
        record.setReqTime(System.currentTimeMillis());

        try {
            client.indexRecord(record);
        } catch (IOException e) {
            LOG.error(e.getMessage(), e);
        }
    }

    @AfterClass
    public static void close() {
        client.close();
    }
}
