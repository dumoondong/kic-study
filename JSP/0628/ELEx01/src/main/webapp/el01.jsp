<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page isELIgnored="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table width="800" border="1">
<tr>
	<td width="300"></td>
	<td><%= 2 %></td>
</tr>
<tr>
	<td>\${2 }/\${ "2" }</td>
	<td>\${2 }/ ${ "2" }</td>
</tr>
<tr>
	<td></td>
	<td><%-- <%= data %> --%> %></td>
</tr>
<tr>
	<td></td>
	<td>데이터 : ${data }</td>
</tr>
</table>
</body>
</html>