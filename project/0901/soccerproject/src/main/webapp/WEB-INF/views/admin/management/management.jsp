<%@page import="com.example.bootweb01.MemberTO"%>
<%@page import="com.example.bootweb01.SmallcodeTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.ArrayList" %>
<%
	String loginUser = (String)session.getAttribute("loginUser");
	String loginGrade = (String)session.getAttribute("loginGrade");
	ArrayList<MemberTO> grdatas = (ArrayList)session.getAttribute( "grdatas" ); // 소코드 리스트
	
	ArrayList<MemberTO> datas = (ArrayList)request.getAttribute( "datas" ); // 회원리스트
	ArrayList<SmallcodeTO> datas1 = (ArrayList)request.getAttribute( "datas1" ); // 소코드 리스트
	
	StringBuilder sbHtml = new StringBuilder(); // 회원 리스트 
	StringBuilder sbHtml1 = new StringBuilder(); // 회원 등급 리스트
	
	
	//소코드 검색창
	for(SmallcodeTO to : datas1) {
		String seq = to.getSeq();
		String smallcode = to.getSmallcode();
		String smallinfo = to.getSmallinfo();
		sbHtml1.append("<option name='"+smallinfo+"' value='"+smallinfo+"'>"+smallinfo+"</option>");
	}
	if(grdatas == null){
		//회원 테이블 리스트
		for( MemberTO to : datas ) {
			String seq = to.getSeq();
			String id = to.getId();
			String grade = to.getGrade();
			String name = to.getName();
			String phone = to.getPhone();
			String email = to.getEmail();
			
			sbHtml.append( "<tr class='table-secondary'>" );
			sbHtml.append( "	<td class='left'>" );
			sbHtml.append( "		<a href='./memberedit.do?seq=" + seq + "'>" + id + "</a>" );
			sbHtml.append( "	<td>" + grade + "</td>" );
			sbHtml.append( "	<td>" + name + "</td>" );
			sbHtml.append( "	<td>" + phone + "</td>" );
			sbHtml.append( "	<td>" + email + "</td>" );
			sbHtml.append( "</tr>" );
		}
	}else{
		//회원 테이블 리스트
		for( MemberTO to : grdatas ) {
			String seq = to.getSeq();
			String id = to.getId();
			String grade = to.getGrade();
			String name = to.getName();
			String phone = to.getPhone();
			String email = to.getEmail();
			
			sbHtml.append( "<tr class='table-secondary'>" );
			sbHtml.append( "	<td class='left'>" );
			sbHtml.append( "		<a href='./memberedit.do?seq=" + seq + "'>" + id + "</a>" );
			sbHtml.append( "	<td>" + grade + "</td>" );
			sbHtml.append( "	<td>" + name + "</td>" );
			sbHtml.append( "	<td>" + phone + "</td>" );
			sbHtml.append( "	<td>" + email + "</td>" );
			sbHtml.append( "</tr>" );
		}
	}
%>
<!DOCTYPE html>
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
    <div align="middle">
		<!-- 회원등급리스트검색 -->
		<div style="width:60px; margin:0px 0px 70px 0px;"></div>
		<form action="search_gr.do" method="get" name="mfrm">
		    <select class="form-select" onchange="myFunction(this.value)" id="search" style="width:10%; height: 47px;"aria-label="Default select example">
			  <option selected="selected">전체보기</option> 
			  	<%=sbHtml1 %>
			</select>
			<input type="hidden" name="smallinfo" id="smallinfo"/>
			<input style="width:60px; margin:-70px 0px 0px 320px;" type="submit" value="검색" class="btn btn-secondary"/>
		</form>
		<div style="width:60px; margin:0px 0px 96px 0px;"></div>
		<table style="width:40%; text-align: center;" class="table table-hover">
			<thead>
				<tr>
			      <th width="20%" scope="col">id</th>
			      <th width="15%" scope="col">등급</th>
			      <th width="15%" scope="col">이름</th>
			      <th width="25%" scope="col">핸드폰번호</th>
			      <th width="25%" scope="col">email</th>
			    </tr>
		    </thead>
		 	<tbody>
					<%=sbHtml %>
		    </tbody>
		</table>
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