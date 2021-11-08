package com.springbook.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

public class LoginController implements Controller{

	public LoginController() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub 
		
		System.out.println("�α��� ó��");
		
		String id = request.getParameter("id");
		String password = request.getParameter("password"); 
		UserVO vo = new UserVO();
		vo.setId(id);
		vo.setPassword(password);
		UserDAO dao = new UserDAO(); 
		UserVO user	=dao.getUser(vo);
		
		if(user!=null){
			return "getBoardList.do";
		}else{
			return "login";
		}
		
	}

}
