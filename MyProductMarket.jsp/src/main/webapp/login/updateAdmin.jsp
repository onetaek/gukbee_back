<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%
	String sessionId = (String)session.getAttribute("sessionAdminId");
%>
<sql:setDataSource var ="dataSource"
	url="jdbc:mariadb://localhost:3310/my_product_market"
	driver="org.mariadb.jdbc.Driver" user="root" password="7517"/>
<sql:query dataSource="${dataSource }" var="resultSet">
	select * from admin where id = ?
	<sql:param value="<%=sessionId %>"/>
</sql:query>
<title>관리자 정보 수정</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body onload="init()">
<jsp:include page="./menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">관리자 정보 수정</h1>
		</div>
	</div>
	<c:forEach var="row" items="${resultSet.rows }">
	<div class="container">
		<form name="newMember" class="form-horizontal"  action="./processUpdateAdmin.jsp" method="post" onsubmit="return checkForm()">
			<div class="form-group  row">
				<label class="col-sm-2 ">아이디</label>
				<div class="col-sm-3">
					<input name="id" type="text" class="form-control" placeholder="id" value="<c:out value='${row.id }'/>" readonly>
				</div>
			</div>
			 <input name="password" type="hidden" value="<c:out value='${row.password }'/>">
			 
			<div class="form-group  row">
				<label class="col-sm-2">비밀번호</label>
				<div class="col-sm-3">
					<input name="password_confirm" type="text" class="form-control" placeholder="비밀번호를 입력하시오" >
				</div>
			</div>
			<div class="form-group  row">
				<label class="col-sm-2">성명</label>
				<div class="col-sm-3">
					<input name="name" type="text" class="form-control" placeholder="name" value="<c:out value='${row.name }'/>" >
				</div>
			</div>
			<div class="form-group  row">
				<div class="col-sm-offset-2 col-sm-10 ">
					<input type="submit" class="btn btn-primary" value="관리자정보수정" > 
				</div>
			</div>
		</form>
	</div>
	
	<jsp:include page="../layouts/footer.jsp" />
	<script>
		function checkForm(){
			if(!document.newMember.password.value){
				alert("비밀번호를 입력하세요");
				return false;
			}
			if(document.newMember.password.value != document.newMember.password_confirm.value){
				alert("비밀번호를 동일하게 입력하세요");
				return false;
			}
		}
	</script>
	</c:forEach>
</body>
</html>