package tbcloud.node.protocol.data;

/**
 * @author dzh
 * @date 2018-11-25 14:33
 */
public class MonitorInfo extends DataReq {

    private int type;

    private long takeTime;

    private float cpuLoad;
    private int cpuUsage;
    private int memUsage;
    private int diskUsage;

    private int pid;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public float getCpuLoad() {
        return cpuLoad;
    }

    public void setCpuLoad(float cpuLoad) {
        this.cpuLoad = cpuLoad;
    }

    public int getCpuUsage() {
        return cpuUsage;
    }

    public void setCpuUsage(int cpuUsage) {
        this.cpuUsage = cpuUsage;
    }

    public int getMemUsage() {
        return memUsage;
    }

    public void setMemUsage(int memUsage) {
        this.memUsage = memUsage;
    }

    public int getDiskUsage() {
        return diskUsage;
    }

    public void setDiskUsage(int diskUsage) {
        this.diskUsage = diskUsage;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public long getTakeTime() {
        return takeTime;
    }

    public void setTakeTime(long takeTime) {
        this.takeTime = takeTime;
    }
}
