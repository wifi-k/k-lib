package tbcloud.node.model.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tbcloud.node.model.NodeDevice;
import tbcloud.node.model.NodeDeviceExample;

public interface NodeDeviceMapper {
    long countByExample(NodeDeviceExample example);

    int deleteByExample(NodeDeviceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(NodeDevice record);

    int insertSelective(NodeDevice record);

    List<NodeDevice> selectByExample(NodeDeviceExample example);

    NodeDevice selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") NodeDevice record, @Param("example") NodeDeviceExample example);

    int updateByExample(@Param("record") NodeDevice record, @Param("example") NodeDeviceExample example);

    int updateByPrimaryKeySelective(NodeDevice record);

    int updateByPrimaryKey(NodeDevice record);
}