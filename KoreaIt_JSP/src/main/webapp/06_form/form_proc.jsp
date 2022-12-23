<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	
	String name = request.getParameter("name");
	String zipcode = request.getParameter("zipcode");
	String address01 = request.getParameter("address01");
	String address02 = request.getParameter("address02");
	String email = request.getParameter("email");
	%>
	<h2 class="bg-secondary text-light" style="margin:0;">입력하신 정보</h2>
	<table class="table table-dark table-striped-columns">
		<tr>
			<th>이름</th>
			<td><%=name %></td>
		</tr>
		<tr>
			<th>주소</th>
			<td><%=zipcode %> <%=address01 %> <%=address02 %> </td>
		</tr>
		<tr>
			<th>이메일</th>
			<td><%=email %></td>
		</tr>
	</table>

</body>
</html>