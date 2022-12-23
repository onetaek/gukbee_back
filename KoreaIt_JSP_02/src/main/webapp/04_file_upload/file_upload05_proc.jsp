<%@page import="org.apache.commons.fileupload.*" %>
<%@page import="java.util.*" %>
<%@page import="java.io.*" %>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String realPath = request.getServletContext().getRealPath("resources/images");
	out.print(realPath);
	File dir = new File(realPath);
	if(!dir.exists()){
		dir.mkdirs();
	}
	DiskFileUpload upload = new DiskFileUpload();
	List items = upload.parseRequest(request);
	Iterator params = items.iterator();
	
	String fileName = null;
	while(params.hasNext()){
		FileItem fileItem = (FileItem) params.next();
		if(!fileItem.isFormField()){
			fileName = fileItem.getName();
			//out.print(fileName);
			//fileName = fileName.substring(fileName.lastIndexOf("\\")+1);
			File file = new File(realPath + "/" + fileName);
			fileItem.write(file);
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<img src="${pageContext.request.contextPath }/resources/images/<%=fileName %>"/>
</body>
</html>