package cn.lwy.mapper;

import cn.lwy.pojo.Candidate;
import cn.lwy.pojo.CandidateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CandidateMapper {
    int countByExample(CandidateExample example);

    int deleteByExample(CandidateExample example);

    int deleteByPrimaryKey(String id);

    int insert(Candidate record);

    int insertSelective(Candidate record);

    List<Candidate> selectByExample(CandidateExample example);

    Candidate selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Candidate record, @Param("example") CandidateExample example);

    int updateByExample(@Param("record") Candidate record, @Param("example") CandidateExample example);

    int updateByPrimaryKeySelective(Candidate record);

    int updateByPrimaryKey(Candidate record);
}