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
	세션 아이디와 웹 사이트에서 유지한 시간 출력하기.
	1) 고유한 세션 내장 객체의 아이디를 가져오도록 session 내장 객체의 getId() 메서드를 작성
	2) 세션에 마지막으로 접근한 시간을 가져오도록 session 내장 객체의 getLastAccessedTime() 메서드를 작성.
	3) 세션이 생성된 시간을 가져오도록 session 내장 객체의 getCreationTime() 메서드를 작성.
	4) 웹 사이트에 머문 시간을 계산하도록 작성.
	 --%>
	 <%
	 	String session_id = session.getId();
	 	//세션에 마지막으로 접근한 시간
	 	long last_time = session.getLastAccessedTime();; // 단위: ms
	 	//세션이 생성된 시간
	 	long start_time = session.getCreationTime(); //단위 ms
	 	
	 	long used_time = (last_time - start_time) / 1000;
	 	
	 	out.println("세션 아이디 : "+session_id + "<br>");
	 	out.println("요청 시작 시간 : "+start_time + "<br>");
	 	out.println("요청 마지막 시간 : "+last_time + "<br>");
	 	out.println("웹 사이트에서 경과 시간 : "+used_time + "<br>");
	 %>
</body>
</html>