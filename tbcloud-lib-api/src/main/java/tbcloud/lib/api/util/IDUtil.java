package tbcloud.lib.api.util;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author dzh
 * @date Jul 24, 2018 7:04:33 PM
 * @version 0.0.1
 */
public class IDUtil {

    static int TokenRandomSize = 24;

    static int IDRandomSize = 30;

    public static final String genToken(long usrId) {
        return genToken(usrId, "", "");
    }

    /**
     * 生成Api登录的token: 0xUsrID+24位随机数
     * 
     * openID sessionKey可选参数，可以是空字符串
     * 
     * @return
     */
    public static final String genToken(long usrId, String openID, String sessionKey) {
        String hexUsr = Long.toHexString(usrId);

        // String hexMS = Long.toHexString(System.currentTimeMillis());
        String hexID = Integer.toHexString(openID.hashCode());
        String hexKey = Integer.toHexString(sessionKey.hashCode());

        int ranlen = TokenRandomSize - hexID.length() - hexKey.length();

        StringBuilder buf = new StringBuilder(32);
        // buf.append(hexMS);
        buf.append(hexID);
        buf.append(hexKey);
        for (int i = 0; i < ranlen; i++) {
            buf.append(Integer.toHexString(ThreadLocalRandom.current().nextInt(0, 16)));
        }
        String ranStr = buf.toString();
        if (ranlen < 0) ranStr = ranStr.substring(0, TokenRandomSize);
        return hexUsr + ranStr;
    }

    public static final long decodeUserIDFromToken(String token) {
        if (token == null || token.length() <= TokenRandomSize) return -1;
        String hexUsr = token.substring(0, token.length() - TokenRandomSize);
        return Long.parseLong(hexUsr, 16);
    }

    public static final String genNoticeId(long usrId, int hashTitle) {
        String hexUsr = Long.toHexString(usrId);

        String hexMS = Long.toHexString(System.currentTimeMillis());
        String hexTitle = Integer.toHexString(hashTitle);

        int ranlen = IDRandomSize - hexMS.length() - hexTitle.length();

        StringBuilder buf = new StringBuilder(32);
        buf.append(hexMS);
        buf.append(hexTitle);
        for (int i = 0; i < ranlen; ++i) {
            buf.append(Integer.toHexString(ThreadLocalRandom.current().nextInt(0, 16)));
        }
        String ranStr = buf.toString();
        if (ranlen < 0) ranStr = ranStr.substring(0, IDRandomSize);
        return hexUsr + ranStr;
    }

    public static final String genCommentId(long usrId, int hashNotice) {
        String hexUsr = Long.toHexString(usrId);

        String hexMS = Long.toHexString(System.currentTimeMillis());
        String hexTitle = Integer.toHexString(hashNotice);

        int ranlen = IDRandomSize - hexMS.length() - hexTitle.length();

        StringBuilder buf = new StringBuilder(32);
        buf.append(hexMS);
        buf.append(hexTitle);
        for (int i = 0; i < ranlen; ++i) {
            buf.append(Integer.toHexString(ThreadLocalRandom.current().nextInt(0, 16)));
        }
        String ranStr = buf.toString();
        if (ranlen < 0) ranStr = ranStr.substring(0, IDRandomSize);
        return hexUsr + ranStr;
    }
}
