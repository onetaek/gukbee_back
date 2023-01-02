<%@page import="java.sql.*"%>
<%
Connection conn = null;
String url="jdbc:h2:tcp://localhost/~/test";
String user ="sa";
String password ="";
Class.forName("org.h2.Driver");
conn = DriverManager.getConnection(url,user,password);
%>