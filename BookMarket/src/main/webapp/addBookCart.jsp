<%@page import="java.util.ArrayList"%>
<%@page import="dto.Book"%>
<%@page import="dao.BookRepository"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 장바구니</title>
</head>
<body>
<%
	String id = request.getParameter("id");
	System.out.println("bookId = "+id);
	if(id==null || id.trim().equals("")){
		response.sendRedirect("books.jsp");
		return;
	}
	
	BookRepository dao = BookRepository.getInstance();
	
	Book book = dao.getBookById(id);
	if(book == null){
		response.sendRedirect("execptionNoProductId.jsp");
	}
	
	ArrayList<Book> bookList = (ArrayList<Book>)session.getAttribute("bookCartList");
	if(bookList == null){
		bookList = new ArrayList<Book>();
		session.setAttribute("bookCartList",bookList);
	}
	
	int cnt = 0;//기존 장바구니에 담긴 상품인지 확인하기 위한 용도
	Book goodsQnt = new Book();
	for(int i = 0 ; i < bookList.size(); i++){
		goodsQnt = bookList.get(i);
		if(goodsQnt.getBookId().equals(id)){
			cnt++;
			int orderQuantity = goodsQnt.getQuantity() +1;
			goodsQnt.setQuantity(orderQuantity);
		}
	}
	if(cnt == 0){
		book.setQuantity(1);
		bookList.add(book);
	}
	
	response.sendRedirect("book.jsp?id="+id);
	
%>
</body>
</html>