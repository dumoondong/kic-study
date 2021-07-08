<%@ page language="java" contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:choose>
	<c:when test="${ param.url == 1 }">
		<c:import var="json" charEncoding="utf-8" url="http://www.kma.go.kr/DFSROOT/POINT/DATA/top.json.txt" />	
	</c:when>
	<c:when test="${ param.url == 2 }">
		<c:import var="json" charEncoding="utf-8" url="http://www.kma.go.kr/DFSROOT/POINT/DATA/mdl.${ param.code }.json.txt" />	
	</c:when>
	<c:when test="${ param.url == 3 }">
		<c:import var="json" charEncoding="utf-8" url="http://www.kma.go.kr/DFSROOT/POINT/DATA/leaf.${ param.code }.json.txt" />	
	</c:when>
</c:choose>
${ json }
