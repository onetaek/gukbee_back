<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--선언문 태그에 전역 메서드 사용하기 --%>
	<%--전역 메서드 sum()을 선언하기 위해 선언문 태그를 작성 --%>
	<%!
		int sum(int a, int b){
		return a+b;
	}
	%>
	<%--결과 값출력을 위해 스크립틀릿 태그를 작성 --%>
	<%
		out.println("2 + 3 = " + sum(2,3));
	%>
</body>
</html>