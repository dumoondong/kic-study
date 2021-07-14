<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./css/vader/jquery-ui.css" />
<style type="text/css">
	/* 사용자 정의 CSS */
</style>
<script type = "text/javascript" src="./js/jquery-3.6.0.js"><</script>
<script type = "text/javascript" src="./js/jquery-ui.js"><</script>
<script type="text/javascript">
	$( document).ready(function(){
		$('#progressbar').progressbar({
			value: 75
		});	
		$('#btn1').button().on('click',function(){
			const value = $('#progressbar').progressbar('value');
			$('#progressbar').progressbar('value',value - 5);
		});
		$('#btn2').button().on('click',function(){
			const value = $('#progressbar').progressbar('value');
			$('#progressbar').progressbar('value',value + 5);
		}); 
	});

</script>
</head>
<body>

<div id="progressbar"></div>
<br /><hr /><br />
<div>
	<button id="btn1">감소(-5)</button>
	<button id="btn2">증가(+5)</button>
</div>


</body>
</html>