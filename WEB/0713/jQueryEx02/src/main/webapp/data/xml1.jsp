<%@ page language="java" contentType="text/xml; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%
out.println("<books>");
out.println("	<book>");
out.println("		<name>HTML5 + CSS3 입문</name>");
out.println("		<publisher>삼국미디어</publisher>");
out.println("<author>유비</author>");
out.println("<price>30000원</price>");
out.println("</book>");
out.println("<book>");
out.println("<name>JavaScript + JQery 입문</name>");
out.println("<publisher>삼국미디어</publisher>");
out.println("<author>관우</author>");
out.println("<price>32000원</price>");
out.println("</book>");
out.println("<book>");
out.println("<name>Node.js 프로그래밍</name>");
out.println("<publisher>삼국미디어</publisher>");
out.println("<author>장비</author>");
out.println("<price>22000원</price>");
out.println("</book>");
out.println("<book>");
out.println("<name>HTML5 프로그래밍</name>");
out.println("<publisher>삼국미디어</publisher>");
out.println("<author>조자룡</author>");
out.println("<price>30000원</price>");
out.println("</book>");
out.println("</books>");
%>