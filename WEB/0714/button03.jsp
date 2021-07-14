<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./css/vader/jquery-ui.css" />
<style type="text/css">
	/* 사용자 정의 CSS */
	body	{font-size: 80%;}
</style>
<script type = "text/javascript" src="./js/jquery-3.6.0.js"><</script>
<script type = "text/javascript" src="./js/jquery-ui.js"><</script>
<script type="text/javascript">
	$( document).ready(function(){
		$('#btn1').button({
			icon:'ui-icon-trash',
			//iconPosition: 'top'
			showLabel: false
		}).on('click',function(){
			alert('test');
		});
	});

</script>
</head>
<body>

<button id="btn1">버튼1</button><br /><br />
</form>
</body>
</html>