package tbcloud.node.model.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tbcloud.node.model.NodeRt;
import tbcloud.node.model.NodeRtExample;

public interface NodeRtMapper {
    long countByExample(NodeRtExample example);

    int deleteByExample(NodeRtExample example);

    int deleteByPrimaryKey(String nodeId);

    int insert(NodeRt record);

    int insertSelective(NodeRt record);

    List<NodeRt> selectByExample(NodeRtExample example);

    NodeRt selectByPrimaryKey(String nodeId);

    int updateByExampleSelective(@Param("record") NodeRt record, @Param("example") NodeRtExample example);

    int updateByExample(@Param("record") NodeRt record, @Param("example") NodeRtExample example);

    int updateByPrimaryKeySelective(NodeRt record);

    int updateByPrimaryKey(NodeRt record);
}