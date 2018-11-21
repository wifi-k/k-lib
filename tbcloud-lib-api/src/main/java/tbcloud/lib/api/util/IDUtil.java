package tbcloud.lib.api.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tbcloud.lib.api.ApiConst;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author dzh
 * @version 0.0.1
 * @date Jul 24, 2018 7:04:33 PM
 */
public class IDUtil {

    static Logger LOG = LoggerFactory.getLogger(IDUtil.class);

    static int TokenRandomSize = 24;

    static int IDRandomSize = 30;

    public static final String genToken(long usrId) {
        return genToken(usrId, "", "");
    }

    /**
     * 生成Api登录的token: 0xUsrID+24位随机数
     * <p>
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

    public static final String genEmailToken(long usrId) {
        return genToken(usrId);
    }

    public static final long decodeUserIDFromEmailToken(String token) {
        return decodeUserIDFromToken(token);
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

    /**
     * <pre>
     * 将imgCodeId转换为user_imgcode的编号ID,
     * 保证imgCodeId在1小时内具有相同的innerImgCodeId
     * </pre>
     *
     * @param imgCodeId
     * @return
     */
    public static final int innerImgCodeId(String imgCodeId) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHH");
        return Math.abs((imgCodeId + sdf.format(new Date())).hashCode() % ApiConst.IMGCODE_MAX_ID) + 1;
        // LOG.info("innerImgCode {} to {}", imgCodeId, r);
    }

    /**
     * @param apiVersion
     * @return
     */
    public static final String genImgCodeId(String apiVersion) {
        if (apiVersion == null) {
            apiVersion = "";
        }

        String hexMS = Long.toHexString(System.currentTimeMillis());
        String hexVersion = Integer.toHexString(apiVersion.hashCode());

        int ranlen = IDRandomSize - hexMS.length() - hexVersion.length();

        StringBuilder buf = new StringBuilder(32);
        buf.append(hexMS);
        buf.append(hexVersion);
        for (int i = 0; i < ranlen; ++i) {
            buf.append(Integer.toHexString(ThreadLocalRandom.current().nextInt(0, 16)));
        }
        String ranStr = buf.toString();
        if (ranlen < 0) ranStr = ranStr.substring(0, IDRandomSize);
        return ranStr;
    }

    public static final String genMobileVcode(int size) {
        if (size < 1) {
            size = 4;
        }
        StringBuilder buf = new StringBuilder(size);
        for (int i = 0; i < size; ++i) {
            buf.append(ThreadLocalRandom.current().nextInt(0, 10));
        }
        return buf.toString();
    }

    /**
     * max(userId) = Long.MAX_VALUE
     *
     * @param userId
     * @return versionHex[1] + userIdHexLengthHex[1] + userIdHex[] + RandomHex, max lenght 24
     */
    public static final String genApikeyV1(long userId) {
        int maxLen = 24;
        String versionHex = "1";

        String userIdHex = Long.toHexString(userId); // max length 16
        String userIdHexLengthHex = Integer.toHexString(userIdHex.length() - 1);

        StringBuffer buf = new StringBuffer(24);
        buf.append(versionHex);
        buf.append(userIdHexLengthHex);
        buf.append(userIdHex);
        //RandomHex
        int ranlen = maxLen - 2 - userIdHex.length();
        for (int i = 0; i < ranlen; ++i) {
            buf.append(Integer.toHexString(ThreadLocalRandom.current().nextInt(0, 16)));
        }

        return buf.toString();
    }

    public static final long readUserIdFromApikey(String apikey) {
        if (StringUtil.isEmpty(apikey))
            return 0L;

        char version = apikey.charAt(0);
        try {
            if ('1' == version) {
                int userIdHexLength = Integer.parseInt(apikey.substring(1, 1), 16) + 1;
                if (userIdHexLength > 0 && userIdHexLength <= 16) {
                    String userIdHex = apikey.substring(2, 2 + userIdHexLength);
                    return Long.parseLong(userIdHex, 16);
                }

            }
            //TODO else
        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
        }

        return 0L;
    }

    public static final String genUserInviteCode() {
        return "";
    }

    // private static final char inviteCode[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

}
