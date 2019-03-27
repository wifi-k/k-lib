package tbcloud.node.model.wifi;

import java.util.List;

/**
 * wifi格式 [{"freq":0-所有,"rssi":5,"timer":[{"startTime":"23:00","endTime":"06:00"},{}]},{}]
 *
 * @author dzh
 * @date 2019-03-27 10:53
 */
public class WifiTimer {

    private int freq;
    private int rssi;
    private List<Timer> timer;

    public int getFreq() {
        return freq;
    }

    public void setFreq(int freq) {
        this.freq = freq;
    }

    public int getRssi() {
        return rssi;
    }

    public void setRssi(int rssi) {
        this.rssi = rssi;
    }

    public List<Timer> getTimer() {
        return timer;
    }

    public void setTimer(List<Timer> timer) {
        this.timer = timer;
    }

    public static final class Timer {
        private String startTime;
        private String endTime;

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public String getEndTime() {
            return endTime;
        }

        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }
    }

}
