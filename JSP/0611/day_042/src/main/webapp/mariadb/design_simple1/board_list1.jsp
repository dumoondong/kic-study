<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="javax.naming.Context" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.naming.NamingException" %>

<%@ page import="javax.sql.DataSource" %>

<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>

<%
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	StringBuilder sbHtml = new StringBuilder();
	int totalRecord = 0;
	try {
		Context initCtx = new InitialContext();
		Context envCtx = (Context)initCtx.lookup( "java:comp/env" );
		DataSource dataSource = (DataSource)envCtx.lookup( "jdbc/mariadb" );
		
		conn = dataSource.getConnection();
		
		String sql = "select seq, subject, writer, date_format(wdate,'%Y-%m-%d') wdate, hit from board1 order by seq desc";
		pstmt = conn.prepareStatement( sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY );
		
		rs = pstmt.executeQuery();
		
		rs.last();		//커서 맨 마지막 데이터로 이동
		totalRecord= rs.getRow();
		rs.beforeFirst();
		
		while(rs.next()){
			String seq = rs.getString("seq");
			String subject = rs.getString("subject");
			String writer = rs.getString("writer");
			String wdate = rs.getString("wdate");
			String hit = rs.getString("hit");
			
			sbHtml.append("<tr>");
			sbHtml.append("	<td>&nbsp;</td>");
			sbHtml.append("	<td>"+ seq +"</td>");
			sbHtml.append( "<td class='left'><a href='board_view1.jsp?seq=" + seq + "'>" + subject + "</a>&nbsp;<img src='../../images/icon_new.gif' alt='NEW'></td>" );
			sbHtml.append(" <td>"+ writer +"</td>");
			sbHtml.append(" <td>"+ wdate +"</td>");
			sbHtml.append(" <td>"+ hit +"</td>");
			sbHtml.append(" <td>&nbsp;</td>");
			sbHtml.append(" </tr>");
		}
		
	} catch( NamingException e ) {
		System.out.println( "[에러] " + e.getMessage() );
	} catch( SQLException e ) {
		System.out.println( "[에러] " + e.getMessage() );
	} finally {
		if( rs != null ) rs.close();
		if( pstmt != null ) pstmt.close();
		if( conn != null ) conn.close();
	}
%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../../css/board_list.css">
</head>

<body>
<!-- 상단 디자인 -->
<div class="con_title">
	<h3>게시판</h3>
	<p>HOME &gt; 게시판 &gt; <strong>게시판</strong></p>
</div>
<div class="con_txt">
	<div class="contents_sub">
		<div class="board_top">
			<div class="bold">총 <span class="txt_orange"><%=totalRecord %></span>건</div>
		</div>

		<!--게시판-->
		<div class="board">
			<table>
			<tr>
				<th width="3%">&nbsp;</th>
				<th width="5%">번호</th>
				<th>제목</th>
				<th width="10%">글쓴이</th>
				<th width="17%">등록일</th>
				<th width="5%">조회</th>
				<th width="3%">&nbsp;</th>
			</tr>
<!-- 시작 -->
<%=sbHtml %>
<!--  끝  -->
			</table>
		</div>	
		<!--//게시판-->

		<div class="align_right">
			<input type="button" value="쓰기" class="btn_write btn_txt01" style="cursor: pointer;" onclick="location.href='board_write1.jsp'" />
		</div>
	</div>
</div>
<!--//하단 디자인 -->

</body>
</html>
