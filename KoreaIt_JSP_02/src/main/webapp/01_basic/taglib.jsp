<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--taglib 디렉티브 태그에 태그 라이브러리로 JSTL을 설정하는 예--%>
	<%--
	JSTL 태그
	유용한 JSP태그의 모음인 JSTL은 자주 사용되는 핵심 기능을 제공
	반복문, 조건문과 같은 논리적 구조 작업, XML 문서 조작, 국제화 태그 조직, SQL조작 수행을 위한 태그를 지원.
	
	JSTL을 사용하려면 webapp/WEB-INF/lib 디렉터리의 위치에 jstl.jar 라이브러리 파일이 있어야함.
	Apache Standard Taglib 페이지에서 다운로드 가능.
	 --%>
	<c:forEach var="k" begin="1" end="10" step="1">
		<c:out value="${k }"/>
	</c:forEach>
</body>
</html>