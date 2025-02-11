package com.newlecture.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newlecture.web.dao.UserDao;
import com.newlecture.web.dto.UserViewDto;

@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	private UserDao userDao;	
	
	@Override
	public UserViewDto getUser(String id) {
		// TODO Auto-generated method stub
		UserViewDto userViewDto = userDao.getUser(id);
		return userViewDto;
	}
}
