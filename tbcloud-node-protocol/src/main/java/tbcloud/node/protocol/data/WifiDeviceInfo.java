package tbcloud.node.protocol.data;

/**
 * 连接wifi的设备列表
 *
 * @author dzh
 * @date 2019-03-28 14:14
 */
public class WifiDeviceInfo extends DataReq {

    private String device;

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public static final class DeviceInfo {

        private String mac;
        private String name;//hostname
        private Long onTime;
        private Long offTime;

        public String getMac() {
            return mac;
        }

        public void setMac(String mac) {
            this.mac = mac;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Long getOnTime() {
            return onTime;
        }

        public void setOnTime(Long onTime) {
            this.onTime = onTime;
        }

        public Long getOffTime() {
            return offTime;
        }

        public void setOffTime(Long offTime) {
            this.offTime = offTime;
        }


    }
}
