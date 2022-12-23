<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Scripting Tag</h2>
	<%--주석태그--%>
	<%!
		int count = 3;
	String makeItLower(String data){
		return data.toLowerCase();
	}
	%>
	<%
		//스크립트릿 태그로 자바 로직 코드 작성
		for(int i = 1 ; i <=count; i++){
			out.println("Java Server Page "+i+"<br>");
		}
	%>
	<%--표현문 태그로 선언문의 메소드를 호출하여 문자열 형태로 출력 --%>
	<%=makeItLower("Hello Wolrd")%>
</body>
</html>