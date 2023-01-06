<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그아웃</title>
</head>
<body>
	<%	
		session.removeAttribute("sessionAdminId");
		session.removeAttribute("sessionAdminName");
		session.removeAttribute("sessionAdminDay");
		System.out.println("로그아웃 logoutAdmin.jsp");
		response.sendRedirect("index.jsp");
	%>
</body>
</html>