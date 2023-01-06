<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>아이디, 비밀번호 인증을 이용한 데이터 삭제</h4>
	<form method="post" action="sql04_process">
		<p>기존 아이디 : <input type="text" name="id"></p>
		<p>기존 비밀번호 : <input type="password" name="passwd"></p>
		<p><input type="submit" value="전송"></p>
	</form>
</body>
</html>