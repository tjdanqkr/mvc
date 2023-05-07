<%@page import="java.util.List"%>
<%@page import="io.playdata.board.dto.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/home.css">
</head>
<body>
	<%@ include file="../fix/header.jsp" %>
	<a href="create">게시글 쓰기</a>
	<table>
		<thead>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>자세히 보기</th>
		</thead>
		<tbody>
			
			<c:forEach items="${boards }" var="board">
				<tr>
					<td>${board.title }</td>
					<td>${board.userName }</td>
					<td>${board.createDate }</td>
					<td><a href="detail?boardId=${board.id }">자세히보기</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>