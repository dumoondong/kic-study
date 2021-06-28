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
	pageContext.setAttribute("name1", "홍길동");
	request.setAttribute("name2", "박문수");
	session.setAttribute("name3", "성춘향");
	application.setAttribute("name4", "이몽룡");
	
	//pageContext.setAttribute("name", "홍길동");
	request.setAttribute("name", "박문수");
	session.setAttribute("name", "성춘향");
	application.setAttribute("name", "이몽룡");
%>
${ pageScope.name1 }<br />
${ requestScope.name2 }<br />
${ sessionScope.name3 }<br />
${ applicationScope.name4 }<br />

${name }<br />
</body>
</html>