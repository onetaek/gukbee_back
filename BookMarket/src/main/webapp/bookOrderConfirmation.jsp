<%@page import="dto.Book"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.net.URLDecoder"%>
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
<%
	request.setCharacterEncoding("utf-8");

	String cartId = session.getId();
	
	String shipping_cartId = "";
	String shipping_name = "";
	String shipping_shippingDate = "";
	String shipping_country = "";
	String shipping_zipCode = "";
	String shipping_addressName = "";
	
	Cookie[] cookies = request.getCookies();
	if(cookies != null){
		for(int i = 0 ; i < cookies.length ; i++){
			Cookie thisCookie = cookies[i];
			String n = thisCookie.getName();
			if(n.equals("Shipping_cartId"))
				shipping_cartId = URLDecoder.decode((thisCookie.getValue()),"utf-8");
			if(n.equals("Shipping_name"))
				shipping_name = URLDecoder.decode((thisCookie.getValue()),"utf-8");
			if(n.equals("Shipping_shippingDate"))
				shipping_shippingDate = URLDecoder.decode((thisCookie.getValue()),"utf-8");
			if(n.equals("Shipping_country"))
				shipping_country = URLDecoder.decode((thisCookie.getValue()),"utf-8");
			if(n.equals("Shipping_zipCode"))
				shipping_zipCode = URLDecoder.decode((thisCookie.getValue()),"utf-8");
			if(n.equals("Shipping_addressName"))
				shipping_addressName = URLDecoder.decode((thisCookie.getValue()),"utf-8");
		}
	}
%>
<div class="container col-8 alert alert-info mt-5">
	<div class="text-center">
		<h1>영주증</h1>
	</div>
	<div class="row justify-content-betwenn">
		<div class="col-4" align="left">
			<strong>배송 주소</strong><br> 성명 : <% out.println(shipping_name); %><br>
			우편번호 : <% out.println(shipping_zipCode);  %><br>
			주소 : <% out.println(shipping_addressName); %>(<%out.println(shipping_country); %>)<br>
		</div>
		<div class="col-4" align="right">
			<p><em>배송일: <%out.println(shipping_shippingDate); %></em>
		</div>
	</div>
	<div>
		<table class="table table-hover">
			<tr>
				<th class="text-center">상품</th>
				<th class="text-center">#</th>
				<th class="text-center">가격</th>
				<th class="text-center">소계</th>
			</tr>	
			<%
				int sum = 0;
				ArrayList<Book> bookCartList = (ArrayList<Book>)session.getAttribute("bookCartList");
				if(bookCartList == null)
					bookCartList = new ArrayList<Book>();
				for(int i = 0 ; i < bookCartList.size(); i++){
					Book book = bookCartList.get(i);
					int total = book.getUnitPrice() * book.getQuantity();
					sum = sum + total;
			%>
				<tr>
					<td class="text-center"><em><%=book.getBookId() %></em></td>
					<td class="text-center"><%=book.getQuantity() %></td>
					<td class="text-center"><%=book.getUnitPrice() %></td>
					<td class="text-center"><%=total %></td>
				</tr>
			
			<%
				}
			%>
			<tr>
				<td></td>
				<td></td>
				<td class="text-right"><strong>총액: </strong></td>
				<td class="text-center text-danger"><strong><%=sum %></strong></td>
			</tr>
		</table>
		<a href="./bookShippingInfo.jsp?cartId=<%=shipping_cartId %>" class="btn btn-secondary" role="button">이전</a>
		<a href="./bookThankCustomer.jsp" class="btn btn-success" role="button">주문 완료</a>
		<a href="./bookCheckOutCancelled.jsp" class="btn btn-secondary" role="button">취소</a>
		
	</div>
	
</div>
</body>
</html>