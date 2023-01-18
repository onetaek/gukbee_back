<%@page import="t_dao.ProductDAO"%>
<%@page import="dto.Cart"%>
<%@page import="t_dao.CartDAO"%>
<%@page import="dto.Product"%>
<%@page import="java.util.ArrayList"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>장바구니</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

</head>
<body>
	<jsp:include page="../layouts/menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">장바구니</h1>
		</div>
	</div>

	<div class="container">
		<div class="row">
			<table width="100%">
				<tr>
					<td align="left"><span href="./deleteCart.jsp"
						onclick="deleteCart();" class="btn btn-danger">삭제하기</span></td>
					<td align="right"><a href="../order/shippingInfo.jsp?cartId=${cartId }" class="btn btn-success">주문하기</a></td>
				</tr>

			</table>
		</div>
		<div style="padding-top: 50px">
			<c:set var="sum" value="${0 }" />
			<table class="table table-hover">
				<tr>
					<th>상품</th>
					<th>가격</th>
					<th>수량</th>
					<th>소계</th>
					<th>비고</th>
				</tr>	
				<c:forEach var="cart" items="${cartList }">
				<c:set var="total" value="${cart.unitPrice * cart.cnt }" />
				<c:set var="sum" value="${sum + total }"/>
				<tr>
					<td>
					<input type="checkbox" name="chkID" value="${cart.cartId }" onclick="setChkAlone(this);">
						${cart.productId} - ${cart.name }
					</td>
					<td>${cart.unitPrice}</td>
					<td>${cart.cnt}</td>
					<td>${total }</td>
					<td><span style="cursor:pointer"
						onclick="removeCartById('${cart.productId}')"
						class="badge badge-danger">삭제</span></td>
				</tr>
				</c:forEach>
				<tr>
					<th></th>
					<th></th>
					<th>총액</th>
					<th><c:out value="${sum }" /></th>
					<th></th>
				</tr>
			</table>
			<a href="../shop_db/products.jsp" class="btn btn-secondary">&laquo; 쇼핑
				계속하기</a>
		</div>

		<form name="frmCart" method="post">
			<input type="hidden" name="id" value=""/>
		</form>
		<script>
			const frm = document.frmCart;
			let removeCartById = function(ID) {
				if (confirm("해당 상품을 장바구니에서 삭제하시겠습니까?")) {
					frm.id.value=ID;
					frm.action="removeCart.jsp";
					frm.submit();
				}
			}
			let deleteCart = function() {
				if(confirm('삭제하시겠습니까?')){
					frm.action ="deleteCart.jsp";
					frm.submit();
				}
			}
		</script>
		<hr>
	</div>
	<jsp:include page="../layouts/footer.jsp" />
</body>
</html>