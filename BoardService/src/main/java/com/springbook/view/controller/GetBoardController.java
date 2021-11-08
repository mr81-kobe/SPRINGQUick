package com.springbook.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

public class GetBoardController implements Controller{

	public GetBoardController() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		
		
		String seq_str = request.getParameter("seq");
		
		int seq= Integer.parseInt(seq_str); 
		
		BoardVO vo = new BoardVO(); 
		vo.setSeq(seq);
		
		
		BoardDAO dao = new BoardDAO(); 
		BoardVO board = dao.getBoaard(vo); 
		HttpSession session= request.getSession(); 
		session.setAttribute("board", board);
		
		return "getBoard";
		
		
		
	}

}
