<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.*"%>
<%@ page import="mvc.model.BoardDTO"%>
<%
BoardDTO notice = (BoardDTO) request.getAttribute("board");
int num = ((Integer) request.getAttribute("num")).intValue();
int nowpage = ((Integer) request.getAttribute("page")).intValue();
String sessionId = (String) session.getAttribute("sessionId");
System.out.println("sessionId?????" + sessionId);

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
				
				
			<%if(notice.getFilename() !=null && notice.getFilename().isEmpty()){%>
				<div>
					<label class="col-sm-2 control-label">이미지</label>
					<div class="col-sm-8" style="word-break:break-all;">
						<img src="/img/<%=notice.getFilename() %>" class="user-gallery-image"/>
					</div>
				</div>	
			<%} %>
			
			<div class="form-group row">
				<div class="col-sm-offset-2 col-sm-10">
					<%
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
		
		<!-- 리플 쓰기, 로그인 상태에서만 나옴. -->
			<hr>
			<c:if test="${sessionId != null }">
			<form name="frmRipple" class="form-horizontal" method="post">
				<input type="hidden" name="num" value="<%=notice.getNum() %>"/>
				<input type="hidden" name="pageNum" value="<%= nowpage%>"/>
				<div class="form-group row">
					<label class="col-sm-2 control-label">성명</label>
					<div class="col-sm-3">
						<input name="name" type="text" class="form-control" value="${sessionName }" placeholder="name">
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-2 control-label">내용</label>
					<div class="col-sm-8" style="word-break-all;">
						<textarea name="content" class="form-control" cols="50" rows="3"></textarea>
					</div>
				</div>
				<div class="form-group row">
					<label class="col-sm-2 control-label"></label>
					<div class="col-sm-3">
						<span class="btn btn-primary" onclick="goRippleSubmit();">등록</span>
					</div>
				</div>
			</form>
			<script>
				function goRippleSubmit(){
					let frm = document.frmRipple;
					frm.action = "GalleryRippleWriteAction.do";
					frm.submit();
				}
			</script>
			</c:if>	
			<!-- 리플 쓰기 -->
			<div class="form-group row">
				<div class="col-sm-offset-2 col-sm-10">
					
				</div>
			</div>	
			
			
			
			
			<!-- 리플 목록. -->
			<hr>
			
			
			
			<c:forEach var="ripple" items="${rippleList }">
				<p>${ripple.content } | ${ripple.name }
					<c:if test="${sessionId == ripple.memberId }">
						<span class="btn btn-danger" onclick ="goRippleDelete('${ripple.rippleId}')">>삭제</span>
					</c:if>
				</p>
			</c:forEach>
			
			
			<form name="frmRippleDelete" class="form-horizontal" method="post">
				<input type="hidden" name="num" value="<%=notice.getNum() %>">
				<input type="hidden" name="pageNum" value="<%= nowpage%>">
				<input type="hidden" name="rippleId">
			</form>
			<script>
				function goRippleDelete(ID){
					console.log("삭제할 아이디!",ID);
					if(confirm("삭제하시겠습니까?")){
						const frm =document.frmRippleDelete;
						frm.rippleId.value= ID;
						frm.action="GalleryRippleDeleteAction.do";
						frm.submit();
					}
				}
			</script>
			
			
			
			
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





