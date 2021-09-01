<%@page import="com.example.bootweb01.MemberTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String loginUser = (String)session.getAttribute("loginUser");
%>
<html>
  <head>
    <meta charset="UTF-8">
   <!------<title> Website Layout | CodingLab</title>------>
    <link rel="stylesheet" type="text/css" href="./css/topmenu.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css"/>
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
	<%
	if(loginUser == null){
	%>
	<!-- 로그인 전 -->
	<nav>
	    <div class="menu">
	      <div class="logo">
	        <a href="main.do">SOCCERWITH</a>
	      </div>
	      <ul>
	        <li><a href="login.do">로그인</a></li>
	        <li><a href="registration.do">회원가입</a></li>
	        <li><a href="#">아이디찾기</a></li>
	      </ul>
	    </div>
  	</nav>    
	  <%
	}else{
	  %>
	<!-- 로그인 후 -->
	<nav>
		<div class="menu">
			<div class="logo">
				<a href="">SOCCERWITH</a>
			</div>
			<ul>
				<li><a style="padding: 100px; color: white;"><%=loginUser %>관리자님</a></li>
				<li><a href="logout.do">로그아웃</a></li>
				<li><a href="">이벤트</a></li>
				<li><a href="">고객센터</a></li>
			</ul>
		</div>
	</nav>   
	    
	  <%
	  }
	  %>
</body>
</html>