<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type = "text/javascript" src="./js/jquery-3.6.0.min.js"><</script>
<script type="text/javascript">
	$( () => {
		document.getElementById('btn1').onclick = () => {
			
			//const html = document.getElementById('result');
			//console.log(html);
			//console.log(html.innerHTML);
			//console.log(html.textContent);
			
			console.log($('#reuslt'));
			console.log($('#result').html());
			console.log($('#result').text());
		};
	
		document.getElementById('btn2').onclick = () => {
			//$('#result').html('<b>새롭게 변경된 내용</b>');
			$('#result').text('<b>새롭게 변경된 내용</b>');
		};
	});

</script>
</head>
<body>
<button id="btn1">내용</button>
<button id="btn2">추가</button>
<br /><hr /><br />
<div id="result"><b>출력 내용</b></div>
</body>
</html>