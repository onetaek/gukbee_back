<%@page import="java.util.Enumeration"%>
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
request 내장 객체로 모든 HTTP 헤더 정보 값 출력하기
1)모든 헤더 이름을 가져오도록 request 내장 객체 getHeaderNames(메서드를 호출하고,
이를 모두 저장하도록 Enumeration 객체 타입의 변수 en을 작성.
referer : 이전페이지 즉 어떤페이지에서 현제 페이지에 접속했는지의 정보가있음
 --%>
<%
	Enumeration en = request.getHeaderNames();
	while(en.hasMoreElements()){
		String headerName = (String) en.nextElement();
		String headerValue = request.getHeader(headerName);	
%>
<%=headerName %> :<%=headerValue %><br>
<%
	}
%>
</body>
</html>