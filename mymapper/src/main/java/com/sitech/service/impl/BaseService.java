/**
 * @标题: BaseService.java
 * @包名： com.sitech.service
 * @功能描述：TODO
 * @作者： NeverGiveUp-WJ
 * @创建时间： 2018年11月13日 下午5:09:39
 * @version v1.0
 */
package com.sitech.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sitech.service.IService;

import tk.mybatis.mapper.common.Mapper;

/**
 * @类描述：
 * @项目名称：mymapper
 * @包名： com.sitech.service
 * @类名称：BaseService
 * @创建人：NeverGiveUp-WJ
 * @创建时间：2018年11月13日下午5:09:39
 * @修改人：NeverGiveUp-WJ
 * @修改时间：2018年11月13日下午5:09:39
 * @修改备注：
 * @version v1.0
 * @see 
 * @bug 
 * @Copyright 
 * @mail
 */
public class BaseService<T> implements IService<T>{

	@Autowired
	protected Mapper<T> mapper;
	
	public Mapper<T> getMapper() {
        return mapper;
    }
	/**
	 * @描述:
	 * @方法名: selectByExample
	 * @param example
	 * @return
	 * @创建人：NeverGiveUp-WJ
	 * @创建时间：2018年11月13日下午5:09:58
	 * @修改人：NeverGiveUp-WJ
	 * @修改时间：2018年11月13日下午5:09:58
	 * @修改备注：
	 * @throws
	 */
	@Override
	public List<T> selectByExample(Object example) {
		 return mapper.selectByExample(example);
		 
		
	}
	/**
	 * @描述:
	 * @方法名: delete
	 * @param record
	 * @return
	 * @创建人：NeverGiveUp-WJ
	 * @创建时间：2018年11月13日下午5:37:01
	 * @修改人：NeverGiveUp-WJ
	 * @修改时间：2018年11月13日下午5:37:01
	 * @修改备注：
	 * @throws
	 */
	@Override
	public int delete(T record) {
		return mapper.delete(record);
	}
	/**
	 * @描述:
	 * @方法名: deleteByExample
	 * @param example
	 * @return
	 * @创建人：NeverGiveUp-WJ
	 * @创建时间：2018年11月13日下午5:37:01
	 * @修改人：NeverGiveUp-WJ
	 * @修改时间：2018年11月13日下午5:37:01
	 * @修改备注：
	 * @throws
	 */
	@Override
	public int deleteByExample(Object example) {
		return mapper.deleteByExample(example);
	}
	/**
	 * @描述:根据主键删除
	 * @方法名: deleteByPrimaryKey
	 * @param key
	 * @return
	 * @创建人：NeverGiveUp-WJ
	 * @创建时间：2018年11月13日下午5:37:01
	 * @修改人：NeverGiveUp-WJ
	 * @修改时间：2018年11月13日下午5:37:01
	 * @修改备注：
	 * @throws
	 */
	@Override
	public int deleteByPrimaryKey(Object key) {
		return mapper.deleteByPrimaryKey(key);
	}
	/**
	 * @描述:
	 * @方法名: equalsByPrimaryKey
	 * @param obj
	 * @return
	 * @创建人：NeverGiveUp-WJ
	 * @创建时间：2018年11月13日下午5:39:08
	 * @修改人：NeverGiveUp-WJ
	 * @修改时间：2018年11月13日下午5:39:08
	 * @修改备注：
	 * @throws
	 */
	@Override
	public boolean equalsByPrimaryKey(Object obj) {
		return mapper.equals(obj);
	}
	/**
	 * @描述:
	 * @方法名: existsWithPrimaryKey
	 * @param key
	 * @return
	 * @创建人：NeverGiveUp-WJ
	 * @创建时间：2018年11月13日下午5:40:01
	 * @修改人：NeverGiveUp-WJ
	 * @修改时间：2018年11月13日下午5:40:01
	 * @修改备注：
	 * @throws
	 */
	@Override
	public boolean existsWithPrimaryKey(Object key) {
		return mapper.existsWithPrimaryKey(key);
	}
	/**
	 * @描述:插入数据,需要有主键,需要数据库表中的所有字段全都存在,否则插入失败,此方法不常用
	 * @方法名: insert
	 * @param record
	 * @return
	 * @创建人：NeverGiveUp-WJ
	 * @创建时间：2018年11月13日下午5:41:19
	 * @修改人：NeverGiveUp-WJ
	 * @修改时间：2018年11月13日下午5:41:19
	 * @修改备注：
	 * @throws
	 */
	@Override
	public int insert(T record) {
		return mapper.insert(record);
	}
	/**
	 * @描述:插入数据,需要有主键,有什么属性插入什么属性
	 * @方法名: insertSelective
	 * @param record
	 * @return
	 * @创建人：NeverGiveUp-WJ
	 * @创建时间：2018年11月13日下午5:43:46
	 * @修改人：NeverGiveUp-WJ
	 * @修改时间：2018年11月13日下午5:43:46
	 * @修改备注：
	 * @throws
	 */
	@Override
	public int insertSelective(T record) {
		return mapper.insertSelective(record);
	}
	/**
	 * @描述:根据T对象中的属性名称查询,
	 * 	类似于select * from table where t.username=xxx and t.mobile = xxxx
	 * @方法名: select
	 * @param record
	 * @return
	 * @创建人：NeverGiveUp-WJ
	 * @创建时间：2018年11月13日下午5:50:58
	 * @修改人：NeverGiveUp-WJ
	 * @修改时间：2018年11月13日下午5:50:58
	 * @修改备注：
	 * @throws
	 */
	@Override
	public List<T> select(T record) {
		return mapper.select(record);
	}
	/**
	 * @描述:
	 * @方法名: selectAll
	 * @return
	 * @创建人：NeverGiveUp-WJ
	 * @创建时间：2018年11月13日下午5:50:58
	 * @修改人：NeverGiveUp-WJ
	 * @修改时间：2018年11月13日下午5:50:58
	 * @修改备注：
	 * @throws
	 */
	@Override
	public List<T> selectAll() {
		return mapper.selectAll();
	}
	/**
	 * @描述:根据主键查询
	 * @方法名: selectByPrimaryKey
	 * @param key
	 * @return
	 * @创建人：NeverGiveUp-WJ
	 * @创建时间：2018年11月13日下午5:54:05
	 * @修改人：NeverGiveUp-WJ
	 * @修改时间：2018年11月13日下午5:54:05
	 * @修改备注：
	 * @throws
	 */
	@Override
	public T selectByPrimaryKey(Object key) {
		return mapper.selectByPrimaryKey(key);
	}
	/**
	 * @描述:
	 * @方法名: selectCount
	 * @param record
	 * @return
	 * @创建人：NeverGiveUp-WJ
	 * @创建时间：2018年11月13日下午5:54:05
	 * @修改人：NeverGiveUp-WJ
	 * @修改时间：2018年11月13日下午5:54:05
	 * @修改备注：
	 * @throws
	 */
	@Override
	public int selectCount(T record) {
		return mapper.selectCount(record);
	}
	/**
	 * @描述:
	 * @方法名: selectCountByExample
	 * @param example
	 * @return
	 * @创建人：NeverGiveUp-WJ
	 * @创建时间：2018年11月13日下午5:54:05
	 * @修改人：NeverGiveUp-WJ
	 * @修改时间：2018年11月13日下午5:54:05
	 * @修改备注：
	 * @throws
	 */
	@Override
	public int selectCountByExample(Object example) {
		return mapper.selectCountByExample(example);
	}
	/**
	 * @描述:如果断定T对象的查询条件是一个,可以调用此方法,返回单个对象
	 * @方法名: selectOne
	 * @param record
	 * @return
	 * @创建人：NeverGiveUp-WJ
	 * @创建时间：2018年11月13日下午5:54:05
	 * @修改人：NeverGiveUp-WJ
	 * @修改时间：2018年11月13日下午5:54:05
	 * @修改备注：
	 * @throws
	 */
	@Override
	public T selectOne(T record) {
		return mapper.selectOne(record);
	}
	/**
	 * @描述:
	 * @方法名: updateByExample
	 * @param record
	 * @param example
	 * @return
	 * @创建人：NeverGiveUp-WJ
	 * @创建时间：2018年11月13日下午5:57:46
	 * @修改人：NeverGiveUp-WJ
	 * @修改时间：2018年11月13日下午5:57:46
	 * @修改备注：
	 * @throws
	 */
	@Override
	public int updateByExample(T record, Object example) {
		return mapper.updateByExample(record, example);
	}
	/**
	 * @描述:
	 * @方法名: updateByExampleSelective
	 * @param record
	 * @param example
	 * @return
	 * @创建人：NeverGiveUp-WJ
	 * @创建时间：2018年11月13日下午5:57:46
	 * @修改人：NeverGiveUp-WJ
	 * @修改时间：2018年11月13日下午5:57:46
	 * @修改备注：
	 * @throws
	 */
	@Override
	public int updateByExampleSelective(T record, Object example) {
		return mapper.updateByExampleSelective(record, example);
	}
	/**
	 * @描述:根据主键更新数据,需要把对象中所有的字段全部填充才能调用此方法,一般不常用!
	 * @方法名: updateByPrimaryKey
	 * @param record
	 * @return
	 * @创建人：NeverGiveUp-WJ
	 * @创建时间：2018年11月13日下午5:57:46
	 * @修改人：NeverGiveUp-WJ
	 * @修改时间：2018年11月13日下午5:57:46
	 * @修改备注：
	 * @throws
	 */
	@Override
	public int updateByPrimaryKey(T record) {
		return mapper.updateByPrimaryKey(record);
	}
	/**
	 * @描述:根据主键更新数据,T对象里面有什么属性就更新什么属性,如果T对象没有主键,抛出异常
	 * @方法名: updateByPrimaryKeySelective
	 * @param record
	 * @return
	 * @创建人：NeverGiveUp-WJ
	 * @创建时间：2018年11月13日下午5:57:46
	 * @修改人：NeverGiveUp-WJ
	 * @修改时间：2018年11月13日下午5:57:46
	 * @修改备注：
	 * @throws
	 */
	@Override
	public int updateByPrimaryKeySelective(T record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

}
