package cn.lwy.mapper;

import cn.lwy.pojo.QstTag;
import cn.lwy.pojo.QstTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QstTagMapper {
    int countByExample(QstTagExample example);

    int deleteByExample(QstTagExample example);

    int insert(QstTag record);

    int insertSelective(QstTag record);

    List<QstTag> selectByExample(QstTagExample example);

    int updateByExampleSelective(@Param("record") QstTag record, @Param("example") QstTagExample example);

    int updateByExample(@Param("record") QstTag record, @Param("example") QstTagExample example);
}