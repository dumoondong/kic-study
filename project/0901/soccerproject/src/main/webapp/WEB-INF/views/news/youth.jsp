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
		<input type="button" style="font-size:25px; padding:20px 30px;" value="꿈나무들" class="btn_write btn_txt01" style="cursor: pointer;" onclick="location.href='./oversea.do'" />
	</div>
      <div class="album py-5 bg-light">
        <div class="container">

          <div class="row">
            <div class="col-md-4">
              <div class="card mb-4 box-shadow" style="height: 95%; width: 100%; border:1px solid black;">
              	<a href=https://www.yna.co.kr/view/AKR20210809033200063?input=1195m>
                <img class="card-img-top" width="410" height="250" src="https://img4.yna.co.kr/etc/inner/KR/2021/08/09/AKR20210809033200063_02_i_P4.jpg" alt="Card image cap">
                </a>
                <div class="card-body">
                  <a href='https://www.yna.co.kr/view/AKR20210809033200063?input=1195m' class="subtext" class="btn btn-sm btn-outline-secondary">
                  '만세보령머드 JS컵 U12&11 유소년축구대회' 13일 보령서 개막</a>
                  <div class="d-flex justify-content-between align-items-center">
                    <div class="btn-group">
                      <button type="button" onclick="location.href='https://www.yna.co.kr/view/AKR20210809033200063?input=1195m'"class="btn btn-sm btn-outline-secondary">View</button>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-4">
              <div class="card mb-4 box-shadow" style="height: 95%; width: 100%; border:1px solid black;">
              	<a href=http://www.kado.net/news/articleView.html?idxno=1087306>
                <img class="card-img-top" width="410" height="250" src="https://cdn.kado.net/news/photo/202108/1087306_515500_5010.jpg" alt="Card image cap">
                </a>
                <div class="card-body">
                  <a href='http://www.kado.net/news/articleView.html?idxno=1087306' class="subtext" class="btn btn-sm btn-outline-secondary">
                  ‘한국 축구꿈나무 산실’ 명성 유소년대회도 통했다</a>
                  <div class="d-flex justify-content-between align-items-center">
                    <div class="btn-group">
                      <button type="button" onclick="location.href='http://www.kado.net/news/articleView.html?idxno=1087306'"class="btn btn-sm btn-outline-secondary">View</button>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-4">
              <div class="card mb-4 box-shadow" style="height: 95%; width: 100%; border:1px solid black;">
              	<a href=https://newsis.com/view/?id=NISX20210816_0001549301&cID=10807&pID=10800>
                <img class="card-img-top" width="410" height="250" src="https://image.newsis.com/2021/08/16/NISI20210816_0000808813_web.jpg?rnd=20210816080345" alt="Card image cap">
                </a>
                <div class="card-body">
                  <a href='https://newsis.com/view/?id=NISX20210816_0001549301&cID=10807&pID=10800' class="subtext" class="btn btn-sm btn-outline-secondary">
                  [보령소식]‘만세보령머드 유소년축구대회' 개막…김동일 시장 시축 등</a>
                  <div class="d-flex justify-content-between align-items-center">
                    <div class="btn-group">
                      <button type="button" onclick="location.href='https://newsis.com/view/?id=NISX20210816_0001549301&cID=10807&pID=10800'"class="btn btn-sm btn-outline-secondary">View</button>
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