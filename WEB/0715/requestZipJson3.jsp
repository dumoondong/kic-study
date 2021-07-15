<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./css/base/jquery-ui.css"/>
<style type="text/css">
	/* 사용자 정의 css */
	body	{ font-size: 80%;}
</style>
<script type="text/javascript" src="./js/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src="./js/jquery-ui.js"></script>
<script type="text/javascript">
	$(()=> {
		getLoadInfo('sido');
		
		$('#sido').selectmenu({
			width: 150,
			change: function(event, ui){
				console.log(ui.item.value);
				getLoadInfo('gugun',ui.item.value);
			}
		});
		$('#gugun').selectmenu({
			width: 150,
			change: function(event, ui){
				sidoInfo = sido;
				gugunInfo = ui.item.value;
				console.log($('#sido').selectmenu('value'),ui.item.value));
				getLoadInfo('dong',$('#sido').selectmenu('value'),ui.item.value);
			}
		});
		$('#dong').selectmenu({
			width: 150,
			change: function(event, ui){
			}
		});
		
		//가변함수
		// type ( sido, gugun, dong )
		// getLoadInfo('sido')
		// getLoadInfo('gugun', sido)
		// getLoadInfo('dong', sido,gugun)
		// getLoadInfo('address', sido,gugun,dong)
		function getLoadInfo() {
			let commonUrl = './data/'+arguments[0]+'.jsp';
			console.log('commonUrl : ',commonUrl); // ./data/sido.jsp
			
			if (arguments[0] == 'gugun'){
				commonUrl += '?sido='+arguments[1];
				console.log('commonUrl : ',commonUrl);
			}
			
			if (arguments[0] == 'dong'){
				commonUrl += '?sido='+arguments[0]+'&gugun='+arguments[1];
				console.log('commonUrl : ',commonUrl);
			}
			

			
			$.ajax({
				url: commonUrl, 
				type: 'get',
				dataType: 'json',
				success: ( json ) => {
					console.log('json : ',json);
					// 기존 데이터 삭제
					// 1.
					/*
					$('#' + zip).empty();
					let html = '';
					
					$.each( json, (index, item) => {
						html = '<option value= "'+item[zip]+'">'+item[arguments[0]]+'</option>';
					}); 
					console.log('html : ',html);
					$('#'+arguments[0]).append( html );
					*/
					let html = '<option disabled="disabled" selected="selected">선택</option>';
					$.each( json, (index, item) => {
						html = '<option value="'+item[arguments[0]]+'">'+item[arguments[0]]+'</option>';
					}); 
					console.log('html : ',html);
					$('#'+arguments[0]).append( html );
					//새로고침
					$('#'+arguments[0]).selectmenu( 'refresh' );
				},
				error: () => {
					alert('서버 에러');
				}
			});
		}
	});
</script>
</head>
<body>
	<fieldset>
		<legend>우편번호 검색</legend>
		<!-- 시 / 군 / 구 선택 -->
		<select id="sido">
			<option disabled="disabled" selected="selected">시도 선택</option>
		</select> <select id="gugun">
			<option disabled="disabled" selected="selected">구군 선택</option>
		</select> <select id="dong">
			<option disabled="disabled" selected="selected">동 선택</option>
		</select>
	</fieldset>

	<div id="result"></div>

</body>
</html>