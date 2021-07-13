<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	h2 { 
		background-color: yellow;	
	}
	
	.reverse {
		background-color: black;
		color: white;
	}
</style>
<script type = "text/javascript" src="./js/jquery-3.6.0.min.js"><</script>
<script type="text/javascript">
	$( () => {
		/*
		$('h2').on('mouseenter', function() {
			$(this).addClass('reverse');
		});
		
		$('h2').on('mouseleave', function() {
			$(this).removeClass('reverse');
		});
		*/
		/*
		$('h2').on({
			mouseenter: function(){
				$(this).addClass('reverse')
			},
			mouseleave: function(){
				$(this).removeClass('reverse')
			},
		});
		*/
		$('h2').hover(
			function(){
				$(this).addClass('reverse')
			},
			function(){
				$(this).removeClass('reverse')
			}
		);
	});

</script>
</head>
<body>

<h2>이벤트-0</h2>
<h2>이벤트-1</h2>
<h2>이벤트-2</h2>

</body>
</html>