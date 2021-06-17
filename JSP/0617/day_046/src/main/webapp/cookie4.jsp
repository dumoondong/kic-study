<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="util.Cookies" %>
<%
	Cookies cookies = new Cookies(request);
	
	String login_id = cookies.getValue("login_id");
	String login_grade = cookies.getValue("login_grade");
	
	out.println(login_id + "<br />");
	out.println(login_grade + "<br />");
%>