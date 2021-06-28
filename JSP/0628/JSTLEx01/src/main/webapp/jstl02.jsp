<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	pageContext.setAttribute("data", "browser");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
data : <%= pageContext.getAttribute("data") %><br />
data : ${data }<br />
data : <c:out value="${data }" /><br />
data1 : <c:out value="${data1 }" default="default browser" /><br />
</body>
</html>