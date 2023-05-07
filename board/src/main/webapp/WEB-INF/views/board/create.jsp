<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=request.getSession().getAttribute("") %>
	<form method="post">
		<input name="title" placeholder="title">
		<input name="content" placeholder="내용">
		<input type="submit">
	</form>
</body>
</html>