package cn.lwy.utils;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.lwy.pojo.Manager;
import cn.lwy.pojo.ManagerExample;

public interface ManagerMapper {
	/**
	 * 根据条件查询记录行数
	 * @param example  条件
	 * @return  记录行数
	 */
    int countByExample(ManagerExample example);
    /**
	 * 根据条件删除记录
	 * @param example  条件
	 * @return  删除的记录行数
	 */
    int deleteByExample(ManagerExample example);
    /**
     * 根据id删除记录
     * @param id
     * @return  删除记录行数
     */
    int deleteByPrimaryKey(Number id);
    /**
     * 插入记录
     * @param record  HR管理员实体
     * @return  记录行数
     */
    int insert(Manager record);
    
    /**
     * 插入记录(有选择性的插入数据)
     * @param record  HR管理员实体
     * @return  记录行数
     */
    int insertSelective(Manager record);
    /**
     * 根据条件查询记录
     * @param example  条件
     * @return  记录列表
     */
    List<Manager> selectByExample(ManagerExample example);
    /**
     * 根据id查询实体
     * @param id
     * @return  HR管理员实体
     */
    Manager selectByPrimaryKey(String id);
    /**
     * 
     */
    /**
     * 根据条件对字段进行判断再更新(如果为Null就忽略更新)
     * @param record  是要修改的部分值组成的对象(HR管理员实体)，其中有些属性为null则表示该项不修改
     * @param example  是一个对应的查询条件的类， 通过这个类可以实现 order by 和一部分的where 条件
     * @return  更新记录行数
     */
    int updateByExampleSelective(@Param("record") Manager record, @Param("example") ManagerExample example);
    /**
     * 根据条件对字段进行更新
     * @param record  是要修改的部分值组成的对象(HR管理员实体)
     * @param example  是一个对应的查询条件的类， 通过这个类可以实现 order by 和一部分的where 条件
     * @return  更新记录行数
     */
    int updateByExample(@Param("record") Manager record, @Param("example") ManagerExample example);
    /**
     * 根据条件对字段进行判断再更新(如果为Null就忽略更新)
     * @param record  HR管理员实体
     * @return  更新记录行数
     */
    int updateByPrimaryKeySelective(Manager record);
    /**
     * 根据条件对字段进行更新
     * @param record  HR管理员实体
     * @return  更新记录行数
     */
    int updateByPrimaryKey(Manager record);
    /**
     * 根据管理员名来查询实体
     * @param manager  要查询的HR管理员实体
     * @return  HR管理员实体
     */
    Manager getManagerByName(Manager manager);
}