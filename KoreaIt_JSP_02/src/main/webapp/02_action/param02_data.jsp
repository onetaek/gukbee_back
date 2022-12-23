<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
	1)전송된 title 값을 받도록 request 내장 객체의 getParameter()메서드를 작성
	2) 한글이 깨지지 않도록 java.net.URLDecoder.decode() 메소드로 전송된 데이터를 받음.
	3) 전송된 date 값을 받도록 request 내장 객체의 getParameter()메서드를 작성
--%>

${param.title }
${param.date }

<hr>
<%
	String title = request.getParameter("title");
%>
<h3><%=java.net.URLDecoder.decode(title) %></h3>
Today is : <%=request.getParameter("date")%>