<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type = "text/javascript" src="./js/jquery-3.6.0.min.js"><</script>
<script type="text/javascript">
	$( () => {
		document.getElementById('btn').onclick = () => {
			console.log($('#startdan').val());
			console.log($('#enddan').val());
			
			$('#result').html('test');
		}
	});

</script>
</head>
<body>

시작단 <input type ="text" id="startdan" />
~
끝단<input type ="text" id="enddan" />

<button id="btn">구구단 출력</button>
<br /><hr /><br />
<div id="result"></div>
</body>
</html>