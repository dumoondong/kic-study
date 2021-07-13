<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	div { 
		width: 300px;
		height: 300px;
		background-color: yellow;	
	}
	
</style>
<script type = "text/javascript" src="./js/jquery-3.6.0.min.js"><</script>
<script type="text/javascript">
	$( () => {
		$('div').on('click',(e) => {
			console.log(e);
			console.log(e.pageX);
			console.log(e.pageY);
			console.log(e.target);
		});
	});

</script>
</head>
<body>

<div></div>

</body>
</html>