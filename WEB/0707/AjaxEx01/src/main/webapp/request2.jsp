<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function(){
		document.getElementById('btn1').onclick = function() {
			const request = new XMLHttpRequest();
			console.log("1");
			//동기식
			request.open('get','./data/csv1.jsp',false);
			console.log("2");
			request.send();
			console.log("3");
			document.getElementById('result').innerHTML += request.responseText;
			console.log("4");
		};
		
		document.getElementById('btn2').onclick = function() {
			const request = new XMLHttpRequest();
			console.log("1");
			//비동기식
			request.open('get','./data/csv1.jsp',true);
			console.log("2");
			request.send();
			console.log("3");
			document.getElementById('result').innerHTML += request.responseText;
			console.log("4");
		};
		
		document.getElementById('btn3').onclick = function() {
			const request = new XMLHttpRequest();
			console.log("1");
			//비동기식
			request.onreadystatechange = function name() {
				console.log("5",request.readyState);
				
				//request.readyState
				//0		- request가 초기화 안됨
				//1		- 서버와 연결이 설정
				//2		- 서버가 request받음
				//3		- request처리중
				//4		- 완료
				
				if(request.readyState == 4){
					//console.log(request.responseText);
					//console.log(request.status);
					if(request.status == 200){
						document.getElementById('result').innerHTML += request.responseText;
					}else{
						document.getElementById('result').innerHTML += "Web Site Error";
					}
				}
			}
			request.open('get','./data/csv1.jsp',true);
			console.log("2");
			request.send();
			console.log("3");
			document.getElementById('result').innerHTML += request.responseText;
			console.log("4");
		};
	};
</script>
</head>
<body>

<button id="btn1">동기 요청하기</button>
<button id="btn2">비동기 요청하기</button>
<button id="btn3">비동기 확인</button>
<br /><hr /><br />
<div id="result"></div>
</body>
</html>