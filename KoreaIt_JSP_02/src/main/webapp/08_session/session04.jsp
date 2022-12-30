<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session</title>
</head>
<body>
	<%--
	세션에 저장된 세션 속성 삭제하기.
	1)세션에 저장된 세션 속성 이름userID를 삭제하도록 session 내장 객체의 removeAttribute() 메서드를 작성
	--%>
	
	<h4>---------세션을 삭제하기 전---------</h4>
	<%
		String user_id = (String) session.getAttribute("userID");
		String user_pw = (String) session.getAttribute("userPW");
		out.println("설정된 세션 userID : " + user_id + "<br>");
		out.println("설정된 세션 userID : " + user_pw + "<br>");
		
		session.removeAttribute("userID");
	%>
	<%
		user_id = (String) session.getAttribute("userID");
		user_pw = (String) session.getAttribute("userPW");
		out.println("설정된 세션 userID : " + user_id + "<br>");
		out.println("설정된 세션 userID : " + user_pw + "<br>");
	%>
</body>
</html>