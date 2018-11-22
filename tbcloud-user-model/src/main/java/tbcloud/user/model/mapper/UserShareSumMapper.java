package tbcloud.user.model.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tbcloud.user.model.UserShareSum;
import tbcloud.user.model.UserShareSumExample;

public interface UserShareSumMapper {
    long countByExample(UserShareSumExample example);

    int deleteByExample(UserShareSumExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(UserShareSum record);

    int insertSelective(UserShareSum record);

    List<UserShareSum> selectByExample(UserShareSumExample example);

    UserShareSum selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") UserShareSum record, @Param("example") UserShareSumExample example);

    int updateByExample(@Param("record") UserShareSum record, @Param("example") UserShareSumExample example);

    int updateByPrimaryKeySelective(UserShareSum record);

    int updateByPrimaryKey(UserShareSum record);
}