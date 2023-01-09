<%@page import="dao.ProductDao"%>
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
	<jsp:include page="../layouts/menu.jsp"/>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품목록</h1>
		</div>
	</div>
	<div class="container">
		<div class="row" align="center">
			<%
				ProductDao pdao = new ProductDao();
				ArrayList<Product> dtos = pdao.selectAllProduct(); 	
				System.out.println(dtos);
				for(Product product : dtos){
			%>
			<div class="col-md-4">
				<img class="my_img" src="${pageContext.request.contextPath }/resources/images/<%=product.getFilename()%>" style="width:100%;"/>
				<h3><%=product.getPname()%></h3>
				<p><%=product.getDescription() %></p>
				<p><%=product.getUnitPrice() %></p>
				<p><a href="./product.jsp?id=<%=product.getProductId()%>" 
					class="btn btn-secondary" role="button"> 상세 정보 &raquo;</a></p>
			</div>
			<%
				}
			%>
		</div>
		<hr>
	</div>
	<jsp:include page="../layouts/footer.jsp"/>
</body>
</html>