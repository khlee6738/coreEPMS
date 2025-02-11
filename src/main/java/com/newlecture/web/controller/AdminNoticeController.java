package com.newlecture.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.newlecture.web.dto.NoticeViewDto;
import com.newlecture.web.service.NoticeService;

@Controller
@RequestMapping("/admin/notice/")
public class AdminNoticeController {
	
	@Autowired
	private NoticeService service;
	
	@RequestMapping("list")
	public String list() {
		List<NoticeViewDto> list = service.getList();
		return "admin/notice/list";
	}
	@RequestMapping("detail")
	public String detail() {
		
		NoticeViewDto noticeView = service.getDetail(1);
		
		return "admin/notice/detail";
	}
	@RequestMapping("reg")
	public String reg() {
		return "admin/notice/reg";
	}	
}
