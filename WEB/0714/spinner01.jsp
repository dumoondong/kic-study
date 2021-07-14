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
		$('#spinner').spinner({
			min: 5,
			max: 20,
			step: 5,
			spin: function(event, ui) {
				console.log(ui.value);
			}
		});
		
		$('#btn').button().on('click',function(){
			console.log($('#spinner').spinner('value'));
		});
	});

</script>
</head>
<body>
<input type="text" id="spinner" value="10" readonly="readonly"/>
<button id="btn">난 버튼</button>
</body>
</html>