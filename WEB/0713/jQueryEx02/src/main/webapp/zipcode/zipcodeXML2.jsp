<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../js/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
	$(() => {
		$('#btn').on('click', () => {
			$.ajax({
				//url: './data/xml.jsp?dong=신사',
				url: './data/xml.jsp',
				type: 'get',
				data: {
					dong: '신당'
				},
				dataType: 'xml',
				success: function( data ) {
					const zipcodes = data.getElementsByTagName( 'zipcode' );
					const sidos = data.getElementsByTagName( 'sido' );
					const guguns = data.getElementsByTagName( 'gugun' );
					const dongs = data.getElementsByTagName( 'dong' );
					const ris = data.getElementsByTagName( 'ri' );
					const bunjis = data.getElementsByTagName( 'bunji' );
					
					for( let i=0 ; i<zipcodes.length ; i++ ) {
						let zipcode = zipcodes[i].childNodes[0].nodeValue;
						let sido = sidos[i].childNodes[0].nodeValue;
						let gugun = guguns[i].childNodes[0].nodeValue;
						let dong = dongs[i].childNodes[0].nodeValue;
						
						let ri = '';
						if( ris[i].childNodes[0] != null ) {
							ri = ris[i].childNodes[0].nodeValue;
						}
						let bunji = '';
						if( bunjis[i].childNodes[0] != null ) {
							bunji = bunjis[i].childNodes[0].nodeValue;
						}
						
						console.log( zipcode, sido, gugun, dong, ri, bunji );
					}

				},
				error: function(error) {
					alert( "Web Site Error" );
					console.log( '실패 : ', error.status );
					console.log( '실패 : ', error.responseText );
				}
			});			
		});
	});
</script>
</head>
<body>

<button id="btn">ajax 요청</button>
<br /><hr /><br />
<div id="result"></div>

</body>
</html>