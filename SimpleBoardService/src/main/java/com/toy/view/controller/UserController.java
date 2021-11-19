package com.toy.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	@RequestMapping(value="/login.do", method= RequestMethod.POST)
	public String login(UserVO vo, Model model){
		System.out.println("안녕하세요");
		System.out.println(vo.getEmail());
		System.out.println(vo.getPassword());
		
		model.addAttribute("user",vo);
		
		return "redirect:index.jsp";
	}
}
