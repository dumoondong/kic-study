<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.example.bootweb01.MemberTO" %>    

<!DOCTYPE html>
<!-- Created By CodingLab - www.codinglabweb.com -->
<html>
  <head>
    <meta charset="utf-8">
   <!----<title>Login Form Design | CodeLab</title>---->
    <link rel="stylesheet" type="text/css" href="./css/menustyle2.css">
    <link rel="stylesheet" type="text/css" href="./css/login.css">
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
	</br>
	<!-- 왼쪽메뉴 -->
	<div class="sidebar close">
		<jsp:include page="../module/leftmenu.jsp" />
	</div>
    <section class="home-section" >
	    <div class="home-content">
	     <i class='bx bx-menu' ></i>
	     <img src="./images/로고.PNG" float="right" width="200" height="200" title="반갑습니다. 어서오세요!"/>
	    </div>
    </section>
  <br /><br /><br /><br /><br /><br /><br /><br />
	  <div class="wrapper">
	    <div class="title">로그인</div>
	      <form action="login_ok.do" method="post">
	        <div class="field">
	          <input name="id" type="text"  value="" >
	          <label>아이디</label>
	        </div>
	        <div class="field">
	          <input name="password" type="password" value="" >
	          <label>비밀번호</label>
	        </div>
	        <div class="content">
	          <div class="pass-link"><a href="#">비밀번호 찾기</a></div>
	        </div>
	        <div class="field">
	          <input type="submit" value="로그인">
	        </div>
	        <div class="signup-link">회원이 아니십니까? <a href="/registration.do">회원가입</a></div>
	      </form>
	   </div>
  <script>
  let arrow = document.querySelectorAll(".arrow");
  for (var i = 0; i < arrow.length; i++) {
    arrow[i].addEventListener("click", (e)=>{
   let arrowParent = e.target.parentElement.parentElement;//selecting main parent of arrow
   arrowParent.classList.toggle("showMenu");
    });
  }
  let sidebar = document.querySelector(".sidebar");
  let sidebarBtn = document.querySelector(".bx-menu");
  console.log(sidebarBtn);
  sidebarBtn.addEventListener("click", ()=>{
    sidebar.classList.toggle("close");
  });

  </script>
</body>
</html>

