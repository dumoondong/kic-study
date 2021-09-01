<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%	
int flag = (Integer)request.getAttribute( "flag" );

	out.println( "<script type='text/javascript'>" );
	if( flag == 0 ) {
		out.println( "location.href='./changepw.do';" );
	}else if( flag == 2 ){
		out.println( "location.href='./commoncode.do';" );
	} else if( flag == 1 ){
		out.println( "alert( '비밀번호가 틀렸습니다' );" );
		out.println( "history.back();" );
	}else {
		out.println( "alert( '실패' );" );
		out.println( "history.back();" );
	}
	out.println( "</script>" );

%>