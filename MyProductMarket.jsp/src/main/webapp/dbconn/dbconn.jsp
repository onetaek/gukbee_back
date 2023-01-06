<%@page import="java.sql.*"%>
<%
Connection conn = null;
PreparedStatement pstmt = null;
ResultSet rs = null;
try{
	String url="jdbc:mariadb://localhost:3310/my_product_market";
	String user ="root";
	String password ="7517";
	Class.forName("org.mariadb.jdbc.Driver");
	conn = DriverManager.getConnection(url,user,password);	
}catch(SQLException ex){
	out.println("database connect failed <br>");
	out.println("SQLException: "+ex.getMessage());
}
%>