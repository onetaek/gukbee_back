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
	System.out.println("처음 id: "+id);
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
	
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	
	try{
		String sql = "select id, pw from user where id= ? ";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		rs = pstmt.executeQuery();
		
		if(rs.next()){
			String rId = rs.getString("id");
			String rPw = rs.getString("pw");
			
			System.out.println("id: "+id+" rId: "+rId+" pw: "+pw+" rPw: "+rPw);
			
			if(id.equals(rId) && pw.equals(rPw)){
				sql="update user set name= ? where id = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1,name);
				pstmt.setString(2,id);
				pstmt.executeQuery();
				out.println("User 테이블을 수정했습니다.");
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