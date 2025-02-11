package com.newlecture.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.newlecture.web.dto.NoticeViewDto;

@Mapper
public interface NoticeDao {

	@Select("SELECT * FROM notice_view")
	List<NoticeViewDto> getList();
	
	NoticeViewDto getDetail();
	

}
