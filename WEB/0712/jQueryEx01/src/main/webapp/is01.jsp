<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type = "text/javascript" src="./js/jquery-3.6.0.js"><</script>
<script type="text/javascript">
	$( document).ready(function(){
		$('h3').each(function(){
			if($(this).is('.s')){
				$(this).css('background-color','orange');
			}
		});
	});

</script>
</head>
<body>
<h2 class="s">Header-0</h2>
<h3 class="s">Header-1</h3>
<h2>Header-2</h2>
<h3 class="s">Header-3</h3>
<h3>Header-4</h3>
<h2>Header-5</h2>
</body>
</html>