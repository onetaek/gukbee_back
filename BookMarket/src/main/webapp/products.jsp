<%@page import="dto.Product"%>
<%@page import="dao.ProductRepository" %>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.ProductRepository"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="productDAO" class="dao.ProductRepository"/>
<html>
<head>
<meta charset="UTF-8">
<title>상품목록</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
	<!--<jsp:include page="menu.jsp"/>-->
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품목록</h1>
		</div>
	</div>
	<%	
	ProductRepository dao = ProductRepository.getInstance();	
	ArrayList<Product> listOfProducts = dao.getAllProducts();
		
	%>
	<div class="container">
		<div class="row" align="center">
		<%@ include file="dbconn.jsp" %>
			<%
				String sql = "select * from product";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()){
			%>
			<div class="col-md-4">
				<img class="my_img" src="c:upload/<%=rs.getString("p_fileName")%>" style="width:100%;"/>
				<h3><a href="./product.jsp?id=<%=rs.getString("p_name") %>"><%=rs.getString("p_name") %></a></h3>
				<p><%=rs.getString("p_description") %></p>
				<p><%=rs.getString("p_UnitPrice") %></p>
				<p><a href="./product.jsp?id=<%=rs.getString("p_id")%>" 
					class="btn btn-secondary" role="button"> 상세 정보 &raquo;</a></p>
			</div>
			<%
				}
			
			%>
		</div>
		<hr>
	</div>
	<jsp:include page="footer.jsp"/>
</body>
</html>