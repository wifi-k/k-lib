package tbcloud.node.model.mapper;

import tbcloud.node.model.NodeInfoRt;
import tbcloud.node.model.NodeInfoRtExample;
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
