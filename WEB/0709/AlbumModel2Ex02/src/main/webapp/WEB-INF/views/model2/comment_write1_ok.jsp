<%@ page language="java" contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<%@ page import="org.json.simple.JSONObject" %>
    
<%
	int flag = (Integer)request.getAttribute( "flag" );
	
	JSONObject jsonObject = new JSONObject();
	jsonObject.put( "flag", flag );
	
	out.println( jsonObject );
%>