<%@page import="com.example.bootweb01.LargecodeTO"%>
<%@page import="com.example.bootweb01.SmallcodeTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.ArrayList" %>
<%
	String loginUser = (String)session.getAttribute("loginUser");
	String loginGrade = (String)session.getAttribute("loginGrade");
	ArrayList<SmallcodeTO> dedatas = (ArrayList)session.getAttribute( "dedatas" ); // 검색한대코드 리스트

	ArrayList<SmallcodeTO> datas = (ArrayList)request.getAttribute( "datas" ); // 소코드 리스트
	ArrayList<LargecodeTO> datas1 = (ArrayList)request.getAttribute( "datas1" ); // 대코드 리스트
	StringBuilder sbHtml = new StringBuilder(); // 소코드 리스트
	StringBuilder sbHtml1 = new StringBuilder(); // 대코드 검색
	//대코드 검색창
	for(LargecodeTO to : datas1) {
		String seq = to.getSeq();
		String largeinfo = to.getLargeinfo();
		String largecode = to.getLargecode();
		sbHtml1.append("<option name='"+largecode+"' value='"+largecode+"'>"+largeinfo+"</option>");
	}
	
	if(dedatas == null){
		//세션이 없을땐 소코드리스트 전부검색
		for( SmallcodeTO to : datas ) {
			String seq = to.getSeq();
			String smallcode = to.getSmallcode();
			String smallinfo = to.getSmallinfo();
			String smallremark = to.getSmallremark();
			
			sbHtml.append( "<tr class='table-secondary'>" );
			sbHtml.append( "	<td class='left'>" );
			sbHtml.append( "		<a href='./commoncodeEdit.do?seq=" + seq + "'>" + smallcode + "</a>" );
			sbHtml.append( "	<td>" + smallinfo + "</td>" );
			sbHtml.append( "	<td>" + smallremark + "</td>" );
			sbHtml.append( "</tr>" );
		}
	}else{
		//세션이있을때 해당하는 테이블 검색
		for( SmallcodeTO to : dedatas ) {
			String seq = to.getSeq();
			String smallcode = to.getSmallcode();
			String smallinfo = to.getSmallinfo();
			String smallremark = to.getSmallremark();
			
			sbHtml.append( "<tr class='table-secondary'>" );
			sbHtml.append( "	<td class='left'>" );
			sbHtml.append( "		<a href='./commoncodeEdit.do?seq=" + seq + "'>" + smallcode + "</a>" );
			sbHtml.append( "	<td>" + smallinfo + "</td>" );
			sbHtml.append( "	<td>" + smallremark + "</td>" );
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
    	<ul style="width:200px; height: 70px; text-align: center;" class="nav nav-pills">
		  <li class="nav-item">
		     <a class="nav-link" href="decode.do">대코드</a>
		  </li>
		  <li class="nav-item">
		    <a class="nav-link active" aria-current="page" href="#">소코드</a>
		  </li>
		</ul>
		<!-- 대코드 검색 -->
		<form action="search_de.do?" method="post" name="mfrm">
		    <select class="form-select" onchange="myFunction(this.value)" id="search" style="width:10%; height: 47px;"aria-label="Default select example">
			  <option selected="selected">전체보기</option>
			  	<%=sbHtml1 %>
			</select>
			<input type="hidden" name="largecode" id="largecode"/>
			<input style="width:60px; margin:-70px 0px 0px 320px;" type="submit" value="검색" class="btn btn-secondary"/>
		</form>
		<br /><br />
		<div style="margin:0px 0px 10px 900px;">
			<button type="button" class="btn btn-secondary" data-bs-toggle="modal" data-bs-target="#exampleModal">
 			 추가</button>
		</div>
		<table style="width:40%; text-align: center;" class="table table-hover">
			<thead>
				<tr>
			      <th width="15%" scope="col">소코드</th>
			      <th width="20%" scope="col">코드정보</th>
			      <th width="20%" scope="col">비고</th>
			    </tr>
		    </thead>
		 	<tbody>
					<%=sbHtml %>
		    </tbody>
		</table>
	</div>
	
	
	
	<!-- Modal -->
	<form action="commoncodeWrite.do" method="post" name="mfrm" >
		<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title">소코드 추가</h5>
						<button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close">
						<span aria-hidden="true"></span>
						</button>
					</div>
					<div class="modal-body">
					<div class="modal-body">
						<select style = "width: 350px;margin-bottom: 60px; " class="form-select" onchange="myFunction(this.value)" id="search" style="width:10%; height: 47px;"aria-label="Default select example">
							<option selected="selected">대코드선택</option>
								 <%=sbHtml1 %>
								<input type="hidden" name="decode" id="largecode1"/>
						</select>
						
						<div class="row mb-3" >
							<div class="col-md-5 themed-grid-col">소코드</div>
							<input style="background-color:white" name="smallcode" class="col-md-7 themed-grid-col" type="text" >
						</div>	
						<div class="row mb-3" >
							<div class="col-md-5 themed-grid-col">소코드정보</div>
							<input style="background-color:white" name="smallinfo" class="col-md-7 themed-grid-col" type="text" >
						</div>
						
						<div class="row mb-3">
							<div class="col-md-5 themed-grid-col">비고</div>
							<input style="background-color:white" name="smallremark" class="col-md-7 themed-grid-col" type="text" >
						</div>
					</div>
					</div>
					<div class="modal-footer">
						<input type="submit"  value="추가 "class="btn btn-primary"/>
						<button type="button" class="btn btn-secondary" data-bs-dismiss="modal">닫기</button>
					</div>
				</div>
			</div>
		</div>
	</form>
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
		document.getElementById("largecode").value = input;
		document.getElementById("largecode1").value = input;
	}

  </script>
</body>
</html>