package cn.lwy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.lwy.pojo.Assessment;
import cn.lwy.pojo.AssessmentExample;
import cn.lwy.vo.PageVo;

public interface AssessmentMapper {
    int countByExample(AssessmentExample example);

    int deleteByExample(AssessmentExample example);

    int insert(Assessment record);

    int insertSelective(Assessment record);

    List<Assessment> selectByExample(AssessmentExample example);

    List<Assessment> selectByExampleAndVo(@Param("example") AssessmentExample example,@Param("vo") PageVo vo);
    
    int updateByExampleSelective(@Param("record") Assessment record, @Param("example") AssessmentExample example);

    int updateByExample(@Param("record") Assessment record, @Param("example") AssessmentExample example);
}