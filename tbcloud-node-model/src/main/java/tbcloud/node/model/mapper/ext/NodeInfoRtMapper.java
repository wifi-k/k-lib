package tbcloud.node.model.mapper.ext;

import tbcloud.node.model.ext.NodeInfoRt;
import tbcloud.node.model.ext.NodeInfoRtExample;
import tbcloud.node.model.NodeRtInfoExample;

import java.util.List;

/**
 * @author dzh
 * @date 2018-11-20 17:27
 */
public interface NodeInfoRtMapper {

    /**
     * node_info left join node_rt
     *
     * @param example
     * @return
     */
    List<NodeInfoRt> selectByExampleLeftJoinRt(NodeInfoRtExample example);

    NodeInfoRt selectByPrimaryKey(String nodeId);

    /**
     * node_rt left join node_info
     *
     * @param example
     * @return
     */
    List<NodeInfoRt> selectByExampleLeftJoinInfo(NodeRtInfoExample example);
}
