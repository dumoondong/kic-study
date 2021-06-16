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
	out.println("Hello JSP<br />");

	JspWriter writer = pageContext.getOut();
	writer.println("Hello JSP<br />");
	
	out.println("out:"+out+"<br /");
	out.println("writer:"+writer+"<br />");
%>
</body>
</html>