package tbcloud.user.model.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tbcloud.user.model.UserMessage;
import tbcloud.user.model.UserMessageExample;

public interface UserMessageMapper {
    long countByExample(UserMessageExample example);

    int deleteByExample(UserMessageExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserMessage record);

    int insertSelective(UserMessage record);

    List<UserMessage> selectByExample(UserMessageExample example);

    UserMessage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserMessage record, @Param("example") UserMessageExample example);

    int updateByExample(@Param("record") UserMessage record, @Param("example") UserMessageExample example);

    int updateByPrimaryKeySelective(UserMessage record);

    int updateByPrimaryKey(UserMessage record);
}