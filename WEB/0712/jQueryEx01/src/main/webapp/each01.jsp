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
		//each
		const array = [
			{name:'daum',link: 'https://www.daum.net'},
			{name:'naver',link: 'https://www.naver.com'},
			{name:'google',link: 'https://www.google.com'}
		];
		
		for(let i=0; i<array.length; i++){
			//console.log(array[i].name,' / ',array[i].link);
		}
		//함수적인 처리
		array.forEach( function(item) {
			//console.log(item.name,' / ',item.link);
		} )
		
		//$.each(array,function(index,item){
			//console.log(item.name,' / ',item.link);
		//});
		
		let output = '';
		$.each(array,function(index,item){
			output += '<a href="'+item.link+'">';
			output += '<h3>'+item.name+'</h3>';
			output += '</a>';
		});
		
		//document.body.innerHTML = output;
		
		const object = {name:'홍길동',region: '서울시 강남구', part:'베이스'};
		$.each(object,function(key,value) {
			console.log(key,' / ',value);
		});
	});

</script>
</head>
<body>

</body>
</html>