package cn.lwy.mapper;

import cn.lwy.pojo.Choice;
import cn.lwy.pojo.ChoiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChoiceMapper {
    int countByExample(ChoiceExample example);

    int deleteByExample(ChoiceExample example);

    int insert(Choice record);

    int insertSelective(Choice record);

    List<Choice> selectByExample(ChoiceExample example);

    int updateByExampleSelective(@Param("record") Choice record, @Param("example") ChoiceExample example);

    int updateByExample(@Param("record") Choice record, @Param("example") ChoiceExample example);
}