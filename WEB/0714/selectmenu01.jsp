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
		$('#files').selectmenu({
			width: 500,
			change: function(event, ui) {
				console.log(ui.item.value);
			}
		});
	});

</script>
</head>
<body>

<select id="files">
	<optgroup labe="script1">
		<option disabled="disabled" selected="selected">선택</option>
		<option value="jquery">jquery</option>
		<option value="jqueryui">jqueryui</option>
	</optgroup>
	<optgroup labe="script2">
		<option value="jquerycore">jquerycore</option>
		<option value="jquerymobile">jquerymobile</option>
	</optgroup>
</select>

</body>
</html>