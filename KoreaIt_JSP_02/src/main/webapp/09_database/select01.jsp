<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원목록</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<%@ include file="dbconn.jsp" %>
<div class="container">
	<table class="table table-striped table-dark">
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
		</tr>
	<%
	ResultSet rs = null;
	Statement stmt = null;
	try{
		String sql = "select * from user";
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		while(rs.next()){
			String id = rs.getString("id");
			String pw = rs.getString("pw");
			String name = rs.getString("name");
			%>
				<tr>
					<td><%=id %></td>
					<td><%=pw %></td>
					<td><%=name %></td>
				</tr>
			<%		
			}
	}catch(SQLException ex){
		out.println("Member 테이블 호출이 실패했습니다<br>");
		out.println("SQLException: "+ex.getMessage());
	}finally{
		if(rs!=null)rs.close();
		if(stmt !=null)stmt.close();
		if(conn!=null)conn.close();
	}
	%>
</table>
</div>
</body>
</html>