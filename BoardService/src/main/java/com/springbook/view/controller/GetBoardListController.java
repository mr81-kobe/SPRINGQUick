package com.springbook.view.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

public class GetBoardListController implements Controller{

	public GetBoardListController() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub 
	System.out.println("글 목록 검색 처리	");
	
	BoardVO vo = new BoardVO(); 
	
	BoardDAO dao = new BoardDAO(); 
	List<BoardVO> boardList = dao.getBoardList(vo); 
	
	HttpSession session = request.getSession(); 
	
	session.setAttribute("boardList", boardList);
	return "getBoardList";
		
		
		
		
		
		
		
	}

}
