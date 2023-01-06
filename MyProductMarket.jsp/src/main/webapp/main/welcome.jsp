<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제품 웹 쇼핑몰</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
	<jsp:include page="../layouts/menu.jsp"/>
	<%!
	String greeting = "제품 웹 쇼핑몰!";
	String tagline = "Welcome to Web Marekt!";
	%>
	<div class="jumbotron">
		<div class="container text-center">
			<h1 class="display-3">
				<%=greeting %>	
			</h1>
		</div>
	</div>
	<div class="container">
		<div class="text-center">
			<h3><%=tagline %></h3>
		</div>
		<hr>
	</div>
	<jsp:include page="../layouts/footer.jsp"/>
</body>
</html>