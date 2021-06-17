<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	out.println("sub.jsp<br />");
	out.println((String)pageContext.getAttribute("data1") + "<br />");
	out.println((String)request.getAttribute("data2") + "<br />");
	
%>