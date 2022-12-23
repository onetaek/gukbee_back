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
		response 내장 객체로 오류 응답 코드와 오류 메세지 보내기
		1)웹 브라우저에 응답할 오류로 404 코드 및 오류 메세지를 출력하도록
		response 내장 객체의 sendRrror() 메서드를 작성.
	 --%>
	 <%
	 	response.sendError(404,"요청 페이지를 찾을 수 없습니다.");
	 %>
</body>
</html>