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
	String user_id = null;
	user_id = (String) session.getAttribute("userID");
	if(user_id == null)
		response.sendRedirect("sessioni.jsp");
	%>
	<h1><%=user_id %>님 반갑습니다.</h1>
	<a href="session_out.jsp">로그아웃</a>
</body>
</html>