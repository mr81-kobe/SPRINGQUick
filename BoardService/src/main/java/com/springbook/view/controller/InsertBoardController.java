package com.springbook.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

public class InsertBoardController implements Controller{

	public InsertBoardController() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
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
		
		
		
		return "getBoardList.do"; 
		
	}

}
