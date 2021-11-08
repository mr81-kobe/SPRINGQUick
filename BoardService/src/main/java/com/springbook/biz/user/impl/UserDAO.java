package com.springbook.biz.user.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

import com.springbook.biz.board.commons.JDBCUtill;
import com.springbook.biz.user.UserVO;
@Repository
public class UserDAO {

	public UserDAO() {
		// TODO Auto-generated constructor stub
	}
	private final String GET_USER="select * from users where id=? and password=?"; 
	private	Connection conn ; 
	private PreparedStatement stmt;
	private ResultSet rs;
	
	
	public UserVO getUser(UserVO vo){
		
		System.out.println("getUser Ω««‡¡ﬂ....");
		UserVO user = null;
		try{
			conn=JDBCUtill.getConnection(); 
			
			stmt=conn.prepareStatement(GET_USER); 
			stmt.setString(1, vo.getId());
			stmt.setString(2, vo.getPassword());
			rs=stmt.executeQuery(); 
			
			if(rs.next()){
				user= new UserVO();
				user.setId(rs.getString("id"));
				user.setName(rs.getString("name"));
				user.setPassword(rs.getString("password"));
				user.setRole(rs.getString("role"));
			}
		
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace(); 
		}finally{
			JDBCUtill.close(stmt, conn, rs);
		}
		
		return user;
	}
	
	
}
