<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	ArrayList<String> lists = (ArrayList)request.getAttribute("lists");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	out.println("데이터 갯수:" +lists.size() + "<br /><br />");	
	for(String list: lists){
		out.println(list + "<br />");
	}

%>

</body>
</html>