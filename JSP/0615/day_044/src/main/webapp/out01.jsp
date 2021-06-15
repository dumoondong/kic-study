<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" buffer = "4kb"%>
<%@ page buffer = "4kb" autoFlush="true"%>    
<%
	out.println("버퍼사이즈 :" +out.getBufferSize() +"<br/>");
	out.println("남은 공간:" + out.getRemaining()+"<br/>");
	
	for(int i=1; i<1000; i++){
		out.println(i+"Hello JSP<br />");
		if(i%200==0){
			out.println("남은 공간:" + out.getRemaining()+"<br/>");
		}
	}
%>