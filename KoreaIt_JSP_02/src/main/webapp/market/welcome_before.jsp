<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-expend navbar-dark bg-dark">
		<div class="contatiner">
			<div class="navbar-header">
				<a class="navbar-brand" href="./welcon.jsp">HOME</a>
			</div>
		</div>
	</nav>
	<%!
	String greeting = "Welcome to Web Shopping Mall";
	String tagline = "Welcon to Web Marekt!";
	%>
	<div class="jumbotron">
		<div class=contatiner>
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
	<footer class="container">
		<p>&copy; WebMarket</p>
	</footer>
	
	
</body>
</html>