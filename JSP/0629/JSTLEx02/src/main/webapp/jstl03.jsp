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
시작<br />
<c:if test="true">
	무조건 실행<br />
</c:if>
끝<br />

<c:set var="country" value="korea" />
<c:if test="${country == 'korea' }" >
	한국입니다.<br />
</c:if>
</body>
</html>