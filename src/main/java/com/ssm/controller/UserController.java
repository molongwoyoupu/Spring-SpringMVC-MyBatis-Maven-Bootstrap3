package com.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.common.pojo.DataResult;
import com.ssm.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	/**
	 * 获取用户列表
	 * @param page 页数
	 * @param rows 行数
	 * @return
	 */
	@RequestMapping(value = "/getUserList")
    @ResponseBody
    public DataResult getUserList(int page,int rows){
		DataResult result = userService.getUserList(page,rows);
        return result;
    }
	/**
	 * 随机创建用户
	 */
	@RequestMapping(value = "/saveUserList")
	@ResponseBody
    public void saveUserList(){
		userService.saveUserList();
    }

}
