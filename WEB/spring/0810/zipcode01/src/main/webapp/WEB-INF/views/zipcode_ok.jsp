<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="model1.ZipcodeTO" %>

<%
	ArrayList<ZipcodeTO> lists = (ArrayList)request.getAttribute("lists");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	out.println( "<table width='800' border='1'>" );
	for( ZipcodeTO to : lists) {
		out.println( "<tr>" );
		out.println( "	<td>" + to.getZipcode() + "</td>" );	
		out.println( "	<td>" + to.getSido() + "</td>" );
		out.println( "	<td>" + to.getGugun() + "</td>" );
		out.println( "	<td>" + to.getDong() + "</td>" );
		out.println( "	<td>" + to.getRi() + "</td>" );
		out.println( "	<td>" + to.getBunji() + "</td>" );
		out.println( "</tr>" );
	}
	out.println( "</table>" );
%>
</body>
</html>
