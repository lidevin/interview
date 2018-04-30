package cn.lwy.mapper;

import cn.lwy.pojo.PaperQstList;
import cn.lwy.pojo.PaperQstListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaperQstListMapper {
    int countByExample(PaperQstListExample example);

    int deleteByExample(PaperQstListExample example);

    int insert(PaperQstList record);

    int insertSelective(PaperQstList record);

    List<PaperQstList> selectByExample(PaperQstListExample example);

    int updateByExampleSelective(@Param("record") PaperQstList record, @Param("example") PaperQstListExample example);

    int updateByExample(@Param("record") PaperQstList record, @Param("example") PaperQstListExample example);
}