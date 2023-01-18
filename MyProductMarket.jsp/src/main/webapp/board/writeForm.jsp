<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기 폼</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<script>
	function checkForm() {
		if (!document.newWrite.name.value) {
			alert("성명을 입력하세요");
			return false;
		}
		if (!document.newWrite.subject.value) {
			alert("제목을 입력하세요");
			return false;
		}
		if (!document.newWrite.content.value) {
			alert("내용을 입력하세요");
			return false;
		}
	}
</script>
<body>
	<jsp:include page="../layouts/menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">게시판</h1>
		</div>
	</div>

	<div class="container">
		<form name="newWrite" action="./BoardWriteAction.do"
			class="form-horizontal" method="post" onsubmit="return checkForm()">
			<input type="hidden" name="id" class="form-control"
				value="${sessonId }" />
			<div class="form-group row">
				<label class="col-sm-2 control-label">${sessionName }</label>
				<div class="col-sm-3">
					<input name="name" type="text" class="form-control"
						value="${sessionName }" placeholder="name" />
				</div>
			</div>
			<div class="form-group row">
				<label class="col-sm-2 control-label">제목</label>
				<div class="col-sm-5">
					<input name="subject" type="text" class="form-control"
						placeholder="제목을 입력해주세요" />
				</div>
			</div>

			<div class="form-group row">
				<label class="col-sm-2 control-label">내용</label>
				<div class="col-sm-8">
					<textarea name="content" cols="50" rows="5" class="form-control"
					placeholder="내용을 입력해주세요"></textarea>
				</div>
			</div>

			<div class="form-group row">
				<div class="col-sm-offset-2 col-sm-10">
					<input type="submit" class="btn btn-primary" value="등록" /> <input
						type="reset" class="btn btn-warning" value="취소" />
				</div>
			</div>

		</form>
	</div>
	<jsp:include page="../layouts/footer.jsp" />
</body>
</html>