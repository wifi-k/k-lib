package tbcloud.node.model.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tbcloud.node.model.NodeApp;
import tbcloud.node.model.NodeAppExample;

public interface NodeAppMapper {
    long countByExample(NodeAppExample example);

    int deleteByExample(NodeAppExample example);

    int deleteByPrimaryKey(Long id);

    int insert(NodeApp record);

    int insertSelective(NodeApp record);

    List<NodeApp> selectByExample(NodeAppExample example);

    NodeApp selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") NodeApp record, @Param("example") NodeAppExample example);

    int updateByExample(@Param("record") NodeApp record, @Param("example") NodeAppExample example);

    int updateByPrimaryKeySelective(NodeApp record);

    int updateByPrimaryKey(NodeApp record);
}