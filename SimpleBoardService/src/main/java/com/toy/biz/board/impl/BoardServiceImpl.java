package com.toy.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toy.biz.board.BoardService;
import com.toy.biz.board.BoardVO;
@Service
public class BoardServiceImpl implements BoardService{
	@Autowired
	private BoardDAO dao ;
	public BoardServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int insertBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		dao.insertBoard(vo);
		
		return 0;
	}

	@Override
	public int updateBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		dao.updateBoard(vo);
		
		return 0;
	}

	@Override
	public int deleteBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		dao.deleteBoard(vo);
		
		return 0;
	}

	@Override
	public List<BoardVO> getBoardList(BoardVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardVO getBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

}
