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
		$.ajax({
			url: './data/json.jsp',
			type: 'get',
			dataType: 'json',
			success: function(json) {
				const availableTags = json.data;
				console.log(availableTags);
				
			    $('#tags').autocomplete({
			    	source: availableTags
			    });
			},
			error: function(e) {
				alert('서버에러');
				console.log(e.status,e.responseText);
			}
		});
	    
	});

</script>
</head>
<body>

<label for="tag">Program Languages :</label>
<input type="text" id="tags" />



</body>
</html>