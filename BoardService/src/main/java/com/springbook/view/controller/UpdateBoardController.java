/*package com.springbook.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;
@Controller
public class UpdateBoardController {

	public UpdateBoardController() {
		// TODO Auto-generated constructor stub
	}

	@RequestMapping("/updateBoard.do")
	public ModelAndView UpdateBoard(ModelAndView mav , BoardVO vo , BoardDAO dao) {
		// TODO Auto-generated method stub 
		
		dao.updateBoard(vo);
		mav.setViewName("redirect:getBoard.do?seq="+vo.getSeq());
		return mav;
	}

}
*/