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
	<h2>스크립틀릿 사용버전</h2>
	<%
		int num = Integer.parseInt(request.getParameter("num"));
		for(int i = 1 ; i <= 9 ; i++){
			out.println(num + " * " +i + " = " + (num * i));
			out.println("<br>");
		}
	%>
	<hr>
	<h2>EL표현법 사용버전</h2>
	<c:forEach var="k" begin="1" end="9" step="1">
		${param.num } * <c:out value="${k }"/> = <c:out value="${k*param.num }"/><br>
	</c:forEach>
</body>
</html>