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
		//태그선택자
		//$('h1').css('color','blue');
		//$('h2').css('color','blue');
		
		//$('h1' +'1').css('color','yellow');
		//const selector = 'h1';
		//const attribute = 'color';
		//const value= 'green';
		//$(selector).css(attribute,value);
		
		$('h1, h2').css({color: 'red'});
	});

</script>
</head>
<body>
<h1>Helloe jQuery</h1>
<h2>Helloe jQuery</h2>
<h1>Helloe jQuery</h1>
<h2>Helloe jQuery</h2>

</body>
</html>