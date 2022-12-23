<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page buffer="8kb" autoFlush="false" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

----------------------------------------------------page b
<br>
Header 설정-- response.setHeader("b", "1"); 
<%response.setHeader("b", "1"); %>
<br>
session 설정 -- session.setAttribute('2', "2")
<%session.setAttribute("2", "2"); %>
<br>
cookie 설정 -- response.addCookie(new Cookie("co3","3333"));
<%response.addCookie(new Cookie("co3","3333"));%>
<br>
Response Header 출력 -- <% out.write(response.getHeaderNames().toString()); %>
<br>
Response Cookie 출력 -- <% out.write(response.getHeaders("Set-Cookie").toString()); %>
<br>
Request Header 출력 --
<%
Enumeration<String> em = request.getHeaderNames();
while(em.hasMoreElements()) {
	out.write(em.nextElement().toString()+",");
}
%>
<br>
<%
Cookie[] cookies = request.getCookies();
for(Cookie c : cookies) {
	System.out.println("cookie id : " + c.getName() + " cookie val : "+c.getValue());
}
%>
<br>
session 출력 -- <%
Enumeration<String> ems = session.getAttributeNames();
while(ems.hasMoreElements()) {
	out.write(ems.nextElement().toString()+",");
}
%>
<br>
----------------------------------------------------page b
</html>