<%@page import="java.util.ArrayList"%>
<%@page import="dto.Product"%>
<%@page import="dao.ProductRepository"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>장바구니 추가</title>
</head>
<body>
	<%
	System.out.println("addCart.jsp도착!");
		String id = request.getParameter("id");
		if(id == null || id.trim().equals("")){
			response.sendRedirect("products.jsp");
			return;
		}
		
		ProductRepository dao = ProductRepository.getInstance();
		
		Product product = dao.getProductById(id);
		if(product == null){
			response.sendRedirect("execptionNoProductId.jsp");
		}
		
		ArrayList<Product> list = (ArrayList<Product>)session.getAttribute("cartlist");
		if(list == null){
			list = new ArrayList<Product>();
			session.setAttribute("cartlist",list);
		}
		
		int cnt = 0; //기존 장바구니에 담긴 상품인지 확인하기 위한 용도
		Product goodsQnt = new Product();
		for(int i = 0 ; i < list.size(); i++){
			goodsQnt = list.get(i);
			if(goodsQnt.getProductId().equals(id)){
				cnt++;
				int orderQuantity = goodsQnt.getQuantity() +1;
				goodsQnt.setQuantity(orderQuantity);
			}
		}
		
		if(cnt==0){
			product.setQuantity(1);
			list.add(product);
		}
		
		response.sendRedirect("product.jsp?id="+id);
	%>
</body>
</html>