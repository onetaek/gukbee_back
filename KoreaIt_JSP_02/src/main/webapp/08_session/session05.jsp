<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session</title>
</head>
<body>
	<%--
	세션에 저장된 모든 세션 속성 삭제하기.
	1) 요청에 포함된 클라이언트의 세션이 유효하면 유효한 메시지를 출력하고,
	그렇지 않으면 유효하지 않은 메시지를 출력하도록 작성.
	2) 세션에 저장된 모든 세션 속성을 삭제하도록 session 내장 객체의 invalidate() 메서드를 작성.
	--%>
	<%
		String user_id = (String) session.getAttribute("userID");
		String user_pw = (String) session.getAttribute("userPW");
		
		out.println("설정된 세션 이름 userID : " + user_id + "<br>");
		out.println("설정된 세션 값 userPW : " + user_pw + "<br>");
		
		if(request.isRequestedSessionIdValid() == true){
			out.println("세션이 유효합니다");
		}
		else{
			out.println("세션이 유효하지 않습니다");
		}
		
		session.invalidate();
	%>
		<h4>---------세션을 삭제하기 전---------</h4>
	<%
		if(request.isRequestedSessionIdValid() == true){
			out.println("세션이 유효합니다");
		}
		else{
			out.println("세션이 유효하지 않습니다");
		}
	%>
</body>
</html>