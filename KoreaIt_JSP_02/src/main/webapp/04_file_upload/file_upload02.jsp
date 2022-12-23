<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="fileForm" method="post" enctype="multipart/form-data" action="file_upload02_proc.jsp">
		<p> 이 름1 : <input type="text" name="name1"/></p>
		<p> 제 목1 : <input type="text" name="subject1"/></p>
		<p> 파 일1 : <input type="file" name="filename1"/></p>
		<hr>
		<p> 이 름2 : <input type="text" name="name2"/></p>
		<p> 제 목2 : <input type="text" name="subject2"/></p>
		<p> 파 일2 : <input type="file" name="filename2"/></p>
		<hr>
		<p> 이 름3 : <input type="text" name="name3"/></p>
		<p> 제 목3 : <input type="text" name="subject3"/></p>
		<p> 파 일3 : <input type="file" name="filename3"/></p>
		<p> <input type="submit" value="파일 올리기"/></p>
	</form>
</body>
</html>