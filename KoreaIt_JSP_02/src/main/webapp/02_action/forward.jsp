<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Action Tag</title>
</head>
<body>
	<%--
	forward 액션 태그로 현재 날짜와 시각을 출력하는 페이지로 이동하가.
	1) 외부 파일 forward_date.jsp의 내용을 출력하도록 forward액션 태그의 page속성을 작성.
	 --%>
	 <h2>forward 액션 태그</h2>
	 <jsp:forward page = "forward_date.jsp"/>
	 <p>---------------------------------</p>
</body>
</html>