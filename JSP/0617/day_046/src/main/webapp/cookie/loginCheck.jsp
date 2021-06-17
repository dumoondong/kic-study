<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	String id = request.getParameter("id");
	String password = request.getParameter("password");
	
	// 로그인 될 아이디 / 패스워드
	String save_id = "tester";
	String save_password = "1234";
	
	int flag = 2;
	if( id.equals(save_id) && password.equals(save_password)) {
		// 성공
		
		Cookie cookie1 = new Cookie( "login_id", id );
		Cookie cookie2 = new Cookie( "login_grade", "A" );
		
		response.addCookie( cookie1 );
		response.addCookie( cookie2 );
		
		flag = 0;
	} else {
		// 실패
		flag = 1;
	}
	
	out.println( "<script type='text/javascript'>" );
	if( flag == 0 ) {
		out.println( "alert('로그인 되었습니다');" );
		out.println( "location.href='loginComplete.jsp'" );		
	} else if( flag == 1 ) {
		out.println( "alert('아이디나 비밀번호가 틀립니다.');" );
		out.println( "history.back();" );
	} else {
		out.println( "alert('에러입니다.');" );
		out.println( "history.back();" );		
	}
	out.println( "</script>'" );
%>