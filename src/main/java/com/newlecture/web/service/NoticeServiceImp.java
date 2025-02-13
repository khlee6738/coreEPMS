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
	public List<NoticeViewDto> getList(Integer page, String field, String query, int pub) {	//게시글 리스트
	
		//int firstset = 1+(page-1)*10; //OracleDB용 page 1->1, page 2->11, page 3->21
		//int lastset = page*10;		//OracleDB용
		int firstset = 0+(page-1)*10; //MariaDB용(offset으로 활용) page 1->0, page 2->10, page 3->20
		int lastset = 10;		  //MariaDB용(size로 활용)
		
		List<NoticeViewDto> list = noticeDao.getList(firstset, lastset, field, query, pub);
		return list;
	}

	@Override
	public int getCount(String field, String query, int pub) {	//게시글 수
		int count = noticeDao.getCount(field, query, pub);
		return count;
	}	
	
	@Override
	public NoticeViewDto getDetail(int i) {
		NoticeViewDto noticeView = noticeDao.getDetail();
		return noticeView;
	}



}
