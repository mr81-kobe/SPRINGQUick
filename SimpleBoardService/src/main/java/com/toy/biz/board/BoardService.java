package com.toy.biz.board;

import java.util.List;

public interface BoardService {

	
	
	public int insertBoard(BoardVO vo); 
	
	public int updateBoard(BoardVO vo); 
	
	public int deleteBoard(BoardVO vo); 
	
	public List<BoardVO> getBoardList(BoardVO vo); 
	public BoardVO getBoard(BoardVO vo);
}
