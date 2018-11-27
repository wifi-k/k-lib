package tbcloud.node.protocol.data;

/**
 * @author dzh
 * @date 2018-11-25 14:38
 */
public class ProcessNodeMonitor extends NodeMonitor {

    private int pid;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
}
