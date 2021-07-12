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
		$('h3').eq(0).css('background-color','red');
		$('h3').eq(1).css('background-color','blue');
		
		$('h3').eq(-4).css('background-color','yellow');
	});
</script>
</head>
<body>
<h3>Header-0</h3>
<h3>Header-1</h3>
<h3>Header-2</h3>
<h3>Header-3</h3>
<h3>Header-4</h3>
<h3>Header-5</h3>

</body>
</html>