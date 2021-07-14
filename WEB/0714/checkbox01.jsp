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
		$('input[type="checkbox"]').checkboxradio();
		//icon: false
	});

</script>
</head>
<body>
<fieldset>
	<legend>Ratings</legend>
	<label for="cb1">2 Star</label>
	<input type="checkbox" name="cb1" id="cb1" />
	<label for="cb2">3 Star</label>
	<input type="checkbox" name="cb2" id="cb2" />
	<label for="cb3">4 Star</label>
	<input type="checkbox" name="cb3" id="cb3" />
	<label for="cb4">5 Star</label>
	<input type="checkbox" name="cb4" id="cb4" />
	<br /><br />
	<button>테스트</button>
</fieldset>

</body>
</html>