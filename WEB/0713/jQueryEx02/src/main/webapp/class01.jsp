<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.high-light{background-color: yellow;}
</style>
<script type = "text/javascript" src="./js/jquery-3.6.0.min.js"><</script>
<script type="text/javascript">
	$(() => {
		document.getElementById('btn1').onclick =() =>{
			$('h2').addClass('high-light');
		};
		
		document.getElementById('btn2').onclick =() =>{
			$('h2').removeClass('high-light');
		};
		
		document.getElementById('btn3').onclick =() =>{
			$('h2').toggleClass('high-light');
		};
	});

</script>
</head>
<body>
<button id="btn1">클래스 추가</button>
<button id="btn2">클래스 제거</button>
<button id="btn3">클래스 토글</button>
<br /><hr /><br />
<h2>item-0</h2>
<h2>item-1</h2>
<h2>item-2</h2>
<h2>item-3</h2>
</body>
</html>