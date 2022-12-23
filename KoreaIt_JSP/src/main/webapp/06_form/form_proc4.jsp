<%@page import="model.Bean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
	%>
	<jsp:useBean id="bean" class="model.Bean">
		<jsp:setProperty name="bean" property="name"/>
	</jsp:useBean>
	
	<%= bean.getName() %>
	<%= bean.getZipcode() %>
	<%= bean.getAddress01() %>
	<%= bean.getAddress02() %>
	<%= bean.getEmail() %>
</body>
</html>