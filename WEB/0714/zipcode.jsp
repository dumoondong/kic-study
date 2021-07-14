<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/base/jquery-ui.css" />
<style type="text/css">
</style>
<script type="text/javascript" src="../js/jquery-3.6.0.js"></script>
<script type="text/javascript" src="../js/jquery-ui.js"></script>
<script type="text/javascript">
	$( document ).ready(() => {
		$( '#sido' ).selectmenu({
			width: 150,
			change: function( event, ui ) {
				alert( ui.item.value );
			}
		});
		
		$( '#gugun' ).selectmenu({
			width: 150
		});
		
		$( '#dong' ).selectmenu({
			width: 150
		});
		
		$.ajax({
			url: './data/sido.jsp',
			type: 'get',
			dataType: 'json',
			success: ( json ) => {
				$.each( json, ( index, item ) => {
					var html = '<option>' + item.sido + '</option>';
					$( '#sido' ).append( html );
				});
			},
			error: () => {
				alert( '서버 에러' )
			}
		});
	});
</script>
</head>
<body>
<fieldset>
	<legend>우편번호 검색</legend>
	<select id="sido">
		<option disabled="disabled" selected="selected">시도 선택</option>
	</select>
	<select id="gugun">
		<option disabled="disabled" selected="selected">구군 선택</option>
	</select>
	<select id="dong">
		<option disabled="disabled" selected="selected">동 선택</option>
	</select>
</fieldset>
<div id="result"></div>
</body>
</html>
