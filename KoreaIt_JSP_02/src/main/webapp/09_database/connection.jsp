<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--
JDBC API로 데이터베이스 접속하기
1) Connection 객체를 null로 초기화.
2) 데이터베이스와 연동하기 위해 JDBC로 로딩하도록 Class.forName() 메서드 작성.
3) DriverManager 객체로부터 COnneciton 객체를 얻어오도록 getconnection() 메서드를 자성.
 --%>
<%
	Connection conn = null;
	try{
		String url="jdbc:mariadb://localhost:3310/sample";
		String user ="root";
		String password ="7517";
		Class.forName("org.mariadb.jdbc.Driver");
		conn = DriverManager.getConnection(url,user,password);
		System.out.println("데이터베이스 연결이 성공하였습니다.");
	} catch (SQLException ex){
		out.println("데이터베이스 연결이 실패되었습니다.<br>");
		out.println("SQLException: "+ex.getMessage());
	}finally{
		if(conn != null)
			conn.close();
	}
%>
</body>
</html>