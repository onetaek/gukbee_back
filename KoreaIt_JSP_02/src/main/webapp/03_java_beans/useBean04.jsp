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
	useBean 액션 태그에 생성한 자바빈즈 Person 으로 아이디와 이름을 설정하여 출력하기
	1) useBean액션 태그ㅔㅇ id속성 값을 통해 Person 클래스의 setId(), setName()메서드를 ㅅ호출하여
	새로운 값을 저장하도록 스크립틀릿 태그의 작성.
	2) 외부 파일 useBean03.jsp의 내용을 포함하도록 include 액션 태그의 page 속성을 작서
	 --%>
	 <jsp:useBean id="person" class="user.Person" scope="request"/>
	 <p> 아이디 : <%=person.getId() %></p>
	 <p> 이 름 : <%=person.getName() %></p>
	 <%
	 	person.setId(20182005);
	 	person.setName("홍길동");
	 %>
	 <jsp:include page="useBean03.jsp"/>
</body>
</html>