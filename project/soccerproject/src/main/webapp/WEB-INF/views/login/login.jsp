<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- Created By CodingLab - www.codinglabweb.com -->
<html>
  <head>
    <meta charset="utf-8">
   <!----<title>Login Form Design | CodeLab</title>---->
    <link rel="stylesheet" type="text/css" href="./css/menustyle.css">
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
  <div class="sidebar">
    <div class="logo-details">
      <i class='bx bxl-c-plus-plus icon'></i>
        <div class="logo_name">SoccerWith</div>
        <i class='bx bx-menu' id="btn" ></i>
    </div>
    <ul class="nav-list">
      <li>
       <a href="/main.do">
         <i class='bx bx-home' ></i>
         <span class="links_name">홈</span>
       </a>
       <span class="tooltip">홈</span>
     </li>
     <li>
       <a href="/league.do">
         <i class='bx bx-photo-album'></i>
         <span class="links_name">리그/컵</span>
       </a>
       <span class="tooltip">리그/컵</span>
     </li>
     <li>
       <a href="#">
         <i class='bx bx-info-square' type='solid'></i>
         <span class="links_name">뉴스/소식</span>
       </a>
       <span class="tooltip">뉴스/소식</span>
     </li>
     <li>
        <a href="/list.do">
          <i class='bx bx-grid-alt'></i>
          <span class="links_name">게시판</span>
        </a>
         <span class="tooltip">게시판</span>
     </li>
     <li>
       <a href="#">
         <i class='bx bx-id-card' ></i>
         <span class="links_name">마이페이지</span>
       </a>
       <span class="tooltip">마이페이지</span>
     </li>
    </ul>
  </div>
    <div class="wrapper">
      <div class="title">로그인</div>
      <form action="#">
        <div class="field">
          <input type="text" required>
          <label>아이디</label>
        </div>
        <div class="field">
          <input type="password" required>
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
  let sidebar = document.querySelector(".sidebar");
  let closeBtn = document.querySelector("#btn");
  let searchBtn = document.querySelector(".bx-search");

  closeBtn.addEventListener("click", ()=>{
    sidebar.classList.toggle("open");
    menuBtnChange();//calling the function(optional)
  });

  searchBtn.addEventListener("click", ()=>{ // Sidebar open when you click on the search iocn
    sidebar.classList.toggle("open");
    menuBtnChange(); //calling the function(optional)
  });

  // following are the code to change sidebar button(optional)
  function menuBtnChange() {
   if(sidebar.classList.contains("open")){
     closeBtn.classList.replace("bx-menu", "bx-menu-alt-right");//replacing the iocns class
   }else {
     closeBtn.classList.replace("bx-menu-alt-right","bx-menu");//replacing the iocns class
   }
  }
  </script>
  </body>
</html>

