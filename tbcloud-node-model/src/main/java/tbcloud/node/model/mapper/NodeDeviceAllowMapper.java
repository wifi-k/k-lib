package tbcloud.node.model.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tbcloud.node.model.NodeDeviceAllow;
import tbcloud.node.model.NodeDeviceAllowExample;

public interface NodeDeviceAllowMapper {
    long countByExample(NodeDeviceAllowExample example);

    int deleteByExample(NodeDeviceAllowExample example);

    int deleteByPrimaryKey(Long id);

    int insert(NodeDeviceAllow record);

    int insertSelective(NodeDeviceAllow record);

    List<NodeDeviceAllow> selectByExample(NodeDeviceAllowExample example);

    NodeDeviceAllow selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") NodeDeviceAllow record, @Param("example") NodeDeviceAllowExample example);

    int updateByExample(@Param("record") NodeDeviceAllow record, @Param("example") NodeDeviceAllowExample example);

    int updateByPrimaryKeySelective(NodeDeviceAllow record);

    int updateByPrimaryKey(NodeDeviceAllow record);
}