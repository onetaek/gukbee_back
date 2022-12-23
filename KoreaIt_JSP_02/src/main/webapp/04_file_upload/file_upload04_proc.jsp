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
	<%--
	Commons-FileUpload를 이용하여 파일 업로드 및 정보 출력하기.
	Commons-FileUpload 패키지를 사용하도록 page 디랙티브 태그의 import 속성 값에
		패키지 org.apache.commons.fileupload.*를 작성.
	 --%>
	 <%
	 	//홈 페이지에서 전송된 파일을 저장할 서버의 경로를 작성.
	 	String path="C:\\upload";
	 
	 //파일 업로드를 위해 DiskFileUpload 클래스를 생성.
	 DiskFileUpload upload = new DiskFileUpload();
	 
	 //업로드할 파일의 최대 크기, 메모리상에 저장할 최대 크기, 업로드된 파일을 임시로 저장할 경로를 작성.
	 upload.setSizeMax(1000000);
	 upload.setSizeThreshold(4096);
	 upload.setRepositoryPath(path);
	 
	 //폼 페이지에서 전송된 요청 파라미터를 전달받도록 DiskFileUpload 객체 타입의 parseRequest() 메서드를 작성.
	 List items = upload.parseRequest(request);
	 
	 //폼 페이지에서 전송된 요청 파라미터를 Iterator 클래스로 변환. 
	 Iterator params = items.iterator();
	 
	 while(params.hasNext()){
		 FileItem item = (FileItem) params.next();
		 if(item.isFormField()){
			 //홈 페이지에서 전쇵된 요청 파라미터가 일반 데이터이면 요청 파라미터의 이름과 값을 출력.
			 String name = item.getFieldName();
			 String value = item.getString("utf-8");
			 out.println(name + "=" + value + "<br>");
		 }
		 
	 }
	 %>
</body>
</html>