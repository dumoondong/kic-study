<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
1<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//전송 헤더 출력
	java.util.Enumeration e = request.getHeaderNames();
	while(e.hasMoreElements()){
		String headerName = (String)e.nextElement();
		String headerValue = request.getHeader(headerName);
		
		out.println(headerName + " : " + headerValue + "<br />");
	}
%>
<hr />
${header['host'] }<br />
${header['user-agent'] }<br />
${header.host }<br />
${header.user-agent }<br />
<hr />

${ pageContext.request.requestURI }<br />
${ pageContext.request.remoteAddr }<br />
</body>
</html>