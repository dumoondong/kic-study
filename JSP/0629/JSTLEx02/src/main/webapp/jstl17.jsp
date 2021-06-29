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

<%--<s:query var="rs" dataSource="${ds }" sql="select deptno as 부서번호, dname as 부서명, loc as 부서위치 from dept2" />--%>
<s:query var="rs" dataSource="${ds }" >
	select deptno,dname,loc from dept2 where deptno = ?
	<s:param value="30"/>
</s:query>
<c:forEach var="columnName" items="${ rs.columnNames }">
	${columnName }<br />
</c:forEach>

<c:forEach var="data" items="${ rs.rows }">
	${ data["deptno"] }<br />
	${ data["dname"] }<br />
	${ data["loc"] }<br />
</c:forEach>