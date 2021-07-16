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
	body {font-size:80%}
	
	#draggable {
		width:90px;
		height: 80px;
		padding: 5px;
		float: left;
		margin: 0 10px 10px 0;
		font-size: 0.9em;
	}
	
		#droppable {
		width:150px;
		height: 150px;
		padding: 5px;
		float: left;
		margin: 0 10px 10px 0;
		font-size: 0.9em;
	}
</style>
<script type = "text/javascript" src="./js/jquery-3.6.0.js"><</script>
<script type = "text/javascript" src="./js/jquery-ui.js"><</script>
<script type="text/javascript">
	$( document).ready(function(){
		$('#draggable').draggable();
		$('#droppable').droppable({
			drop: function() {
				//console.log($(this).html());
				$(this).find('p').html('Dropped!');
			}
		});
			
	});

</script>
</head>
<body>

<div id="draggable" class="ui-widget-content">
	<p>Default</p>
</div>

<div id="droppable" class="ui-widget-content">
	<p>Move</p>
</div>

</body>
</html>