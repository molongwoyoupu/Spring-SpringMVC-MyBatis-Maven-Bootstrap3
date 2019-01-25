package com.ssm.mapper;

import java.util.List;

import com.ssm.pojo.User;

public interface UserMapper {

	public Long insertUser(User user);
	
	public int insertUserList(List<User> userList);
	
	public List<User> getAllUsers();
}
