package com.toy.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.toy.biz.board.BoardService;
import com.toy.biz.board.BoardVO;

@Controller
public class BoardController {
	@Autowired
	private BoardService service;

	public BoardController() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping("/insertBoard.do")
	public String insertBoard(BoardVO vo) {

		service.insertBoard(vo);
		return "redirect:/boardList.do";

	}

	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo){
		
		service.deleteBoard(vo); 
		return "redirect:/boardList.do";
	}
	@RequestMapping("/updateBoard.do")
	public String updateBoard(BoardVO vo){
		service.updateBoard(vo);
		return "redirect:/boardList.do";
	}
}
