<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="com.springbook.biz.board.BoardVO" %>
<%@page import="com.springbook.biz.board.impl.BoardDAO" %>
<%
String seq = request.getParameter("seq");

BoardVO vo = new BoardVO();

vo.setSeq(Integer.parseInt(seq)); 


BoardDAO dao = new BoardDAO(); 
dao.deleteBoard(vo); 
response.sendRedirect("getBoardList.jsp");





%>