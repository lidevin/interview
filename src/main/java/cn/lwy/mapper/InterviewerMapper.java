package cn.lwy.mapper;

import cn.lwy.pojo.Interviewer;
import cn.lwy.pojo.InterviewerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InterviewerMapper {
    int countByExample(InterviewerExample example);

    int deleteByExample(InterviewerExample example);

    int deleteByPrimaryKey(String id);

    int insert(Interviewer record);

    int insertSelective(Interviewer record);

    List<Interviewer> selectByExample(InterviewerExample example);

    Interviewer selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Interviewer record, @Param("example") InterviewerExample example);

    int updateByExample(@Param("record") Interviewer record, @Param("example") InterviewerExample example);

    int updateByPrimaryKeySelective(Interviewer record);

    int updateByPrimaryKey(Interviewer record);
}