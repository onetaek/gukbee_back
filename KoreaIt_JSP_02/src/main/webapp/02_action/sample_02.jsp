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
	<!-- action태그는 directive태그와 달리 변수 호환이 안됌 -->
	<jsp:include page="sample_02_include.jsp" flush="false"/>
	<br>
	<%
		out.println(num1 * num2);
	%>
</body>
</html>