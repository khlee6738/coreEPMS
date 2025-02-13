package com.newlecture.web.service;

import java.util.List;

import com.newlecture.web.dto.NoticeViewDto;

public interface NoticeService {

	List<NoticeViewDto> getList(Integer page, String field, String query, int pub);	//게시글 리스트

	int getCount(String field, String query, int pub);	//게시글 수
	
	NoticeViewDto getDetail(int i);



}
