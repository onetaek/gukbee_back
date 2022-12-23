<%@page import="java.io.File"%>
<%@page import="java.util.*"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
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
	MultipartRequest multi = new MultipartRequest(request,"C:\\upload",5 * 1024 * 1024, "UTF-8",
			new DefaultFileRenamePolicy());
	
	String name1 = multi.getParameter("name1");
	String subject1 = multi.getParameter("subject1");
	
	String name2 = multi.getParameter("name2");
	String subject2 = multi.getParameter("subject2");
	
	String name3 = multi.getParameter("name3");
	String subject3 = multi.getParameter("subject3");
	
	String filename1 = multi.getFilesystemName("filename1");
	String filename2 = multi.getFilesystemName("filename2");
	String filename3 = multi.getFilesystemName("filename3");

	
%>
	<table border="">
		<tr>	
			<th width="100">이름</th>
			<th width="100">제목</th>
			<th width="100">파일</th>
		</tr>
		<tr>	
			<th><%=name1 %></th>
			<th><%=subject1 %></th>
			<th><%=filename1 %></th>
		</tr>
		<tr>	
			<th><%=name2 %></th>
			<th><%=subject2 %></th>
			<th><%=filename2 %></th>
		</tr>
		<tr>	
			<th><%=name3 %></th>
			<th><%=subject3 %></th>
			<th><%=filename3 %></th>
		</tr>
	</table>

</body>
</html>