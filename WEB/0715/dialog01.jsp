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
		$('#dialog').dialog({
			autoOpen: false,
			model: true,
			width: 500,
			height: 300,
			resizable: false,
			buttons:{
				'취소': function(){
					alert('취소');
					$(this).dialog('close');
				},
				'확인':function(){
					alert('확인');
					$(this).dialog('close');
				}
			},
			show: {
				effect: 'blind',
				duration: 1000,
			},
			hide: {
				effect: 'explode',
				duration: 1000
			}
		});
		
		$('#btn1').button().on('click',function(){
			$('#dialog').dialog('open');
		});
		
		$('#btn2').button().on('click',function(){
			$('#dialog').dialog('close');
		});
	});

</script>
</head>
<body>
<button id="btn1">열기</button>
<button id="btn2">닫기</button>
<div id="dialog" title="jQuery Dialog">
	<h1>Hello jQuery</h1>
</div>

</body>
</html>