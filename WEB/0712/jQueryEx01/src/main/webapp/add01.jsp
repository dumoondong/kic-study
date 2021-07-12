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
		//$('h2,h3').css('background-color','blue');

		$('h2').css('background-color','red').add('h3').css('background-color','blue');
	});

</script>
</head>
<body>
<h2>Header-0</h2>
<h3>Header-1</h3>
<h2>Header-2</h2>
<h3>Header-3</h3>
</body>
</html>