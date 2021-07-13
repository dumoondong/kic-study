<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type = "text/javascript" src="./js/jquery-3.6.0.min.js"><</script>
<script type="text/javascript">
	$(() => {
		//console.log($(document).find('h3'));
		//$(document).find('h3').each((index,item) => {
		//	console.log(index,item);
		//});
		$(document).find('.select').each((index,item) => {
			//console.log(index,item);
			console.log(index,item.innerHTML);
		});
	});
</script>
</head>
<body>

<h3 class="select">Header-0</h3>
<h2>Header-1</h2>
<h3 class="select">Header-2</h3>
<h2>Header-3</h2>
<h3 class="select">Header-4</h3>
<h2>Header-5</h2>


</body>
</html>