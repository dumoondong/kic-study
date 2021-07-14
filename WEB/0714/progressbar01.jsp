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
		//
		console.log( $('#progressbar').progressbar('value'));
		//
		$('#progressbar').progressbar('value',50)
	});

</script>
</head>
<body>

<div id="progressbar"></div>

</body>
</html>