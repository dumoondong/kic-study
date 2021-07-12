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
		//입력양식
		//$('input[type:text]').css('background','yellow');
		
		document.getElementById('btn').onclick = function(){
			console.log( $('select>option:selected').text() );
		};
	});

</script>
</head>
<body> 

<select id="sel">
	<option selected>사과</option>
	<option>수박</option>
	<option>딸기</option>
	<option>참외</option>
</select>
<button id="btn">선택</button>
</body>
</html>