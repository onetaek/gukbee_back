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
		boolean isLogin = false;
		Cookie[] cookies = request.getCookies();
		out.println("현재 설정된 쿠키의 개수 => "+cookies.length + "<br>");
		out.println("======================"+"<br>");
		for(int i = 0 ; i < cookies.length ; i++){
			out.println("설정된 쿠키의 속성 이름 [ "+ i+" ] : "+cookies[i].getName() + "<br>");
			out.println("설정된 쿠키의 속성 값 [ "+ i+" ] : "+cookies[i].getValue() + "<br>");
			out.println("----------------------------------------------------<br>");
			if(cookies[i].getName().equals("userID") && cookies[i].getValue() != null){
				isLogin = true;
			}
		}
		//out.print(isLogin);
		if(isLogin){
			out.print("로그인 중입니다.");
		}else{
			out.print("로그인 상태가 아닙니다.");
		}
	%>
</body>
</html>