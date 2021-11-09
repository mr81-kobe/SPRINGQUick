/*package com.springbook.view.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;
@Controller
public class GetBoardListController {

	public GetBoardListController() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping("/getBoardList.do")
	public ModelAndView getBoardList(BoardVO vo , BoardDAO dao ,ModelAndView mnv) {
		// TODO Auto-generated method stub 
	System.out.println("getBoardList.do");
	
	
	
	
	List<BoardVO> boardList = dao.getBoardList(vo); 
	
	
	
	mnv.addObject("boardList",boardList); 
	mnv.setViewName("getBoardList.jsp");
	return mnv;	
		
		
		}

}
*/