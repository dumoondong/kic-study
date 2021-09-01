<%@page import="com.example.bootweb01.MemberTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
String loginUser = (String)session.getAttribute("loginUser");


	MemberTO to = (MemberTO)request.getAttribute( "to" );
	String id = to.getId();
	String grade = to.getGrade();
	String phone = to.getPhone();
	String email = to.getEmail();
	String name = to.getName();
	String writeboa = to.getWriteboa();
	String writecom = to.getWritecom();
%>
<html>
  <head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="./css/mypage.css">
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
	<div class="container" style="margin-left: 850px;">
		<h2 style="margin-left: 200px;"class="mt-4">내정보관리</h2>
			<div class="row mb-3" >
				<div class="col-md-2 themed-grid-col">ID</div>
				<div style="background-color:white" class="col-md-3 themed-grid-col"><%=loginUser %></div>
			</div>
			<div class="row mb-3">
				<div class="col-md-2 themed-grid-col">회원등급</div>
				<div style="background-color:white" class="col-md-3 themed-grid-col"><%=grade %></div>
			</div>
			<!-- 핸드폰변경 -->
			<form action="mypage_phone.do" method="post" name="mfrm">
				<div class="row mb-3">
					<div class="col-md-2 themed-grid-col">핸드폰번호</div>
					<input type="hidden" name="id" value="<%=id %>" />
					<input style="background-color:white" name = "phone" placeholder=<%=phone %> class="col-md-2 themed-grid-col" type="text" >
					<button type="submit" id="submit1" class="col-md-1 themed-grid-col">변경</button>
				</div>
			</form>
			<!-- 이메일변경 -->
			<form action="mypage_email.do" method="post" name="mfrm">
				<div class="row mb-3">
					<div class="col-md-2 themed-grid-col">이메일</div>
					<input type="hidden" name="id" value="<%=id %>" />
					<input style="background-color:white" name = "email" placeholder=<%=email %> class="col-md-2 themed-grid-col" type="text" >
					<button type="submit" id="submit2" class="col-md-1 themed-grid-col">변경</button>
				</div>
			</form>
			<!-- 이름변경 -->
			<form action="mypage_name.do" method="post" name="mfrm">
				<div class="row mb-3">
					<div class="col-md-2 themed-grid-col">이름</div>
					<input type="hidden" name="id" value="<%=id %>" />
					<input style="background-color:white" name = "name" placeholder=<%=name %> class="col-md-2 themed-grid-col" type="text" >
					<button type="submit" id="submit3" class="col-md-1 themed-grid-col">변경</button>
				</div>
			</form>
			<div class="row mb-3">
				<div class="col-md-2 themed-grid-col">작성게시글수</div>
				<div style="background-color:white" class="col-md-3 themed-grid-col"><%=writeboa %></div>
			</div>
			<div class="row mb-3">
				<div class="col-md-2 themed-grid-col">작성댓글수</div>
				<div style="background-color:white" class="col-md-3 themed-grid-col"><%=writecom %></div>
			</div>
			
			<br />
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
		document.getElementById( 'submit1' ).onclick = function() {
			if( document.mfrm.phone.value.trim() == '' ) {
				alert( '변경할 핸드폰번호를 입력해야 합니다.' );
				return false;
			}
			document.mfrm.submit();
		};
		document.getElementById( 'submit2' ).onclick = function() {
			if( document.mfrm.email.value.trim() == '' ) {
				alert( '변경할 이메일을 입력해야 합니다.' );
				return false;
			}
			document.mfrm.submit();
		};
		document.getElementById( 'submit3' ).onclick = function() {
			if( document.mfrm.name.value.trim() == '' ) {
				alert( '변경할 이름을 입력해야 합니다.' );
				return false;
			}
			document.mfrm.submit();
		};
	};
	</script>
</body>
</html>