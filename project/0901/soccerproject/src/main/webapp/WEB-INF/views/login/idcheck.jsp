<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	int flag = (Integer)request.getAttribute( "flag" );
	
	out.println( "<script type='text/javascript'>" );
	if( flag == 0 ) {
		out.println( "alert( '중복 된 ID가 없습니다.' );" );
		out.println( "history.back();" );
	} else if( flag == 2 ){
		out.println( "alert( '중복입니다.' );" );
		out.println( "history.back();" );
	}else if( flag == 1 ){
		out.println( "alert( '비밀번호가 틀렸습니다.' );" );
		out.println( "history.back();" );
	}else {
		out.println( "alert( '실패.' );" );
		out.println( "history.back();" );
	}
	out.println( "</script>" );
%>

