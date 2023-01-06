<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 메인 페이지</title>
</head>
<body>
	<%@include file = "./menu.jsp" %>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">관리자 메인</h1>
		</div>
	</div>
	<div class="container">
		<%
		out.println("<h2 class='alert alert-danger'>" + sessionAdminName + "님 환영합니다</h2>");
		
		String sessionAdminDay = (String) session.getAttribute("sessionAdminDay");
		out.println("<h2 class='alert alert-danger'>최근 로그인한 시간은 "+sessionAdminDay + "입니다.</h2>");
		%>
	</div>
	<%@include file="../layouts/footer.jsp" %>
</body>
</html>