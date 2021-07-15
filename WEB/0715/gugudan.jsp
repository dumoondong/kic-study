<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./css/base/jquery-ui.css" />
<style type="text/css">
	/* 사용자 정의 CSS */
</style>
<script type = "text/javascript" src="./js/jquery-3.6.0.js"><</script>
<script type = "text/javascript" src="./js/jquery-ui.js"><</script>
<script type="text/javascript">
$( document).ready(function(){
	$('#start').spinner({
		min: 1,
		max: 8,
		spin: function(event,ui) {
			$('#end').spinner('value',ui.value+1);
		}
	});
	$('#end').spinner({
		min: 2,
		max: 9
	});
	$('#btn').button().on('click',() => {
		console.log($('#start').spinner('value'));
		console.log($('#end').spinner('value'));
	});
	
	$('#accordion').accordion({
		collapsible: true
	});
	
	$('#btn').button().on('click',function(){
		const start = $('#start').spinner('value');
		const end = $('#end').spinner('value');
		$('#accordion').empty();
		for(let i=start; i<=end; i++){
			let html = '<h3>'+i+'</h3>';
			html += '<div>';
			html += '	 <ul>';
			for(let j=1; j<=9; j++){
				html += '<li>'+i+'X'+j+'='+(i*j)+'</li>';
			}
			html += '	</ul>';
			html += '</div>';
			$('#accordion').append(html);
		}
		$('#accordion').accordion('refresh');
	});
});

</script>
</head>
<body>
<label for="start">시작단수:</label>
<input type="text" id="start" value="1" readonly="readonly"/>
<label for="start">끝단수:</label>
<input type="text" id="end" value="2" readonly="readonly"/>
<button id="btn">구구단 출력</button>
<br /><hr /><br />
<div id="accordion">

</div>
</body>
</html>