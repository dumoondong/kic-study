<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	session.setAttribute("data1", "value1");
	session.setAttribute("data2", "value2");
	
	ArrayList<String> lists = new ArrayList();
	lists.add("사과");
	lists.add("딸기");
	lists.add("수박");
	session.setAttribute("data3", lists);
%>