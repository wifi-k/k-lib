package tbcloud.common.user.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tbcloud.common.user.model.UserDeveloper;
import tbcloud.common.user.model.UserDeveloperExample;

public interface UserDeveloperMapper {
    long countByExample(UserDeveloperExample example);

    int deleteByExample(UserDeveloperExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(UserDeveloper record);

    int insertSelective(UserDeveloper record);

    List<UserDeveloper> selectByExample(UserDeveloperExample example);

    UserDeveloper selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") UserDeveloper record, @Param("example") UserDeveloperExample example);

    int updateByExample(@Param("record") UserDeveloper record, @Param("example") UserDeveloperExample example);

    int updateByPrimaryKeySelective(UserDeveloper record);

    int updateByPrimaryKey(UserDeveloper record);
}