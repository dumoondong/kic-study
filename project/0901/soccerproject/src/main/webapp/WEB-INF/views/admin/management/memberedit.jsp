<%@page import="com.example.bootweb01.MemberTO"%>
<%@page import="com.example.bootweb01.SmallcodeTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.ArrayList" %>
<%
	String loginUser = (String)session.getAttribute("loginUser");
	String loginGrade = (String)session.getAttribute("loginGrade");
	ArrayList<SmallcodeTO> datas1 = (ArrayList)request.getAttribute( "datas1" ); // 대코드 리스트
	
	StringBuilder sbHtml1 = new StringBuilder(); // 대코드 검색
	
	//대코드 검색창
	for(SmallcodeTO to : datas1) {
		String seq = to.getSeq();
		String smallcode = to.getSmallcode();
		String smallinfo = to.getSmallinfo();
		sbHtml1.append("<option name='"+smallinfo+"' value='"+smallinfo+"'>"+smallinfo+"</option>");
	}	
	MemberTO to = (MemberTO)request.getAttribute( "to" );
	String seq = to.getSeq();
	String id = to.getId();
	String grade = to.getGrade();
	String phone = to.getPhone();
	String email = to.getEmail();
	String name = to.getName();
%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="./css/admin.css">
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
	<jsp:include page="../admin_module/admin_topmenu.jsp" />
	<!-- 왼쪽메뉴 -->
	<div class="sidebar close">
		<jsp:include page="../admin_module/admin_leftmenu.jsp" />
	</div>
	<br /><br /><br />
    <section class="home-section" >
	    <div class="home-content">
		    <i class='bx bx-menu' ></i>
	    </div>
    </section>
    <div class="wrapper" >
		<form action="memberedit_ok.do" >
			<div class="group">
				<h2 class="mt-4">회원정보 수정</h2>
				<select class="form-select" onchange="myFunction(this.value)" id="search" aria-label="Default select example">
					<option selected="selected" >회원등급 선택</option>
					<%=sbHtml1 %>
				</select>
				<input type="hidden" name="smallinfo" id="smallinfo"/>
				<div class="row mb-3" >
					<div class="col-md-5 themed-grid-col">회원ID</div>
					<input style="background-color:white" name="id" value="<%=id %>" class="col-md-7 themed-grid-col" type="text" >
				</div>	
				<div class="row mb-3" >
					<div class="col-md-5 themed-grid-col">이름</div>
					<input style="background-color:white" name="name" value="<%=name %>" class="col-md-7 themed-grid-col" type="text" >
				</div>
				
				<div class="row mb-3">
					<div class="col-md-5 themed-grid-col">핸드폰번호</div>
					<input style="background-color:white" name="phone" value="<%=phone %>" class="col-md-7 themed-grid-col" type="text" >
				</div>
				
				<div class="row mb-3">
					<div class="col-md-5 themed-grid-col">이메일</div>
					<input style="background-color:white" name="email" value="<%=email %>" class="col-md-7 themed-grid-col" type="text" >
				</div>
				
				<div class="form-input">
					<input type="hidden" name="seq" value="<%=seq %>"/>
					<input type="submit" value="수정" class="btn btn-secondary"/>
				</div>
		    </div>
		</form>
		<div class="btn-group">
			<button class="btn btn-secondary">삭제</button>
			<button class="btn btn-secondary" onclick="location.href='./management.do?id=<%=loginUser %>'">취소</button>
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
  
  
	function myFunction(input) {
		document.getElementById("smallinfo").value = input;
	}
  </script>
</body>
</html>