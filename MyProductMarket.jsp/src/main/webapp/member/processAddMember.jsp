<%@page import="dto.Member"%>
<%@page import="dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 처리</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");

	String id = request.getParameter("id");
	String password = request.getParameter("password");
	String name = request.getParameter("name");
	String gender = request.getParameter("gender");
	String year = request.getParameter("birthyy");
	String month = request.getParameterValues("birthmm")[0];
	String day = request.getParameter("birthdd");
	String birth = year + "/" + month + "/" + day;
	String mail1 = request.getParameter("mail1");
	String mail2 = request.getParameter("mail2");
	String mail = mail1 + "@" + mail2;
	String phone = request.getParameter("phone");
	String address = request.getParameter("address");
	System.out.println(id+password+name+gender+mail+phone+address);
	/*		
	Date currentDatetime = new Date(System.currentTimeMillis());
	java.sql.Date sqlDate = new java.sql.Date(currentDatetime.getTime());
	java.sql.Timestamp timestamp = new java.sql.Timestamp(currentDatetime.getTime());
	*/
	
%>


<%--
<sql:setDataSource var ="dataSource"
	url="jdbc:mariadb://localhost:3310/my_product_market"
	driver="org.mariadb.jdbc.Driver" user="root" password="7517"/>
<sql:update dataSource="${dataSource }" var="resultSet">
	insert into member values(?,?,?,?,?,?,?,?,now())
	<sql:param value="<%=id %>"/>
	<sql:param value="<%=password %>"/>
	<sql:param value="<%=name %>"/>
	<sql:param value="<%=gender %>"/>
	<sql:param value="<%=birth %>"/>
	<sql:param value="<%=mail %>"/>
	<sql:param value="<%=phone %>"/>
	<sql:param value="<%=address %>"/>
</sql:update>


<c:if test="${resultSet >=1 }">
	<c:redirect url="resultMember.jsp?msg=1"/>
</c:if>
 --%>
 <%
 	//MVC model 1 버전
 	Member dto = new Member(id,password,name,gender,birth,mail,phone,address,null);
	MemberDao mdao = new MemberDao();
	int insertRowCount = mdao.insertMember(dto);
	if(insertRowCount >= 1){
		response.sendRedirect("resultMember.jsp?msg=1");	
	}
 %>

</body>
</html>