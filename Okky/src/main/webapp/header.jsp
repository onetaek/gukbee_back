<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./css/reset.css" />
<link rel="stylesheet" href="./css/header.css"/>
</head>
<body>
	<div id="headerWrap">
      <header id="header">
        <div class="left-nav">
          <h1><a href="#">로고</a></h1>
          <nav>
            <h2 class="hidden">주요이용메뉴</h2>
            <ul class="gnb">
              <li><a href="#">Q&A</a></li>
              <li class="left-line"><a href="#">커뮤니티</a></li>
              <li class="left-line"><a href="#">공지사항</a></li>
            </ul>
          </nav>
        </div>
        <nav class="right-nav">
          <h2 class="hidden">계정관련이용메뉴</h2>
          <ul class="gnb">
            <li class="search">
              <form>
                <label>
                  <button type="submit">
                    <i class="fa fa-light fa-magnifying-glass"></i>
                  </button>
                  <input type="search" placeholder="검색"/>
                </label>
              </form>
            </li>
            <li class="login admin"><a href="#">로그인</a></li>
            <li class="join admin"><a href="join.jsp">회원가입</a></li>
          </ul>
        </nav>
      </header>
    </div>
</body>
</html>