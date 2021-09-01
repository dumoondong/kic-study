<%@page import="com.example.bootweb01.MemberTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String loginUser = (String)session.getAttribute("loginUser");
	String loginGrade = (String)session.getAttribute("loginGrade");
%>
<html>
  <head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="./css/menustyle2.css">
    <!-- Boxicons CDN Link -->
    <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'>
    <!-- bootstrap css -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	<!-- jQuery -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<!-- popper.js -->
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
	<!-- bootstrap js -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
	    
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
   </head>
<body>
<div class="logo-details">
	<i class='bx bx-football'></i>
	<span class="logo_name">SoccerWith</span>
</div>
<ul class="nav-links">
      <li>
        <a href="#">
          <i class='bx bx-home' ></i>
          <span class="link_name">홈</span>
        </a>
        <ul class="sub-menu blank">
          <li><a class="link_name" href="#">홈</a></li>
        </ul>
      </li>
      <li>
        <div class="iocn-link">
          <a href="#">
            <i class='bx bx-collection' ></i>
            <span class="link_name">리그/컵</span>
          </a>
          <i class='bx bxs-chevron-down arrow' ></i>
        </div>
        <ul class="sub-menu">
          <li><a class="link_name" href="#">리그/컵</a></li>
          <li><a href="#">EPL</a></li>
          <li><a href="leaguelaliga.do">라리가</a></li>
          <li><a href="leagueserieA.do">세리에A</a></li>
          <li><a href="leaguebundesliga.do">분데스리가</a></li>
          <li><a href="#">K리그</a></li>
        </ul>
      </li>
      <li>
        <div class="iocn-link">
          <a href="#">
            <i class='bx bx-book-alt' ></i>
            <span class="link_name">뉴스/소식</span>
          </a>
          <i class='bx bxs-chevron-down arrow' ></i>
        </div>
        <ul class="sub-menu">
          <li><a class="link_name" href="#">뉴스/소식</a></li>
          <li><a href="domestic.do">국내축구</a></li>
          <li><a href="oversea.do">해외축구</a></li>
          <li><a href="retire.do">은퇴선수</a></li>
          <li><a href="youth.do">꿈나무들</a></li>
        </ul>
      </li>
      <li>
        <div class="iocn-link">
          <a href="#">
            <i class='bx bx-grid-alt'></i>
            <span class="link_name">게시판</span>
          </a>
          <i class='bx bxs-chevron-down arrow' ></i>
        </div>
        <ul class="sub-menu">
          <li><a class="link_name" href="#">게시판</a></li>
          <li><a href="#">전체</a></li>
          <li><a href="#">축구</a></li>
          <li><a href="#">축구동영상</a></li>
          <li><a href="#">질문</a></li>
          <li><a href="#">인기</a></li>
          <li><a href="#">공지사항</a></li>
        </ul>
      </li>
      <%
      	if(loginUser == null){
	  	}else{
	   %>      
      <li>
        <div class="iocn-link">
          <a href="">
            <i class='bx bx-id-card' ></i>
            <span class="link_name">마이페이지</span>
          </a>
          <i class='bx bxs-chevron-down arrow' ></i>
        </div>
	  	        <ul class="sub-menu">
	  	          <li><a class="link_name" href="#">내정보관리</a></li>
	  	           <li><a href="">내정보관리</a></li>
	  	          <li><a href="">비밀번호변경</a></li>
	  	        </ul>     
	   </li>
	   <%
		 }
	   %>
	   <%
      	if(loginUser == null){
	  	}else{
	   %> 
	   <li>
       <div class="iocn-link">
          <a href="management.do">
            <i class='bx bx-cog' ></i>
            <span class="link_name">관리자메뉴</span>
          </a>
          <i class='bx bxs-chevron-down arrow' ></i>
        </div>
        <ul class="sub-menu">
          <li><a class="link_name" href="#">관리자메뉴</a></li>
          <li><a href="management.do">회원관리</a></li>
          <li><a href="commoncode.do">공통코드</a></li>
        </ul>
      </li>
      <%
		 }
	  %>
</ul>
</body>
</html>