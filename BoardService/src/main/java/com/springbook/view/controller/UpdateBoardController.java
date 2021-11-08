package com.springbook.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.springbook.biz.board.BoardVO;

public class UpdateBoardController implements Controller{

	public UpdateBoardController() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub 
		
		BoardVO vo = new BoardVO(); 
		String title = request.getParameter("title"); 
		String content = request.getParameter("content");
		vo.setTitle(title);
		vo.setContent(content);
		
		
		return "getBoardList.do";
	}

}
