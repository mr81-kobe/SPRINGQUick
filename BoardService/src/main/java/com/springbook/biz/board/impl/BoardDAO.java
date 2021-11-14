package com.springbook.biz.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.commons.JDBCUtill;

@Repository("boardDAO")
public class BoardDAO extends JdbcDaoSupport{

	public BoardDAO() {
		// TODO Auto-generated constructor stub
	}

	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs ; 
	//�״ϱ� bean �� ��ϵ� datasource�� �̸��� ������̾�� �ȴٴ� ������
	@Autowired
	public void setSuperDataSource(DataSource dataSource){
		super.setDataSource(dataSource);
	}
	
	private final String BOARD_INSERT= "insert into board(seq,title,writer,content) values((select nvl(max(seq),0)+1 from board) ,?,?,?)";
	private final String BOARD_UPDATE ="update board set title=? , content =? where seq=?"; 
	private final String BOARD_DELETE ="delete board where seq=?";
	private final String BOARD_GET ="select * from board where seq=?";
	private final String bOARD_lIST_T="select * from board WHERE TITLE LIKE '%'||?||'%' order by seq desc"; 
	private final String bOARD_lIST_S="select * from board  order by seq desc"; 
	private final String bOARD_lIST_C="select * from board WHERE CONTENT LIKE '%'||?||'%' order by seq desc"; 
	
	public void insertBoard(BoardVO vo){
		
		System.out.println("jdbc로 insertBoardó기능 실행중");
		 
		try{
			conn=JDBCUtill.getConnection(); 
			stmt=conn.prepareStatement(BOARD_INSERT); 
			stmt.setString(1, vo.getTitle());
			stmt.setString(2, vo.getWriter());
			stmt.setString(3, vo.getContent());
			
			stmt.executeUpdate(); 
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			JDBCUtill.close(stmt, conn);
		}
		
		
	}
	
