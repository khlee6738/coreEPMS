package com.newlecture.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer/notice/")
public class NoticeController {

	@GetMapping("list")
	public String list() {
		//return "/WEB-INF/views/customer/notice/list.jsp";
		return "customer/notice/list";		
	}
	
}
