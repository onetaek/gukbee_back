<%@page import="dao.ProductDao"%>
<%@page import="dao.ProductRepository"%>
<%@page import="dto.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage ="exceptionNoProductId.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 상세 정보</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script>
	function addToCart(){
		if(confirm("상품을 장바구니에 추가하시겠습니까?")){
			document.addForm.submit();
		}else{
			document.addForm.reset();
		}
	}
</script>
</head>
<body>
	<jsp:include page="../layouts/menu.jsp"/>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품정보</h1>
		</div>
	</div>
	<%
		String id = request.getParameter("id");
		ProductDao pdao = new ProductDao();
		Product product = pdao.getOneProduct(id);
	%>
	<div class="container">
		<div class="row">
			<div class="col-md-5">
				<img src="${pageContext.request.contextPath }/resources/images/<%=product.getFilename() %>"
				style="width:100%"/>
			</div>
			<div class="col-md-6">
				<h3><%=product.getPname() %></h3>
				<p><%=product.getDescription() %></p>
				<p><b>상품 코드 : </b><span class="badge badge-danger"><%=product.getProductId() %></span></p>
				<p><b>제조사</b> : <%=product.getManufacturer() %></p>
				<p><b>분류</b> : <%=product.getCategory() %></p>
				<p><b>재고 수</b> : <%=product.getUnitsInStock() %></p>
				<h4><%=product.getUnitPrice() %>원</h4>
				<p>
					<form name="addForm" action="../shop_db/addCart.jsp?id=<%=product.getProductId()%>" method="post">
						<a href="#" class="btn btn-info" onclick="addToCart()"> 상품 주문 &raquo;</a>
						<a href="../shop_db/cart.jsp" class="btn btn-warning">장바구니 &raquo;</a>
				 		<a href="./products.jsp" class="btn btn-secondary">상품 목록 &raquo;</a>
					</form>
				</p>
			</div>
		</div>
	</div>
	<jsp:include page="../layouts/footer.jsp"/>
</body>
</html>