<%@page import="bean.BookBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forEach문</title>
</head>
<body>
	<%
		ArrayList<BookBean> bookList = new ArrayList<BookBean>();
		bookList.add(new BookBean("The Secret","Byrne, Rhonda","Atria Books"));
		bookList.add(new BookBean("The Last Lecture","Randy Pausch","hyperion"));
		
		String[] bookCode = {"소설", "역사", "인문", "정치", "마술", "종교","여행", "과학", "만화", "건강"};
	%>
	<c:set var="bookList" value="<%=bookList %>" />
	<c:forEach items="${bookList }" var="item">
		${item.title } / ${item.author } / ${item.publisher }<br>
	</c:forEach>
	
	<hr>
	<c:set var="code" value="<%=bookCode %>" />
	<c:forEach var="item" items="${code }">
		<c:out value="${item }" />
	</c:forEach>
	
	<hr>
	<c:forEach var="i" begin="2" end="9">
		<c:forEach var = "j" begin="1" end="9">
			${i } * ${j } = ${i * j }<br>
		</c:forEach>
	</c:forEach>
	
	<hr>
	<c:forEach var="k" begin="1" end="10" step="2">
		${k }
	</c:forEach>
	<br>
</body>
</html>