<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%	
	String loginUser = (String)session.getAttribute("loginUser");
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
	<!-- 상단메뉴 -->
	<jsp:include page="../module/topmenu.jsp" />
	<!-- 왼쪽메뉴 -->
	<div class="sidebar close">
		<jsp:include page="../module/leftmenu.jsp" />
	</div>
	<br /><br /><br />
  <section class="home-section" >
    <div class="home-content">
      <i class='bx bx-menu' ></i>
    </div>
    <div class="text"></div>
  </section>
    <div align="middle">
		<input type="button" style="font-size:25px; padding:20px 30px;" value="해외축구" class="btn_write btn_txt01" style="cursor: pointer;" onclick="location.href='./oversea.do'" />
	</div>
      <div class="album py-5 bg-light">
        <div class="container" >

          <div class="row">
            <div class="col-md-4" >
              <div class="card mb-4 box-shadow" style="height: 95%; width: 100%; border:1px solid black;">
              	<a href=newstemplate.do>
                <img class="card-img-top" style="height: 250px;" src="https://imgnews.pstatic.net/image/413/2021/08/24/0000124475_001_20210824141017034.jpg?type=w647" alt="Card image cap">
                </a>
                <div class="card-body">
                  <a href='newstemplate.do' class="subtext" class="btn btn-sm btn-outline-secondary">
                  PSG 폭주는 계속된다...2002년생 '프랑스 초신성' 영입 눈앞</a>
                  <div class="d-flex justify-content-between align-items-center">
                    <div class="btn-group">
                      <button type="button" onclick="location.href='newstemplate.do'"class="btn btn-sm btn-outline-secondary">View</button>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-4" >
              <div class="card mb-4 box-shadow" style="height: 95%; width: 100%; border:1px solid black;">
              	<a href=https://sports.news.naver.com/news?oid=413&aid=0000124533>
                <img class="card-img-top" style="height: 250px;" src="https://imgnews.pstatic.net/image/413/2021/08/25/0000124533_001_20210825152017491.jpg?type=w647" alt="Card image cap">
                </a>
                <div class="card-body">
                  <a href='https://sports.news.naver.com/news?oid=413&aid=0000124533' class="subtext" class="btn btn-sm btn-outline-secondary">
                  아스널 118년만 최악의 출발...아르테타, "고참들 책임감 가져라" 질타</a>
                  <div class="d-flex justify-content-between align-items-center">
                    <div class="btn-group">
                      <button type="button" onclick="location.href='https://sports.news.naver.com/news?oid=413&aid=0000124533'" class="btn btn-sm btn-outline-secondary">View</button>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-4" >
              <div class="card mb-4 box-shadow" style="height: 95%; width: 100%; border:1px solid black;">
              	<a href=https://sports.news.naver.com/news?oid=343&aid=0000107383>
                <img class="card-img-top" style="height: 250px;" src="https://imgnews.pstatic.net/image/343/2021/08/25/0000107383_001_20210825151513480.jpg?type=w647" alt="Card image cap">
                </a>
                <div class="card-body">
                  <a href='https://sports.news.naver.com/news?oid=343&aid=0000107383' class="subtext" class="btn btn-sm btn-outline-secondary">
                  레스터 시티, '맨유 거절한' PSV 19세 윙어에 뜨거운 관심</a>
                  <div class="d-flex justify-content-between align-items-center">
                    <div class="btn-group">
                      <button type="button" onclick="location.href='https://sports.news.naver.com/news?oid=343&aid=0000107383'"class="btn btn-sm btn-outline-secondary">View</button>
                    </div>
                  </div>
                </div>
              </div>
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