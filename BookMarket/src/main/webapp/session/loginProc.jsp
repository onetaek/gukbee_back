<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	
	//사용자로 부터 데이터를 읽어드림 
	String id= request.getParameter("id");	
	String pw = request.getParameter("pw");
	
	System.out.println(id+pw);
	
	//아이디와 패스워드를 저장 
	session.setAttribute("id",id);
	System.out.println(session.getAttribute("id"));
	session.setAttribute("pw",pw);
	System.out.println(session.getAttribute("pw"));
		if(session.getAttribute("id") != null){
			%>
			<script>
				alert("로그인되었습니다. id:"+<%=session.getAttribute("id")%>);
			</script>
			<%
		}else{
			%>
			<script>
				alert("로그인이 되지않았습니다.. id:"+<%=session.getAttribute("id")%>);
			</script>
			<%
		}
	%>
</body>
</html>