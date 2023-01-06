<%@page import="dto.Product"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 편집</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script>
	function deleteConfirm(id){
		if(confirm("해당 상품을 삭제합니다!!") == true)
			location.href="./deleteProduct.jsp?id="+ id;
		else
			return;
	}
</script>
</head>
<%
	String edit = request.getParameter("edit");
%>
<body>
	<jsp:include page="../layouts/menu.jsp"/>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품 편집</h1>
		</div>
	</div>
	<div class="container">
		<div class="row">
			<%
			ProductDao pdao = new ProductDao();
			ArrayList<Product> dtos = pdao.selectAllProduct(); 	
			System.out.println(dtos);
			for(Product product : dtos){
			%>
			<div>
				<img src="c:/upload/<%=product.getFilename() %> style="width:100%">
				<h3><%=product.getPname() %></h3>
				<p><%=product.getDescription() %>
				<p><%=product.getUnitPrice() %>원
				<p>
					<%
						if(edit.equals("update")){
					%>
					<a href="./updateProduct.jsp?id=<%=product.getProductId()%>" class="btn btn-success" role="button">
					수정 &raquo;</a>
					<%
						}else if(edit.equals("delete")){
					%>
					<a href="#" onclick="deleteConfirm('<%=product.getProductId() %>')" class="btn btn-danger" role="button">
					삭제 &raquo;</a>
					<%
						}
					%>
			</div>	
			<%
			}
			%>
		</div>
	</div>
	<jsp:include page="../layouts/footer.jsp"/>
</body>
</html>