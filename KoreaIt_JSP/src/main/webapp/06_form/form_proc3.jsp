<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</head>
<body>
	<h2 class="bg-secondary text-light" style="margin: 0;">입력하신 정보</h2>
	<table class="table table-dark table-striped-columns">
		<%
		request.setCharacterEncoding("utf-8");

		Enumeration paramNames = request.getParameterNames();
		while (paramNames.hasMoreElements()) {
			StringBuffer info = new StringBuffer((String)paramNames.nextElement());
			out.print("<tr><th>" + info + " </th>\n");
			String[] paramValues = request.getParameterValues(info.toString());
			out.print("<td>");
			for (int i = 0; i < paramValues.length; i++) {
				out.println(paramValues[i]);
				if (i != paramValues.length - 1) {
			out.println(", ");
				}
			}
			out.print("</td></tr>");
		}
		%>
	</table>
</body>
</html>