package tbcloud.node.model.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author dzh
 * @date 2019-03-21 15:04
 */
public class NodeUtil {

    static final Logger LOG = LoggerFactory.getLogger(NodeUtil.class);

    /**
     * 比较版本
     * <p>
     * 小K版本号定义 SX_K1_V2.X.X.X 第一个版本为SX_K1_V2.0.0.1 SX表示树熊的拼音缩写 K1是产品名字 2表示小K系列产品
     * （0分配给了树熊的老产品 1分配给了星速的产品） X.X.X分别表示主版本、次版本和细小改动版本号
     *
     * @param v1
     * @param v2
     * @return 1 if v1 > v2,0 if v1=v2, -1 if v1<v2
     */
    public static final int compareFireware(String v1, String v2) {
        String[] d1 = v1.split("\\.", 4);
        String[] d2 = v2.split("\\.", 4);

        try {
            int v = Integer.parseInt(d1[1]) - Integer.parseInt(d2[1]);
            if (v != 0) {
                return v > 0 ? 1 : -1;
            }

            v = Integer.parseInt(d1[2]) - Integer.parseInt(d2[2]);
            if (v != 0) {
                return v > 0 ? 1 : -1;
            }

            v = Integer.parseInt(d1[3]) - Integer.parseInt(d2[3]);
            if (v != 0) {
                return v > 0 ? 1 : -1;
            }
        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
        }

        return 0;
    }
}
