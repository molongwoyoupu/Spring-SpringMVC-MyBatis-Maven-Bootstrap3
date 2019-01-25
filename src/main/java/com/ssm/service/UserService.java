package com.ssm.service;

import com.ssm.common.pojo.DataResult;

public interface UserService {

	public DataResult getUserList(int page,int rows);
	
	public void saveUserList();
}
