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
						//let data1 = request.responseText.trim();
						//console.log(data1);
						let data2 = request.responseXML;
						console.log(data2);
	
						const names = data2.getElementsByTagName('name');
						const publishers = data2.getElementsByTagName('publishers');
						const authors = data2.getElementsByTagName('authors');
						const prices = data2.getElementsByTagName('prices');
						//console.log(names);
						//console.log(names.length);
						//console.log(names[0].childNodes[0].nodeValue);
						//console.log(names[0].innerHTML);
						
						for(let i=0; i<names.length; i++){
							let nameValue=names[i].childNodes[0].nodeValue;
							let publisherValue=publishers[i].childNodes[0].nodeValue;
							let authorValue=authors[i].childNodes[0].nodeValue;
							let priceValue=prices[i].childNodes[0].nodeValue;
							
							console.log(nameValue,publisherValue,authorValue,priceValue);
						}
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