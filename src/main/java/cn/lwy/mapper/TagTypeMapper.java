package cn.lwy.mapper;

import cn.lwy.pojo.TagType;
import cn.lwy.pojo.TagTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TagTypeMapper {
    int countByExample(TagTypeExample example);

    int deleteByExample(TagTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TagType record);

    int insertSelective(TagType record);

    List<TagType> selectByExample(TagTypeExample example);

    TagType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TagType record, @Param("example") TagTypeExample example);

    int updateByExample(@Param("record") TagType record, @Param("example") TagTypeExample example);

    int updateByPrimaryKeySelective(TagType record);

    int updateByPrimaryKey(TagType record);
}