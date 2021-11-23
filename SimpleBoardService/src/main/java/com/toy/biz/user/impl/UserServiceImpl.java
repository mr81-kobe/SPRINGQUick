package com.toy.biz.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toy.biz.user.UserService;
import com.toy.biz.user.UserVO;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO dao;
	public UserServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insertUser(UserVO vo) {
		// TODO Auto-generated method stub
		dao.insertUser(vo);
	}

	@Override
	public UserVO selectUser(UserVO vo) {
		// TODO Auto-generated method stub
		return dao.selectUser(vo);
	}
	
	
	
	
	
	
}
