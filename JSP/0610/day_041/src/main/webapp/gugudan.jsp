<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- guguan -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function(){
		document.getElementById("btn").onclick = function(){
			//alert('test');
			const startdan = document.frm.startdan.value;
			const enddan = document.frm.enddan.value;
			
			if(startdan.trim() == '' || enddan.trim() == ''){
				alert('값을 입력해주세요');
				return;
			}
			
			document.frm.submit();
		};
	};

</script>
</head>
<body>
<form action="gugudan_ok.jsp" method="post" name="frm">
시작단<input type="text" name="startdan" />
-
끝단<input type="text" name="enddan" />
<input type="button" id="btn" value="구구단 출력"/>
</body>
</html>