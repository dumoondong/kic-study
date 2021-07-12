<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type = "text/javascript" src="./js/jquery-3.6.0.js"><</script>
<script type="text/javascript">
	$( document).ready( () => {
		$('table').css('width','800');
		$('tr:nth-child(3n)').css('background-color','red');
		$('tr:nth-child(3n+1)').css('background-color','blue');
		$('tr:nth-child(3n+2)').css('background-color','yellow');
		//$('tr:nth-child(3n)').css('background-color','blue');

		
		$('tr:eq(0)').css({
			'background-color': '#000000',
			'color': '#ffffff'
		});
	});

</script>
</head>
<body> 

<table>
<tr>
	<td>이름</td>
	<td>혈액형</td>
	<td>지역</td>
</tr>
<tr>
	<td>홍길동</td>
	<td>AB형</td>
	<td>서울시 송파구</td>
</tr>
<tr>
	<td>박문수</td>
	<td>B형</td>
	<td>서울시 구로구</td>
</tr>
<tr>
	<td>이몽룡</td>
	<td>A형</td>
	<td>서울시 마포구</td>
</tr>
<tr>
	<td>성춘향</td>
	<td>A형</td>
	<td>서울시 강서구</td>
</tr>
<tr>
	<td>홍길동</td>
	<td>AB형</td>
	<td>서울시 송파구</td>
</tr>
<tr>
	<td>박문수</td>
	<td>B형</td>
	<td>서울시 구로구</td>
</tr>
<tr>
	<td>이몽룡</td>
	<td>A형</td>
	<td>서울시 마포구</td>
</tr>
<tr>
	<td>성춘향</td>
	<td>A형</td>
	<td>서울시 강서구</td>
</tr>

</table>
</body>
</html>