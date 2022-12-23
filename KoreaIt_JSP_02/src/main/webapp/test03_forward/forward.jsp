<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>안나오겠지</h2>
	<jsp:forward page="forward_data.jsp">
		<jsp:param name="num" value="5"/>
	</jsp:forward>
</body>
</html>