<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<a href="/board/home">home으로 </a>
<h3><%= session.getAttribute("userName") %>님 환영합니다.</h3>
<a href="/user/login">logout</a>
<%
if(session.getAttribute("userName")==null) response.sendRedirect("/user/login");	
%>