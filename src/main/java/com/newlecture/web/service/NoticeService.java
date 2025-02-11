package com.newlecture.web.service;

import java.util.List;

import com.newlecture.web.dto.NoticeViewDto;

public interface NoticeService {

	List<NoticeViewDto> getList();

	NoticeViewDto getDetail(int i);

}
