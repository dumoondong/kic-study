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
		<input type="button" value="클럽" class="btn_write btn_txt01" style="cursor: pointer;" onclick="location.href='./leagueserieA.do'" />
		<input type="button" value="팀순위" class="btn_write btn_txt01" style="cursor: pointer;" onclick="" />
		<input type="button" value="역대기록" class="btn_write btn_txt01" style="cursor: pointer;" onclick="" />
	</div>
	
  </section>
  	
	<div class="album py-5 bg-light">
    <div class="container">

      <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
     
        <div class="col">
          <div class="card shadow-sm">
          <img align="center" src="images/세리아A/Juventus.jpg" width="65%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp유벤투스</text></svg>
            <div class="card-body">
              <p class="card-text"> 이탈리아 리그가 권역별 리그제(Campionato Nazionale)에서 전국적인 규모의 선수권대회(Lega Calcio)로 탈바꿈한 1929년 이후 명실상부한 이탈리아 최고의 클럽으로 태어났다.</p>
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
          <img src="images/세리아A/Milan.jpg" width="79%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbspAC 밀란</text></svg>
            <div class="card-body">
              <p class="card-text">유벤투스, 인터 밀란과 함께 이탈리아 축구를 대표하는 클럽 가운데 하나인 AC 밀란은 1899년 영국인 알프레드 에드워즈(Alfred Edwards)에 의해 Milan Cricket & Football Club이라는 이름으로 창단되었다.</p>
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
          <img src="images/세리아A/Inter.jpg" width="70%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp인터 밀란</text></svg>
            <div class="card-body">
              <p class="card-text">유벤투스를 제외한 세리에 B로의 강등을 경험하지 않은 유일한 클럽인 인터 밀란, 연고지를 밀라노로 두고있으며 AC밀란 멤버의 캄페리오 형제에 발반한 지오바니를 중심으로 창단되었다.</p>
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
          <img src="images/세리아A/Napoli.jpg" width="75%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp나폴리</text></svg>
            <div class="card-body">
              <p class="card-text">이탈리아 나폴리를 연고지로 두고 있는 프로 축구 클럽. AS 로마와 함께 이탈리아 남부를 대표하는 클럽이다. 1964년, 어쏘시아치오네 칼치오 나폴리에서 소시에타 스포르티바 칼치오 나폴리로 이름을 바꾸었다.</p>
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
          <img src="images/세리아A/Roma.jpg" width="75%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbspAS 로마</text></svg>
            <div class="card-body">
              <p class="card-text">수도 로마에 연고를 둔 AS Roma(Associazione Sportiva Roma)는 1927년 알바(Alba), 포르티투도(Fortitudo), 로만(Roman), 그리고 프로 로마(Pro Roma) 클럽의 합병에 의해 탄생했다.</p>
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
          <img src="images/세리아A/Lazio.jpg" width="70%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp라치오</text></svg>
            <div class="card-body">
              <p class="card-text">창설자인 루이지 비지아렐리(Luigi Bigiarelli)는 클럽의 색상으로 그리스 국기의 색상에 착안해 하늘색과 흰색을 택했다.로마를 연고로 이미 AS 로마가 있어서 주의 이름인 라치오를 클럽의 이름으로 정했다.</p>
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
          <img src="images/세리아A/Bolognafc.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp볼로냐</text></svg>
            <div class="card-body">
              <p class="card-text">클럽 명칭에서 알 수 있듯 1909년 탄생한 볼로냐(Bologna 1909 FC)는 100여년이 넘는 이탈리아 축구 역사상 7번의 우승을 차지한 바 있는 리그 명문클럽이다.</p>
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
          <img src="images/세리아A/Atalanta.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp아탈란타</text></svg>
            <div class="card-body">
              <p class="card-text">1907년 창단한 아탈란타 베르가모의 공식 명칭은 ‘아탈란타 베르가마스카 갈치오 1907’로 흔히 아탈란타 베르가모라는 약칭으로 불린다. 1963년 코파 이탈리아에서 우승을 차지한 것이 클럽 역사상 유일한 우승 기록이다.</p>
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
          <img src="images/세리아A/Udinese.jpg" width="74%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp우디네세</text></svg>
            <div class="card-body">
              <p class="card-text">북부 이탈리아에 근거를 둔 클럽으로 1896년 창단해 110년이 넘는 긴 역사를 자랑한다. 긴 역사에도 불구하고 아직까지 리그 우승이나 코파 이탈리아 우승 기록은 아직까지 없다. </p>
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
          <img src="images/세리아A/Fiorenrina.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp피오렌티나</text></svg>
            <div class="card-body">
              <p class="card-text">1926년 팔레스트라 지나스티카 리베르타스(Palestra Ginnastica Libertas)와 클럽 스포르티보 피렌체(Club Sportivo Firenze), 두 클럽간의 합병으로 탄생한 AC 피오렌티나</p>
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
          <img src="images/세리아A/Torino.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp토리노</text></svg>
            <div class="card-body">
              <p class="card-text">이탈리아 북부 토리노를 연고지로 한 AC 토리노는 1906.12.3일에 창단했다.1977 ~ 2005년까지는 토리노 갈치오라는 이름으로 공식 명칭이 바뀌었지만 2005년 이후 토리노 FC 1906 S.p.A라는 명칭으로 불리고 있다.</p>
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
          <img src="images/세리아A/sampdoria.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp삼프도리아</text></svg>
            <div class="card-body">
              <p class="card-text">제노바에 연고를 둔 삼프도리아는 1946년 8월 12일에 창단한 클럽으로 같은 제노바를 연고로 하는 CFC 제노아와 더비 라이벌 관계를 이룬다.SG 삼피에르다렌세와 안드레아 도리아의 두 개 클럽이 통합하여 생겼다.</p>
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
          <img src="images/세리아A/Genoa.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp제노아</text></svg>
            <div class="card-body">
              <p class="card-text">이탈리아 클럽팀들 가운데 가장 오랜 역사를 자랑하는 제노아는 팀명 자체는 영어명으로 되어 있지만 이를 이탈리아식으로 발음해 게노아가 아닌 ‘제노아’로 부른다.</p>
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
          <img src="images/세리아A/Cagliari.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp칼리아리</text></svg>
            <div class="card-body">
              <p class="card-text">1920년 창단한 칼리아리 갈치오는 이탈리아 내 대표적인 중위권 클럽으로 자리잡고 있지만 대부분의 중위권 클럽들이 우승 경험이 없는 데 반해 칼리아리는 1970년 리그 우승을 차지한 바 있다.</p>
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
          <img src="images/세리아A/Sassuolo.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp사수올로</text></svg>
            <div class="card-body">
              <p class="card-text">1922년 창단되었다. 2005-06 시즌 세리에 C2/B 에서 플레이오프에서 우승하며 승격하였다.2012-13 시즌에 세리에 B에서 우승하면서 클럽 사상 최초로 세리에 A로 승격을 완수했다</p>
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
          <img src="images/세리아A/Spezia.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp스페치아</text></svg>
            <div class="card-body">
              <p class="card-text">이탈리아 리구리아 주 라스페치아를 연고로 하는 프로 축구 구단으로, 1906년 10월 10일에 팀이 창단되었으며 1944년에 당시에 이탈리아 챔피언십을 우승한 기록이 있다.</p>
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
          <img src="images/세리아A/Venezia.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp베네치아</text></svg>
            <div class="card-body">
              <p class="card-text">이탈리아 베네토 주 베네치아를 연고로 하는 축구팀으로, 팔레스트라 마찌알레, 콘스탄티노 레예르가 합병되며 Venezia football club으로 창단되었다.</p>
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
          <img src="images/세리아A/Empoli.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp엠폴리</text></svg>
            <div class="card-body">
              <p class="card-text">엠폴리 FC (Empoli FC)는 이탈리아 엠폴리에 연고지를 둔 축구 클럽이다.1970년대 무렵까지 세리에 C에 주로 소속되어 있었다. 2000년대에 들어서는 세리에 A와 B를 넘나드는 시즌이 계속되고 있다.</p>
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
          <img src="images/세리아A/Sportiva.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbspUS 살레르니타나</text></svg>
            <div class="card-body">
              <p class="card-text">캄파니아주 살레르노를 연고로 하는 이탈리아의 축구 구단으로, 20-21시즌, 세리에 B에서 2위를 기록하며 22년만에 세리에 A로 승격을 확정지었다.</p>
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
          <img src="images/세리아A/Verona.jpg" width="78%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp엘라스 베로나</text></svg>
            <div class="card-body">
              <p class="card-text">엘라스 베로나 FC는 이탈리아 베네토 주 베로나(Verona)를 연고로 한다. 홈 경기장은 스타디오 마르크안토니오 벤테고디이다. 지역 라이벌 키에보와의 경기는 데르비 델라 스칼라로 알려졌으며 언제나 뜨겁다.</p>
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