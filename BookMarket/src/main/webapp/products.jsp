<%@page import="dto.Product"%>
<%@page import="dao.ProductRepository" %>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.ProductRepository"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="productDAO" class="dao.ProductRepository"/>
<html>
<head>
<meta charset="UTF-8">
<title>상품목록</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
	<!--<jsp:include page="menu.jsp"/>-->
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품목록</h1>
		</div>
	</div>
	<%	
	ProductRepository dao = ProductRepository.getInstance();	
	ArrayList<Product> listOfProducts = dao.getAllProducts();
		
	%>
	<div class="container">
		<div class="row" align="center">
			<%
				for(int i = 0 ; i < listOfProducts.size();i++){
					Product product = listOfProducts.get(i);
			%>
			<div class="col-md-4">
				<h3><a href="./product.jsp?id=<%=product.getProductId() %>"><%=product.getPname() %></a></h3>
				<p><%=product.getDescription() %></p>
				<p><%=product.getUnitPrice() %></p>
				<p><a href=""></a></p>
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