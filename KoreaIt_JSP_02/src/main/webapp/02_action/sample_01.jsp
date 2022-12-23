<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int num1 = 5;
	%>
	<%@include file="sample_01_include.jsp" %>
	<%
		out.println(num1 * num2);
	%>
</body>
</html>