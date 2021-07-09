<%@ page language="java" contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<%@ page import="model1.CommentTO" %>

<%@ page import="java.util.ArrayList" %>

<%@ page import="org.json.simple.JSONArray" %>
<%@ page import="org.json.simple.JSONObject" %>

<%
	ArrayList<CommentTO> commentLists = (ArrayList)request.getAttribute( "commentLists" );

	JSONArray jsonArray = new JSONArray();
	for( CommentTO to : commentLists ) {
		JSONObject obj = new JSONObject();
		obj.put("cse" , to.getSeq());
		obj.put("cwriter", to.getWriter());
		obj.put("ccontent", to.getContent());
		obj.put("cwdate",  to.getWdate());
		
		jsonArray.add(obj);
	}
	out.println(jsonArray);
%>