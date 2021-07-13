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
		//$.ajax();
		//url
		//data
		//type : get/post
		//async :
		//dataType
		//이벤트
		//success
		//error
		
		$('#btn').on('click',() => {
			$.ajax({
				url: './data/json1.jsp?dong=신사',
				type: 'get',
				//dataType: 'text',
				//dataType: 'xml',
				dataType: 'json',
				success: function(data) {
					console.log(typeof(data));
					console.log(data)
				},
				error: function() {
					console.log('실패');
				}
			});
		});
	});

</script>
</head>
<body>
<button id="btn">연결</button>
</body>
</html>