<%@page import="dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	String id = request.getParameter("id");
	System.out.println("id= "+id);
	MemberDao mdao = new MemberDao();
	int cnt = mdao.memberCheckById(id);
	boolean result = (cnt == 1) ? true : false; 
	System.out.println("cnt = "+ cnt);
%>
{
	"result" : "<%=result%>"
}