package com.newlecture.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.newlecture.web.dto.NoticeViewDto;
import com.newlecture.web.service.NoticeService;

@Controller
@RequestMapping("/admin/notice/")
public class AdminNoticeController {
	
	@Autowired
	private NoticeService service;
	
	@GetMapping("list")
	public String list(Model model) {
		//System.out.println("get방식의 list");
		int page = 1;
		String field = "";
		String query = "";
		int pub = 0; //관리자 리스트 페이지설정 (일반사용자는 1, 이경우에는 공개처리된것만 보임)	
		
		List<NoticeViewDto> list = service.getList(page,field,query,pub);	//게시판목록
		int noticeCount = service.getCount(field,query,pub);	//전체(조건별) 게시글수
		
		model.addAttribute("list", list);
		model.addAttribute("count", noticeCount);
		return "admin/notice/list";
	}
	
	@PostMapping("list")
	public String list(@RequestParam(name = "p", defaultValue = "1") Integer page, @RequestParam(name = "f", defaultValue = "TITTLE") String field, @RequestParam(name = "q", defaultValue = "") String query,  Model  model) {
		//System.out.println("post방식의 list");			
		int pub = 0; //관리자 리스트 페이지설정 (일반사용자는 1, 이경우에는 공개처리된것만 보임)		
		List<NoticeViewDto> list = service.getList(page,field,query,pub);	//게시판목록
		int noticeCount = service.getCount(field,query,pub);	//전체(조건별) 게시글수		
		
		model.addAttribute("list", list);
		model.addAttribute("count", noticeCount);
		return "admin/notice/list";
	}
	
	@PostMapping("detail")
	public String detail() {
		
		NoticeViewDto noticeView = service.getDetail(1);
		
		return "admin/notice/detail";
	}
	@RequestMapping("reg")
	public String reg() {
		return "admin/notice/reg";
	}	
}
