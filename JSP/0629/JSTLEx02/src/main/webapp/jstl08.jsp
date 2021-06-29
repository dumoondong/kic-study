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
<table width="800" border="1">
<c:forEach var="row" begin="0" end="9">
	<tr>
		<c:forEach var="col" begin="0" end="9">
			<c:choose>
				<c:when test="${row ==0 && col == 0 }">
					<td>&nbsp;</td>
				</c:when>
				<c:when test="${row ==0}">
					<td align="center">X ${col }</td>
				</c:when>
				<c:when test="${col ==0}">
					<td align="center">${row } 단 </td>
				</c:when>
				<c:otherwise>
					<td align="center">${row } * ${col } = ${row * col }</td>
				</c:otherwise>
			</c:choose>
		</c:forEach>
	</tr>
	</c:forEach>
</table>
</body>
</html>