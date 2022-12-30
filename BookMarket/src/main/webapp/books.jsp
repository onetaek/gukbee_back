<%@page import="dao.BookRepository"%>
<%@page import="dto.Book"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--<jsp:useBean id="bookDAO" class="dao.BookRepository"/>-->
<html>
<head>
<meta charset="UTF-8">
<title>도서목록</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
	<jsp:include page="menu.jsp"/>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">도서목록</h1>
		</div>
	</div>
	<%	
		BookRepository dao = BookRepository.getInstance();
		ArrayList<Book> listOfBooks = dao.getAllBooks();
	%>
	<div class="container">
		<div class="row" align="center">
			<%
				for(int i = 0 ; i < listOfBooks.size();i++){
					Book book = listOfBooks.get(i);
			%>
			<div class="col-md-12">
				<img class="my_img" src="${pageContext.request.contextPath }/resources/images/<%=book.getFilename()%>
				"style="width:300px";/>
				<h3 class="text-left"><a href="./book.jsp?id=<%=book.getBookId()%>">[<%=book.getCategory() %>] <%=book.getName() %></a></h3>
				<p class="text-left"><%=book.getDescription() %></p>
				<p class="text-left"><%=book.getAuthor() %> | <%=book.getPublisher() %> | <%=book.getUnitPrice() %></p>
			</div>
			<%
				}
			%>
		</div>
		<hr>
	</div>
	<jsp:include page="footer.jsp"/>
</body>
</html>