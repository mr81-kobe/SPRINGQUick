/*package com.springbook.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;
@Controller
public class DeleteBoardController {

	public DeleteBoardController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping("/deleteBoard.do")
	public ModelAndView deleteBoard( ModelAndView mav ,BoardVO vo , BoardDAO dao) {
		// TODO Auto-generated method stub
		 
		dao.deleteBoard(vo);
	
		mav.setViewName("redirect:getBoardList.do");
		
		
		return mav;
	}

}
*/