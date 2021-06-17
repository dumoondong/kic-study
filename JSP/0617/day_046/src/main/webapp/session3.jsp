<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%
	String data1 = (String)session.getAttribute("data1");
	String data2 = (String)session.getAttribute("data2");

	out.println(data1 + "<br />");
	out.println(data2 + "<br />");
	
	ArrayList<String> lists = (ArrayList)session.getAttribute("data3");
	out.println(lists.get(0)+"<br />");
	out.println(lists.get(1)+"<br />");
	
%>