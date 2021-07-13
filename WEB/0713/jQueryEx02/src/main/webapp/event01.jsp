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
		//$('#btn1').on('click', ()=>{
		//	alert('btn1 click');
		//});
		
		//$('#btn2').on('click', ()=>{
		//	alert('btn2 click');
		//});
		
		/*
		$('button').on('click', function(){
			//alert('btn click');
			//console.log($(this).text());
			console.log($(this).attr('id'));
		});
		*/
		$('#btn1').click(()=>{
			alert('btn1 click');
		});
	});

</script>
</head>
<body>
<button id="btn1">버튼 1</button>
<button id="btn2">버튼 2</button>
</body>
</html>