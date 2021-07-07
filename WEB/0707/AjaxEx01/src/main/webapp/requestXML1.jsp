<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function(){
		document.getElementById('btn').onclick = function() {
			const request = new XMLHttpRequest();
			request.onreadystatechange = function name() {
				if(request.readyState == 4){
					if(request.status == 200){
						let data = request.responseText.trim();
						
						data = data.replace(/<books>/g,'');
						data = data.replace(/<\books>/g,'');
						data = data.replace(/<book>/g,'');
						data = data.replace(/<\book>/g,'');
						data = data.replace(/<name>/g,'');
						data = data.replace(/<publisher>/g,'');
						data = data.replace(/<author>/g,'');
						data = data.replace(/<price>/g,'');
						data = data.replace(/<\/name>/g,',');
						data = data.replace(/<\/publisher>/g,'',);
						data = data.replace(/<\/author>/g,',');
						data = data.replace(/<\/price>/g,'\n');
						
						console.log(data);
						
						
						const rowdatas = data.trim().split('\n');
						
						console.log(rowdatas.length);
						console.log(rowdatas[0]);
						
						let result = '<table border ="1" >';
						for(let i=0; i<rowdatas.length; i++){
							let coldatas = rowdatas[i].split(',');
							
							result += '<tr>';
							result += '<td>'+coldatas[0] + '</td>';
							result += '<td>'+coldatas[1] + '</td>';
							result += '<td>'+coldatas[2] + '</td>';
							result += '<td>'+coldatas[3] + '</td>';
							result += '</tr>';
						}
						result += '<table>';
						
						document.getElementById('result').innerHTML += result;
					}else{
						alert("Web Site Error");
					}
				}
			}
			request.open('get','./data/xml2.jsp',true);
			request.send();
		};
	};
</script>
</head>
<body>

<button id="btn">ajax 요청하기</button>
<br /><hr /><br />
<div id="result"></div>
</body>
</html>