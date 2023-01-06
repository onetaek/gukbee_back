<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ include file="../dbconn/dbconn.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 처리</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");

	String id = request.getParameter("id");
	String password = request.getParameter("password");
	
	String sql = "select * from admin where id=? and password = ?";
	try{
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,id);
		pstmt.setString(2,password);
		rs = pstmt.executeQuery();
		if(rs.next()){
			session.setAttribute("sessionAdminId",rs.getString("id"));
			session.setAttribute("sessionAdminName",rs.getString("name"));
			session.setAttribute("sessionAdminDay",rs.getString("lately_login_day"));
			
			//최근 로그인한 날짜를 변경
			sql = "update admin set lately_login_day = now() where id=? and password=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,id);
			pstmt.setString(2,password);
			pstmt.executeUpdate();
			
			//인덱스 페이지로 이동
			response.sendRedirect("index.jsp");
		}else{
			response.sendRedirect("loginAdmin.jsp?error=1");
		}
	}catch(Exception e){
		e.printStackTrace();
	}
%>
</body>
</html>