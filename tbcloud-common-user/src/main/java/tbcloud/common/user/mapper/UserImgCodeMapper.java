package tbcloud.common.user.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import tbcloud.common.user.model.UserImgCode;
import tbcloud.common.user.model.UserImgCodeExample;

public interface UserImgCodeMapper {
    long countByExample(UserImgCodeExample example);

    int deleteByExample(UserImgCodeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserImgCode record);

    int insertSelective(UserImgCode record);

    List<UserImgCode> selectByExample(UserImgCodeExample example);

    UserImgCode selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserImgCode record, @Param("example") UserImgCodeExample example);

    int updateByExample(@Param("record") UserImgCode record, @Param("example") UserImgCodeExample example);

    int updateByPrimaryKeySelective(UserImgCode record);

    int updateByPrimaryKey(UserImgCode record);
}