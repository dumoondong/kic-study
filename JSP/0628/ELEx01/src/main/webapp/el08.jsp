<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="model1.BoardTO" %>
<%@ page import="java.util.HashMap" %>
<%
	BoardTO to1 = new BoardTO();
	to1.setSubject("제목1");
	to1.setWriter("저자1");
	
	BoardTO to2 = new BoardTO();
	to2.setSubject("제목2");
	to2.setWriter("저자2");
	
	HashMap<String,BoardTO> lists = new HashMap();
	lists.put("to1",to1);
	lists.put("to2",to2);
	pageContext.setAttribute("lists", lists);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
제목 : ${ lists.to1.subject }<br />
저자 : ${ lists.to1.writer }<br />
제목 : ${ lists.to2.subject }<br />
저자 : ${ lists.to2.writer }<br />
</body>
</html>