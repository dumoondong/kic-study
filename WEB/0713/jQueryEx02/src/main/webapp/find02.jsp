<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type = "text/javascript" src="./js/jquery-3.6.0.min.js"><</script>
<script type="text/javascript">
	let xml = '';
	xml += '<friends>';
	xml += '	<friend>';
	xml += '		<name>tester1</name>';
	xml += '		<language>Ruby</language>';
	xml += '	</friend>';
	xml += '	<friend>';
	xml += '		<name>tester2</name>';
	xml += '		<language>Basic</language>';
	xml += '	</friend>';	
	xml += '	<friend>';
	xml += '		<name>tester3</name>';
	xml += '		<language>Javascript</language>';
	xml += '	</friend>';
	xml += '</friends>';
	
	$(() => {
		console.log(typeof(xml));
		const xmlDoc = $.parseXML(xml);
		console.log(typeof(xmlDox));
		//console.log($(xmlDoc).find('friend'));
		
		$(xmlDoc).find('friend').each(function(){
			//console.log(this);
			//console.log($(this));
			console.log($(this).find('name').text());
			console.log($(this).find('language').text());
		});
	});
</script>
</head>
<body>


</body>
</html>