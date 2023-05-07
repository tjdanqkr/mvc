<%@ page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<a href="http://localhost:8080/">home</a>
<p> test </p>
<p>${hi}</p>

<c:forEach var="i" begin="0" end="10" step="1">
	<p>
		${i}
	</p>
</c:forEach>
<select>
<%
List<String> req = (List) request.getAttribute("genderList");
for(String str :req){%>
	<option value=<%=str %>><%= str %></option>
<%}%>
</select>

<select>
	<c:forEach var="gender" items="${genderList}">
		<option value="${gender}">${gender}</option>
	</c:forEach>
</select>
<c:set var="str" value="hello world"></c:set>
<p>${str }</p>
<c:set var="num" value="2"></c:set>
<c:if test="${num % 2 == 0 }">
	<p>${num } = 짝수</p>
</c:if>
<c:if test="${num % 2 == 1 }">
	<p>${num } = 홀수</p>
</c:if>

<c:choose>
	<c:when test="${num % 2 == 0 }">
		<button>${num } = 짝수</button>
	</c:when>
	<c:when test="${num % 2 == 1  }">
		<p>${num } = 홀수</p>
	</c:when>
	<c:otherwise>
		<p> 모르겠음</p>
	</c:otherwise>
</c:choose>


</body>
</html>