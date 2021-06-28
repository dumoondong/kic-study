<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- pageContext.setAttribute("data1","test1") -->
<%--<c:set var="data1" value="test1" scope="page"/> --%>
<c:set var="data1" value="test2" scope="request"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${data1 }<br />
</body>
</html>