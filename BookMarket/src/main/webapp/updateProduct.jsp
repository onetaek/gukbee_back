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
	<jsp:include page="menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품 등록</h1>
		</div>
	</div>
	<%@ include file="dbconn.jsp"%>
	<%
	String productId = request.getParameter("id");

	String sql = "select * from product where p_id = ?";
	pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, productId);
	rs = pstmt.executeQuery();
	if (rs.next()) {
	%>



	<div class="container">
		<div class="row">
			<div class="col-md-5">
				<img src="c:/upload/<%=rs.getString("p_filename")%>" alt="image"
					style="width: 100%" />
			</div>
		</div>
		<div class="col-md-7">
			<form name="newProduct" action="./processUpdateProduct.jsp"
				class="form-horizontal" method="post" enctype="multipart/form-data">
				<input type="hidden" name="productId" class="form-control" />
				<div class="form-group row">
					<label class="col-sm-2">상품명</label>
					<div class="col-sm-3">
						<input type="text" name="name" class="form-control"
							value="<%=rs.getString("p_name")%> " />
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-2">가격</label>
					<div class="col-sm-3">
						<input type="text" name="unitPrice" class="form-control"
							value="<%=rs.getInt("p_unitPrice")%>" />
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
						<input type="radio" name="condition" value="New" <%if(rs.getString("p_condition").equals("New"))out.print("checked"); %> /> 신규 제품 
						<input type="radio" name="condition" value="Old" <%if(rs.getString("p_condition").equals("Old"))out.print("checked"); %> /> 중고 제품
						<input type="radio" name="condition" value="Refurbished" <%if(rs.getString("p_condition").equals("Refurbished"))out.print("checked"); %> /> 재생 제품
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-2">이미지</label>
					<div class="col-sm-5">
						<input type="file" name="productImage" class="form-control" />
					</div>
				</div>
			</form>
		</div>
	</div>
	<%
	}
	if (rs != null)
	rs.close();
	if (pstmt != null)
	pstmt.close();
	if (conn != null)
	conn.close();
	%>
</body>
</html>