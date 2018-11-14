/**
 * @标题: UserServiceImpl.java
 * @包名： com.sitech.service.impl
 * @功能描述：TODO
 * @作者： NeverGiveUp-WJ
 * @创建时间： 2018年11月13日 下午5:14:29
 * @version v1.0
 */
package com.sitech.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sitech.mapper.UserMapper;
import com.sitech.model.User;
import com.sitech.service.UserService;

/**
 * @类描述：
 * @项目名称：mymapper
 * @包名： com.sitech.service.impl
 * @类名称：UserServiceImpl
 * @创建人：NeverGiveUp-WJ
 * @创建时间：2018年11月13日下午5:14:29
 * @修改人：NeverGiveUp-WJ
 * @修改时间：2018年11月13日下午5:14:29
 * @修改备注：
 * @version v1.0
 * @see 
 * @bug 
 * @Copyright 
 * @mail
 */
@Service
public class UserServiceImpl extends BaseService<User> implements UserService{

	@Autowired
	private UserMapper mapper;

	/**
	 * @描述:
	 * @方法名: selectUser
	 * @return
	 * @创建人：NeverGiveUp-WJ
	 * @创建时间：2018年11月13日下午5:27:13
	 * @修改人：NeverGiveUp-WJ
	 * @修改时间：2018年11月13日下午5:27:13
	 * @修改备注：
	 * @throws
	 */
	@Override
	public List<User> selectUser() {
		return mapper.selectUser();
	}
}
