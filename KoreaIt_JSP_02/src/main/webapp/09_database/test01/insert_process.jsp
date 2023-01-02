<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="../dbconn.jsp" %>
<%
	request.setCharacterEncoding("utf-8");
	String num = request.getParameter("num");
	String depart = request.getParameter("depart");
	String name = request.getParameter("name");
	String address = request.getParameter("address");
	String phone = request.getParameter("phone");
	
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	
	try{
		String sql = "insert into student(num, depart, name, address, phone) values(?,?,?,?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,num);
		pstmt.setString(2,depart);
		pstmt.setString(3,name);
		pstmt.setString(4,address);
		pstmt.setString(5,phone);
		pstmt.executeUpdate();
		conn.close();
		pstmt.close();
		out.println("insert문 실행 완료!");
	}catch(Exception e){
		out.println("insert 실패ㅠ");
		e.printStackTrace();
	}
%>
</body>
</html>