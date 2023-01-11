<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주소 작성</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container pt-3 bg-dark-subtle" style="width:600px;">
		<h2 class="text-center">주소록: 작성화면</h2>
		<hr>
		<a class="btn btn-primary mb-3" href="./address_book_control.jsp?action=list">주소록 목록으로</a><br>
		<form name="frmInsert" method="post" action="./address_book_control.jsp">
		<input type="hidden" name="action" value="insert"/>
		<table class="table table-dark table-striped">
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" maxlength="15"/></td>			
			</tr>
			<tr>
				<td>email</td>
				<td><input type="email" name="email" maxlength="50"/></td>			
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input type="text" name="tel" maxlength="20"/></td>			
			</tr>
			<tr>
				<td>생일</td>
				<td><input type="date" name="birth"/></td>			
			</tr>
			<tr>
				<td>회사</td>
				<td><input type="text" name="comdept" maxlength="20"/></td>			
			</tr>
			<tr>
				<td>메모</td>
				<td><input type="text" name="memo"/></td>			
			</tr>
			<tr>
				<td colspan="2">
					<input class="btn btn-success" type="submit" value="저장"/>
					<input class="btn btn-warning" type="reset" value="취소"/>
				</td>			
			</tr>
		</table>
		</form>
	
	</div>
</body>
</html>