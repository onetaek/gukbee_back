<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	body{
		display:flex;
		justify-content:center;
		align-items:center;
		height:100vh;
		background:black;
	}
	h1{
		font-size:70px;
		color:#fff;
	}
</style>
</head>

<body>
<%!
	String hello = "Hello, Java Server Pages";
	public String getString(){
		return hello;
	}
%>
<h1>
<%= getString() %>
</h1>
</body>
</html>