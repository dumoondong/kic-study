<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	canvas { 
		border: 1px solid black;
	}
	
</style>
<script type = "text/javascript" src="./js/jquery-3.6.0.min.js"><</script>
<script type="text/javascript">
	$( () => {
		const canvas = document.getElementById('canvas');
		const context = canvas.getContext('2d');
		
		$('#canvas').on({
			mousedown: (e) =>{
				context.beginPath();
				context.moveTo(e.pageX,e.pageY);
			},
			mouseup: (e) =>{
				context.lineTo(e.pageX,e.pageY);
				context.stroke();
			}
		});
	});

</script>
</head>
<body>

<canvas id="canvas" width="700" height="400"></canvas>


</body>
</html>