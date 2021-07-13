<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function() {
		document.getElementById( 'btn' ).onclick = function() {
			const request = new XMLHttpRequest();
			request.onreadystatechange = function() {
				if( request.readyState == 4 ) {
					if( request.status == 200 ) {
						const data = request.responseText.trim();
						const json = JSON.parse(data);
						
						for(let i=0; i<json.length; i++){
							console.log(json[i].zipcode);
							console.log(json[i].sido);
						}
						
					} else {
						alert( "Web Site Error" );
					}
				}
				
			};
			request.open( 'get', './data/data.jsp?dong=신사', true );
			request.send();
		};
	};
</script>
</head>
<body>

<button id="btn">ajax 요청</button>
<br /><hr /><br />
<div id="result"></div>

</body>
</html>