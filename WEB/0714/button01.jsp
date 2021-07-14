<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./css/base/jquery-ui.css" />
<style type="text/css">
	/* 사용자 정의 CSS */
	body	{font-size: 80%;}
</style>
<script type = "text/javascript" src="./js/jquery-3.6.0.js"><</script>
<script type = "text/javascript" src="./js/jquery-ui.js"><</script>
<script type="text/javascript">
	$( document).ready(function(){
		$('#btn2').button();
		$('input[type="submit"]').button();
		$('input[type="button"]').button();
		$('a').button();
		$('#btn6').button();
	});

</script>
</head>
<body>

<button id="btn1">버튼1</button><br /><br />
<button id="btn2">버튼1</button><br /><br />
<input type="submit" value="버튼3" /><br /><br />
<input type="button" value="버튼4" /><br /><br />
<a href="https://www.daum.net">바로가기</a><br /><br />
<div id="btn6">버튼 6</div><br /><br />
</body>
</html>