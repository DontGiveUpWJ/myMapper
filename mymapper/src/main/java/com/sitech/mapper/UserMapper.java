/**
 * @标题: UserMapper.java
 * @包名： com.sitech.mapper
 * @功能描述：TODO
 * @作者： NeverGiveUp-WJ
 * @创建时间： 2018年11月13日 下午5:07:13
 * @version v1.0
 */
package com.sitech.mapper;

import java.util.List;

import com.sitech.model.User;
import com.sitech.util.MyMapper;

/**
 * @类描述：
 * @项目名称：mymapper
 * @包名： com.sitech.mapper
 * @类名称：UserMapper
 * @创建人：NeverGiveUp-WJ
 * @创建时间：2018年11月13日下午5:07:13
 * @修改人：NeverGiveUp-WJ
 * @修改时间：2018年11月13日下午5:07:13
 * @修改备注：
 * @version v1.0
 * @see 
 * @bug 
 * @Copyright 
 * @mail
 */
public interface UserMapper extends MyMapper<User>{
	
	public List<User> selectUser();

}
