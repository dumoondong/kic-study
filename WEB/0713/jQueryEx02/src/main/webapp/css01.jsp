<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.first {color:red;}
	.second{color:pink;}
	.third {color:orange;}
</style>
<script type = "text/javascript" src="./js/jquery-3.6.0.min.js"><</script>
<script type="text/javascript">
	$( document).ready(function(){
		document.getElementById('btn1').onclick = () => {
			//console.log($('h3').css('color'));
			$('h3').css('color',(index,item)=>{
				console.log(index,item);
			});
		};
		document.getElementById('btn2').onclick = () => {
			//전체
			//$('h3').css('color','cyan');
			const colors = ['purple','black','red'];
			
			$('h3').css('color',(index) => {
				return colors[index];
			});
		};
	});

</script>
</head>
<body>
<button id="btn1">css 내용</button>
<button id="btn2">css 추가</button>
<br /><hr /><br />

<h3 class="first">Header-0</h3>
<h3 class="second">Header-1</h3>
<h3 class="third">Header-2</h3>

</body>
</html>