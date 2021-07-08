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
						let data = request.responseXML;
						//console.log( data );
						
						
						const zipcodes = data.getElementsByTagName('zipcode');
						const sidos = data.getElementsByTagName('sido');
						const guguns = data.getElementsByTagName('gugun');
						const dongs = data.getElementsByTagName('dong');
						const ris = data.getElementsByTagName('ri');
						const bunjis = data.getElementsByTagName('bunji');
						
						for(let i=0; i<zipcodes.length; i++){
							let zipcode = zipcodes[i].childNodes[0].nodeValue;
							let sido = sidos[i].childNodes[0].nodeValue;
							let gugun = guguns[i].childNodes[0].nodeValue;
							let dong = dongs[i].childNodes[0].nodeValue;
							
							let ri = '';
							if(ris[i].childNodes[0] != null){
								let ri = ris[i].childNodes[0].nodeValue;
							}
							let bunji = '';
							if(bunjis[i].childNodes[0] != null){
								let bunji = bunjis[i].childNodes[0].nodeValue;
							}
							
							console.log(zipcode, sido, gugun, dong, ri, bunji);
						}
					} else {
						alert( "Web Site Error" );
					}
				}
				
			};
			request.open( 'get', './data/xml.jsp?dong=신사', true );
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