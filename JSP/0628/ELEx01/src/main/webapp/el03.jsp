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
	String name1 = "홍길동";
	// pageContext/pageScope, requestScope, sessionScope, applicationScope
	pageContext.setAttribute("name1", "박문수");
%>
name1 : <%= name1 %><br />
name1 : ${ name1 }<br />
<%
	out.println( pageContext.getAttribute("name1") + "<br />");
%>
name1 : ${pageScope.name1 }<br />
name1 : ${pageScope['name1'] }<br />
</body>
</html>