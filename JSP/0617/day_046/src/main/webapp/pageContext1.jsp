<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String data = "value";
	
	pageContext.setAttribute("data1", data);
	out.println((String)pageContext.getAttribute("data1") + "<br />");
%>