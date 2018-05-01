package cn.lwy.service;

public interface BaseService<T> {

	/**
	 * 根据id获得实体
	 * @param id
	 * @return 数据库中查询的实体
	 */
	T getById(Number id);
	
	/**
	 * 根据id删除实体
	 * @param id
	 * @return  是否删除成功
	 */
    boolean deleteById(Number id);

    /**
     * 插入实体
     * @param entity
     * @return  是否插入成功
     */ 
    boolean insert(T entity);
    
    /**
     * 插入实体
     * @param entity
     * @return  是否插入成功
     */
    boolean insertSelective(T entity);
    
    /**
     * 更新实体
     * @param entity
     * @return  是否更新成功
     */
    boolean updateByIdSelective(T entity);
    
    /**
     * 更新实体
     * @param entity
     * @return  是否更新成功
     */
    boolean updateById(T entity);
}