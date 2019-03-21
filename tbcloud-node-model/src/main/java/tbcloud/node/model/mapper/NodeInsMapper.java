package tbcloud.node.model.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tbcloud.node.model.NodeIns;
import tbcloud.node.model.NodeInsExample;

public interface NodeInsMapper {
    long countByExample(NodeInsExample example);

    int deleteByExample(NodeInsExample example);

    int deleteByPrimaryKey(String id);

    int insert(NodeIns record);

    int insertSelective(NodeIns record);

    List<NodeIns> selectByExample(NodeInsExample example);

    NodeIns selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") NodeIns record, @Param("example") NodeInsExample example);

    int updateByExample(@Param("record") NodeIns record, @Param("example") NodeInsExample example);

    int updateByPrimaryKeySelective(NodeIns record);

    int updateByPrimaryKey(NodeIns record);
}