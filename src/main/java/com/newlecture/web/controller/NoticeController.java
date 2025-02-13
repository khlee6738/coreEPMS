package com.newlecture.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.newlecture.web.dto.NoticeViewDto;
import com.newlecture.web.service.NoticeService;

@Controller
@RequestMapping("/customer/notice/")
public class NoticeController {

	@Autowired
	private NoticeService service;
	
	@GetMapping("list")
	public String list(Model model) {
		int page = 1;
		String field = "";
		String query = "";
		int pub = 0; //관리자 리스트 페이지설정 (일반사용자는 1, 이경우에는 공개처리된것만 보임)
		
		List<NoticeViewDto> list = service.getList(page,field,query,pub);
		
		model.addAttribute("list", list);
		return "customer/notice/list";		
	}

	@GetMapping("detail")
	public String detail() {
		return "customer/notice/detail";		
	}
}