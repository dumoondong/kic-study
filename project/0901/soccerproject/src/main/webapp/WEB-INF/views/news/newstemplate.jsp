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

	</content>
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
	</section>  
	<div class="news_headline" align= "middle">
							
								
								
								
									<span class="logo" id="pressLogo"><a href="http://www.interfootball.co.kr" class="link" target="_blank"><img height="35" src="https://mimgnews.pstatic.net/image/upload/office_logo/413/2020/11/26/logo_413_11_20201126174936.png" alt="인터풋볼" onerror="javascript:setPressLogo('인터풋볼');"></a></span>
								
							
							<h4 class="newstitle" style="font-size: 35px;">PSG 폭주는 계속된다...2002년생 '프랑스 초신성' 영입 눈앞</h4>
							<div class="info">
								<span>기사입력 2021.08.24. 오후 02:10</span>
								<span><span class="bar"></span>최종수정 2021.08.24. 오후 02:10</span>
								
									<a target="_blank" href="http://www.interfootball.co.kr/news/articleView.html?idxno=540595" class="press_link">기사원문</a>
								
							</div>
							
						</div>
						<div class="newssubtitle" id="newsEndContents" style="padding: 120px;">
						
						
							<span class="end_photo_org"><img width="50%" height="50%" src="https://imgnews.pstatic.net/image/413/2021/08/24/0000124475_001_20210824141017034.jpg?type=w647" alt=""></span>
							<b style="font-size: 18px;">
							<br><br>파리생제르맹(PSG)이 에두아르도 카마빙가(18, 스타드 렌)도 품을 기세다.<br><br>PSG는 올여름 이적시장의 주인공이었다. 지난 시즌 프랑스 리그앙 트로피를 릴에 빼앗기고 유럽축구연맹(UEFA) 챔피언스리그(UCL) 우승에도 실패하자 분노의 영입에 나선 것이다. 마우리시오 포체티노 감독에게 더욱 지지를 보내기 위함도 있었다.<br><br>월드클래스 선수들이 대거 합류해다. 바르셀로나 원클럽맨이자 올타임 넘버원으로 평가받는 리오넬 메시가 PSG 유니폼을 입었고 레알 마드리드 역사상 최고 센터백 세르히오 라모스도 PSG로 왔다. 이 밖에도 리버풀 중원 핵이었던 조르지니오 바이날둠, 이탈리아 UEFA 유럽축구선수권대회(유로2020) 우승 주역 잔루이지 돈나룸마도 합류했다.<br><br>모두 이적료 한 푼 들지 않는 자유계약(FA) 영입이었던 게 고무적이다. 이적료가 든 선수는 아슈라프 하키미 뿐이다. PSG는 하키미 영입에 6,000만 유로(약 823억 원)를 지불했다. 세계적 명성과 압도적 기량을 가진 5명을 데려온 PSG는 프랑스, 유럽 무대 제패를 동시에 노리고 있다.<br><br>PSG 폭주는 멈추지 않을 전망이다. 테오 에르난데스, 폴 포그바를 비롯한 선수들을 추가로 원하고 있다. 킬리안 음바페와의 재계약도 PSG 목표다. 원대한 꿈을 향한 계획이 차근차근 이뤄지며 PSG는 유럽 최고 스쿼드를 가진 명문 팀으로 거듭나는 중이다.<br><br>2002년생 카마빙가도 PSG 타깃이다. 카마빙가는 프랑스 최고 신성으로 10대 중반 때부터 스타드 렌 주전 미드필더로 뛰었다. 엄청난 활동량과 공수 기여도를 보며 포스트 은골로 캉테라는 별칭까지 붙었다. 높은 명성 속 프랑스 성인 대표팀까지 발탁됐다. 렌 돌풍을 이끌며 팀을 UCL 무대에 올려놓기도 했다. 지난 시즌엔 등번호 10번을 달고 팀 에이스 역할을 했다.<br><br>내년 여름 카마빙가는 렌과의 계약이 만료된다. 렌 입장에선 구단 최고 가치 선수를 공짜로 내보내고 싶지 않을 것이다. 따라서 올여름 매각 가능성이 높은데 PSG가 유력 후보로 점쳐졌다.<br><br>스페인 '마르카'는 "PSG와 렌이 합의에 가까워졌다. 카마빙가는 프랑스 선수 비중을 늘리려는 PSG에 가장 부합한 젊은 자원이다. 타팀들도 노리고 있지만 카마빙가 최우선은 리그앙 잔류기에 PSG로 갈 가능성이 높다"고 전했다.<br><br>
						</b>
						
						
						
						<p class="source"><b>기사제공</b> 인터풋볼</p>

						

						
						
							
								<p class="byline">신동훈 기자 hun7599@interfootball.co.kr</p>
							
				
						
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