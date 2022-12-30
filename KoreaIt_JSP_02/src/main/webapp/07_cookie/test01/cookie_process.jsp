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
		System.out.println("cookie_process.jsp입니다.");
		String user_id = request.getParameter("id");
		String user_pw = request.getParameter("pw");
		
		if(user_id.equals("test") && user_pw.equals("1234")){
			Cookie cookie_id = new Cookie("userID",user_id);
			response.addCookie(cookie_id);
			response.sendRedirect("welcome.jsp");
		}
	%>
</body>
</html>