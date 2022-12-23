<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>스크립틀릿 버전</h3>
	<%
		int num = Integer.parseInt(request.getParameter("num"));
		for(int i = 1 ; i < 10 ; i++){
			out.print(num+" * "+i+" = "+(num*i)+"<br>");
		}
	%>
	<hr>
	<h3>EL 버전</h3>
	<c:forEach var="k" begin="1" end="9" step="1">
		${param.num } * <c:out value="${k }"/> = <c:out value="${k*param.num }"/><br>
	</c:forEach>
</body>
</html>