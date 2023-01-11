<%@page import="mvc.dto.AddressBookDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주소 수정</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript">
		function delcheck() {
			result = confirm("정말로 삭제하시겠습니까?");
			if(result === true){
				document.frmUpdate.action.value="delete";
				document.frmUpdate.submit();
			}
		}
	</script>
</head>
<body>
 	<%
 		AddressBookDTO dto = (AddressBookDTO)request.getAttribute("dto");
 		
 	%>
	<div class="container pt-3 bg-dark-subtle" style="width:600px;">
		<h2 class="text-center">주소록: 수정화면</h2>
		<hr>
		<a class="btn btn-primary mb-3" href="./address_book_control.jsp?action=list">주소록 목록으로</a><br>
		<form name="frmUpdate" method="post" action="./address_book_control.jsp">
		<input type="hidden" name="action" value="update"/>
		<input type="hidden" name="id" value="<%=dto.getId() %>"/>
		<table class="table table-dark table-striped">
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" maxlength="15"  value="<%=dto.getName() %>" /></td>			
			</tr>
			<tr>
				<td>email</td>
				<td><input type="email" name="email" maxlength="50" value="<%=dto.getEmail() %>" /></td>			
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input type="text" name="tel" maxlength="20" value="<%=dto.getTel() %>" /></td>			
			</tr>
			<tr>
				<td>생일</td>
				<td><input type="date" name="birth" value="<%=dto.getBirth() %>" /></td>			
			</tr>
			<tr>
				<td>회사</td>
				<td><input type="text" name="comdept" maxlength="20" value="<%=dto.getComdept() %>" /></td>			
			</tr>
			<tr>
				<td>메모</td>
				<td><input type="text" name="memo" value="<%=dto.getMemo() %>" /></td>			
			</tr>
			<tr>
				<td colspan="2">
					<input class="btn btn-success" type="submit" value="수정"/>
					<input class="btn btn-warning" type="reset" value="취소"/>
					<input class="btn btn-danger" type="button" value="삭제" 
					onClick="delcheck()" />
				</td>			
			</tr>
		</table>
		</form>
	
	</div>
</body>
</html>