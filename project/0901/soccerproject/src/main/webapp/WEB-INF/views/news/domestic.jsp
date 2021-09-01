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
		<input type="button" style="font-size:25px; padding:20px 30px;" value="국내축구" class="btn_write btn_txt01" style="cursor: pointer;" onclick="location.href='./oversea.do'" />
	</div>
      <div class="album py-5 bg-light">
        <div class="container">
			<div class="row">
            <div class="col-md-4">
              <div class="card mb-4 box-shadow" style="height: 95%; width: 100%; border:1px solid black;">
              	<a align="middle"> <iframe width="410" height="250" src="https://tv.naver.com/embed/22055257?autoPlay=false" frameborder="0" allow="accelerometer; picture-in-picture" allowfullscreen></iframe></a>
                <div class="card-body">
                  <a text-align=="bottom" href='https://sports.news.naver.com/news?oid=001&aid=0012620453' class="subtext" class="btn btn-sm btn-outline-secondary">
                  [영상] '부상 우려' 손흥민, 밝은 표정으로 팀 훈련 소화</a>
                  <div class="d-flex justify-content-between align-items-center">
                    <div class="btn-group">
                      <button type="button" onclick="location.href='https://sports.news.naver.com/news?oid=001&aid=0012620453'"class="btn btn-sm btn-outline-secondary">View</button>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-4">
              <div class="card mb-4 box-shadow" style="height: 95%; width: 100%; border:1px solid black;">
              	<a align="middle"><iframe width="410" height="250" src="https://www.youtube.com/embed/yTjQ0ORtk5U" frameborder="0" allow="accelerometer; picture-in-picture" allowfullscreen></iframe></a>
                <div class="card-body">
                  <a href='https://youtu.be/yTjQ0ORtk5U' class="subtext" class="btn btn-sm btn-outline-secondary">
                  수줍은 봄 소녀의 반전 페널티킥! 김병지 당황잼ㅋㅋㅋ | 아주대 런치어택</a>
                  <div class="d-flex justify-content-between align-items-center">
                    <div class="btn-group">
                      <button type="button" onclick="location.href='https://youtu.be/yTjQ0ORtk5U'"class="btn btn-sm btn-outline-secondary">View</button>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="col-md-4">
              <div class="card mb-4 box-shadow" style="height: 95%; width: 100%; border:1px solid black;">
              	<a align="middle"><iframe width="410" height="250" src="https://www.youtube.com/embed/4dKT3UERbZY" frameborder="0" allow="accelerometer; picture-in-picture" allowfullscreen></iframe></a>
                <div class="card-body" vertical-align="bottom">
                  <a href='https://youtu.be/4dKT3UERbZY' class="subtext" class="btn btn-sm btn-outline-secondary">
                  김병지, 당신이 몰랐던 17가지 사실ㅣ골넣는 골키퍼ㅣ100M 11초ㅣ주특기 드리블</a>
                  <div class="d-flex justify-content-between align-items-center">
                    <div class="btn-group">
                      <button type="button" onclick="location.href='https://youtu.be/4dKT3UERbZY'"class="btn btn-sm btn-outline-secondary">View</button>
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