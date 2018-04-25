package cn.lwy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.lwy.pojo.Question;
import cn.lwy.pojo.QuestionExample;
import cn.lwy.vo.PageVo;

public interface QuestionMapper {
    int countByExample(QuestionExample example);

    int deleteByExample(QuestionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Question record);

    int insertSelective(Question record);

    List<Question> selectByExample(QuestionExample example);

    List<Question> selectWithKindByExampleAndVo(@Param("example") QuestionExample example,@Param("vo") PageVo vo);
    
    Question selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Question record, @Param("example") QuestionExample example);

    int updateByExample(@Param("record") Question record, @Param("example") QuestionExample example);

    int updateByPrimaryKeySelective(Question record);

    int updateByPrimaryKey(Question record);
}