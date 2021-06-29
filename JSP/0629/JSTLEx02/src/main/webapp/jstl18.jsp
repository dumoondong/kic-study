<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<s:setDataSource
	var="ds"
	url="jdbc:mysql://localhost:3306/sample"
	driver="org.mariadb.jdbc.Driver"
	user="root"
	password="123456" 
	scope="page" />

<c:set var="data" value="연구" />
<s:query var="rs" dataSource="${ds }" >
	select deptno,dname,loc from dept2 where dname like ?
	<s:param value="${data }%"/>
</s:query>
<c:forEach var="columnName" items="${ rs.columnNames }">
	${columnName }<br />
</c:forEach>

<c:forEach var="data" items="${ rs.rows }">
	${ data["deptno"] }<br />
	${ data["dname"] }<br />
	${ data["loc"] }<br />
</c:forEach>