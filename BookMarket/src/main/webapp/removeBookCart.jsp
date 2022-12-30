<%@page import="java.util.ArrayList"%>
<%@page import="dto.Book"%>
<%@page import="dao.BookRepository"%>
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
	/* 장바구니에서 상품을 개별 삭제 */
	String id = request.getParameter("id");
	System.out.println("id= "+id);
	if(id ==null || id.trim().equals("")){
		response.sendRedirect("books.jsp");
		return;
	}
	
	BookRepository dao = BookRepository.getInstance();
	
	Book book = dao.getBookById(id);
	if(book == null){
		response.sendRedirect("exceptionNoProductId.jsp");
	}
	
	ArrayList<Book> bookCartList = (ArrayList<Book>)session.getAttribute("bookCartList");
	bookCartList.remove(book);
	
	response.sendRedirect("bookCart.jsp");
%>
</body>
</html>