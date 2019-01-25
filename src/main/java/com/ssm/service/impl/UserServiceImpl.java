package com.ssm.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.common.pojo.DataResult;
import com.ssm.common.utils.RandomUtils;
import com.ssm.mapper.UserMapper;
import com.ssm.pojo.User;
import com.ssm.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public DataResult getUserList(int page, int rows) {
		// 查询之前,配置分页
		PageHelper.startPage(page, rows);
		// 进行查询
		List<User> list = userMapper.getAllUsers();
		PageInfo<User> pageInfo = new PageInfo<User>(list);
		// 返回结果
		DataResult dataResult = new DataResult();
		dataResult.setRows(list);
		dataResult.setTotal(pageInfo.getTotal());
		return dataResult;
	}

	@Override
	public void saveUserList() {
		List<User> userList = new ArrayList<User>();
		for (int i = 0; i < 10; i++) {
			User user = new User();
			user.setAccountNum(RandomUtils.getUUID());
			user.setNickName(RandomUtils.getRandomChar(3));
			user.setPassword("123");
			user.setGender("" + (int) (Math.random() * 1 + 1));
			user.setAge("" + (int) (Math.random() * 9 + 15));
			user.setCreateTime(new Date());
			userList.add(user);
		}
		userMapper.insertUserList(userList);
	}

}
