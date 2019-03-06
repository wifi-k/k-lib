package tbcloud.node.protocol.data.ins;

/**
 * @author dzh
 * @date 2019-03-06 17:27
 */
public class FirmwareUpgrade extends InsVal {

    private String download;  //下载地址

    private String firmware; //固件版本

    public String getDownload() {
        return download;
    }

    public void setDownload(String download) {
        this.download = download;
    }

    public String getFirmware() {
        return firmware;
    }

    public void setFirmware(String firmware) {
        this.firmware = firmware;
    }
}
