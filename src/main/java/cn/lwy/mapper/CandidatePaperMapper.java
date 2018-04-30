package cn.lwy.mapper;

import cn.lwy.pojo.CandidatePaper;
import cn.lwy.pojo.CandidatePaperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CandidatePaperMapper {
    int countByExample(CandidatePaperExample example);

    int deleteByExample(CandidatePaperExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CandidatePaper record);

    int insertSelective(CandidatePaper record);

    List<CandidatePaper> selectByExample(CandidatePaperExample example);

    CandidatePaper selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CandidatePaper record, @Param("example") CandidatePaperExample example);

    int updateByExample(@Param("record") CandidatePaper record, @Param("example") CandidatePaperExample example);

    int updateByPrimaryKeySelective(CandidatePaper record);

    int updateByPrimaryKey(CandidatePaper record);
}