<%@page import="dao.BookRepository"%>
<%@page import="dto.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage ="exceptionNoProductId.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
	<!--<jsp:useBean id="bookDAO" class="dao.BookRepository"/>-->
	<jsp:include page="menu.jsp"/>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">도서정보</h1>
		</div>
	</div>
	<%
		String id = request.getParameter("id");
		BookRepository dao = BookRepository.getInstance();
		Book book = dao.getBookById(id);
	%>
	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<h3><b>책제목: </b><%=book.getName() %></h3>
				<p><b>책코드: </b><span class="badge badge-danger"><%=book.getBookId() %></span></p>
				<h4><b>가격: </b><%=book.getUnitPrice() %></h4>
				<p><b>저자: </b><%=book.getAuthor() %></p>
				<p><b>설명: </b><%=book.getDescription() %></p>
				<p><b>출판사: </b><%=book.getPublisher() %></p>
				<p><b>분류: </b><%=book.getCategory() %></p>
				<p><b>재고량: </b><%=book.getUnitsInStock() %></p>
				<p><b>책페이지수: </b><%=book.getTotalPages() %></p>
				<p><b>출판일: </b><%=book.getReleaseDate() %></p>
				<p><b>새거/중고: </b><%=book.getCondition() %></p>
				 <p>
				 	<a href="#" class="btn btn-info"> 도서 주문 &raquo;</a>
				 	<a href="./books.jsp" class="btn btn-secondary">도서 목록 &raquo;</a>
				 </p>
			</div>
		</div>
	</div>
</body>
</html>