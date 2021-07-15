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
<script type = "text/javascript" src="./js/i18n/datepicker-ko.js"><</script>
<script type="text/javascript">
	$( document).ready(function(){
		$('#datepicker1').datepicker({
			numberOfMonths: 3,
			dateFormat: 'yy-mm-dd',
			showAnim: 'slide'
		});
	});

</script>
</head>
<body>
Date : <input type="text" id= "datepicker1" readonly="readonly" />
<br /><br />
Date : <input type="date" />
</body>
</html>