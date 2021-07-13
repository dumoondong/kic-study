<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type = "text/javascript" src="./js/jquery-3.6.0.min.js"><</script>
<script type="text/javascript">
	$( document).ready(function(){
		document.getElementById('btn1').onclick = () => {
			//가장 상위에 한개의 내용만 출력
			//console.log($('img').attr('src' ));	
			
			$('img').each(function(){
				console.log($(this).attr('src'));
			});
		};
		document.getElementById('btn2').onclick = () => {
			$('img').attr('height',100);
			//$('img').attr('width',100);
			
			//$('img').attr('width',(index) => {
			//	return (index + 1) * 100;
			//});
		};
		
		document.getElementById('btn3').onclick = () => {
			$('img').removeAttr('height');
		};
	});

</script>
</head>
<body>
<button id="btn1">att 내용</button>
<button id="btn2">att 추가</button>
<button id="btn3">att 제거</button>
<br /><hr /><br />

<img src="./images/Chrysanthemum.jpg" width="150" />
<img src="./images/Desert.jpg" width="150" />
<img src="./images/Hydrangeas.jpg" width="150" />
<img src="./images/Jellyfish.jpg" width="150" />

</body>
</html>