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
		//$('h3:even').css({
		//	backgroundColor: 'black',
		//	color:'white'
		//});
		
		//$('h3').filter(':even').css({
		//$('h3').filter(':odd').css({
		//	backgroundColor: 'black',
		//	color:'white'
		//});
		
		const h3 = $('h3');
		console.log(h3);
		
		h3.filter(':even').css('background-color', 'black');
		h3.filter(':odd').css('background-color', 'green');
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