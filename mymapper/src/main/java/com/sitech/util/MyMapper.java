/**
 * @标题: MyMapper.java
 * @包名： com.sitech.utils
 * @功能描述：TODO
 * @作者： NeverGiveUp-WJ
 * @创建时间： 2018年11月13日 下午4:58:30
 * @version v1.0
 */
package com.sitech.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @类描述：
 * @项目名称：mymapper
 * @包名： com.sitech.utils
 * @类名称：MyMapper
 * @创建人：NeverGiveUp-WJ
 * @创建时间：2018年11月13日下午4:58:30
 * @修改人：NeverGiveUp-WJ
 * @修改时间：2018年11月13日下午4:58:30
 * @修改备注：
 * @version v1.0
 * @see 
 * @bug 
 * @Copyright 
 * @mail
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
