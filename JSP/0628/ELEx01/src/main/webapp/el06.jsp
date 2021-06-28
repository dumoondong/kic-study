<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="model1.BoardTO" %>
<%
	BoardTO to = new BoardTO();
	to.setSubject("제목");
	to.setWriter("저자");
	
	//pageContext.setAttribute("to", to);
	request.setAttribute("to", to);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
제목 : ${ to.subject }<br />
저자 : ${ to.writer }<br />
</body>
</html>