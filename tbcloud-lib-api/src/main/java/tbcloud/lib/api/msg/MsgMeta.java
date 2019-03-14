package tbcloud.lib.api.msg;

/**
 * @author dzh
 * @date 2018-12-27 15:16
 */
public interface MsgMeta {

    String Topic_User = "tbcUser";
    String Topic_Node = "tbcNode";
    String Topic_HttpProxy = "tbcHttpProxy";

    String Node_Ssid_List = "nodeSsidList"; //[{"freq":1, "ssid":"","rssi":-60}, {"freq":2, "ssid":"","rssi":-60}]

}
