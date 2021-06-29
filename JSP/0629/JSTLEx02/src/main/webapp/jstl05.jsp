<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="hakjum" value="90" />
<c:choose>
	<c:when test="${hakjum >= '90' }">
		<c:out value="${hakjum }" />의 학점은 A
	</c:when>
	<c:when test="${hakjum >= '80' }">
		<c:out value="${hakjum }" />의 학점은 B
	</c:when>
	<c:when test="${hakjum >= '70' }">
		<c:out value="${hakjum }" />의 학점은 C
	</c:when>
	<c:otherwise>
		D
	</c:otherwise>
</c:choose>
</body>
</html>