<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%@page import="com.springbook.biz.board.BoardVO" %>
<%@page import="com.springbook.biz.board.impl.BoardDAO" %>

<%
BoardVO board=(BoardVO)session.getAttribute("board"); 

%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>�� ��</title>
</head>
<body>
<center>

<h1>�� ��	</h1>

<a href="logout_proc.jsp">Log-Out</a> 
<hr>
<form action="updateBoard.do" method="post"> 
<input type="hidden" value="<%=board.getSeq() %>" name="seq" >
<table border="1" cellpadding="0" cellspacing="0" >

<tr>
	<td bgcolor="orange" width="70">����</td>
	<td align="left"><input type="text" name="title" value="${board.title }"></td> 
	������

</tr>
<tr>

	<td bgcolor="orange">�ۼ���</td>

	<td align="left">${board.writer }</td>
	

</tr>
<tr>
	<td bgcolor="orange"> ����</td>
	<td align="left"><textarea rows="40" cols="10" name="content">${board.content} </textarea></td>
	
</tr> 
<tr>
	<td bgcolor="orange"> �����</td>
	<td align="left">${board.regDate }</td>

</tr>
<tr>
	<td bgcolor="orange"> ��ȸ��</td>
	<td align="left">${ board.cnt }</td>
</tr>
<tr>
	<td colspan="2" align="center"><input type ="submit" value="����"></td>

</tr>
</table>


</form>
<hr> 

<a href="insertBoard.jsp">�� ���</a>&nbsp;&nbsp;&nbsp;
<a href="deleteBoard.do?seq=${ board.seq }">�ۻ���</a>&nbsp;&nbsp;&nbsp;
<a href="getBoardList.jsp">�� ���</a>
</center>
</body>
</html>