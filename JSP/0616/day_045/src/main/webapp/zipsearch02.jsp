<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="model1.ZipcodeDAO" %>
<%@ page import="model1.ZipcodeTO" %>
<%@ page import="java.util.ArrayList" %>
<%
	request.setCharacterEncoding( "utf-8" );

	
	String dong = request.getParameter("dong");
	
	ZipcodeDAO dao = new ZipcodeDAO();

%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table { border: 1px solid black; font-size: 15px; border-collapse: collapse; }
	td.input { width: 600px; padding: 10px; text-align: center; border: 1px solid black; }
	td.result { width: 150px; padding: 10px; border: 1px solid black; }
</style>
<script type="text/javascript">
	window.onload = function() {
		document.getElementById( 'btn' ).onclick= function() {
			const dong = document.getElementById( 'dong' ).value;
			if( dong.length < 2 ) {
				alert( '동이름을 2자 이상 입력하셔야 합니다.' );
				return;
			}
			document.frm.submit();
		};
	};
</script>
</head>
<body>
<form action="zipsearch02.jsp" method="post" name="frm">
<table>
<tr>
	<td class="input" align="absmiddle">
		<input type="text" name="dong" id="dong" size="40" placeholder="동이름 입력"/>
		<input type="button" id="btn" value="우편번호검색">
	</td>
</tr>
</table>
</form>
<hr />

</body>
</html>
