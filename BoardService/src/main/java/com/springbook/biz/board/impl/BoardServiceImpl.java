/*package com.springbook.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.commons.LogAdvice;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO boardDAO;
	private LogAdvice log;

	public BoardServiceImpl() {
		// TODO Auto-generated constructor stub
		this.log = new LogAdvice();
	}

	@Override
	public void insertBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		log.printLog();
		boardDAO.insertBoard(vo);

	}

	@Override
	public void updateBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		log.printLog();
		boardDAO.updateBoard(vo);
	}

	@Override
	public BoardVO getBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		log.printLog();
		return boardDAO.getBoaard(vo);

	}

	@Override
	public List<BoardVO> getBoardList(BoardVO vo) {
		// TODO Auto-generated method stub
		log.printLog();
		return boardDAO.getBoardList(vo);
	}

}*/ 

/*
package com.springbook.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.commons.Log4jAdvice;
import com.springbook.biz.board.commons.LogAdvice;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO boardDAO;
	private Log4jAdvice log ;
	public BoardServiceImpl() {
		// TODO Auto-generated constructor stub
	this.log= new Log4jAdvice();
	}

	@Override
	public void insertBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		log.pringLogging();
		boardDAO.insertBoard(vo);
		
	
	}

	@Override
	public void updateBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		log.pringLogging();
		boardDAO.updateBoard(vo);
	}

	@Override
	public BoardVO getBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		log.pringLogging();
		return boardDAO.getBoaard(vo);
		
	}

	@Override
	public List<BoardVO> getBoardList(BoardVO vo) {
		// TODO Auto-generated method stub
		log.pringLogging();
		return boardDAO.getBoardList(vo);
	}

}*/



package com.springbook.biz.board.impl;

import java.util.List;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.commons.Log4jAdvice;
import com.springbook.biz.board.commons.LogAdvice;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO boardDAO;

	public BoardServiceImpl() {
		// TODO Auto-generated constructor stub
	
	}

	@Override
	public void insertBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		
		boardDAO.insertBoard(vo);
		
	
	}

	@Override
	public void updateBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		
		boardDAO.updateBoard(vo);
	}

	@Override
	public BoardVO getBoard(BoardVO vo) {
		// TODO Auto-generated method stub
	
		return boardDAO.getBoaard(vo);
		
	}

	@Override
	public List<BoardVO> getBoardList(BoardVO vo) {
		// TODO Auto-generated method stub
	
		return boardDAO.getBoardList(vo);
	}

}
