<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="dbconn.jsp" %>
<%
	request.setCharacterEncoding("utf-8");
 	
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	
	Statement stmt = null;
	
	try{
		String sql = "insert into user(id,pw,name) values('"+id+"', '"+pw+"','"+name+"')";
		out.print(sql);
		stmt = conn.createStatement();
		stmt.executeUpdate(sql);
		out.println("User테이블 삽입이 성공했습니다.");
	}catch(Exception e){
		out.println("User테이블 삽입에 실패하였습니다.");
	}
%>
</body>
</html>