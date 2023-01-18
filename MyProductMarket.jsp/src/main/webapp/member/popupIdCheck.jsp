<%@page import="dto.Member"%>
<%@page import="dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디 중복 체크를 위한 팝업창</title>
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8");
	String id = request.getParameter("id");
	System.out.println("id= "+id);
	
	MemberDao mdao = new MemberDao();
	int cnt = mdao.memberCheckById(id);
	if(cnt == 1){
		out.print("동일한 아이디가 있습니다.");
	}else if(cnt != 1){
		out.print("동일한 아이디가 없습니다.");
	}
	%>
	
	
	<%--
	<sql:query dataSource="${dataSource }" var="resultSet">
		select count(*) as cnt from member where id =?
		<sql:param value="<%=id %>" />
	</sql:query>
	<c:forEach var="row" items="${resultSet.rows }">
		<c:choose>
			<c:when test="${row.cnt==1 }">
				동일한 아이디가 있습니다.
			</c:when>
			<c:when test="${row.cnt=!1 }">
				동일한 아이디가 없습니다.
			</c:when>
		</c:choose>
	
	</c:forEach>
	 --%>
</body>
</html>