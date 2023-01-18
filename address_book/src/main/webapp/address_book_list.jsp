<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%--<%@ page errorPage="./address_book_error.jsp"%> --%>
<%@ page import="java.util.*"%>
<%@ page import="mvc.dto.AddressBookDTO"%>
<%@ page import="mvc.dao.AddressBookDAO"%>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>주소록:목록화면</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet">

<script type="text/javascript">
	function check(ID) {
		pwd = prompt('수정/삭제 하려면 비밀번호를 넣으세요');
		document.location.href = "address_book_control.do?action=edit&id="
				+ ID + "&passwd=" + pwd;
	}
</script>
</head>
<body>
<%
	String catogory = request.getParameter("catogory");
	String searchVal = request.getParameter("searchVal");
	if(catogory == null){
		catogory = "";
	}
	if(searchVal == null){
		searchVal = "";
	}
%>
	<div class="container pt-3 bg-dark-subtle">
		<h2 class="text-center">주소록:목록화면</h2>
		<hr>
		<div class="container row">
			<form action="address_book_control.jsp">
				<input type="hidden" name="action" value="search"/>
				<a class="btn btn-primary mb-3 col" href="./address_book_form.jsp">주소록 등록</a>
				<div style="float:right;">
				<select name="catogory">
					<option value="name" <%if(catogory.equals("name")){out.print(" selected");} %>>이름</option>
					<option value="tel" <%if(catogory.equals("tel")){out.print(" selected");} %>>전화번호</option>
					<option value="birth" <%if(catogory.equals("birth")){out.print(" selected");} %>>생일</option>
					<option value="comdept" <%if(catogory.equals("comdept")){out.print(" selected");} %>>회사</option>
					<option value="email" <%if(catogory.equals("email")){out.print(" selected");} %>>이메일</option>
					<option value="memo" <%if(catogory.equals("memo")){out.print(" selected");} %>>메모</option>
				</select>
				<input type="search" name="searchVal" value="<%=searchVal %>" class="col mb-3" size="20" />
				<button class="btn btn-info col mb-3" type="submit">검색</button>
				</div>
			</form>
		</div>
		
		<form>
			<table class="table table-dark table-striped">
				<tr>
					<th>번호</th>
					<th>이 름</th>
					<th>전화번호</th>
					<th>생 일</th>
					<th>회 사</th>
					<th>메 모</th>
				</tr>
				<%
				ArrayList<AddressBookDTO> datas = (ArrayList<AddressBookDTO>) request.getAttribute("datas");
				for (AddressBookDTO addressBookDTO : datas) {
				%>
				<tr class="tr-dataList">
					<td class="td-id"><a class="btn btn-info"
						href="javascript:check(<%=addressBookDTO.getId()%>)"><%=addressBookDTO.getId()%></a></td>
					<td class="td-name"><%=addressBookDTO.getName()%></td>
					<td class="td-tel"><%=addressBookDTO.getTel()%></td>
					<td class="td-birth"><%=addressBookDTO.getBirth()%></td>
					<td class="td-comdept"><%=addressBookDTO.getComdept()%></td>
					<td class="td-memo"><%=addressBookDTO.getMemo()%></td>
				</tr>
				<%
				}
				%>
			</table>
		</form>
	</div>
	<script>
		
	</script>
</body>
</html>