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
		//자손 / 후손
		//$('div> *').css('color','red');
		$('div *').css('color','red');
	});

</script>
</head>
<body> 
<div>
	<ul>
		<li>사과</li>
		<li>수박</li>
		<li>딸기</li>
	</ul>
	<ul>
		<li>사과</li>
		<li>수박</li>
		<li>딸기</li>
	</ul>
</div>
</body>
</html>