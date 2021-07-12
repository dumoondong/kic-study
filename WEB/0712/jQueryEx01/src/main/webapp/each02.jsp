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
		$('h2').each(function(index,item) {
			//console.log(index,item);
			console.log(item.innerHTML);
		});
	});

</script>
</head>
<body>
<h2>item-0</h2>
<h2>item-1</h2>
<h2>item-2</h2>
<h2>item-3</h2>
</body>
</html>