package tbcloud.node.protocol.data;

import tbcloud.node.protocol.util.GsonUtil;

/**
 * @author dzh
 * @date 2018-11-25 13:43
 */
public class DataReq implements Data {

    private String nodeId;

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @Override
    public String toString() {
        return GsonUtil.toJson(this);
    }
}
