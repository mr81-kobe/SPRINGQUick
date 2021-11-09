package com.springbook.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller
public class BoardController {

	public BoardController() {
		// TODO Auto-generated constructor stub
	}

	
	
	@RequestMapping("/insertBoard.do")
	public String insertBoard(BoardVO vo, BoardDAO dao ){
		
		dao.insertBoard(vo);
		
		return "redirect:getboardList.do";
	}
	

	@RequestMapping("/updateBoard.do")
	public String updateBoard(BoardVO vo, BoardDAO dao  ){
		
		dao.updateBoard(vo);
		
		return "redirect:getBoard.do?seq="+vo.getSeq();
	}
	

	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo, BoardDAO dao ){
		
		dao.deleteBoard(vo);
		
		return "redirect:deleteBoard.do?seq="+vo.getSeq();
	}

	
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardVO vo, BoardDAO dao , Model mav){
		
		
		mav.addAttribute("board",dao.getBoaard(vo)); 
	
		
		
		return "getBoard.jsp";
	}
	

	@RequestMapping("/getBoardList")
	public String getBoardList(BoardVO vo, BoardDAO dao , Model mav){
		
		
		mav.addAttribute("boardList",dao.getBoardList(vo));
		
		return "getBoardList.jsp";
	}
	
}
