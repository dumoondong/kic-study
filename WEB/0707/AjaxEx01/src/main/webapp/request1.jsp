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
			//alert('test');
			
			const request = new XMLHttpRequest();
			//옵션설정
			//'get' / 'post'
			//url
			//false : 동기방식 / true : 비동기
			
			//다른 ip에 데이터를 요청하면 cross domain(CORS)
			request.open('get','http://192.168.0.8:8080/AjaxEx01/data/csv1.jsp',false);
			//요청
			request.send();
			
			//console.log(request.responseText);
			//document.body.innerHTML += request.responseText;
			document.getElementById('result').innerHTML += request.responseText;
		};
	};
</script>
</head>
<body>

<button id="btn1">요청하기</button>
<br /><hr /><br />
<div id="result"></div>
</body>
</html>