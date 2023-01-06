<%@page import="dto.Product"%>
<%@page import="dao.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
	<jsp:include page="../layouts/menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품 등록</h1>
		</div>
	</div>
	<%
	String productId = request.getParameter("id");
	System.out.println("updateProduct.jsp에서의 productId: "+productId);
	ProductDao pdao = new ProductDao();
	Product product = pdao.getOneProduct(productId);
	%>
	<div class="container">
		<div class="row">
			<div class="col-md-5">
				<img src="c:/upload/<%=product.getFilename()%>" alt="image"
					style="width: 100%" />
			</div>
		</div>
		<div class="col-md-7">
			<form name="newProduct" action="./processUpdateProduct.jsp"
				class="form-horizontal" method="post" enctype="multipart/form-data">
				<input type="hidden" name="productId" value="<%=productId %>" />
				<div class="form-group row">
					<label class="col-sm-2">상품명</label>
					<div class="col-sm-3">
						<input type="text" name="name" class="form-control"
							value="<%=product.getPname()%> " />
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-2">가격</label>
					<div class="col-sm-3">
						<input type="text" name="unitPrice" class="form-control"
							value="<%=product.getUnitPrice()%>" />
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-2">상세 정보</label>
					<div class="col-sm-5">
						<textarea name="description" cols="50" rows="2"
							class="form-control"></textarea>
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-2">제조사</label>
					<div class="col-sm-3">
						<input type="text" name="manufacturer" class="form-control" />
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-2">분류</label>
					<div class="col-sm-3">
						<input type="text" name="categary" class="form-control" />
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-2">재고 수(정수 입력)</label>
					<div class="col-sm-3">
						<input type="text" name="unitsInStock" class="form-control" />
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-2">상태</label>
					<div class="col-sm-5">
						<input type="radio" name="condition" value="New" <%if(product.getCondition().equals("New"))out.print("checked"); %> /> 신규 제품 <input
							type="radio" name="condition" value="Old" <%if(product.getCondition().equals("Old"))out.print("checked"); %> /> 중고 제품 <input
							type="radio" name="condition" value="Refurbished" <%if(product.getCondition().equals("Refurbished"))out.print("checked"); %> /> 재생 제품
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-2">이미지</label>
					<div class="col-sm-5">
						<input type="file" name="productImage" class="form-control" />
					</div>
				</div>
				<div class="form-group row">
				<div class="col-sm-offset-2 col-sm-10">
					<input type="submit" class="btn btn-primary" value="수정"/>				
				</div>
			</div>
				
			</form>
		</div>
	</div>
</body>
</html>