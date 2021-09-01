<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- Created By CodingLab - www.codinglabweb.com -->
<html>
<head>
    <meta charset="UTF-8">
    <!---<title> Responsive Registration Form | CodingLab </title>--->
    <link rel="stylesheet" type="text/css" href="./css/menustyle2.css">
    <link rel="stylesheet" type="text/css" href="./css/registration.css">
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
  </section>
  <br /><br /><br /><br /><br /><br /><br /><br />
  <div class="container">
    <div class="title">회원가입</div>
    <div class="content">
      <form action="./registration_ok.do" method="post" name="wfrm">
        <div class="user-details">
          <div class="input-box">
            <span class="details">아이디</span>
            <input type="text" name="id" placeholder="사용할 아이디를 입력하세요" required>
            <button type="button" onclick="#" method="post" class="btn btn-primary btn-sm">중복검사</button>
          </div>
          <div class="input-box">
            <span class="details">이름</span>
            <input type="text" name="name" placeholder="이름을 입력하세요" required>
          </div>
          <div class="input-box">
            <span class="details">이메일</span>
            <input type="text" name="email" placeholder="이메일을 입력하세요(@포함)" required>
          </div>
          <div class="input-box">
            <span class="details">핸드폰번호</span>
            <input type="text" name="phone" placeholder="핸드폰번호를 입력하세요(-포함)" required>
          </div>
          <div class="input-box">
            <span class="details">비밀번호</span>
            <input type="password" name="password1" placeholder="사용할 비밀번호를 입력하세요" required>
          </div>
          <div class="input-box">
            <span class="details">비밀번호 확인</span>
            <input type="password" name="password2" placeholder="비밀번호 확인" required>
          </div> 
        </div>
        <br/><br/><br/>
        <span class="details">이메일 및 핸드폰번호를 양식에 맞게 작성하지 않을시 아이디찾기 및 비밀번호찾기가 불가능합니다.</span>
        <div class="button">
          <input type="submit" id="submit1" value="회원가입">
        </div>
      </form>
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

	window.onload = function() {
		document.getElementById('submit1').onclick = function() {
			if(document.wfrm.id.value.trim().length < 6){
				alert( 'id 6자이상 입력합니다.' );
				return false;
			}
			if( document.wfrm.password1.value.trim() != document.wfrm.password2.value.trim() ) {
				alert( '비밀번호가 일치하지 않습니다.' );
				return false;
			}
			if(document.wfrm.password1.value.trim().length < 6){
				alert( '비밀번호 6자이상 입력합니다.' );
				return false;
			}
		};
	};
  
  
 </script>
</body>
</html>


