/**
 * @标题: IService.java
 * @包名： com.sitech
 * @功能描述：TODO
 * @作者： NeverGiveUp-WJ
 * @创建时间： 2018年11月13日 下午5:08:27
 * @version v1.0
 */
package com.sitech.service;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 * @类描述：
 * @项目名称：mymapper
 * @包名： com.sitech
 * @类名称：IService
 * @创建人：NeverGiveUp-WJ
 * @创建时间：2018年11月13日下午5:08:27
 * @修改人：NeverGiveUp-WJ
 * @修改时间：2018年11月13日下午5:08:27
 * @修改备注：
 * @version v1.0
 * @see 
 * @bug 
 * @Copyright 
 * @mail
 */
public interface IService <T>{
	
	
	
	int delete(T record);
	int deleteByExample(Object example);
	int deleteByPrimaryKey(Object key);
	boolean equalsByPrimaryKey(Object obj);
	boolean existsWithPrimaryKey(Object key);
	int insert(T record);
	int insertSelective(T record);
	List<T> select(T record);
	List<T> selectAll();
	List<T> selectByExample(Object example);
	T selectByPrimaryKey(Object key);
	int selectCount(T record);
	int selectCountByExample(Object example);
	T selectOne(T record);
	int updateByExample(T record, Object example);
	int updateByExampleSelective(T record, Object example);
	int updateByPrimaryKey(T record);
	int updateByPrimaryKeySelective(T record);
	
}
