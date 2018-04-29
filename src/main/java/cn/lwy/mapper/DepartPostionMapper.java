package cn.lwy.mapper;

import cn.lwy.pojo.DepartPostion;
import cn.lwy.pojo.DepartPostionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartPostionMapper {
    int countByExample(DepartPostionExample example);

    int deleteByExample(DepartPostionExample example);

    int deleteByPrimaryKey(String content);

    int insert(DepartPostion record);

    int insertSelective(DepartPostion record);

    List<DepartPostion> selectByExample(DepartPostionExample example);

    DepartPostion selectByPrimaryKey(String content);

    int updateByExampleSelective(@Param("record") DepartPostion record, @Param("example") DepartPostionExample example);

    int updateByExample(@Param("record") DepartPostion record, @Param("example") DepartPostionExample example);

    int updateByPrimaryKeySelective(DepartPostion record);

    int updateByPrimaryKey(DepartPostion record);
}