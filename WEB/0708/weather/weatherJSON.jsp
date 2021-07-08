<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#sido, #gugun, #dong {
		width: 100px;
	}
</style>
<script type="text/javascript">
	window.onload = function() {
		document.getElementById( 'btn' ).onclick = function() {
			const request = new XMLHttpRequest();
			request.onreadystatechange = function() {
				if( request.readyState == 4 ) {
					if( request.status == 200 ) {
						const data = request.responseText.trim();
						const json = JSON.parse( data );
						
						let html = '<option value="00">시도선택</option>';
						for( let i=0 ; i<json.length ; i++ ) {
							html += '<option value="' + json[i].code + '">' + json[i].value + '</option>'; 
						}
						document.getElementById( 'sido' ).innerHTML = html;
						
					} else {
						alert( "Web Site Error" );
					}
				}
			};
			request.open( 'get', './data/proxy.jsp?url=1', true );
			request.send();
		};
		
		document.getElementById( 'sido' ).onchange = function() {
			//console.log( document.getElementById( 'sido' ).value );
			const code = document.getElementById( 'sido' ).value;
			
			const request = new XMLHttpRequest();
			request.onreadystatechange = function() {
				if( request.readyState == 4 ) {
					if( request.status == 200 ) {
						const data = request.responseText.trim();
						const json = JSON.parse( data );
						
						let html = '<option value="00">구군선택</option>';
						for( let i=0 ; i<json.length ; i++ ) {
							html += '<option value="' + json[i].code + '">' + json[i].value + '</option>'; 
						}
						document.getElementById( 'gugun' ).innerHTML = html;
						
					} else {
						alert( "Web Site Error" );
					}
				}
			};
			request.open( 'get', './data/proxy.jsp?url=2&code=' + code, true );
			request.send();
		};
		
		document.getElementById( 'gugun' ).onchange = function() {
			const code = document.getElementById( 'gugun' ).value;
			
			const request = new XMLHttpRequest();
			request.onreadystatechange = function() {
				if( request.readyState == 4 ) {
					if( request.status == 200 ) {
						const data = request.responseText.trim();
						const json = JSON.parse( data );
						
						let html = '<option value="00">동선택</option>';
						for( let i=0 ; i<json.length ; i++ ) {
							html += '<option value="' + json[i].code + '">' + json[i].value + '</option>'; 
						}
						document.getElementById( 'dong' ).innerHTML = html;
						
					} else {
						alert( "Web Site Error" );
					}
				}
			};
			request.open( 'get', './data/proxy.jsp?url=3&code=' + code, true );
			request.send();
		};
		
		document.getElementById( 'dong' ).onchange = function() {
			const code = document.getElementById( 'dong' ).value;
			
			const request = new XMLHttpRequest();
			request.onreadystatechange = function() {
				if( request.readyState == 4 ) {
					if( request.status == 200 ) {
						const xml = request.responseXML;
												
						const pubDate = xml.getElementsByTagName( 'pubDate' )[0].childNodes[0].nodeValue;
						const category = xml.getElementsByTagName( 'category' )[0].childNodes[0].nodeValue;
						const link = xml.getElementsByTagName( 'link' )[0].childNodes[0].nodeValue;
						const datas = xml.getElementsByTagName( 'data' );
						
						let html = '<table width="800" border="1">';
						html += '<tr>';
						html += '	<td width="100">날짜</td>';
						html += '	<td>' + pubDate + '</td>';
						html += '</tr>';
						html += '<tr>';
						html += '	<td>장소</td>';
						html += '	<td>' + category + '</td>';
						html += '</tr>';
						html += '<tr>';
						html += '	<td>링크</td>';
						html += '	<td>' + link + '</td>';
						html += '</tr>';
						html += '<tr>';
						html += '	<td>날씨데이터</td>';
						html += '	<td><textarea rows="10" cols="90">' + datas.toString() + '</textarea></td>';
						html += '</tr>';
						html += '</table>';
						
						document.getElementById( 'result' ).innerHTML = html;
					} else {
						alert( "Web Site Error" );
					}
				}
			};
			request.open( 'get', './data/proxy_xml.jsp?code=' + code, true );
			request.send();
		};
	};
</script>
</head>
<body>

<button id="btn">ajax 요청</button>

<br /><hr />

<select id="sido">
<option value="00">시도선택</option>
</select>

<select id="gugun">
<option value="00">구군선택</option>
</select>

<select id="dong">
<option value="00">동선택</option>
</select>

<br /><hr /><br />
<div id="result"></div>

</body>
</html>