<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@page import="com.springbook.biz.user.UserVO" %>
    <%@page import="com.springbook.biz.user.impl.UserDAO" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String id = request.getParameter("id"); 
String password = request.getParameter("password"); 

UserVO vo = new UserVO(); 

vo.setId(id);
vo.setPassword(password); 

UserDAO userDAO = new UserDAO(); 

UserVO user = userDAO.getUser(vo); 

if(user!=null){
	response.sendRedirect("getBoardList.jsp");
	
}else{
	response.sendRedirect("login.jsp"); 
}




%>