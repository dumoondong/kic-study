<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type = "text/javascript" src="./js/jquery-3.6.0.js"><</script>
<script type="text/javascript">
	$( document).ready(function(){
		// 속성
		// 요소[속성=값]
		//$('input[type="text"]').css('background','red');
		//$('input[data="text"]').css('background','yellow');
		
		//$('input[type^="te"]').css('background','yellow');
		$('input[type$="rd"]').css('background','yellow');
	});

</script>
</head>
<body> 
<input type = "text" data = "text" /><br /><br />
<input type = "password" data = "text" /><br /><br />

</body>
</html>