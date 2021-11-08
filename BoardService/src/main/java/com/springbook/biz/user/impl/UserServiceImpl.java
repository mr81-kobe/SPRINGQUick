package com.springbook.biz.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.user.UserService;
import com.springbook.biz.user.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDAO dao ;
	public UserServiceImpl() {
		// TODO Auto-generated constructor stub
	} 
	public UserServiceImpl(UserDAO dao) {
		// TODO Auto-generated constructor stub
	this.dao =dao;
		}
	
	public void setDao(UserDAO dao) {
		this.dao = dao;
	}

	@Override
	public UserVO getUser(UserVO vo) {
		// TODO Auto-generated method stub
		return dao.getUser(vo);
	}

}

