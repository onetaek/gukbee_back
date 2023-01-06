<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 편집</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script>
	function deleteConfirm(id){
		if(confirm("해당 상품을 삭제합니다!!") == true)
			location.href="./deleteProduct.jsp?id="+ id;
		else
			return;
	}
</script>
</head>
<%
	String edit = request.getParameter("edit");
%>
<body>
	<jsp:include page="menu.jsp"/>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품 편집</h1>
		</div>
	</div>
	<div class="container">
		<div class="row">
			<%@ include file="dbconn.jsp" %>
			<%
				String sql = "select * from product";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()){
					
				
			%>
			<div>
				<img src="c:/upload/<%=rs.getString("p_fileName") %> style="width:100%">
				<h3><%=rs.getString("p_name") %></h3>
				<p><%=rs.getString("p_description") %>
				<p><%=rs.getString("p_UnitPrice") %>원
				<p>
					<%
						if(edit.equals("update")){
					%>
					<a href="./updateProduct.jsp?id=<%=rs.getString("p_id")%>" class="btn btn-success" role="button">
					수정 &raquo;</a>
					<%
						}else if(edit.equals("delete")){
					%>
					<a href="#" onclick="deleteConfirm('<%=rs.getString("p_id") %>')" class="btn btn-danger" role="button">
					삭제 &raquo;</a>
					<%
						}
					%>
			</div>	
			<%
			}
				if(rs!=null)
					rs.close();
				if(pstmt != null)
					pstmt.close();
				if(conn != null)
					conn.close();
			%>
		</div>
	</div>
	<jsp:include page="footer.jsp"/>
</body>
</html>