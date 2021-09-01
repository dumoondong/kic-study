<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%	
	String loginUser = (String)session.getAttribute("loginUser");
%>
<html>
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0">
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<title>Insert title here</title>
		<link rel="stylesheet" type="text/css" href="./css/menustyle2.css">
		<link rel="stylesheet" type="text/css" href="./css/board_list.css">
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
	     <meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0">
    <link rel="stylesheet" type="text/css" href="./css/style.css">
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
    
    </br>
    <div class="btn-group">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
		<input type="button" value="클럽" class="btn_write btn_txt01" style="cursor: pointer;" onclick="location.href='./leaguelaliga.do'" />
		<input type="button" value="팀순위" class="btn_write btn_txt01" style="cursor: pointer;" onclick="" />
		<input type="button" value="역대기록" class="btn_write btn_txt01" style="cursor: pointer;" onclick="" />
	</div>
	
  </section>
  	
	<div class="album py-5 bg-light">
    <div class="container">

      <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
     
        <div class="col">
          <div class="card shadow-sm">
          <img align="center" src="images/라리가로고/barsel.jpg" width="70%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp바르셀로나</text></svg>
            <div class="card-body">
              <p class="card-text">올림픽 개최 도시 바르셀로나에 위치해있는 구단으로, 레알 마드리드와 FC 바르셀로나가 맞붙는 'Super Clasico'는 세계에서 가장 흥미로운 라이벌전 중 하나로 손꼽힌다.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	<a href="https://naver.com">
                  		<button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                  	</a>
                </div>
              </div>
            </div>
          </div>
        </div>
        
        <div class="col">
          <div class="card shadow-sm">
          <img src="images/라리가로고/realmadrid.jpg" width="79%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp레알 마드리드</text></svg>
            <div class="card-body">
              <p class="card-text">20세기 최우수 클럽으로 선정된 레알 마드리드의 본래 이름은 F.C 마드리드였다.스페인 국왕의 이름이 걸린 킹스컵 대회에서 연거푸 우승하며 'Real'이라는 칭호가 주어졌고, 그 후 레알 마드리드라고 불렸다.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	<a href="https://naver.com">
                  		<button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                  	</a>
                </div>
              </div>
            </div>
          </div>
        </div>
        
        <div class="col">
          <div class="card shadow-sm">
          <img src="images/라리가로고/atmadrid.jpg" width="70%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbspAT 마드리드</text></svg>
            <div class="card-body">
              <p class="card-text">1903년 창단한 아틀레티코 마드리드는 100년 이상의 역사를 자랑하는 클럽으로 마드리드는 레알 마드리드, FC 바르셀로나와 함께 '스페인 3대 명문'으로 손꼽힐 정도의 유서 깊은 역사와 전통을 자랑한다.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	<a href="https://naver.com">
                  		<button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                  	</a>
                </div>
              </div>
            </div>
          </div>
        </div>

        <div class="col">
          <div class="card shadow-sm">
          <img src="images/라리가로고/valencia.jpg" width="77%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp발렌시아</text></svg>
            <div class="card-body">
              <p class="card-text">1919년에 창립된 발렌시아는 1940년대, 3차례의 프리메라 리가 우승을 차지하며 전성기의 포문을 열었다. 그리고 가장 가까운 역사의 발렌시아를 논하는데 있어 역시 70년대 초반의 팀을 빼놓을 수는 없을 것이다.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	<a href="https://naver.com">
                  		<button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                  	</a>
                </div>
              </div>
            </div>
          </div>
        </div>
        
        <div class="col">
          <div class="card shadow-sm">
          <img src="images/라리가로고/sevilla.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp세비야</text></svg>
            <div class="card-body">
              <p class="card-text">1905년 창단, 홈구장인 라몬 산체스 피즈후안은 1982년 스페인 월드컵 당시 월드컵 경기장으로 쓰였던 구장으로 당시에는 7만여명을 수용할 수 있을 정도의 구장이었지만 현재는 4만 5천석 규모의 구장으로 바뀌었다.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	<a href="https://naver.com">
                  		<button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                  	</a>
                </div>
              </div>
            </div>
          </div>
        </div>
        
        <div class="col">
          <div class="card shadow-sm">
          <img src="images/라리가로고/celta de vigo.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp셀타 비고</text></svg>
            <div class="card-body">
              <p class="card-text">갈리시아 지방의 비고라는 도시를 연고로 하는 이 클럽으로 '셀타'라는 이름은 켈트족의 '켈트'를 그 기원으로 한다. 독특한 문화 양식이 자리잡고 있으며 갈리시아 지방의 특색이 고스란히 담겨져 있는 클럽이기도 하다.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	<a href="https://naver.com">
                  		<button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                  	</a>
                </div>
              </div>
            </div>
          </div>
        </div>

        <div class="col">
          <div class="card shadow-sm">
          <img src="images/라리가로고/villarreal.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp비야 레알</text></svg>
            <div class="card-body">
              <p class="card-text">1923년 창단한 비야레알은 발렌시아에서 북쪽으로 60km 정도 떨어진 카스테욘 지방에 연고를 둔 클럽이다. 도시 인구가 5만명이 채 되지 않을 정도의 작은 도시인 만큼 구단 분위기 또한 차분하고 조용한 클럽이다.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	<a href="https://naver.com">
                  		<button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                  	</a>
                </div>
              </div>
            </div>
          </div>
        </div>
        
        <div class="col">
          <div class="card shadow-sm">
          <img src="images/라리가로고/osasuna.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp우에스카</text></svg>
            <div class="card-body">
              <p class="card-text">1960년 창단하여 지역리그에 참여. 1977년 3부리그로 처음 승격, 3~4부리그를 오가면서 대부분의 시즌을 보냈다. 2007-08 시즌 3부리그에서 준우승, 처음으로 세군다 디비시온으로 승격해 5시즌간 2부리그에서 머물렀다</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	<a href="https://naver.com">
                  		<button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                  	</a>
                </div>
              </div>
            </div>
          </div>
        </div>
        
        <div class="col">
          <div class="card shadow-sm">
          <img src="images/라리가로고/getafe.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp헤타페</text></svg>
            <div class="card-body">
              <p class="card-text">창단 시즌인 1983/84시즌부터 1986/87시즌까지 7부리그에 3부리그까지 한 번도 쉬지않고 승격하는 데에 성공했다. 이후 3부리그에서 지지부진하다가 1993/94시즌에 승격 자격을 얻어 2부리그로 승격한다.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	<a href="https://naver.com">
                  		<button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                  	</a>
                </div>
              </div>
            </div>
          </div>
        </div>
        
        <div class="col">
          <div class="card shadow-sm">
          <img src="images/라리가로고/alaves.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp알라베스</text></svg>
            <div class="card-body">
              <p class="card-text">데포르티보 알라베스(Deportivo Alavés), 약칭 알라베스(Alavés)는 스페인의 축구 클럽으로, 바스크 지방의 아라바 주의 비토리아를 연고지로 한다. 2016/17 시즌에서 프리메라 리가에 참가하고 있다. </p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	<a href="https://naver.com">
                  		<button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                  	</a>
                </div>
              </div>
            </div>
          </div>
        </div>
        
        <div class="col">
          <div class="card shadow-sm">
          <img src="images/라리가로고/granada.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp그라나다</text></svg>
            <div class="card-body">
              <p class="card-text">75/76 시즌을 마친 이후 2부리그로 강등된 이후 무려 30년이 넘는 시간을 하부리그에서 보낸 뒤 2011/12 시즌 35년만에 드디어 1부리그에 재승격했다.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	<a href="https://naver.com">
                  		<button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                  	</a>
                </div>
              </div>
            </div>
          </div>
        </div>
        
        <div class="col">
          <div class="card shadow-sm">
          <img src="images/라리가로고/sociedad.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp레알 소시에다드</text></svg>
            <div class="card-body">
              <p class="card-text">아틀레틱 빌바오와 함께 스페인 바스크 지방을 대표하는 클럽. 아틀레틱 빌바오와 전통의 라이벌이자 이웃사촌에 가까운 관계이며, 두 팀의 경기는 '바스크 더비'라는 이름으로 불린다.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	<a href="https://naver.com">
                  		<button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                  	</a>
                </div>
              </div>
            </div>
          </div>
        </div>
        
        <div class="col">
          <div class="card shadow-sm">
          <img src="images/라리가로고/levante.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp레반테</text></svg>
            <div class="card-body">
              <p class="card-text">스페인 제 3의 도시 발렌시아를 대표하는 2인자 클럽. 발렌시아 CF와는 오랜 라이벌 관계이며, 두 팀의 경기는 '발렌시아 더비'로 잘 알려져 있다. 발렌시아보다 도리어 오랜 역사와 전통을 갖고 있지만, 오래도록 2부리그를 전전하며 명문으로 도약하지 못했다.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	<a href="https://naver.com">
                  		<button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                  	</a>
                </div>
              </div>
            </div>
          </div>
        </div>
        
        <div class="col">
          <div class="card shadow-sm">
          <img src="images/라리가로고/betis.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp레알 베티스</text></svg>
            <div class="card-body">
              <p class="card-text">08/09 시즌 18위를 기록하며 2부리그로 강등됐던 베티스로서는 몇 년간의 공백을 뒤로한 채 올시즌 1부리그에 복귀했다. FC 세비야와 마찬가지로 세비야에 연고를 두고 있는 베티스는 세비리아스트는 애칭을 가진 세비야와 달리 베티코스라는 애칭으로 불린다.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	<a href="https://naver.com">
                  		<button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                  	</a>
                </div>
              </div>
            </div>
          </div>
        </div>
        
        <div class="col">
          <div class="card shadow-sm">
          <img src="images/라리가로고/athletic.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp아틀레틱 빌바오</text></svg>
            <div class="card-body">
              <p class="card-text">바스크 지방에 연고를 둔 클럽으로 1898년에 창단해 110년이 넘는 긴 역사를 가진 팀이다. 정식명칭은 아틀레틱 클루브(Athletic Club). 1928년 공식적으로 시작된 프리메라리가의 원년 멤버인 동시에 현재까지 단 한차례도 강등되지 않고 1부리그에 개근하고 있는 클럽이기도 하다.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	<a href="https://naver.com">
                  		<button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                  	</a>
                </div>
              </div>
            </div>
          </div>
        </div>
        
        <div class="col">
          <div class="card shadow-sm">
          <img src="images/라리가로고/cadiz.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp카디스</text></svg>
            <div class="card-body">
              <p class="card-text">한때 3부리그에서 승격권에도 못들 당시 35점까지 떨어지며 최저치를 기록, 승격에 성공한 이후 49점까지 올린다.이후 2부리그에서도 좋은 성적을 바탕으로 61점까지 올리며 승격하고, 1부리그로 왔다.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	<a href="https://naver.com">
                  		<button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                  	</a>
                </div>
              </div>
            </div>
          </div>
        </div>
        
        <div class="col">
          <div class="card shadow-sm">
          <img src="images/라리가로고/espanol.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp에스파뇰</text></svg>
            <div class="card-body">
              <p class="card-text">1900년 카탈루냐의 중심도시 바르셀로나에 카스티야인들을 위해 만들어진 구단이다. 이 팀은 라이벌 FC 바르셀로나처럼 여자축구와 남자/여자농구, 남자 링크하키, 남자/여자배구까지 하는 종합 스포츠단이기도 하다.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	<a href="https://naver.com">
                  		<button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                  	</a>
                </div>
              </div>
            </div>
          </div>
        </div>
        
        <div class="col">
          <div class="card shadow-sm">
          <img src="images/라리가로고/mallorca.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp마요르카</text></svg>
            <div class="card-body">
              <p class="card-text">창단 이래 2부리그를 전전하는 중소클럽으로서 크게 두각을 나타내지 못했지만, 1990년대부터 미겔 앙헬 나달과 같은 걸출한 스타 선수를 배출하는 등 조금씩 주목을 받았던 팀이다.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	<a href="https://naver.com">
                  		<button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                  	</a>
                </div>
              </div>
            </div>
          </div>
        </div>
        
        <div class="col">
          <div class="card shadow-sm">
          <img src="images/라리가로고/elche.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp엘체</text></svg>
            <div class="card-body">
              <p class="card-text">연고 도시는 발렌시아 주의 엘체(Elche)이다. 잉글리시 리그 1의 볼턴 원더러스와 제휴 관계를 맺고 있다. 최대 라이벌은 인근의 알리칸테에 있는 에르쿨레스 CF이다.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	<a href="https://naver.com">
                  		<button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                  	</a>
                </div>
              </div>
            </div>
          </div>
        </div>
        
        <div class="col">
          <div class="card shadow-sm">
          <img src="images/라리가로고/vallecano.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp라욜 바예카노</text></svg>
            <div class="card-body">
              <p class="card-text">원래 바예카노는 마드리드에 속하지 않던 지역이다가 현대에 와서야 푸엔테 데 바예카스 구로 편입되었기 때문에 '바예카스 사람'의 정체성을 갖고 있어 이를 가리키는 '바예카노스'라는 애칭으로도 자주 불린다. </p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	<a href="https://naver.com">
                  		<button type="button" class="btn btn-sm btn-outline-secondary">View</button>
                  	</a>
                </div>
              </div>
            </div>
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