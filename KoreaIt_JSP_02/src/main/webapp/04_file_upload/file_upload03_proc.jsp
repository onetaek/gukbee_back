<%@page import="org.apache.commons.fileupload.*" %>
<%@page import="java.util.*" %>
<%@page import="java.io.*" %>
<%@page import="java.io.File"%>
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
		String fileUploadPath = "C:\\upload";
		//String fileuploadPath ="./";
		DiskFileUpload upload = new DiskFileUpload();
		
		List items = upload.parseRequest(request);
		
		Iterator params = items.iterator();
		
		while(params.hasNext()){
			FileItem fileItem = (FileItem)params.next();
			if(!fileItem.isFormField()){
				String fileName = fileItem.getName();
				out.print(fileName);
				fileName = fileName.substring(fileName.lastIndexOf("\\")+1);
				File file = new File(fileUploadPath + "/" + fileName);
				fileItem.write(file);
			}
		}
	%>
</body>
</html>