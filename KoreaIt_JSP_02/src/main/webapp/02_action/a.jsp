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
----------------------------------------------------page a
<br>
Header 설정-- response.setHeader("a", "1"); 
<%response.setHeader("a", "1"); %>
<br>
session 설정 -- session.setAttribute('1', "1")
<%session.setAttribute("1", "1"); %>
<br>
cookie 설정 -- response.addCookie(new Cookie("co1","1111"));
<%response.addCookie(new Cookie("co1","1111"));%>
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
session 출력 -- <%
Enumeration<String> ems = session.getAttributeNames();
while(ems.hasMoreElements()) {
	out.write(ems.nextElement().toString()+",");
}

%>
<br>
<br>
여기서 플러쉬 
<br>
<jsp:include page="b.jsp" flush="false"/>
<br>
----------------------------------------------------page a+
<br>
Header 추가-- response.setHeader("b", "2"); 
<%response.setHeader("b", "2"); %>
<br>
cookie 추가 -- response.addCookie(new Cookie("co2","2222"));
<%response.addCookie(new Cookie("co2","2222"));%>
<br>
Response Header 출력 -- <% out.write(response.getHeaderNames().toString()); %>
<br>
Response Cookie 출력 -- <% out.write(response.getHeaders("Set-Cookie").toString()); %>
<br>
Request Header 출력 --
<%
Enumeration<String> ems2 = request.getHeaderNames();
while(ems2.hasMoreElements()) {
	out.write(ems2.nextElement().toString()+",");
}
%>
<br>
----------------------------------------------------page a+

</body>
</html>