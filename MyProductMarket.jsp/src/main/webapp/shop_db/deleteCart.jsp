<%@page import="t_dao.CartDAO"%>
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
	String orderNo = session.getId();
	CartDAO cartDAO = new CartDAO();
	cartDAO.deleteCart(orderNo);


	response.sendRedirect("cart.jsp");
%>
</body>
</html>