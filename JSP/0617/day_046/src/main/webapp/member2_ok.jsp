<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="to" class="pack.MemberTO"></jsp:useBean>
<%
	to.setId("tester");
	to.setPassword("1234");
	
	out.println(to.getId()+"<br/>");
	out.println(to.getPassword()+"<br/>");
%>