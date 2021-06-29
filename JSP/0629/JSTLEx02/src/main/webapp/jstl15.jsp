<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<s:setDataSource
	var="ds"
	url="jdbc:mysql://localhost:3306/sample"
	driver="org.mariadb.jdbc.Driver"
	user="root"
	password="123456" 
	scope="page" />

연결: ${ ds } <br />
<%-- <s:update var="data" dataSource="${ds }" sql="insert into dept2 values(30,'정보부','서울')" /> --%>
<s:update var="data" dataSource="${ds}" sql="insert into dept2 values (?,?,?)" >
	<s:param value="60" />
	<s:param value="홍보부" />
	<s:param value="대구" />
</s:update>
성공 : ${data}

