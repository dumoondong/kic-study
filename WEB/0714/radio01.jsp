<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./css/base/jquery-ui.css" />
<style type="text/css">
	/* 사용자 정의 CSS */
</style>
<script type = "text/javascript" src="./js/jquery-3.6.0.js"><</script>
<script type = "text/javascript" src="./js/jquery-ui.js"><</script>
<script type="text/javascript">
	$( document).ready(function(){
		$('input[type="radio"]').checkboxradio({
			icon: false
		})
		.on('click', function() {
			alert('change');
		});
	});

</script>
</head>
<body>
<fieldset>
	<legend>Ratings</legend>
	<label for="cb1">2 Star</label>
	<input type="radio" name="cb" id="cb1" />
	<label for="cb2">3 Star</label>
	<input type="radio" name="cb" id="cb2" />
	<label for="cb3">4 Star</label>
	<input type="radio" name="cb" id="cb3" />
	<label for="cb4">5 Star</label>
	<input type="radio" name="cb" id="cb4" />
</fieldset>

</body>
</html>