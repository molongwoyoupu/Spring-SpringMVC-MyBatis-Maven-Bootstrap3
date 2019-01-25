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
	
	@RequestMapping(value = "/getUserList")
    @ResponseBody
    public DataResult getUserList(int page,int rows){
		System.out.println("page:"+page);
		System.out.println("rows:"+rows);
		DataResult result = userService.getUserList(page,rows);
        return result;
    }
	
	@RequestMapping(value = "/saveUserList")
    public void saveUserList(){
		userService.saveUserList();
    }

}
