<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%	
	int flag = (Integer)request.getAttribute( "flag" );
	String id = (String)request.getAttribute( "id" );	
	String grade = (String)request.getAttribute( "grade" );	
	
	out.println( "<script type='text/javascript'>" );
	if( flag == 0 ) {
		session.setAttribute("loginUser", id);  //세션에 값 저장
		out.println( "location.href='./main.do';" );
	}else if( flag == 2 ){
		session.setAttribute("loginGrade", grade);  //세션에 값 저장
		System.out.println( grade );
		session.setAttribute("loginUser", id);  //세션에 값 저장
		out.println( "location.href='./management.do';" );
	} else if( flag == 1 ){
		out.println( "alert( '비밀번호가 틀렸습니다.' );" );
		out.println( "history.back();" );
	}else {
		out.println( "alert( 'id가 존재하지 않습니다.' );" );
		out.println( "history.back();" );
	}
	out.println( "</script>" );

%>