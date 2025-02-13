package com.newlecture.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.newlecture.web.dto.NoticeViewDto;

@Mapper
public interface NoticeDao {


	List<NoticeViewDto> getList(@Param("firstset") int firstset, @Param("lastset") int lastset, @Param("field") String field, @Param("query") String query, @Param("pub") int pub);	//게시글목록

	int getCount(String field, String query, int pub);	
	
	NoticeViewDto getDetail();


	

}
