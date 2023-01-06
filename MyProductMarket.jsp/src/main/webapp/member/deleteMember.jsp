<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원삭제</title>
</head>
<body>
<%
	String sessionId = (String)session.getAttribute("sessionId");
%>
<sql:setDataSource var ="dataSource"
	url="jdbc:mariadb://localhost:3310/my_product_market"
	driver="org.mariadb.jdbc.Driver" user="root" password="7517"/>
<sql:query dataSource="${dataSource }" var="resultSet">
	delete from member where id =?
	<sql:param value="<%=sessionId %>"/>
</sql:query>
<c:if test="${resultSet >=1 }">
	<c:import var="url" url="logoutMember.jsp"/>
	<c:redirect url="resultMember.jsp"/>
</c:if>

</body>
</html>