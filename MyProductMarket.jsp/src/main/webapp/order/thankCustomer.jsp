<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>thankCustomer</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
<%
	String shipping_cartId = "";
	String shipping_shippingDate = "";
	Cookie[] cookies = request.getCookies();
	System.out.println(cookies);
	if(cookies != null){
		for(int i = 0 ; i < cookies.length ; i++){
			Cookie thisCookie = cookies[i];
			String n = thisCookie.getName();
			System.out.println(n);
			if(n.equals("Shipping_cartId"))
				shipping_cartId = URLDecoder.decode((thisCookie.getValue()),"utf-8");
			if(n.equals("Shipping_shippingDate"))
				shipping_shippingDate = URLDecoder.decode((thisCookie.getValue()),"utf-8");
		}
	}
%>
	<jsp:include page="../layouts/menu.jsp"/>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">주문 완료</h1>
		</div>
	</div>
	<div class="container">
		<h2 class="alert alert-danger">주문해주셔서 감사합니다.</h2>
		<p> 주문은 : <%=shipping_shippingDate %>에 배송될 예정입니다! |</p>
		<p> 주문번호 : <%=shipping_cartId %> </p>
	</div>
<%
	session.invalidate();
	
	for(int i = 0 ; i < cookies.length; i++){
		Cookie thisCookie = cookies[i];
		String n = thisCookie.getName();
		if(n.equals("Shipping_carId"))
			thisCookie.setMaxAge(0);
		if(n.equals("Shipping_name"))
			thisCookie.setMaxAge(0);
		if(n.equals("Shipping_shippingDate"))
			thisCookie.setMaxAge(0);
		if(n.equals("Shipping_country"))
			thisCookie.setMaxAge(0);
		if(n.equals("Shipping_zipCode"))
			thisCookie.setMaxAge(0);
		if(n.equals("Shipping_addressName"))
			thisCookie.setMaxAge(0);
		
		response.addCookie(thisCookie);
	}
	
	
	
%>
</body>
</html>