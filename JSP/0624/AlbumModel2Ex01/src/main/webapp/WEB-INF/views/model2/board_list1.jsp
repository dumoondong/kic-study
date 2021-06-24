<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="model1.BoardTO" %>

<%@ page import="java.util.ArrayList" %>

<%
	int cpage = (Integer)request.getAttribute( "cpage" );
	int recordPerPage = (Integer)request.getAttribute( "recordPerPage" );
	
	int totalRecord = (Integer)request.getAttribute( "totalRecord" );
	int totalPage = (Integer)request.getAttribute( "totalPage" );
	
	int blockPerPage = (Integer)request.getAttribute( "blockPerPage" );
	int startBlock = (Integer)request.getAttribute( "startBlock" );
	int endBlock = (Integer)request.getAttribute( "endBlock" );
	
	ArrayList<BoardTO> boardLists = (ArrayList)request.getAttribute( "boardLists" );
	
	StringBuilder sbHtml = new StringBuilder();
		
	for( int i=0 ; i<recordPerPage ; i++ ) {
		String seq = "";
		String subject = "";
		String writer = "";
		String filename = "";
		int cmt = 0;
		String wdate = "";
		String hit = "";
		int wgap = 0;
		
		if( i < boardLists.size() ) {
			BoardTO to = boardLists.get(i);
			seq = to.getSeq();
			subject = to.getSubject();
			writer = to.getWriter();
			filename = to.getFilename() == null ? "./images/noimage.jpg" : "./upload/" + to.getFilename();
			cmt = to.getCmt();
			wdate = to.getWdate();
			hit = to.getHit();
			wgap = to.getWgap();
		}
 
		if( i%5 == 0 ) {
			sbHtml.append( "<tr>" );
		}
		sbHtml.append( "	<td class='last2'>" );
		sbHtml.append( "		<div class='board'>" );
		sbHtml.append( "			<table class='boardT'>" );
		sbHtml.append( "			<tr>" );
		sbHtml.append( "				<td class='boardThumbWrap'>" );
		sbHtml.append( "					<div class='boardThumb'>" );
		if( seq.equals( "" ) ) {
			sbHtml.append( "						<img src='./images/noimage.jpg' border='0' width='200' />" );
		} else {
			sbHtml.append( "						<a href='board_view.do?cpage=" + cpage + "&seq=" + seq + "'><img src='" + filename + "' border='0' width='200' /></a>" );
		}
		sbHtml.append( "					</div>" );
		sbHtml.append( "				</td>" );
		sbHtml.append( "			</tr>" );
		sbHtml.append( "			<tr>" );
		sbHtml.append( "				<td>" );
		sbHtml.append( "					<div class='boardItem'>" );
		if( seq.equals( "" ) ) {
			sbHtml.append( "						<strong></strong>" );
			sbHtml.append( "						<span class='coment_number'></span>" );
		} else {
			sbHtml.append( "						<strong>" + subject +"</strong>" );
			sbHtml.append( "						<span class='coment_number'><img src='./images/icon_comment.png' alt='commnet'>" + cmt + "</span>" );
			if( wgap <= 1 ) {
				sbHtml.append( "						<img src='./images/icon_new.gif' alt='NEW'>") ;
			}
		}
		sbHtml.append( "					</div>" );
		sbHtml.append( "				</td>" );
		sbHtml.append( "			</tr>" );
		sbHtml.append( "			<tr>" );
		sbHtml.append( "				<td><div class='boardItem'><span class='bold_blue'>" + writer + "</span></div></td>" );
		sbHtml.append( "			</tr>" );
		sbHtml.append( "			<tr>" );
		sbHtml.append( "				<td>" );
		if( seq.equals( "" ) ) {
			sbHtml.append( "					<div class='boardItem'></div>" );
		} else {
			sbHtml.append( "					<div class='boardItem'>" + wdate + " <font>|</font> Hit " + hit + "</div>" );
		}
		sbHtml.append( "				</td>" );
		sbHtml.append( "			</tr>") ;
		sbHtml.append( "		</table>" );
		sbHtml.append( "	</div>" );
		sbHtml.append( "</td>" );
		
		if( i%5 == 4 ) {
			sbHtml.append( "</tr>" );
		}
	}
%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="./css/board_list.css">
<style type="text/css">
<!--
	.board_pagetab { text-align: center; }
	.board_pagetab a { text-decoration: none; font: 12px verdana; color: #000; padding: 0 3px 0 3px; }
	.board_pagetab a:hover { text-decoration: underline; background-color:#f2f2f2; }
	.on a { font-weight: bold; }
-->
</style>
</head>

<body>
<!-- 상단 디자인 -->
<div class="contents1"> 
	<div class="con_title"> 
		<p style="margin: 0px; text-align: right">
			<img style="vertical-align: middle" alt="" src="./images/home_icon.gif" /> &gt; 커뮤니티 &gt; <strong>여행지리뷰</strong>
		</p>
	</div> 
	<div class="contents_sub">	
		<div class="board_top">
			<div class="bold">
				<p>총 <span class="txt_orange">1</span>건</p>
			</div>
		</div>	
		
		<!--게시판-->
		<table class="board_list">
		<%=sbHtml %>
		</table>
		<!--//게시판-->	
		
		<div class="align_right">		
			<button type="button" class="btn_write btn_txt01" style="cursor: pointer;" onclick="location.href='board_write.do'">쓰기</button>
		</div>
		<!-- 페이지 -->
		<div class="paginate_regular">
			<div class="board_pagetab" align="middle">
<%			
	if( startBlock == 1 ) {
		out.println( "<span class='on'>&lt;&lt;</span>" );
	} else {
		out.println( "<span class='off'><a href='board_list.do?cpage=" + ( startBlock - blockPerPage ) + "'>&lt;&lt;</a></span>" );
	}
	
	out.println( "&nbsp;" );

	if( cpage == 1 ) {
		out.println( "<span class='on'>&lt;</span>" );
	} else {
		out.println( "<span class='off'><a href='board_list.do?cpage=" + ( cpage - 1 )+ "'>&lt;&nbsp;</a></span>" );
	}
	
	out.println( "&nbsp;&nbsp;" );

	for( int i=startBlock ; i<=endBlock ; i++ ) {
		if( cpage == i ) {
			out.println( "<span class='on'>[ " + i + " ]</span>" );
		} else {
			out.println( "<span class='off'><a href='board_list.do?cpage=" + i + "'>" + i + "</a></span>" );
		}
	}

	out.println( "&nbsp;&nbsp;" );
	
	if( cpage == totalPage ) {
		out.println( "<span class='on'>&gt;</span>" );
	} else {
		out.println( "<span class='off'><a href='board_list.do?cpage=" + ( cpage + 1 )+ "'>&gt;</a></span>" );
	}
	
	out.println( "&nbsp;" );
	
	if( endBlock == totalPage ) {
		out.println( "<span class='on'>&gt;&gt;</span>" );
	} else {
		out.println( "<span class='off'><a href='board_list.do?cpage=" + ( startBlock + blockPerPage ) + "'>&gt;&gt;</a></span>" );
	}
%>
			</div>
		</div>
		<!-- //페이지 -->
	</div>
</div>
<!--//하단 디자인 -->

</body>
</html>