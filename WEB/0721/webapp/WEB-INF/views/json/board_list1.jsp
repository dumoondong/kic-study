<%@ page language="java" contentType="text/plain; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<%@ page import="model1.BoardTO" %>

<%@ page import="java.util.ArrayList" %>

<%@ page import="org.json.simple.JSONArray" %>
<%@ page import="org.json.simple.JSONObject" %>

<%
	ArrayList<BoardTO> datas = (ArrayList)request.getAttribute( "datas" );

	int totalRecord = datas.size();
	
	JSONArray jsonArray = new JSONArray();	
	for( BoardTO to : datas ) {
		JSONObject obj = new JSONObject();
		obj.put( "seq", to.getSeq() );
		obj.put( "subject", to.getSubject() );
		obj.put( "writer", to.getWriter() );
		obj.put( "wdate", to.getWdate() );
		obj.put( "hit", to.getHit() );
		obj.put( "wgap", to.getWgap() );
		jsonArray.add( obj );
	}
	
	JSONObject jsonObject = new JSONObject();
	jsonObject.put( "flag", "0" );
	jsonObject.put( "data", jsonArray );
	
	out.println( jsonObject );
%>