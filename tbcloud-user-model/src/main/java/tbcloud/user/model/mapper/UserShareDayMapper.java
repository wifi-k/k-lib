package tbcloud.user.model.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tbcloud.user.model.UserShareDay;
import tbcloud.user.model.UserShareDayExample;

public interface UserShareDayMapper {
    long countByExample(UserShareDayExample example);

    int deleteByExample(UserShareDayExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserShareDay record);

    int insertSelective(UserShareDay record);

    List<UserShareDay> selectByExample(UserShareDayExample example);

    UserShareDay selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserShareDay record, @Param("example") UserShareDayExample example);

    int updateByExample(@Param("record") UserShareDay record, @Param("example") UserShareDayExample example);

    int updateByPrimaryKeySelective(UserShareDay record);

    int updateByPrimaryKey(UserShareDay record);
}