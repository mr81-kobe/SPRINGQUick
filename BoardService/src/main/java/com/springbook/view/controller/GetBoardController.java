/*package com.springbook.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;
@Controller
public class GetBoardController {

	public GetBoardController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping("/getBoard.do")
	public ModelAndView handleRequest(ModelAndView mav , BoardVO vo , BoardDAO dao) {
		// TODO Auto-generated method stub
		
		
		
		
		
		BoardVO board = dao.getBoaard(vo); 
		HttpSession session= request.getSession(); 
		session.setAttribute("board", board);
		
		
		
		mav.addObject("board",board); 
		mav.setViewName("getBoard");
		
		return mav;
		
		
		
	}

}
*/