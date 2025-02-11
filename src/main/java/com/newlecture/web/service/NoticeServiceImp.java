package com.newlecture.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newlecture.web.dao.NoticeDao;
import com.newlecture.web.dto.NoticeViewDto;

@Service
public class NoticeServiceImp implements NoticeService {
	
	@Autowired
	private NoticeDao noticeDao;	
	
	@Override
	public List<NoticeViewDto> getList() {
		List<NoticeViewDto> list = noticeDao.getList();
		return list;
	}

	@Override
	public NoticeViewDto getDetail(int i) {
		NoticeViewDto noticeView = noticeDao.getDetail();
		return noticeView;
	}

}
