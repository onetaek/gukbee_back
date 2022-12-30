<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--
	쿠키 객체에 저장된 모든 쿠키 삭제하가.
	1) 쿠키 정보를 어덩오도록 request  내장 객체의 getCookies() 메서드 작성.
	2) 얻은 모든 쿠키를 삭제하도록 Cookie 객체의 setMaxAge() 메서드에 유효 기간을 0으로 설정
	3) 웹 페이지 cookie02.jsp로 이동하도록 response 내장 객체의 sendRediect() 메서드를 작성.
	 --%>
	<%
		Cookie[] cookies = request.getCookies();
		for(int i = 0 ; i < cookies.length; i++){
			cookies[i].setMaxAge(0);
			response.addCookie(cookies[i]);
		}
		response.sendRedirect("cookie02.jsp");
	%>
</body>
</html>