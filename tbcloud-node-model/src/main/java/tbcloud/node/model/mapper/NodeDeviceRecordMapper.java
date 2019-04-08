package tbcloud.node.model.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tbcloud.node.model.NodeDeviceRecord;
import tbcloud.node.model.NodeDeviceRecordExample;

public interface NodeDeviceRecordMapper {
    long countByExample(NodeDeviceRecordExample example);

    int deleteByExample(NodeDeviceRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(NodeDeviceRecord record);

    int insertSelective(NodeDeviceRecord record);

    List<NodeDeviceRecord> selectByExample(NodeDeviceRecordExample example);

    NodeDeviceRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") NodeDeviceRecord record, @Param("example") NodeDeviceRecordExample example);

    int updateByExample(@Param("record") NodeDeviceRecord record, @Param("example") NodeDeviceRecordExample example);

    int updateByPrimaryKeySelective(NodeDeviceRecord record);

    int updateByPrimaryKey(NodeDeviceRecord record);
}