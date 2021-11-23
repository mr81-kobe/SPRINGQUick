package com.toy.biz.board.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.toy.biz.board.BoardVO;

@Repository
public class BoardDAO {
	@Autowired
	private SqlSessionTemplate mybatis;
	public BoardDAO() {
		// TODO Auto-generated constructor stub
	}

	public int insertBoard(BoardVO vo){
		
		mybatis.insert("boardDAO.insertBoard",vo);
		
		return 0;
	} 
	
	public int updateBoard(BoardVO vo){
		
		mybatis.update("boardDAO.updateBoard", vo);
		return 0;
		
	}
	public int deleteBoard(BoardVO vo){
		mybatis.delete("boardDAO.deleteBoard", vo);
		return 0;
	}
	public List<BoardVO> getBoardList(BoardVO vo){
		
		
		return null;
	}
	public  BoardVO getBoard(BoardVO vo){
		mybatis.selectOne("boardDAO.getBoard",vo);
		return null;
	}
}
