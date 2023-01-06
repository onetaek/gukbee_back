<%@page import="dto.Member"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
	<%@include file="./menu.jsp"%>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">회원 목록</h1>
		</div>
	</div>
	<div class="container">
		<div class="row" align="center">
			<table class="table table-dark table-striped table-hover text-center">
				<thead>
					<tr>
						<th>아이디</th>
						<th>비번</th>
						<th>이름</th>
						<th>성별</th>
						<th>생일</th>
						<th>이메일</th>
						<th>폰번</th>
						<th>주소</th>
						<th>가입일자</th>
					</tr>
				</thead>
				<tbody>
				<%@include file="../dbconn/dbconn.jsp" %>
				<%
				//1. 페이지당 게시물을 가져오기 위해 필요한 값: 페이지당 게시물 수, 페이지 번호
				int cntListPerPage = 2;//페이지당 게시물 수.
				int pageNum = 1;//페이지 번호가 전달이 안되면 1페이지
				if(request.getParameter("pageNum")!=null){
					pageNum = Integer.parseInt(request.getParameter("pageNum"));
				}
				//2. 페이지 번호당 게시물을 들고 오기 위해 필요한 값 : 시작 게시물 번호, 페이지당 게시물 수
				int startNum = (pageNum - 1)* cntListPerPage;//1페이지 :0 , 2페이지 :10, 3페이지 20
				String sql = "select * from member limit ?,?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1,startNum);
				pstmt.setInt(2,cntListPerPage);
				rs=pstmt.executeQuery();
				while(rs.next()){
				%>
				<tr>
						<td><%=rs.getString(1)%></td>
						<td><%=rs.getString(2)%></td>
						<td><%=rs.getString(3)%></td>
						<td><%=rs.getString(4)%></td>
						<td><%=rs.getString(5)%></td>
						<td><%=rs.getString(6)%></td>
						<td><%=rs.getString(7)%></td>
						<td><%=rs.getString(8)%></td>
						<td><%=rs.getString(9)%></td>
					</tr>				
				<%
				}
				%>
				</tbody>
			</table>
			
			<div class="col-sm-5 container" >
			<%
			//3.페이징 출력을 위해 필요한 값 : 전체 페이지 수
			String sql2 = "select count(*) from member";
			pstmt = conn.prepareStatement(sql2);
			rs = pstmt.executeQuery();
			rs.next();
			int totalRecord = rs.getInt(1);//전체 게시물 수
			//전체 페이지 수 1) 전체 게시물 수가 페이지당 게시물 수의 배수일 경우 전체 게시물 수 / 페이지당 게시물 수
			//2) 전체 게시물 수가 페이지당 게시물 수의 배수가 나일 경우(전체 게시물 수 / 페이지당 게시물 수) +1
			int totalPage = (totalRecord  % cntListPerPage == 0)?totalRecord / cntListPerPage : (totalRecord / cntListPerPage) + 1;
			
			//4. 페이징 처리
			int block = 2;
			int blockTotal = totalPage % block == 0 ? totalPage / block : totalPage / block + 1;//총 블럭의 수
			int blockThis = ((pageNum - 1)/block) + 1;//현재 페이지의 블럭
			int blockThisFirstPage = ((blockThis - 1) * block) + 1;//현재 블럭의 첫 페이지
			int blockThisLastPage = blockThis * block;//현재 블럭의 마지막 페이지
			blockThisLastPage = (blockThisLastPage > totalPage)?totalPage : blockThisLastPage;//마지막 블럭의 경우 전체 페이지 번호가 블럭의 마지막 페이지보다 적은경우
			
			/*
			out.println("totalPage :"+totalPage + "<br>");
			out.println("blockTotal :"+blockTotal + "<br>");
			out.println("blockThis :"+blockThis + "<br>");
			out.println("blockThisFirstPage :"+blockThisFirstPage + "<br>");
			out.println("blockThisLastPage :"+blockThisLastPage + "<br>");
			*/
			//4. 페이징 출력
			%>
			<a href="memberList.jsp?pageNum=1">[첫 페이지]</a>
			<% 
			if(blockThis > 1){%>
				<a href="memberList.jsp?pageNum=<%=(blockThisFirstPage -1) %>">[이전]</a>
			<%
			}
			%>
			<%
			for(int i = blockThisFirstPage ; i <= blockThisLastPage; i++){
			%>
			<a href="memberList.jsp?pageNum=<%=i%>"> [<%=i %>] </a>
			<%
			}
			 %>
			 <%
			 if(blockThis < blockTotal){
			 %>
			 <a href="memberList.jsp?pageNum=<%=(blockThisLastPage + 1) %>">[다음]</a>
			 <%
			 }
			 %>
			<a href = "memberList.jsp?pageNum=<%=totalPage %>">[마지막 페이지]</a>
			</div>
		</div>
		<hr>
	</div>
	<jsp:include page="../layouts/footer.jsp"/>
</body>
</html>