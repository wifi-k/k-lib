package tbcloud.user.model.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tbcloud.user.model.UserShareRecord;
import tbcloud.user.model.UserShareRecordExample;

public interface UserShareRecordMapper {
    long countByExample(UserShareRecordExample example);

    int deleteByExample(UserShareRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserShareRecord record);

    int insertSelective(UserShareRecord record);

    List<UserShareRecord> selectByExample(UserShareRecordExample example);

    UserShareRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserShareRecord record, @Param("example") UserShareRecordExample example);

    int updateByExample(@Param("record") UserShareRecord record, @Param("example") UserShareRecordExample example);

    int updateByPrimaryKeySelective(UserShareRecord record);

    int updateByPrimaryKey(UserShareRecord record);
}