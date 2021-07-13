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
		// A.appendTO(B)
		// appendTO //prependTO
		// insertAfter / insertBefore
		// b append (A)
		// append / prepend
		// after / before
		//$('<h2>Hello jQuery</h2>').appendTo('div');
		
		document.getElementById('btn1').onclick = () => {
			$('<h2></h2>').html('Hello jQuery').appendTo('div');			
		};
		document.getElementById('btn2').onclick = () => {
			//$('<img />').attr('src','./images/Jellyfish.jpg').appendTo('div');	
			//$('<img />')
			//	.attr('src','./images/Jellyfish.jpg')
			//	.appendTo('width','521');	
			
			$('<img />')
			.attr({
				src: './images/Jellyfish.jpg',
				width: 521,
				height: 384
			})
			.appendTo('div');
		};
	});

</script>
</head>
<body>
<button id="btn1">html 추가</button>
<button id="btn2">html 추가</button>
<br /><hr /><br />
<div></div>
</body>
</html>