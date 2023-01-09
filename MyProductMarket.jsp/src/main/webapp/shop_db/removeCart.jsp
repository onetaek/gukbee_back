<%@page import="java.util.Iterator"%>
<%@page import="dao.ProductDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dto.Product"%>
<%@page import="dao.ProductRepository"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>장바구니 삭제 처리</title>
</head>
<body>
	<%
	System.out.println("removeCart.jsp 도착!");
	/* 장바구니에서 상품을 개별 삭제 */
	String id = request.getParameter("id");
	System.out.println("id= "+id);
	if(id ==null || id.trim().equals("")){
		response.sendRedirect("../product/products.jsp");
		return;
	}
	
	ProductDao pdao = new ProductDao();
	Product product = pdao.getOneProduct(id);
	
	if(product == null){
		response.sendRedirect("../error/exceptionNoProductId.jsp");
	}
	
	ArrayList<Product> cartList = (ArrayList<Product>)session.getAttribute("cartlist");

    Iterator it = cartList.iterator();
    while (it.hasNext()) {
        Product temp = (Product)it.next();
		if(temp.getProductId().equals(id)){
			it.remove();	
		}
    }
	response.sendRedirect("cart.jsp");
	%>
</body>
</html>