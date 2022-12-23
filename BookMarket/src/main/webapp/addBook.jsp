<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script src="./resource/js/validation.js"></script>
</head>
<body>
	<jsp:include page="menu.jsp"/>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">도서 등록</h1>
		</div>
	</div>
	<div class="container">
		<form name="newProduct" action="./processAddBook.jsp" class="form-horizontal" method="post">
			<div class="form-group row">
				<label class="col-sm-2">도서 코드</label>
				<div class="col-sm-3">
					<input type="text" id="bookId" name="bookId" class="form-control"/>				
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">도서명</label>
				<div class="col-sm-3">
					<input type="text" id="name" name="name" class="form-control"/>				
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">가격</label>
				<div class="col-sm-3">
					<input type="text" id="unitPrice" name="unitPrice" class="form-control"/>				
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">저자</label>
				<div class="col-sm-5">
					<input type="text" name="author" class="form-control"/>		
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">도서정보</label>
				<div class="col-sm-5">
					<textarea name="description" cols="50" rows="2"
						class="form-control"></textarea>					
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">출판사</label>
				<div class="col-sm-3">
					<input type="text" name="publisher" class="form-control"/>				
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2">카테고리</label>
				<div class="col-sm-3">
					<input type="text" name="category" class="form-control"/>				
				</div>
			</div>
			
			<div class="form-group row">
				<label class="col-sm-2">도서 수</label>
				<div class="col-sm-3">
					<input type="text" id="unitsInStock" name="unitsInStock" class="form-control"/>				
				</div>
			</div>
			
			<div class="form-group row">
				<label class="col-sm-2">총페이지</label>
				<div class="col-sm-3">
					<input type="text" name="totalPages" class="form-control"/>				
				</div>
			</div>
			
			<div class="form-group row">
				<label class="col-sm-2">출판일</label>
				<div class="col-sm-3">
					<input type="date" name="releaseDate" class="form-control"/>				
				</div>
			</div>
			
			<div class="form-group row">
				<label class="col-sm-2">상태</label>
				<div class="col-sm-5">
					<input type="radio" name="condition" value="New"/> 신규 제품
					<input type="radio" name="condition" value="Old"/> 중고 제품
					<input type="radio" name="condition" value="Refurbished"/> 재생 제품				
				</div>
			</div>
			<div class="form-group row">
				<div class="col-sm-offset-2 col-sm-10">
					<input onclick="checkAddProduct()" type="button" class="btn btn-primary" value="등록"/>				
				</div>
			</div>
		</form>
	</div>
</body>
</html>