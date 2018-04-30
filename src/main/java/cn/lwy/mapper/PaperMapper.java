package cn.lwy.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import cn.lwy.pojo.Paper;
import cn.lwy.pojo.PaperExample;
import cn.lwy.vo.PageVo;

public interface PaperMapper {
    int countByExample(PaperExample example);

    int deleteByExample(PaperExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Paper record);

    int insertSelective(Paper record);

    List<Paper> selectByExample(PaperExample example);

    List<Paper> selectByExampleAndVo(@Param("example") PaperExample example,@Param("vo") PageVo vo);
    
    Paper selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Paper record, @Param("example") PaperExample example);

    int updateByExample(@Param("record") Paper record, @Param("example") PaperExample example);

    int updateByPrimaryKeySelective(Paper record);

    int updateByPrimaryKey(Paper record);
}