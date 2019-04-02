package tbcloud.lib.api.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author dzh
 * @date 2019-03-31 15:15
 */
public class MacUtil {

    static final Logger LOG = LoggerFactory.getLogger(MacUtil.class);

    public static final String clean(String mac) {
        return mac.replaceAll("[-:]", "");
    }

    public static Long macValue(String mac) {
        return Long.parseLong(mac, 16);
    }

}
