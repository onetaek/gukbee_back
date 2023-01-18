<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.*"%>
<%@ page import="mvc.model.BoardDTO"%>
<%
BoardDTO notice = (BoardDTO) request.getAttribute("board");
int num = ((Integer) request.getAttribute("num")).intValue();
int nowpage = ((Integer) request.getAttribute("page")).intValue();
%>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>Board</title>
</head>
<body>
	<jsp:include page="../layouts/menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">게시판</h1>
		</div>
	</div>
	<div class="container">
		<form
			action="BoardUpdateView.do?num=<%=notice.getNum()%>&pageNum=<%=nowpage%>"
			class="form-horizontal" method="post">
			<div class="form-group row">
				<label class="col-sm-2 control-label">성명</label>
				<div class="col-sm-3">
					<input name="name" class="form-control" readonly
						value="<%=notice.getName()%>" />
				</div>
			</div>

			<div class="form-group row">
				<label class="col-sm-2 control-label">제목</label>
				<div class="col-sm-5">
					<input name="subject" type="text" class="form-control" readonly
						value="<%=notice.getSubject()%>" placeholder="제목을 입력해주세요" />
				</div>
			</div>

			<div class="form-group row">
				<label class="col-sm-2 control-label">내용</label>
				<div class="col-sm-8">
					<textarea name="content" cols="50" rows="5" class="form-control" readonly
						value="<%=notice.getContent()%>" placeholder="내용을 입력해주세요"></textarea>
				</div>
			</div>

			<div class="form-group row">
				<div class="col-sm-offset-2 col-sm-10">
					<%
					String sessionId = (String) session.getAttribute("sessionId");
					System.out.println("sessionId?????" + sessionId);
					%>
					<c:set var="userId" value="<%=notice.getId()%>" />
					<c:if test="${sessionId == userId }">
						<p>
							<input type="submit" class="btn btn-success" value="수정페이지로이동" /> 
							<a class="btn btn-danger text-light" onclick="deleteBoard()">삭제</a>
						</p>
					</c:if>
					<a class="btn btn-secondary" href="./BoardListAction.do?pageNum=<%=nowpage%>"> 목록</a>

				</div>
			</div>
		</form>
		<hr>
	</div>
	<script>
		const frm = document.frmCart;
		let deleteBoard = function() {
			if (confirm('진짜로 삭제하시겠습니까?')) {
				location.href = "./BoardDeleteAction.do?num=<%=notice.getNum()%>&pageNum=<%=nowpage%>";
			}
		}
	</script>
	<jsp:include page="../layouts/footer.jsp" />
</body>
</html>





