<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="model1.BoardTO" %>
<%@ page import="model1.CommentTO" %>

<%@ page import="java.util.ArrayList" %>
<%
	String cpage = (String)request.getAttribute( "cpage" );
	BoardTO bto = (BoardTO)request.getAttribute( "bto" );
	ArrayList<CommentTO> commentLists = (ArrayList)request.getAttribute( "commentLists" );
	
	String seq = bto.getSeq();
	String subject = bto.getSubject();
	String writer = bto.getWriter();
	String mail = bto.getMail();
	String wip = bto.getWip();
	String wdate = bto.getWdate();
	String hit = bto.getHit();
	String content = bto.getContent();
	String filename = bto.getFilename();
	String latitude = bto.getLatitude();
	String longitude = bto.getLongitude();
	
	StringBuilder sbHtml = new StringBuilder();
	for( CommentTO to : commentLists ) {
		String cseq = to.getSeq();
		String cwriter = to.getWriter();
		String ccontent = to.getContent();
		String cwdate = to.getWdate();
		
		sbHtml.append( "<tr>" );
		sbHtml.append( "	<td class='coment_re' width='20%'>" );
		sbHtml.append( "		<strong>" + cwriter + "</strong> (" + cwdate + ")" );

		sbHtml.append( "		&nbsp;&nbsp;<input type='password' name='password' class='coment_input pR10'>");
		sbHtml.append( "		<a href='javascript:deletecomment(" + cseq + ")'><img src='./images/icon_del.gif' style='vertical-align:middle' /></a>");

		sbHtml.append( "		<div class='coment_re_txt'>" + ccontent + "</div>" );
		sbHtml.append( "	</td>");
		sbHtml.append( "</tr>");
	}
%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1.0,minimum-scale=1.0,maximum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="./css/board_view.css">
<script type="text/javascript">
	window.onload = function() {
		document.getElementById('submit2').onclick = function() {
			
			const seq = '<%=seq %>';
			const cwriter = document.getElementById('cwriter').value;
			const cpassword = document.getElementById('cpassword').value;
			const ccontent = document.getElementById('ccontent').value;
			
			if(cwriter.trim() == "") {
				alert('이름을 입력하셔야 합니다.');
				return false;				
			}
			if(cpassword.trim() == "") {
				alert('비밀번호를 입력하셔야 합니다.');
				return false;				
			}
			if(ccontent.trim() == "") {
				alert('내용을 입력하셔야 합니다.');
				return false;				
			}
			
			const writeRequest = new XMLHttpRequest();
			writeRequest.onreadystatechange = function() {
				if( writeRequest.readyState == 4 ) {
					if( writeRequest.status == 200 ) {
						const data = writeRequest.responseText.trim();
						const json = JSON.parse( data );
						
						//console.log( json );
						
						if( json.flag == 0 ) {
							alert( '댓글 입력에 성공했습니다.' );
							
							// list
							const listRequest = new XMLHttpRequest();
							listRequest.onreadystatechange = function() {
								if( listRequest.readyState == 4 ) {
									if( listRequest.status == 200 ) {
										const data = listRequest.responseText.trim();
										const json = JSON.parse( data );
										
										//디자인에 입력
										
										let html = '';
										for( let i=0 ; i<json.length ; i++ ) {
											html += '<tr>';
											html += '	<td class="coment_re" width="20%">';
											html += '		<strong>' + json[i].cwriter + '</strong> (' + json[i].cwdate + ')';
	
											html += '		&nbsp;&nbsp;<input type="password" name="password" class="coment_input pR10">';
											html += '		<a href="javascript:deletecomment(' + json[i].seq + ')"><img src="./images/icon_del.gif" style="vertical-align:middle" /></a>';

											html += '		<div class="coment_re_txt">' + json[i].ccontent + '</div>';
											html += '	</td>';
											html += '</tr>';
										}					
										document.getElementById( 'result' ).innerHTML = '';
										document.getElementById( 'result' ).innerHTML = html;
										
									} else {
										alert( "Web Site Error" );
									}
								}
							};
							listRequest.open( 'get', './comment_list.do?seq=' + seq, true );
							listRequest.send();
							
						} else if( json.flag == 1 ) {
							alert( '댓글 입력에 실패했습니다.' );
						}
						
					} else {
						alert( "Web Site Error" );
					}
				}
			};
			writeRequest.open( 'get', './comment_write_ok.do?seq=' + seq + '&cwriter=' + cwriter + '&cpassword=' + cpassword + '&ccontent=' + ccontent, true );
			writeRequest.send();
		};
	};
	
	const deletecomment = function( seq ) {
		alert( 'seq : ' + seq );
	};
</script>
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
	<!--게시판-->
		<div class="board_view">
			<table>
			<tr>
				<th width="10%">제목</th>
				<td width="60%"><%=subject %></td>
				<th width="10%">등록일</th>
				<td width="20%"><%=wdate %></td>
			</tr>
			<tr>
				<th>글쓴이</th>
				<td><%=writer + "(" + wip + "/" + mail + ")" %></td>
				<th>조회</th>
				<td><%=hit %></td>
			</tr>
			<tr>
				<th>위치정보</th>
				<td>
					위도 : (<%=latitude %>) / 경도 : (<%=longitude %>)
				</td>
				<th></th>
				<td></td>
			</tr>		
			<tr>
				<td colspan="4" height="200" valign="top" style="padding:20px; line-height:160%">
					<div id="bbs_file_wrap">
						<div>
							<img src="./upload/<%=filename %>" width="900" onerror="" /><br />
						</div>
					</div>
					<%=content %>
				</td>
			</tr>			
			</table>
			
			<table id="result">
			<%= sbHtml %>
			</table>

			<table>
			<tr>
				<td width="94%" class="coment_re">
					글쓴이 <input type="text" id="cwriter" name="cwriter" maxlength="5" class="coment_input" />&nbsp;&nbsp;
					비밀번호 <input type="password" id="cpassword" name="cpassword" class="coment_input pR10" />&nbsp;&nbsp;
				</td>
				<td width="6%" class="bg01"></td>
			</tr>
			<tr>
				<td class="bg01">
					<textarea id="ccontent" name="ccontent" cols="" rows="" class="coment_input_text"></textarea>
				</td>
				<td align="right" class="bg01">
					<button type="button" id="submit2" class="btn_re btn_txt01">댓글등록</button>
				</td>
			</tr>
			</table>
		</div>
		<div class="btn_area">
			<div class="align_left">			
				<input type="button" value="목록" class="btn_list btn_txt02" style="cursor: pointer;" onclick="location.href='board_list.do?cpage=<%=cpage %>'" />
			</div>
			<div class="align_right">
				<input type="button" value="수정" class="btn_list btn_txt02" style="cursor: pointer;" onclick="location.href='board_modify.do?cpage=<%=cpage %>&seq=<%=seq %>'" />
				<input type="button" value="삭제" class="btn_list btn_txt02" style="cursor: pointer;" onclick="location.href='board_delete.do?cpage=<%=cpage %>&seq=<%=seq %>'" />
				<input type="button" value="쓰기" class="btn_write btn_txt01" style="cursor: pointer;" onclick="location.href='board_write.do?cpage=<%=cpage %>'" />
			</div>
		</div>
		<!--//게시판-->
	</div>
<!-- 하단 디자인 -->
</div>

</body>
</html>