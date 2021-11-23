package com.toy.view.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.toy.biz.user.UserService;
import com.toy.biz.user.UserVO;

@Controller
public class UserController {
	@Autowired
	private UserService service;
	
	public UserController() {
		// TODO Auto-generated constructor stub
	}
	
	
	@RequestMapping(value="/signin.do", method= RequestMethod.POST)
	public String signin(UserVO vo, Model model){
		
		service.insertUser(vo);
		model.addAttribute("user",vo);
		
		return "redirect:index.jsp";
	}
	@RequestMapping(value="/login.do", method= RequestMethod.GET)
	public String login(UserVO vo, Model model,HttpSession session){
		
		if(service.selectUser(vo)!=null){
		session.setAttribute("userID", service.selectUser(vo));
		}else {
			model.addAttribute("message","아이디 혹은 비밀번호가 틀립니다.");
			return "redirect:login.jsp";
		}
		
		
		return "redirect:Section.jsp";
	}

	@ResponseBody
	@RequestMapping(value="/login.do", produces="application/json;charset=UTF-8", method= RequestMethod.POST)
public  String login2(@RequestBody UserVO vo, HttpSession session){
		System.out.println("도착");
		if(service.selectUser(vo)!=null){
		session.setAttribute("userID", service.selectUser(vo).getEmail());
		}else {
			
			return "알맞지 않은 아이디";
		}
		
		
		return "로그인되었습니다.";
	}

	
	
	@RequestMapping("/logout.do")
	public String logout(HttpSession session){
		session.invalidate();
		
		return "redirect:login.jsp";
	}
	
	
}
