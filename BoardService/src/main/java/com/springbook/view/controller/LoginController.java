package com.springbook.view.controller;

import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springbook.biz.board.CommandTestVO;
import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;
@Controller
public class LoginController  {

	public LoginController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public String loginview(UserVO vo , UserDAO dao) {
		// TODO Auto-generated method stub
		System.out.println("로그인 화면으로 이동"); 
		vo.setId("test");
		vo.setPassword("test123"); 
		
		
		return "login.jsp";
	}

	
	
	@RequestMapping(value="/login.do",method=RequestMethod.POST)
	public String login(UserVO vo ,UserDAO dao,CommandTestVO test, HttpSession session ){
		
		System.out.println("로그인 인증 처리"); 
		System.out.println(test.getTitle()); 
		
		
		if(vo.getId()==null||vo.getId().equals("")){
			throw new IllegalArgumentException("아이디는 반드시 입력해야 합니다.");
		}
		 if(dao.getUser(vo) !=null)
		 {
			 session.setAttribute("userName", vo.getId());
			 return "getBoardList.do"; 
		 } 
		 else return "login.jsp";
		
	}


	@RequestMapping("/test.do")
	public String test(CommandTestVO vo){
		vo.setTitle("aaaaa");
		return "login.jsp";
	
	}

} 
