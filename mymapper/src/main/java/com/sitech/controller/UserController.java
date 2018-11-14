/**
 * @标题: UserController.java
 * @包名： com.sitech.controller
 * @功能描述：TODO
 * @作者： NeverGiveUp-WJ
 * @创建时间： 2018年11月13日 下午5:16:15
 * @version v1.0
 */
package com.sitech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sitech.model.User;
import com.sitech.service.UserService;

import tk.mybatis.mapper.entity.Example;

/**
 * @类描述：
 * @项目名称：mymapper
 * @包名： com.sitech.controller
 * @类名称：UserController
 * @创建人：NeverGiveUp-WJ
 * @创建时间：2018年11月13日下午5:16:15
 * @修改人：NeverGiveUp-WJ
 * @修改时间：2018年11月13日下午5:16:15
 * @修改备注：
 * @version v1.0
 * @see 
 * @bug 
 * @Copyright 
 * @mail
 */
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value = "/users")
	public Object findUser() {
		
		return userService.selectUser();
	}
	public static void main(String[] args) {
		int [][] a = {{1,2,3},{4,5,6}};
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
