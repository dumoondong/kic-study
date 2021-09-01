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
		<input type="button" value="클럽" class="btn_write btn_txt01" style="cursor: pointer;" onclick="location.href='./leaguebundesliga.do'" />
		<input type="button" value="팀순위" class="btn_write btn_txt01" style="cursor: pointer;" onclick="" />
		<input type="button" value="역대기록" class="btn_write btn_txt01" style="cursor: pointer;" onclick="" />
	</div>
    
  </section>	
	<div class="album py-5 bg-light">
    <div class="container">

      <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
     
        <div class="col">
          <div class="card shadow-sm">
          <img align="center" src="images/분데스리가/bayern.jpg" width="70%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp바이에른뮌헨</text></svg>
            <div class="card-body">
              <p class="card-text">통산 리그 우승 30회(분데스라 정식 도입 이전 1회 우승 포함), DFB 포칼(독일컵) 우승 20회 등 리그와 컵대회에서 바이에른은 리그 최다 우승 기록을 보유하고 있다. 분데스리가 통산 성적 역시 압도적인 1위를 달리고 있음은 당연하다.</p>
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
          <img src="images/분데스리가/leverkusen.jpg" width="71%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp레버쿠젠</text></svg>
            <div class="card-body">
              <p class="card-text">원 구단명은 TSV 바이어 04 레버쿠젠으로 팀명에서도 알 수 있듯 창단 연도는 1904년이다. 대도시 쾰른 근교에 위치한 레버쿠젠을 연고지로 하는 클럽으로 쾰른이 450만 남짓의 인구를 자랑하는데 반해 레버쿠젠은 인구 16만명 남짓의 작은 도시다.</p>
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
          <img src="images/분데스리가/leipzig.jpg" width="70%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp라이브치히</text></svg>
            <div class="card-body">
              <p class="card-text">RB 라이프치히는 독일 작센 주의 라이프치히를 연고로 하는 축구 클럽이다. 레드불은 오스트리아 잘츠부르크, 미국 뉴욕 및 브라질 캄피나스에서도 축구 클럽을 운영하고 있으며, 레드불이 지원하는 축구 클럽으로는 4번째에 해당한다.</p>
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
          <img src="images/분데스리가/dortmund.jpg" width="77%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp도르트문트</text></svg>
            <div class="card-body">
              <p class="card-text">1909 e. V. Dortmund) 는 흔히 도르트문트 또는 BVB로 알려진 노르트라인베스트팔렌 주 도르트문트를 연고로 하는 독일의 축구 클럽이다. 독일에서 가장 성공적인 축구 클럽 가운데 하나이다.</p>
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
          <img src="images/분데스리가/wolfsburg.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp볼프스부르크</text></svg>
            <div class="card-body">
              <p class="card-text">연고지인 볼프스부르크 시는 1936년 폭스바겐의 공장이 들어서면서 처음 생긴 도시다. 신흥강호 축에 속하는 이 팀의 역사는 폭스바겐과 떼어놓고 말할 수 없다. 그러나 모기업의 상태가 안좋다.</p>
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
          <img src="images/분데스리가/koln.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp쾰른</text></svg>
            <div class="card-body">
              <p class="card-text">원래 쾰른 지역에는 1901년에 생긴 Kölner Ballspiel-Club 1907년에 탄생한 SpVgg Sülz 07라는 클럽이 있었다. 이 두 팀이 1948년 합병하면서 탄생한 것이 오늘날의 FC 쾰른이다.</p>
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
          <img src="images/분데스리가/freiburg.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp프라이부르크</text></svg>
            <div class="card-body">
              <p class="card-text">1904년 창단한 SC 프라이부르크는 본래 산하에 체조팀을 함께 운영해 어지간한 팀들이 FC 즉 축구 클럽이라는 약자를 팀명 앞에 붙이는 것과 달리 스포츠 클럽이라는 뜻의 SC 라는 약자를 팀명 앞에 쓰고 있다.</p>
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
          <img src="images/분데스리가/hoffenheim.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp호펜하임</text></svg>
            <div class="card-body">
              <p class="card-text">인구 3천명 남짓의 작은 마을 진스하임에 속한 작은 마을 호펜하임을 연고지로 하고 있는 호펜하임은 1990년대 초반까지만 해도 7부리그에 머물렀지만 장족의 발전을 통해 1부리그에서 활동하고 있다.</p>
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
          <img src="images/분데스리가/stuttgart.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp슈투트가르트</text></svg>
            <div class="card-body">
              <p class="card-text">종합 스포츠 클럽으로 피스트볼, 탁구, 하키 등을 운영하는데 그 중 유명한 것이 바로 축구 클럽이다. 남독일의 주요 도시 중 하나인 슈투트가르트를 연고로 4만 5천명의 회원을 자랑하는 독일에서 다섯번째로 큰 클럽이다.</p>
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
          <img src="images/분데스리가/mainz.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp마인츠05</text></svg>
            <div class="card-body">
              <p class="card-text">100년 이상의 역사를 자랑하는 유서깊은 클럽이지만 1부리그 무대에서 남긴 족적은 사실상 미미하다.분데스리가 도입 이전과 이후를 통틀어 아직까지 리그 우승을 차지한 적이 없다.</p>
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
          <img src="images/분데스리가/frankfurt.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp프랑크푸르트</text></svg>
            <div class="card-body">
              <p class="card-text">독일 경제의 중심지인 프랑크푸르트에 연고를 둔 클럽이다. 국내 팬들에게는 차범근 전 수원 감독이 1980년대 초반 몸담으며 UEFA컵 우승을 차지한 팀으로도 잘 알려져 있다.</p>
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
          <img src="images/분데스리가/borussia.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp묀헨글라드바흐</text></svg>
            <div class="card-body">
              <p class="card-text">1990년대 이후 재정 위기를 겪으며 1부 2부리그 사이를 오가는 이른바 중소 규모의 클럽으로 전락한 상태지만, 1900년에 창단한 클럽으로 분데스리가 통산 순위 6위를 달리고 있는 분데스리가 전통의 명문 구단이다.</p>
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
          <img src="images/분데스리가/augsburg.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp아우크스부르크</text></svg>
            <div class="card-body">
              <p class="card-text">1907년 창단한 FC 아우크스부르크는 바이에른 주에 위치한 아우크스부르크를 연고지로 하는 팀으로 11/12 시즌 구단 역사상 첫 1부리그 시즌을 보내고 있는 팀이다.</p>
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
          <img src="images/분데스리가/hertha.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp헤르타 베를린</text></svg>
            <div class="card-body">
              <p class="card-text">독일의 수도 베를린에 연고를 둔 클럽으로 베를린 연고 축구클럽들 중에서도 위상이있다. 역대 2번의 우승을 차지했지만 분데스리가 정식 출범 이후에는 리그 우승을 차지한 바가 없다. </p>
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
          <img src="images/분데스리가/bochum.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp보훔</text></svg>
            <div class="card-body">
              <p class="card-text">1848년 7월 26일 창단 이후 1852년 12월 28일에 탄압으로 인해 잠시 해산되었지만, 1860년 6월 19일에 다시 복구해서 지금까지 팀의 역사가 계속되고 있다.</p>
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
          <img src="images/분데스리가/berlin.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp우니온 레를린</text></svg>
            <div class="card-body">
              <p class="card-text">헤르타가 서베를린을 대표한다면, 독일 통일 이후로는 이 팀이 동베를린 대표격에 해당하는 클럽이다. 10년 넘게 승격도, 강등도 없이 중상위권을 지키고 있는 2부리그에 머물다가 첫 1부리그로 승격했다.</p>
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
          <img src="images/분데스리가/Bielefeld.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp아르미니아 빌레펠트</text></svg>
            <div class="card-body">
              <p class="card-text">1905년 5월 3일 창단하였다. 하키, 피겨스케이팅 등 다른 종목도 포함하고 있는 종합 스포츠 클럽이다. 아르미니아(Arminia)라는 이름은 로마 제국에 대항한 게르만족 지도자인 아르미니우스(Arminius)에서 유래하였다.</p>
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
          <img src="images/분데스리가/Greuther.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp그로이터 퓌르트</text></svg>
            <div class="card-body">
              <p class="card-text">독일 바이에른 주 퓌르트의 축구 클럽 팀이다. 제2차 세계 대전 전에 3번의 우승을 차지하였다. 유니폼은 녹색과 흰색을 사용한다. 뉘른베르크가 남동쪽 약 7km 정도에 위치해 있어 뉘른베르크와는 라이벌 관계에 있다.</p>
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