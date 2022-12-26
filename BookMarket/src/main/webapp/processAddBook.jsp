<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="java.io.File"%>
<%@page import="dao.BookRepository"%>
<%@page import="dto.Book"%>
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

	String bookId = multi.getParameter("bookId");
	String name = multi.getParameter("name");
	String unitPrice = multi.getParameter("unitPrice");
	String author = multi.getParameter("author");
	String description = multi.getParameter("description");
	String publisher = multi.getParameter("publisher");
	String category = multi.getParameter("category");
	String unitsInStock = multi.getParameter("unitsInStock");
	String totalPages = multi.getParameter("totalPages");
	String condition = multi.getParameter("condition");
	String releaseDate = multi.getParameter("releaseDate");
	
	Integer price;
	
	if(unitPrice.isEmpty()){
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
	
	long totalPages_long;
	
	if(totalPages.isEmpty()){
		totalPages_long = 0;
	}else{
		totalPages_long = Long.valueOf(totalPages);
	}
	
	Enumeration files = multi.getFileNames();
	String fname = (String)files.nextElement();
	String fileName = multi.getFilesystemName(fname);
	
	BookRepository dao = BookRepository.getInstance();
	
	Book newBook = new Book();
	newBook.setBookId(bookId);
	newBook.setName(name);
	newBook.setUnitPrice(price);
	newBook.setAuthor(author);
	newBook.setDescription(description);
	newBook.setPublisher(publisher);
	newBook.setCategory(category);
	newBook.setUnitsInStock(stock);
	newBook.setTotalPages(totalPages_long);
	newBook.setReleaseDate(releaseDate);
	newBook.setCondition(condition);
	newBook.setFilename(fileName);
	
	dao.addBook(newBook);
	response.sendRedirect("books.jsp");
	%>
</body>
</html>