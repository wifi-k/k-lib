package tbcloud.node.model.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tbcloud.node.model.NodeInfo;
import tbcloud.node.model.NodeInfoExample;

public interface NodeInfoMapper {
    long countByExample(NodeInfoExample example);

    int deleteByExample(NodeInfoExample example);

    int deleteByPrimaryKey(String nodeId);

    int insert(NodeInfo record);

    int insertSelective(NodeInfo record);

    List<NodeInfo> selectByExample(NodeInfoExample example);

    NodeInfo selectByPrimaryKey(String nodeId);

    int updateByExampleSelective(@Param("record") NodeInfo record, @Param("example") NodeInfoExample example);

    int updateByExample(@Param("record") NodeInfo record, @Param("example") NodeInfoExample example);

    int updateByPrimaryKeySelective(NodeInfo record);

    int updateByPrimaryKey(NodeInfo record);
}