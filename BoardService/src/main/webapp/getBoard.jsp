<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page import="com.springbook.biz.board.BoardVO" %>
<%@page import="com.springbook.biz.board.impl.BoardDAO" %>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글 상세</title>
</head>
<body>
<center>

<h1>글 상세	</h1>

<a href="logout_proc.jsp">Log-Out</a> 
<hr>
<form action="updateBoard.do" method="post"> 
	<input type="hidden" value=" ${board.seq }" name="seq" >
<table border="1" cellpadding="0" cellspacing="0" >

<tr>
	<td bgcolor="orange" width="70">제목</td>
	<td align="left"><input type="text" name="title" value="${board.title }"></td> 

</tr>
<tr>

	<td bgcolor="orange">작성자</td>

	<td align="left">${board.writer }</td>
	

</tr>
<tr>
	<td bgcolor="orange"> 내용</td>
	<td align="left"><textarea rows="40" cols="10" name="content">${board.content} </textarea></td>
	
</tr> 
<tr>
	<td bgcolor="orange"> 등록일</td>
	<td align="left">${board.regDate }</td>

</tr>
<tr>
	<td bgcolor="orange"> 조회수</td>
	<td align="left">${ board.cnt }</td>
</tr>
<tr>
	<td colspan="2" align="center"><input type ="submit" value="수정"></td>

</tr>
</table>


</form>
<hr> 

<a href="insertBoard.jsp">글 등록</a>&nbsp;&nbsp;&nbsp;
<a href="deleteBoard.do?seq=${ board.seq }">글삭제</a>&nbsp;&nbsp;&nbsp;
<a href="getBoardList.jsp">글 목록</a>
</center>
</body>
</html>