<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	h2 { 
		background-color: yellow;	}
</style>
<script type = "text/javascript" src="./js/jquery-3.6.0.min.js"><</script>
<script type="text/javascript">
	$( () => {
		//$('h2').on('click',function() {
		//	console.log('click 호출 :', $(this).html());
		//	console.log('click 호출 :', $(this).text());
		//});
		
		$('h2').on('click',function(){
			$(this).html((index,item) =>{
				return item + '*';
			});
		});
	});

</script>
</head>
<body>

<h2>이벤트-0</h2>
<h2>이벤트-1</h2>
<h2>이벤트-2</h2>

</body>
</html>