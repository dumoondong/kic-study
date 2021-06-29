<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>

<s:setDataSource
	var="ds"
	dataSource="jdbc/mariadb2"
	scope="page" />
<s:query var="rs" dataSource="${ ds }">
	select * from dept2
</s:query>

<c:forEach var="data" items="${ rs.rows }">
	${ data["deptno"] }<br />
	${ data["dname"] }<br />
	${ data["loc"] }<br />
</c:forEach>