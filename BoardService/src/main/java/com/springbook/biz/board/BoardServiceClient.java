package com.springbook.biz.board;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		BoardService service = (BoardService) factory.getBean("boardService"); 
		BoardVO vo = new BoardVO(); 
		vo.setTitle("규준이 킹왗짱");
		vo.setContent("존나 쩔지 그럼");
		vo.setWriter("규준황"); 
		service.insertBoard(vo);
	}

}
