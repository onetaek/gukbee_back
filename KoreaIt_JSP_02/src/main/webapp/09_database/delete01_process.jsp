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

	ResultSet rs = null;
	Statement stmt = null;
	
	try{
		String sql = "select id, pw from user where id='" + id + "'";
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		
		if(rs.next()){
			String rId = rs.getString("id");
			String rPw = rs.getString("pw");
			
			System.out.println("id: "+id+" rId: "+rId+" pw: "+pw+" rPw: "+rPw);
			
			if(id.equals(rId) && pw.equals(rPw)){
				sql="delete from user where id ='" + id +"'";
				stmt = conn.createStatement();
				stmt.executeQuery(sql);
				out.println("User 테이블을 삭제했습니다.");
			}else{
				out.println("일치하는 비밀번호가 아닙니다.");
			}
		}else{
			out.println("User 테이블에 일치하는 아이디가 없습니다.");
		}
	}catch(SQLException ex){
		out.println("SQLException: "+ex.getMessage());
	}
	
%>
</body>
</html>