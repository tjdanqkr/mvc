<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" >
		<input name="id" value="${board.id }" type="hidden">
		<input name="title" placeholder="title" value="${board.title }">
		<input name="userName" placeholder="작성자" value="${board.userName}">
		<input name="content" 
			placeholder="내용" 
			value="${board.content }">
		<input type="radio" name="type" value="update">update
		<input type="radio" name="type" value="delete">delete
	
		<input type="submit" value="승인">
	</form>
</body>
</html>