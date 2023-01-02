<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<%@ include file="../dbconn.jsp" %>
<table class="table table-dark table-striped table-hover">
<tr>
	<th>학번</th>
	<th>학과</th>
	<th>이름</th>
	<th>주소</th>
	<th>연락처</th>
</tr>
<%
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	try{
		String sql = "select * from student";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while(rs.next()){
			%>
			<tr>
				<td><%=rs.getString("num") %></td>
				<td><%=rs.getString("depart") %></td>
				<td><%=rs.getString("name") %></td>
				<td><%=rs.getString("address") %></td>
				<td><%=rs.getString("phone") %></td>
			</tr>
			<%			
		}
	}catch(Exception e){
		e.printStackTrace();
	}

%>
</table>	
</body>
</html>