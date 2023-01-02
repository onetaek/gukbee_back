<%@page import="java.sql.*"%>
<%
Connection conn = null;
String url="jdbc:mariadb://localhost:3310/sample";
String user ="root";
String password ="7517";
Class.forName("org.mariadb.jdbc.Driver");
conn = DriverManager.getConnection(url,user,password);
%>