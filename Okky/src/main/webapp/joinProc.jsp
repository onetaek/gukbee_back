<%@page import="dao.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 처리 페이지</title>
</head>
<body>
	<jsp:useBean id="userDTO" class="dto.UserDTO">
		<jsp:setProperty name="userDTO" property="*"/>
	</jsp:useBean>
	<%
		UserDAO udao = new UserDAO();
		udao.insertUser(userDTO);
	%>
		<script>
			alert("회원가입이 완료되었습니다.");
		</script>
	<%
		//DB에 값을 저장후 원하는 페이지로 이동
		response.sendRedirect("login.jsp");
	%>
</body>
</html>