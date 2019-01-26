package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@RequestMapping("/userSearchView")
	public String userSearchView() {
		return "manage/usersearch";
	}
	
}
