package com.toy.biz.user.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.toy.biz.user.UserVO;

@Repository
public class UserDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	public UserDAO() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void insertUser(UserVO vo){
		
		System.out.println(mybatis.insert("UserDAO.insertUser",vo));
		
		
	}
	
	public UserVO selectUser(UserVO vo){
		
		
		return mybatis.selectOne("UserDAO.selectUser",vo); 
		
		
	}
}
