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
		<input type="button" value="클럽" class="btn_write btn_txt01" style="cursor: pointer;" onclick="location.href='./league.do'" />
		<input type="button" value="팀순위" class="btn_write btn_txt01" style="cursor: pointer;" onclick="" />
		<input type="button" value="역대기록" class="btn_write btn_txt01" style="cursor: pointer;" onclick="" />
	</div>
    
  </section>	
	<div class="album py-5 bg-light">
    <div class="container">

      <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
     
        <div class="col">
          <div class="card shadow-sm">
          <img align="center" src="images/arsenal.png" width="57%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp아스날</text></svg>
            <div class="card-body">
              <p class="card-text">1886년 창단한 아스날은 그 오랜 역사가 말해주 듯 잉글랜드에서 가장 오래도록 1부리그에 잔류하고 있는 전통의 강팀이다. </p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                  		<input type="button" value="View" class="btn_write btn_txt01" style="cursor: pointer;" onclick="location.href='./Arsenal.do'" />
                </div>
              </div>
            </div>
          </div>
        </div>
        
        <div class="col">
          <div class="card shadow-sm">
          <img src="images/mancity.jpg" width="55%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp맨시티</text></svg>
            <div class="card-body">
              <p class="card-text">맨체스터 시티는 맨체스터 유나이티드와 함께 맨체스터 시를 연고로 하는 잉글랜드의 대표적인 구단이다.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	
                  		<input type="button" value="View" class="btn_write btn_txt01" style="cursor: pointer;" onclick="location.href='./Mancity.do'" />
                  	
                </div>
              </div>
            </div>
          </div>
        </div>
        
        <div class="col">
          <div class="card shadow-sm">
          <img src="images/liverpool.jpg" width="70%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp리버풀</text></svg>
            <div class="card-body">
              <p class="card-text">맨체스터 유나이티드와 함께 잉글랜드 최고의 명문 자리를 놓고 오래도록 자존심 대결을 펼쳐 온 팀이다.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	
                  		<input type="button" value="View" class="btn_write btn_txt01" style="cursor: pointer;" onclick="location.href='./Liverpool.do'" />
                  	
                </div>
              </div>
            </div>
          </div>
        </div>

        <div class="col">
          <div class="card shadow-sm">
          <img src="images/tottenham.jpg" width="60%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp토트넘</text></svg>
            <div class="card-body">
              <p class="card-text">1882년 창단한 북런던 지역의 유서 깊은 명문클럽이다. 팀의 이름 ‘홋스퍼’는 14세기 경 토트넘 지역을 지배했던 귀족 헨리 퍼시경의 별명으로부터 유래한 것이다.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	
                  		<input type="button" value="View" class="btn_write btn_txt01" style="cursor: pointer;" onclick="location.href='./Arsenal.do'" />
                  
                </div>
              </div>
            </div>
          </div>
        </div>
        
        <div class="col">
          <div class="card shadow-sm">
          <img src="images/manunited.jpg" width="58%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp맨유</text></svg>
            <div class="card-body">
              <p class="card-text">리버풀과 함께 잉글랜드를 대표하는 최고의 명문클럽으로 손꼽힌다. 전통의 붉은색 유니폼으로 인해 ‘붉은 악마들(Red Devils)’이란 애칭으로 불린다.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	
                  		<input type="button" value="View" class="btn_write btn_txt01" style="cursor: pointer;" onclick="location.href='./Arsenal.do'" />
                  	
                </div>
              </div>
            </div>
          </div>
        </div>
        
        <div class="col">
          <div class="card shadow-sm">
          <img src="images/chelsea.jpg" width="58%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp첼시</text></svg>
            <div class="card-body">
              <p class="card-text">스탬포드 브릿지 구장의 소유권을 손에 넣은 미어즈 형제에 의해 창설된 구단이다. 전통적으로 푸른 색깔의 유니폼을 입어 왔기 때문에 ‘더 블루즈(The Blues)’라는 애칭으로 불린다.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	
                  		<input type="button" value="View" class="btn_write btn_txt01" style="cursor: pointer;" onclick="location.href='./Arsenal.do'" />
                  	
                </div>
              </div>
            </div>
          </div>
        </div>

        <div class="col">
          <div class="card shadow-sm">
          <img src="images/leicester.jpg" width="58%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp레스터시티</text></svg>
            <div class="card-body">
              <p class="card-text">인구 30만의 잉글랜드 도시 레스터를 대표하는 축구 클럽. 단 한 시즌간 3부 리그 생활을 한 것을 제외하고 모든 역사를 1~2부 리그에서만 보낸, 나름의 역사를 지닌 클럽이다.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	
                  		<input type="button" value="View" class="btn_write btn_txt01" style="cursor: pointer;" onclick="location.href='./Arsenal.do'" />
                  	
                </div>
              </div>
            </div>
          </div>
        </div>
        
        <div class="col">
          <div class="card shadow-sm">
          <img src="images/everton.jpg" width="58%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp에버튼</text></svg>
            <div class="card-body">
              <p class="card-text">에버튼은 리그 9회 우승의 경력을 갖고 있는 잉글랜드 전통의 명문 구단이다. 리버풀과 함께 같은 리버풀 시를 연고로 하고 있으며, 에버튼과 리버풀의 경기는 ‘머지사이드 더비’라는 이름의 라이벌 대결로 매우 유명하다.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	
                  		<input type="button" value="View" class="btn_write btn_txt01" style="cursor: pointer;" onclick="location.href='./Arsenal.do'" />
                  	
                </div>
              </div>
            </div>
          </div>
        </div>
        
        <div class="col">
          <div class="card shadow-sm">
          <img src="images/newcastle.jpg" width="58%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp뉴캐슬</text></svg>
            <div class="card-body">
              <p class="card-text">1892년 공식 창단된 뉴캐슬은 풋볼리그 초창기를 화려하게 장식했던 명문 구단. 1905년, 1907년, 1909년에 세 차례 리그를 제패, 1910년과 1924년에는 FA컵 정상, 1926/27 시즌 들어 통산 네 번째 리그 우승을 차지했다. </p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	
                  		<input type="button" value="View" class="btn_write btn_txt01" style="cursor: pointer;" onclick="location.href='./Arsenal.do'" />
                  	
                </div>
              </div>
            </div>
          </div>
        </div>
        
        <div class="col">
          <div class="card shadow-sm">
          <img src="images/brighton.jpg" width="56%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp브라이튼</text></svg>
            <div class="card-body">
              <p class="card-text">영국 잉글랜드 남동부 이스트서식스 주 브라이튼 앤 호브 보로에 연고지를 둔 축구 클럽. 정확히는 브라이튼시의 북동쪽에 자리잡고 있다.팀명은 브라이튼 앤 호브 알비온 풋볼 클럽이다.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	
                  		<input type="button" value="View" class="btn_write btn_txt01" style="cursor: pointer;" onclick="location.href='./Arsenal.do'" />
                  	
                </div>
              </div>
            </div>
          </div>
        </div>
        
        <div class="col">
          <div class="card shadow-sm">
          <img src="images/astonvilla.jpg" width="56%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp브라이튼</text></svg>
            <div class="card-body">
              <p class="card-text">잉글랜드 프로축구의 역사와 함께 해온 오랜 전통을 자랑하는 클럽. 워낙 전통적인 강팀으로 유명하다보니 현지에서도 팬들의 자부심이 정말 대단하고 다른 팬들도 많이 알아주는 편이다.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	
                  		<input type="button" value="View" class="btn_write btn_txt01" style="cursor: pointer;" onclick="location.href='./Arsenal.do'" />
                  	
                </div>
              </div>
            </div>
          </div>
        </div>
        
        <div class="col">
          <div class="card shadow-sm">
          <img src="images/crystalpalace.jpg" width="56%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp브라이튼</text></svg>
            <div class="card-body">
              <p class="card-text">1905년 영국 런던의 남부 지역을 연고로 창단한 축구 클럽. 인근에 있었던 수정궁에서 이름을 따서 만들어졌고, 이 때문에 대한민국의 축구 팬들도 흔히 수정궁이라고 애칭 삼아 부른다.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	
                  		<input type="button" value="View" class="btn_write btn_txt01" style="cursor: pointer;" onclick="location.href='./Arsenal.do'" />
                  	
                </div>
              </div>
            </div>
          </div>
        </div>
        
        <div class="col">
          <div class="card shadow-sm">
          <img src="images/burnley.jpg" width="56%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp번리</text></svg>
            <div class="card-body">
              <p class="card-text">잉글랜드 번리에 연고지를 둔 축구 클럽으로 1888년 창단하였다. 풋볼 리그의 원년부터 참여한 유서깊은 구단으로, 클럽의 컬러는 레드와인과 블루를 사용하는데, 풋볼 리그 출범 초기의 최강팀이었던 아스톤 빌라의 강함을 본받고 싶어 컬러를 변경한 것이다.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	
                  		<input type="button" value="View" class="btn_write btn_txt01" style="cursor: pointer;" onclick="location.href='./Arsenal.do'" />
                  	
                </div>
              </div>
            </div>
          </div>
        </div>
        
        <div class="col">
          <div class="card shadow-sm">
          <img src="images/southampton.jpg" width="56%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp사우스 햄튼</text></svg>
            <div class="card-body">
              <p class="card-text">1885년 창단한 팀으로 120년 이상의 오랜 역사를 자랑하는 클럽이다. 1885년 11월 창단 당시에는 세인트 메리스라는 이름으로 시작됐으며 1889년부터 ‘더 델’을 홈구장으로 사용했지만, 2001년 들어서는 현재의 홈구장인 세인트 메리스 스타디움으로 홈구장을 이동했다.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	
                  		<input type="button" value="View" class="btn_write btn_txt01" style="cursor: pointer;" onclick="location.href='./Arsenal.do'" />
                  	
                </div>
              </div>
            </div>
          </div>
        </div>
        
        <div class="col">
          <div class="card shadow-sm">
          <img src="images/wolverhampton.jpg" width="56%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp울버햄튼</text></svg>
            <div class="card-body">
              <p class="card-text">잉글랜드의 울버햄튼을 연고로 하는 축구클럽이다. 1877년 교회의 존 베인튼과 존 브로디라는 두 신부가 세인트 루크스라는 이름으로 창단하였고, 2년 뒤 더 원더러스와 합병하여 지금의 울버햄튼 원더러스 FC라는 이름을 가지게 되었다. </p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	
                  		<input type="button" value="View" class="btn_write btn_txt01" style="cursor: pointer;" onclick="location.href='./Arsenal.do'" />
                  	
                </div>
              </div>
            </div>
          </div>
        </div>
        
        <div class="col">
          <div class="card shadow-sm">
          <img src="images/leeds.jpg" width="56%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp리즈</text></svg>
            <div class="card-body">
              <p class="card-text">요크셔험버 웨스트요크셔 주 리즈를 연고지로 하고 있다. 맨체스터 유나이티드 FC와 로즈 더비를 가졌을 정도로 프리미어 리그에 오래 있었지만 2003-04 시즌을 끝으로 강등된 후 2019-20 시즌까지 EFL 챔피언십에 있었다. 하지만 2019-20 시즌, 16년 만에 1부리그 승격을 확정지었다.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	
                  		<input type="button" value="View" class="btn_write btn_txt01" style="cursor: pointer;" onclick="location.href='./Arsenal.do'" />
                  	
                </div>
              </div>
            </div>
          </div>
        </div>
        
        <div class="col">
          <div class="card shadow-sm">
          <img src="images/westham.jpg" width="56%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp웨스트햄</text></svg>
            <div class="card-body">
              <p class="card-text">100년 이상의 전통과 역사를 자랑하는 웨스트햄 유나이티드는 1895년 창립됐다. 본래 템즈 사의 사원 축구모임으로 시작됐으나 1898년에는 당당히 2부리그에 가입했고, 곧바로 1부로 승격하여 풋볼리그 소속으로 활약했다.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	
                  		<input type="button" value="View" class="btn_write btn_txt01" style="cursor: pointer;" onclick="location.href='./Arsenal.do'" />
                  	
                </div>
              </div>
            </div>
          </div>
        </div>
        
        <div class="col">
          <div class="card shadow-sm">
          <img src="images/norwich.jpg" width="56%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp노리치시티</text></svg>
            <div class="card-body">
              <p class="card-text">이스트 오브 잉글랜드 노퍽 주 노리치를 연고지로 하고 있다. 강등이 되기 위해서는 일단 1부 리그에 속해 있어야 한다는게 선제 조건이라 그만큼 승격과 강등을 많이 하는 클럽이다. 이러한 팀을 지칭하는 개념인 에스컬레이터 팀 이라는 단어의 대표격이라고 볼 수 있다.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	
                  		<input type="button" value="View" class="btn_write btn_txt01" style="cursor: pointer;" onclick="location.href='./Arsenal.do'" />
                  	
                </div>
              </div>
            </div>
          </div>
        </div>
        
        <div class="col">
          <div class="card shadow-sm">
          <img src="images/watford.jpg" width="56%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp왓포드</text></svg>
            <div class="card-body">
              <p class="card-text">이스트 오브 잉글랜드 허트포드셔 주 왓포드를 연고지로 하고있다. 이 팀의 유명한 팬인 엘튼 존이 1976년에 팀을 직접 사서 1976~1987년과 1997~2002년 두 차례에 걸쳐 회장을 역임, 홈구장의 스탠드 개축이 이루어지면서 스탠드 중 하나의 이름이 엘튼 존 경 스탠드로 바뀌었다.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	
                  		<input type="button" value="View" class="btn_write btn_txt01" style="cursor: pointer;" onclick="location.href='./Arsenal.do'" />
                  	
                </div>
              </div>
            </div>
          </div>
        </div>
        
        <div class="col">
          <div class="card shadow-sm">
          <img src="images/brentford.jpg" width="56%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp브렌드포드</text></svg>
            <div class="card-body">
              <p class="card-text">런던 하운즐로우 구 브렌트포드를 연고지로 하고 있다. 몇몇 언론 및 관련 홈페이지에서는 '브렌트퍼드'로 표기한다. EPL 74년만의 1부리그로 복귀를해 팬들의 감동어린 눈물의 영상이 화제가 되었으며, 복귀전으로 아스널과 경기를 해 2:0이라는 통쾌한 승리를 거뒀다.</p>
              <div class="d-flex justify-content-between align-items-center">
                <div class="btn-group">
                	
                  		<input type="button" value="View" class="btn_write btn_txt01" style="cursor: pointer;" onclick="location.href='./Arsenal.do'" />
                  	
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