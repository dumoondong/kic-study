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
		$('h3').filter(function(index, item) {
			//each
			//console.log(item);
			
			//let flag = false;
			//if(index % 2 ==0){
			//	flag = true;
			//}
			//return flag;
			return index % 2 ==0;
		}).css('background-color', 'blue');
	});

</script>
</head>
<body>
<h3>Header-0</h3>
<h3>Header-1</h3>
<h3>Header-2</h3>
<h3>Header-3</h3>
<h3>Header-4</h3>
<h3>Header-5</h3>

</body>
</html>