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
		document.getElementById('btn1').onclick = () => {
			$( 'div' ).remove();
		};
		document.getElementById('btn2').onclick = () => {
			$( 'div' ).empty();
		};
	});

</script>
</head>
<body>
<button id="btn1">제거 1</button>
<button id="btn2">제거 2</button>
<br /><hr /><br />
<div>
	<h2>Header-0</h2>
	<h2>Header-1</h2>
	<h2>Header-2</h2>
</div>
</body>
</html>