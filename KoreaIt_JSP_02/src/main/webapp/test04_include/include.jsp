<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>이건보이겠지?</h2>
	<jsp:include page="include_data.jsp">
		<jsp:param name="num" value="5"/>
	</jsp:include>
	<h2>끝!!!!</h2>
</body>
</html>