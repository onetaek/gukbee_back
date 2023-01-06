<%@page import="dao.ProductDao"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="java.io.File"%>
<%@page import="dao.ProductRepository"%>
<%@page import="dto.Product"%>
<%@page import="java.sql.*" %>
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
	request.setCharacterEncoding("UTF-8");
	
	String realPath = request.getServletContext().getRealPath("resources/images");
	File dir = new File(realPath);
	if(!dir.exists()){//dir경로에 디렉터리가 없다면
		dir.mkdirs();//make 해줘라
	}
	
	String filename = "";
	String encType = "utf-8";//인코딩 타입
	int maxSize = 5 * 1024 * 1024; //최대 업로드될 파일의 크기 5MB
	
	//파일을 받아야하기 때문에 MultipartRequest라는 클래스를 사용해서 받음
	MultipartRequest multi = new MultipartRequest(request,realPath,maxSize,encType,new DefaultFileRenamePolicy());
	
	String productId = multi.getParameter("productId");
	String name = multi.getParameter("name");
	String unitPrice = multi.getParameter("unitPrice");
	String description = multi.getParameter("description");
	String manufacturer = multi.getParameter("manufacturer");
	String category = multi.getParameter("categary");
	String unitsInStock = multi.getParameter("unitsInStock");
	String condition = multi.getParameter("condition");
	
	
	Integer price;
	
	if(unitPrice.isEmpty()){//가격이 입력이 안되었을경우 0으로
		price = 0;
	}else{
		price = Integer.valueOf(unitPrice);
	}
	
	long stock;
	
	if(unitsInStock.isEmpty()){
		stock = 0;
	}else{
		stock = Long.valueOf(unitsInStock);
	}
	
	Enumeration files = multi.getFileNames();
	String fname = (String)files.nextElement();
	String fileName = multi.getFilesystemName(fname);
	
	ProductDao pdao = new ProductDao();
	pdao.addProduct(productId,name,price,description,category,
			manufacturer,stock,condition,filename);
	
	response.sendRedirect("products.jsp");
	%>
</body>
</html>