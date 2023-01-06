<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 수정 처리</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");

	String id = request.getParameter("id");
	String password = request.getParameter("password");
	String name = request.getParameter("name");
%>
<sql:setDataSource var ="dataSource"
	url="jdbc:mariadb://localhost:3310/my_product_market"
	driver="org.mariadb.jdbc.Driver" user="root" password="7517"/>
	
<sql:update dataSource="${dataSource }" var="resultSet">
	update admin set password=?, name=? where id=?
	<sql:param value="<%=password %>"/>
	<sql:param value="<%=name %>"/>
	<sql:param value="<%=id %>"/>
</sql:update>
<%
	session.setAttribute("sessionAdminName",name);
%>
<c:if test="${resultSet >=1 }">
	<c:redirect url="index.jsp"/>
</c:if>

</body>
</html>