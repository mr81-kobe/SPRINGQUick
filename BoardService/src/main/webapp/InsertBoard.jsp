<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
  
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글 쓰기</title>
</head>
<body>
<center>

<h1>글 등록</h1>
<a href="logout_proc.jsp">Log-Out</a>
<hr>

<form action="insertBoard.do" method="post">

<table border="1" cellpadding="0" cellspacing="0">

<tr>
	<td bgcolor="orange" width="70">제목 </td>
	<td align="left"><input type="text" name="title"></td>
</tr> 
<tr>
	<td bgcolor="orange">작성자</td>
	<td align="left"><input type="text" name="writer"></td>
</tr> 

<tr>
	<td bgcolor="orange">내용</td>
	<td align="left"><textarea name="content" cols="40" rows="10"></textarea></td>

</tr> 
<tr>

	<td colspan="2" align="left"> <input type="submit" value="제출">
	</td>


</tr>
</table>



</form>
<hr>
<a href="getBoardList.do">글 목록 가기</a> 

</center>
</body>
</html>