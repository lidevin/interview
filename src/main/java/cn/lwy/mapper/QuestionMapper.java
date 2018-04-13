package cn.lwy.mapper;

import cn.lwy.pojo.Question;
import cn.lwy.pojo.QuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionMapper {
    int countByExample(QuestionExample example);

    int deleteByExample(QuestionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Question record);

    int insertSelective(Question record);
    
    Question selectByPrimaryKey(Integer id);
    Question selectWithTagByPrimaryKey(Integer id);
    Question selectFullByPrimaryKey(Integer id);
    Question selectWithChoiceByPrimaryKey(Integer id);
    
    List<Question> selectByExample(QuestionExample example);
    List<Question> selectWithChoiceByExample(QuestionExample example);
    List<Question> selectWithTagByExample(QuestionExample example);
    List<Question> selectFullByExample(QuestionExample example);
    
    
    int updateByExampleSelective(@Param("record") Question record, @Param("example") QuestionExample example);

    int updateByExample(@Param("record") Question record, @Param("example") QuestionExample example);

    int updateByPrimaryKeySelective(Question record);

    int updateByPrimaryKey(Question record);
}