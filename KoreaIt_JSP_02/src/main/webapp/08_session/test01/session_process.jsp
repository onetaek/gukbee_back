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
		System.out.println("session_process.jsp입니다.");
		String user_id = request.getParameter("id");
		String user_pw = request.getParameter("pw");
		
		if(user_id.equals("admin") && user_pw.equals("1234")){
			session.setAttribute("userID",user_id);
			session.setAttribute("userPW",user_pw);
			response.sendRedirect("welcome.jsp");
			
		}else{
			out.println("세션 생성이 실패했습니다.");
		}
	%>
	<a href="session.jsp">로그인 화면으로 돌아가기</a>
</body>
</html>