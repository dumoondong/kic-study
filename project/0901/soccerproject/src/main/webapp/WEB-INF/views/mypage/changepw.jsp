<%@page import="com.example.bootweb01.MemberTO"%>
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
<body >
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
    <br /><br /><br /><br />
	<main>
	<div class="container" align="middle">
		<h2 class="mt-4">비밀번호변경</h2>
		<form action="changepw_ok.do" method="post" name="wfrm" class="was-validated">
			<input type="hidden" name="id" value="<%=loginUser %>" />
		    <div style="width:300px;" class="form-group">
		      <input type="password" class="form-control" name="password1" placeholder="변경할 비밀번호" id="password1" required>
		      <div class="valid-feedback"></div>
		      <div class="invalid-feedback">입력하셔야 합니다.</div>
		    </div>
		    <br />
		    <div style="width:300px;" class="form-group">
		      <input type="password" class="form-control" name="password2" placeholder="변경할 비밀번호 확인" id="password2" required>
		      <div class="valid-feedback"></div>
		      <div class="invalid-feedback">입력하셔야 합니다.</div>
		    </div>
		    <br />
		    <button type="submit" id="submit1" class="btn btn-primary">변경</button>
	  	</form>
			
	</div>
	</main>
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
			if( document.wfrm.password1.value.trim() != document.wfrm.password2.value.trim() ) {
				alert( '비밀번호가 일치하지 않습니다.' );
				return false;
			}
			if(document.wfrm.password1.value.trim().length < 6){
				alert( '비밀번호 6자이상 입력합니다.' );
				return false;
			}
			document.wfrm.submit();
		};
	};
  
	</script>
</body>
</html>