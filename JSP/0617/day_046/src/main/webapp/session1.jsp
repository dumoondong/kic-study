<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>

<%
	out.println(session.getId() + "<br />");
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	Date time = new Date();
	time.setTime(session.getCreationTime());
	out.println(formatter.format(time)+ "<br/>");
	
	time.setTime(session.getLastAccessedTime());
	out.println(formatter.format(time)+ "<br/>");
	
	out.println(session.getMaxInactiveInterval() + "초");
%>