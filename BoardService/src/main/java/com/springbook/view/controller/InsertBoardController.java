/*package com.springbook.view.controller;




import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;
@Controller
public class InsertBoardController {

	public InsertBoardController() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub 
		
		BoardVO vo = new BoardVO();
		BoardDAO dao = new BoardDAO();
		String title = request.getParameter("title");
		String content=request.getParameter("content"); 
		String writer = request.getParameter("writer"); 
		
		vo.setContent(content);
		vo.setTitle(title);
		vo.setWriter(writer);
		dao.insertBoard(vo);
		
		ModelAndView mnv = new ModelAndView(); 
		mnv.setViewName("redirect:getBoardList.do");
		
		return mnv; 
		
	} 
	
	@RequestMapping(value="/insertBoard.do")
	
	public String insertBoard(BoardVO vo){
		System.out.println("InsertBoard 실행 중");
		
		BoardDAO dao = new BoardDAO();
		
		
		dao.insertBoard(vo);
		ModelAndView mav = new ModelAndView(); 
		mav.setViewName("redirect:getBoardList.do");
			
		return "redirect:getBoardList.do";
	}

}
*/