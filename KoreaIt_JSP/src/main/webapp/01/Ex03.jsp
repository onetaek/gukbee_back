<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 선언문 태그에 전역 변수 사용하기 --%>
<%!
	/* 변수 data에 50저장. 선언문 태그를 작성 */
	int data = 50;
%>
<%
	out.println("Value of the variable is: " + data);
%>
</body>
</html>