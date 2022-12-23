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
	include 액션 태그에 현재 날짜와 시각을 출력하는 페이지 포함하기.
	외부 파일 include_date.jsp의 내용을 포함하여 풀력하도록 include액션 태그의 page 속성을 작성.
	 --%>
	 <h2>include 액션 태그</h2>
	 <jsp:include page="include_date.jsp" flush="true"/>
	 <p>--------------------------------</p>
</body>
</html>