	public void updateBoard(BoardVO vo){
	
		
		try{
			conn=JDBCUtill.getConnection(); 
			stmt=conn.prepareStatement(BOARD_UPDATE); 
			stmt.setString(1, vo.getTitle());
			stmt.setString(2, vo.getContent()); 
			stmt.setInt(3, vo.getSeq());
			stmt.executeUpdate();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace(); 
		}finally{
			JDBCUtill.close(stmt, conn);
		}
	}
	public BoardVO getBoaard(BoardVO vo){
		
				
		
		BoardVO board = new BoardVO(); 
		
		try{
			conn = JDBCUtill.getConnection(); 
			stmt=conn.prepareStatement(BOARD_GET); 
			stmt.setInt(1, vo.getSeq());
			rs=stmt.executeQuery(); 
			if(rs.next()){
				board.setTitle(rs.getString("title")); 
				board.setCnt(rs.getInt("cnt"));
				board.setRegDate(rs.getDate("regDate"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer")); 
				board.setSeq(rs.getInt("seq"));
			}
		
		
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			
			JDBCUtill.close(stmt, conn, rs);
		}
	
		return board;
	}
	public void deleteBoard(BoardVO vo){
		
		
		try{
			conn=JDBCUtill.getConnection(); 
			stmt=conn.prepareStatement(BOARD_DELETE); 
			stmt.setInt(1, vo.getSeq()); 
			stmt.executeUpdate();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			JDBCUtill.close(stmt, conn);
		}
	}
	public List<BoardVO> getBoardList(BoardVO vo ){
		
		System.out.println("jdbc로 리스트 가져오기 실행 중");
		
		
		
		
		List<BoardVO> list = new ArrayList<>();
		try{
			conn=JDBCUtill.getConnection();
			if(vo.getSearchCondition().equals("TITLE")){
				stmt=conn.prepareStatement(bOARD_lIST_T); 
				stmt.setString(1, vo.getSearchKeyword());
				System.out.println("타이틀");
			}else if(vo.getSearchCondition().equals("CONTENT")){
				stmt=conn.prepareStatement(bOARD_lIST_C) ;
				stmt.setString(1, vo.getSearchKeyword()); 
				
				System.out.println("콘텐트");
			}
			
			rs=stmt.executeQuery();
			while(rs.next()){
			BoardVO board = new BoardVO(); 
			board.setTitle(rs.getString("title")); 
			board.setCnt(rs.getInt("cnt"));
			board.setRegDate(rs.getDate("regDate"));
			board.setContent(rs.getString("content"));
			board.setWriter(rs.getString("writer"));  
			board.setSeq(rs.getInt("seq"));
			list.add(board);
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			JDBCUtill.close(stmt, conn, rs);
		}
	
	
		return list;
	}
	
	
	
	

	
			}

/*package com.springbook.biz.board.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;

@Repository("boardDAO")
public class BoardDAO extends JdbcDaoSupport{

	public BoardDAO() {
		// TODO Auto-generated constructor stub
	}

	//�״ϱ� bean �� ��ϵ� datasource�� �̸��� ������̾�� �ȴٴ� ������
	@Autowired
	public void setSuperDatasource (DataSource dataSource){
		super.setDataSource(dataSource);
	}
	
	private final String BOARD_INSERT= "insert into board(seq,title,writer,content) values((select nvl(max(seq),0)+1 from board) ,?,?,?)";
	private final String BOARD_UPDATE ="update board set title=? , content =?, where seq=?"; 
	private final String BOARD_DELETE ="delete board where seq=?";
	private final String BOARD_GET ="select * from board where seq=?";
	private final String bOARD_lIST="select * from board order by seq desc"; 
	
	
	public void insertBoard(BoardVO vo){
		
		System.out.println("jdbc�� insertBoardó��");
		 
		getJdbcTemplate().update(BOARD_INSERT,vo.getTitle(),vo.getWriter(),vo.getContent());
		
	}
	
	public void updateBoard(BoardVO vo){
		System.out.println("jdbc�� UpdateBoard ��� ����");
		getJdbcTemplate().update(BOARD_UPDATE,vo.getTitle(),vo.getContent(),vo.getCnt());
		
	}
	public BoardVO getBoaard(BoardVO vo){
		
		System.out.println("���� ã�� ��� ������");
		Object[] args= {vo.getSeq()};
		return getJdbcTemplate().queryForObject(BOARD_GET, args, new BoardRowMapper());
	
	}
	public void deleteBoard(BoardVO vo){
		
		System.out.println("���� ����� ��� ������");
	}
	public List<BoardVO> getBoardList(BoardVO vo ){
		System.out.println("���� ����Ʈ ã�� ��� ������"); 
		return getJdbcTemplate().query(bOARD_lIST, new BoardRowMapper());
	}
	
	
	
	
	class BoardRowMapper implements RowMapper<BoardVO>{
		@Override
		public BoardVO mapRow(ResultSet rs , int rowNum) throws SQLException{
			BoardVO board = new BoardVO();
			
			board.setSeq(rs.getInt("seq"));
			board.setContent(rs.getString("content"));
			board.setRegDate(rs.getDate("regDate"));
			board.setTitle(rs.getString("title"));
			board.setWriter(rs.getString("writer"));
			board.setCnt(rs.getInt("cnt")); 
			return board;
		}

	
		
		
	}
			}*/



/*package com.springbook.biz.board.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;

@Repository("boardDAO")
public class BoardDAO {

	public BoardDAO() {
		// TODO Auto-generated constructor stub
	}

	//�״ϱ� bean �� ��ϵ� datasource�� �̸��� ������̾�� �ȴٴ� ������ 
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private final String BOARD_INSERT= "insert into board(seq,title,writer,content) values((select nvl(max(seq),0)+1 from board) ,?,?,?)";
	private final String BOARD_UPDATE ="update board set title=? , content =?, where seq=?"; 
	private final String BOARD_DELETE ="delete board where seq=?";
	private final String BOARD_GET ="select * from board where seq=?";
	private final String bOARD_lIST="select * from board order by seq desc"; 
	
	
	public void insertBoard(BoardVO vo){
		
		System.out.println("jdbc�� insertBoardó��");
		 
		jdbcTemplate.update(BOARD_INSERT,vo.getTitle(),vo.getWriter(),vo.getContent());
		
	}
	
	public void updateBoard(BoardVO vo){
		System.out.println("jdbc�� UpdateBoard ��� ����");
		jdbcTemplate.update(BOARD_UPDATE,vo.getTitle(),vo.getContent(),vo.getCnt());
		
	}
	public BoardVO getBoaard(BoardVO vo){
		
		System.out.println("���� ã�� ��� ������");
		Object[] args= {vo.getSeq()};
		return jdbcTemplate.queryForObject(BOARD_GET, args, new BoardRowMapper());
	
	}
	public void deleteBoard(BoardVO vo){
		
		System.out.println("���� ����� ��� ������");
	}
	public List<BoardVO> getBoardList(BoardVO vo ){
		System.out.println("���� ����Ʈ ã�� ��� ������"); 
		return jdbcTemplate.query(bOARD_lIST, new BoardRowMapper());
	}
	
	
	
	
	class BoardRowMapper implements RowMapper<BoardVO>{
		@Override
		public BoardVO mapRow(ResultSet rs , int rowNum) throws SQLException{
			BoardVO board = new BoardVO();
			
			board.setSeq(rs.getInt("seq"));
			board.setContent(rs.getString("content"));
			board.setRegDate(rs.getDate("regDate"));
			board.setTitle(rs.getString("title"));
			board.setWriter(rs.getString("writer"));
			board.setCnt(rs.getInt("cnt")); 
			return board;
		}

	
		
		
	}*/
			
