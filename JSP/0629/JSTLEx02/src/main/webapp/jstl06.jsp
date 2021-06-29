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
<form action="jstl06.jsp" method="post">
학점 : <input type="text" name="hakjum" />
<input type="submit" value="등급보기" />

<c:if test="${ !empty(param.hakjum) }" >
	학점 출력<br />
	<c:choose>
		<c:when test="${param.hakjum>=90 }" >
			학점은 A
		</c:when>
		<c:when test="${param.hakjum>=80 }" >
			학점은 B
		</c:when>
		<c:when test="${param.hakjum>=70 }" >
			학점은 C
		</c:when>
		<c:when test="${param.hakjum>=60 }" >
			학점은 D
		</c:when>
		<c:otherwise>
			학점은 F
		</c:otherwise>
	</c:choose>
</c:if>
</form>
</body>
</html>