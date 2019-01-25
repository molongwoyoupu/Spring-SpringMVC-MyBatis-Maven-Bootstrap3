package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@RequestMapping("/")
	public String index() {
		return "NewFile";
	}
	
	@RequestMapping("/userSearchView")
	public String userSearchView() {
		return "manage/usersearch";
	}
	
	@RequestMapping("/index")
	public String protalIndexView() {
		return "protal/index";
	}
}
