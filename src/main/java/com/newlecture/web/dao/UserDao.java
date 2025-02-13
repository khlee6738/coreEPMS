package com.newlecture.web.dao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.newlecture.web.dto.UserViewDto;

@Mapper
public interface UserDao {

	@Select("SELECT * FROM user_view WHERE user_id = #{id}")
	UserViewDto getUser(String id);
	

}
