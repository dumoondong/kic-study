<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	//지역변수
	int num1 = 10;
	out.println("Hello JSP 1<br/>");
	out.println("Hello JSP :"+num1+"<br />");
%>
<%= "Hello JSP 1<br/>" %>
<%= "Hello JSP :"+num1+"<br />" %>
</body>
</html>