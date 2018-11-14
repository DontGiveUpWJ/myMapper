/**
 * @标题: UserService.java
 * @包名： com.sitech.service
 * @功能描述：TODO
 * @作者： NeverGiveUp-WJ
 * @创建时间： 2018年11月13日 下午5:13:32
 * @version v1.0
 */
package com.sitech.service;

import java.util.List;

import com.sitech.model.User;

/**
 * @类描述：
 * @项目名称：mymapper
 * @包名： com.sitech.service
 * @类名称：UserService
 * @创建人：NeverGiveUp-WJ
 * @创建时间：2018年11月13日下午5:13:32
 * @修改人：NeverGiveUp-WJ
 * @修改时间：2018年11月13日下午5:13:32
 * @修改备注：
 * @version v1.0
 * @see 
 * @bug 
 * @Copyright 
 * @mail
 */
public interface UserService extends IService<User>{
	
	public List<User> selectUser();

}
