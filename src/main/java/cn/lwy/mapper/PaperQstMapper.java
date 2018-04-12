package cn.lwy.mapper;

import cn.lwy.pojo.PaperQst;
import cn.lwy.pojo.PaperQstExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaperQstMapper {
    int countByExample(PaperQstExample example);

    int deleteByExample(PaperQstExample example);

    int insert(PaperQst record);

    int insertSelective(PaperQst record);

    List<PaperQst> selectByExample(PaperQstExample example);

    int updateByExampleSelective(@Param("record") PaperQst record, @Param("example") PaperQstExample example);

    int updateByExample(@Param("record") PaperQst record, @Param("example") PaperQstExample example);
}