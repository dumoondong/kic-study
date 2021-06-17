<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="to" class="pack.MemberTO"/>
<jsp:setProperty name = "to" property = "id" value = "tester"/>
<jsp:setProperty name = "to" property = "password" value = "1234"/>
<%

	out.println(to.getId()+"<br/>");
	out.println(to.getPassword()+"<br/>");
%>