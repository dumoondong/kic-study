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
</style>
<script type = "text/javascript" src="./js/jquery-3.6.0.js"><</script>
<script type = "text/javascript" src="./js/jquery-ui.js"><</script>
<script type="text/javascript">
	$( document).ready(function(){
		$('#slider').slider({
			//orientation: 'vertical'
			orientation: 'horizontal',
			value: 50,
			min: 0,
			max: 255,
			step: 20,
			
			change: function(event, ui ){
				//console.log('change :', $(this).slider('value'));
				console.log('change :', ui.value);
			}
			
			/*
			slide: function(event,ui) {
				console.log('slide :', ui.value);
			}
			*/
		});
	});

</script>
</head>
<body>

<div id="slider"></div>

</body>
</html>