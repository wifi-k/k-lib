package tbcloud.node.model.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tbcloud.node.model.NodeDeviceDay;
import tbcloud.node.model.NodeDeviceDayExample;

public interface NodeDeviceDayMapper {
    long countByExample(NodeDeviceDayExample example);

    int deleteByExample(NodeDeviceDayExample example);

    int deleteByPrimaryKey(Long id);

    int insert(NodeDeviceDay record);

    int insertSelective(NodeDeviceDay record);

    List<NodeDeviceDay> selectByExample(NodeDeviceDayExample example);

    NodeDeviceDay selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") NodeDeviceDay record, @Param("example") NodeDeviceDayExample example);

    int updateByExample(@Param("record") NodeDeviceDay record, @Param("example") NodeDeviceDayExample example);

    int updateByPrimaryKeySelective(NodeDeviceDay record);

    int updateByPrimaryKey(NodeDeviceDay record);
}