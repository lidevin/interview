package cn.lwy.mapper;

import cn.lwy.pojo.Assessment;
import cn.lwy.pojo.AssessmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssessmentMapper {
    int countByExample(AssessmentExample example);

    int deleteByExample(AssessmentExample example);

    int insert(Assessment record);

    int insertSelective(Assessment record);

    List<Assessment> selectByExample(AssessmentExample example);

    int updateByExampleSelective(@Param("record") Assessment record, @Param("example") AssessmentExample example);

    int updateByExample(@Param("record") Assessment record, @Param("example") AssessmentExample example);
}