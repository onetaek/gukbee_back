
<%@page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--표현문 태그로 현재 날짜 출력하기 --%>
	<%--2.스크립틀릿 태그를 이용하여 지역변수에 현재날짜를 저자해서 출력하기 --%>
	<%!
		Date today = new Date();
	%>
	<p>Today's date: <%=new java.util.Date() %></p>
	<p>Today's date: <%=today %></p>
</body>
</html>