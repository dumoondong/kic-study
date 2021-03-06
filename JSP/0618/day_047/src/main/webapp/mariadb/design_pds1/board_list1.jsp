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
	request.setCharacterEncoding( "utf-8" );

	int cpage = 1;
	if( request.getParameter( "cpage" ) != null 
			&& !request.getParameter( "cpage" ).equals( "" )) {
		cpage = Integer.parseInt(request.getParameter( "cpage" ));
	}

	int recordPerPage = 10;
	
	int totalRecord = 0;
	int totalPage = 1;
	
	int blockPerPage = 5;
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	StringBuilder sbHtml = new StringBuilder();
	try {
		Context initCtx = new InitialContext();
		Context envCtx = (Context)initCtx.lookup( "java:comp/env" );
		DataSource dataSource = (DataSource)envCtx.lookup( "jdbc/mariadb" );
		
		conn = dataSource.getConnection();
		
		String sql = "select seq, subject, writer, filesize, date_format(wdate, '%Y.%m.%d') wdate, hit, datediff(now(), wdate) wgap from pds_board1 order by seq desc";
		pstmt = conn.prepareStatement( sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY );
		
		rs = pstmt.executeQuery();
		
		rs.last();
		totalRecord = rs.getRow();
		rs.beforeFirst();
		
		totalPage = ( ( totalRecord - 1 ) / recordPerPage ) + 1;
		
		int skip = (cpage - 1)*recordPerPage;
		if(skip != 0 ) rs.absolute( skip );
		
		for( int i=0 ; i<recordPerPage && rs.next() ; i++ ) {
			String seq = rs.getString( "seq" );
			String subject = rs.getString( "subject" );
			String writer = rs.getString( "writer" );
			long filesize = rs.getLong( "filesize" );
			String wdate = rs.getString( "wdate" );
			String hit = rs.getString( "hit" );
			int wgap = rs.getInt( "wgap" );
			
			sbHtml.append( "<tr>" );
			sbHtml.append( "<td>&nbsp;</td>" );
			sbHtml.append( "<td>" + seq + "</td>" );
			sbHtml.append( "<td class='left'>" );
			sbHtml.append( "	<a href='board_view1.jsp?cpage=" + cpage + "&seq=" + seq + "'>" + subject + "</a>&nbsp;" );
			if( wgap == 0 ) {
				sbHtml.append( "	<img src='../../images/icon_new.gif' alt='NEW'>" );
			}
			sbHtml.append( "</td>");
			sbHtml.append( "<td>" + writer + "</td>" );
			sbHtml.append( "<td>" + wdate + "</td>" );
			sbHtml.append( "<td>" + hit + "</td>" );
			sbHtml.append( "<td>" );
			if( filesize != 0 ) {
				sbHtml.append( "	<img src='../../images/icon_file.gif' />" );
			}
			sbHtml.append( "</td>" );
			sbHtml.append( "</tr>" );
		}
		
	} catch( NamingException e ) {
		System.out.println( "[??????] " + e.getMessage() );
	} catch( SQLException e ) {
		System.out.println( "[??????] " + e.getMessage() );
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
<!-- ?????? ????????? -->
<div class="con_title">
	<h3>?????????</h3>
	<p>HOME &gt; ????????? &gt; <strong>?????????</strong></p>
</div>
<div class="con_txt">
	<div class="contents_sub">
		<div class="board_top">
			<div class="bold">
				<p>??? <span class="txt_orange">1</span>???</p>
			</div>
		</div>

		<!--?????????-->
		<div class="board">
			<table>
			<tr>
				<th width="3%">&nbsp;</th>
				<th width="5%">??????</th>
				<th>??????</th>
				<th width="10%">?????????</th>
				<th width="17%">?????????</th>
				<th width="5%">??????</th>
				<th width="3%">&nbsp;</th>
			</tr>
<!-- ?????? -->
<%=sbHtml %>
<!-- ???  -->
			</table>
		</div>
		<!--//?????????-->
		
		<div class="align_right">
			<input type="button" value="??????" class="btn_write btn_txt01" style="cursor: pointer;" onclick="location.href='board_write1.jsp'" />
		</div>

		<!--???????????????-->
		<div class="paginate_regular">
			<div align="absmiddle">
<%
	int startBlock = ( ( cpage - 1) / blockPerPage ) * blockPerPage + 1;
	int endBlock = ( ( cpage - 1) / blockPerPage ) * blockPerPage + blockPerPage;
	if( endBlock >= totalPage ) {
		endBlock = totalPage;
	}

	if( startBlock == 1 ) {
		out.println( "<span>&lt;&lt;</span>" );
	} else {
		out.println( "<span><a href='board_list1.jsp?cpage=" + ( startBlock - blockPerPage) + "'>&lt;&lt;</a></span>" );
	}	
	out.println( "&nbsp;" );	
	
	
	if( cpage == 1 ) {
		out.println( "<span>&lt;</span>" );
	} else {
		out.println( "<span><a href='board_list1.jsp?cpage=" + (cpage -1 ) + "'>&lt;</a></span>" );
	}
	out.println( "&nbsp;&nbsp;" );
	
	for(int i=startBlock ; i<=endBlock ; i++) {
		if( cpage == i ) {
			out.println( "<span>[ " + i + " ]</span>" );	
		} else {
			out.println( "<span><a href='board_list1.jsp?cpage=" + i + "'>" + i + "</a></span>" );
		}
	}
	
	out.println( "&nbsp;&nbsp;" );
	if( cpage == totalPage ) {
		out.println( "<span>&gt;</span>" );
	} else {
		out.println( "<span><a href='board_list1.jsp?cpage=" + ( cpage+1 )+ "'>&gt;</a></span>" );
	}

	out.println( "&nbsp;");
	if( startBlock == totalPage ) {
		out.println( "<span>&gt;&gt;</span>" );
	} else {
		out.println( "<span><a href='board_list1.jsp?cpage=" + ( startBlock + blockPerPage) + "'>&gt;&gt;</a></span>" );
	}
%>
			</div>
		</div>
		<!--//???????????????-->
	</div>
</div>
<!--//?????? ????????? -->

</body>
</html>