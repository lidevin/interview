package cn.lwy.mapper;

import cn.lwy.pojo.ExamInfo;
import cn.lwy.pojo.ExamInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExamInfoMapper {
    int countByExample(ExamInfoExample example);

    int deleteByExample(ExamInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExamInfo record);

    int insertSelective(ExamInfo record);

    List<ExamInfo> selectByExample(ExamInfoExample example);

    ExamInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExamInfo record, @Param("example") ExamInfoExample example);

    int updateByExample(@Param("record") ExamInfo record, @Param("example") ExamInfoExample example);

    int updateByPrimaryKeySelective(ExamInfo record);

    int updateByPrimaryKey(ExamInfo record);
}