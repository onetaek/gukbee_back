<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="file_upload03_proc.jsp" method="post" enctype="multipart/form-data">
		<p> 파 일 : <input type="file" name="filename"></p>
		<p> <input type="submit" value="파일 올리기"/></p>
	</form>
</body>
</html>