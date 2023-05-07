<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<p>name : ${name }</p>
	<p>name : <%= request.getParameter("name") %></p>
	<p>id : <%= session.getAttribute("id") %></p>
	<p>age : ${age }</p>
	<p>age : ${num }</p>
</body>
</html>