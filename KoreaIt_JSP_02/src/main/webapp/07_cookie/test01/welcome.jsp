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
		System.out.println("welcome.jsp입니다.");
		boolean isLogin = true;
		Cookie[] cookies = request.getCookies();
		for(int i = 0 ; i < cookies.length; i++){
			if(cookies[i].getName().equals("test")){
				isLogin = true;
				break;
			}
		}
		if(isLogin == false){
			response.sendRedirect("cookie_out.jsp");
		}
	%>
	<h1>로그인 되었습니다.</h1>
	<a href="cookie_out.jsp">로그아웃</a>
</body>
</html>