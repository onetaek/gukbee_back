<%@page import="t_dao.CartDAO"%>
<%@page import="t_dao.ProductDAO"%>
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
<title>장바구니 추가</title>
</head>
<body>

	<%
		System.out.println("shop_db의 addCart.jsp");
		String productId = request.getParameter("id");
		System.out.println("shop_db의 id: "+productId);
		if(productId == null || productId.trim().equals("")){
			response.sendRedirect("products.jsp");
			return;
		}
		
		//ProductDao pdao = new ProductDao();
		//Product product = pdao.getOneProduct(id);
		
		ProductDAO productDAO = new ProductDAO();
		Product productDTO = productDAO.getProductById(productId);
		
		if(productDTO == null){
			response.sendRedirect("../error/execptionNoProductId.jsp");
		}
		
		String orderNo = session.getId();//세션마다 붙은 키
		String memberId = (String)session.getAttribute("sessionId");
		
		CartDAO cartDAO = new CartDAO();
		
		boolean flag = cartDAO.updateCart(productDTO,orderNo,memberId);
		
		response.sendRedirect("product.jsp?id="+productId);//id -> 제품의 아이디
		
		/*
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
		
		response.sendRedirect("../product/product.jsp?id="+id);
		*/
	%>
</body>
</html>