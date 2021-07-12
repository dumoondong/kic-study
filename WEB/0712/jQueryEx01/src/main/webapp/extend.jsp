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
		let object = {name: '홍길동'};
		
		//object.region1 = '서울시 종로구';
		//object.part1 = '리더';
		
		console.log(object);
		
		$.extend( object,
				{region2:' 서울시 양천구',part2:' 베이스'},
				{region3:' 서울시 서초구',part3:' 베이스'}
		);
		console.log(object);
	});

</script>
</head>
<body>

</body>
</html>