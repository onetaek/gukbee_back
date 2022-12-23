<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--
	자바빈즈 Person을 생성하고 useBean 액션 태그에 Person 클래스를 사용하려 아이디와 이름 출력하기
	1) 자바진즈로 Person 클래스를 사용하도록 useBean 액션 태그를 작성
	2) useBean 액션 태그에 id 속성 값을 통해 Person 클래스의 getId(), getName() 메서드를 각각 호출하여
	반환된 결과 값을 출력하도록 표현문 태그를 작성
	 --%>
	 <jsp:useBean id="person" class="user.Person" scope="request"/>
	 <p> 아이디 : <%=person.getId() %></p>
	 <p> 이 름 : <%=person.getName() %></p>
</body>
</html>