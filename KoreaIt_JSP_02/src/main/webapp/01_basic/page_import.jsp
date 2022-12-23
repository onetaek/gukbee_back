<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--page 디렉티브 태그에 Date 클래스를 이용하여 현재 날짜 출력하기--%>
	 
	 <%--java.util.Date 패키지를 사용하기 위해 page디렉티브 태그의 import 속성을 작성--%>
	 <%@ page import="java.util.Date" %>
	 <%--현재 날짜를 출력하도록 표현문 태그를 작성 --%>
	 Today is <%=new Date() %>
</body>
</html>