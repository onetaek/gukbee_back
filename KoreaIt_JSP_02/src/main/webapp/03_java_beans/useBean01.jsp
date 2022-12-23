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
	useBean 액션 태그에 Date클래스를 사용하여 현재 날짜와 시각 출력하기.
	1) 자바빈즈로 Date 클래스를 사용하도록 useBean 액션 태그를 작성.
	2) out 내장 객체 변수를 통해 설정한 문자열을 출력하도록 스크립틀릿 태그를 작성.
	3) useBean 액션 태그에 id 속성 값으로 현재 날짜와 시각을 출력하도록 표현문 태그를 작성.
	 --%>
	 <jsp:useBean id="date" class="java.util.Date"/>
	 <p><% out.print("오늘의 날짜 및 시각"); %></p>
	 <p><%=date %></p>
</body>
</html>