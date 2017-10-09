package com.aboo.vapp.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aboo.vapp.core.data.mapper.UserMapper;
import com.aboo.vapp.core.model.User;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	public boolean insertUser(){
		User user = new User();
		user.setId(1);
		user.setUname("test");
		userMapper.insertByObject(user);
		return true;
	}
	
	public User findByName(String uname){
		return userMapper.findByName(uname);
	}
	
}
