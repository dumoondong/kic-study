<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>        
<!-- form_ok.jsp -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	java.util.Enumeration e = request.getParameterNames();
	while(e.hasMoreElements()){
		String key = (String)e.nextElement();
		out.println( "키값 : " + key + "<br />");
	}
	out.println( request.getParameter("data1") + "<br />");
	out.println( request.getParameter("data2") + "<br />");
	out.println( request.getParameter("data3") + "<br />");
%>

</body>
</html>