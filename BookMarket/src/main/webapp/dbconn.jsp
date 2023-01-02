<%@page import="java.sql.*"%>
<%
Connection conn = null;
PreparedStatement pstmt = null;
ResultSet rs = null;

try{
	String url="jdbc:mariadb://localhost:3310/sample";
	String user ="root";
	String password ="7517";
	Class.forName("org.mariadb.jdbc.Driver");
	conn = DriverManager.getConnection(url,user,password);	
}catch(SQLException ex){
	out.println("데이터베이스 연결이 실패되었습니다.<br>");
	out.println("SQLException: "+ex.getMessage());
}
%>