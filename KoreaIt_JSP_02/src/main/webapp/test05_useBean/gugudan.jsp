<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="gugu" class="gugudan.GuGuDan"/>
	<h2>구구단 출력하기</h2>
	<%
	for(int i = 1; i <= 9 ; i++){
		out.print(5+" * "+i+" = "+gugu.process(5, i)+"<br>");
	}
	%>
</body>
</html>