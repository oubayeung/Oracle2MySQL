package com.ninemax.mapper;

import java.io.Serializable;
import java.util.List;

public interface BaseMapper<T> {

	/**
	 * <p>插入单条记录</p>
	 *  
	 * @param entity
	 * 		<li>插入对象实体</li>
	 * @return
	 */
	int insert(T entity);
	
	/**
	 * <p>选择性插入，null字段不插入</p>
	 * @param entity
	 * <li>插入实体对象</li>
	 * @return
	 */
	int insertSelective(T entity);
	
	/**
	 * <p>批量插入</p>
	 * @param entityList
	 * <li>插入对象实体列表</li>
	 * @return
	 */
	int insertBatch(List<T> entityList);
	
	/**
	 * <p>根据ID查询</p>
	 * @param id
	 * @return
	 */
	T selectById(Serializable id);
	
	/**
	 * <p>查询单条记录</p>
	 * @param entity
	 * @return
	 */
	T selectOne(T entity);
	
	/**
	 * <p>查询全部记录/p>
	 * @param entity
	 * @return
	 */
	List<T> selectList(T entity);
	
	/**
	 * <p>通过ID批量查询</p>
	 * @param idsList
	 * 		<li>ID列表集合</li>
	 * @return
	 */
	List<T> selectBatchByIds(List<? extends Serializable> idsList);
	
	/**
	 * <p>查询总记录数</p>
	 * @param entity
	 * @return
	 */
	int selectToTalCount(T entity);
}
