<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ page import="org.json.simple.JSONArray" %>
<%@ page import="org.json.simple.JSONObject" %>
<%
	JSONArray jsonArray= new JSONArray();
	
	JSONObject obj1 = new JSONObject();
	obj1.put("name", "HTML5 + CSS3 입문");
	obj1.put("publisher", "삼국미디어");
	obj1.put("author", "유비");
	obj1.put("price", "30000원");
	
	JSONObject obj2 = new JSONObject();
	obj2.put("name", "JavaScript + JQery 입문");
	obj2.put("publisher", "삼국미디어");
	obj2.put("author", "관우");
	obj2.put("price", "32000원");
	
	JSONObject obj3 = new JSONObject();
	obj3.put("name", "Node.js 프로그래밍");
	obj3.put("publisher", "삼국미디어");
	obj3.put("author", "장비");
	obj3.put("price", "22000원");
	
	JSONObject obj4 = new JSONObject();
	obj4.put("name", "HTML5 프로그래밍");
	obj4.put("publisher", "삼국미디어");
	obj4.put("author", "조자룡");
	obj4.put("price", "30000원");
	
	jsonArray.add(obj1); 
	jsonArray.add(obj2);
	jsonArray.add(obj3);
	jsonArray.add(obj4);
	
	out.println(jsonArray);
%>
