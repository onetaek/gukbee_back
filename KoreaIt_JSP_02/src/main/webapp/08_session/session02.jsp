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
	세션에 저장된 속성 값 가져와 출력하기.
	1)세션에 저장된 세션 속성이름user_ID, user_PW 의 속성 값을 가져오도록
	session 내장객체의 getAttribute() 메서드를 작성.
	--%>
	<%
		String user_id = (String) session.getAttribute("userID");
		String user_pw = (String) session.getAttribute("userPW");
		
		out.println("설정 된 세션의 속성 값 [1] : " + user_id + "<br>");
		out.println("설정 된 세션의 속성 값 [2] : " + user_pw);
	%>
</body>
</html>