<%@ page language="java" contentType="text/plain; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
	
<%@ page import="model1.BoardTO" %>

<%@ page import="org.json.simple.JSONObject" %>

<%
	BoardTO to = (BoardTO)request.getAttribute( "to" );

	JSONObject obj = new JSONObject();
	obj.put( "seq", to.getSeq() );
	obj.put( "subject", to.getSubject() );
	obj.put( "writer", to.getWriter() );
	
	JSONObject jsonObject = new JSONObject();
	jsonObject.put( "flag", "0" );
	jsonObject.put( "data", obj );
	
	out.println( jsonObject );
%>
