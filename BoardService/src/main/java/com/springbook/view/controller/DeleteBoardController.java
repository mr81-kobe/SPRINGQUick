package com.springbook.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

public class DeleteBoardController implements Controller {

	public DeleteBoardController() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		int seq = Integer.parseInt(request.getParameter("seq"));
		
		
		BoardVO vo = new BoardVO();
		vo.setSeq(seq); 
		
		BoardDAO dao = new BoardDAO();  
		dao.deleteBoard(vo);
		
		
		return "getBoardList.do";
	}

}
