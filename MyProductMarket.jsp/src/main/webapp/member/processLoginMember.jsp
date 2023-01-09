<%@page import="t_dao.CartDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ include file="../dbconn/dbconn.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 처리</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");

	String id = request.getParameter("id");
	String password = request.getParameter("password");
	String sql ="select * from member where id =? and password =?";
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1,id);
	pstmt.setString(2,password);
	rs = pstmt.executeQuery();
	if(rs.next()){
		session.setAttribute("sessionId",id);
		session.setAttribute("sessionName",rs.getString("name"));
		
		CartDAO cartDAO = new CartDAO();
		cartDAO.updateCartByLogin(session);
		response.sendRedirect("resultMember.jsp?msg=2");
	}else{
		response.sendRedirect("loginMember.jsp?error=1");
	}
%>
<%--
<sql:setDataSource var ="dataSource"
	url="jdbc:mariadb://localhost:3310/sample_jsp_market"
	driver="org.mariadb.jdbc.Driver" user="root" password="7517"/>
<sql:query dataSource="${dataSource }" var="resultSet">
	select * from member where id=? and password=?
	<sql:param value="<%=id %>"/>
	<sql:param value="<%=password %>"/>
</sql:query>
<c:forEach var="row" items="${resultSet.rows }">
	<%
		session.setAttribute("sessionId",id);
	%>
	<c:redirect url="resultMember.jsp?msg=2"/>
</c:forEach>
	<c:redirect url="loginMember.jsp?msg=1"/>
 --%>
</body>
</html>