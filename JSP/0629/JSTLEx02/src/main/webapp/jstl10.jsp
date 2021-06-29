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

<c:forTokens var= "data" items="1,2,3,4,5" delims=",">
	${ data }<br />
</c:forTokens>

<c:set var="lists" value="홍길동,김길동,고길동" />
<c:forTokens var= "data" items="${lists }" delims=",">
	${ data }<br />
</c:forTokens>

<c:forTokens var= "data" items="빨강,주황.노랑,파랑,남색.보라" delims=",.">
	${ data }<br />
</c:forTokens>

</body>
</html>