<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./css/base/jquery-ui.css" />
<style type="text/css">
	/* 사용자 정의 CSS */
	label, input { display:block; }
    input.text { margin-bottom:12px; width:90%; padding: .4em; }
    fieldset { padding:0; border:0; margin-top:5px; }
    h1 { font-size: 1.2em; margin: .6em 0; }
    div#users-contain { width: 350px; margin: 20px 0; }
    div#users-contain table { margin: 1em 0; border-collapse: collapse; width: 100%; }
    div#users-contain table td, div#users-contain table th { border: 1px solid #eee; padding: .6em 10px; text-align: left; }
    .ui-dialog .ui-state-error { padding: .3em; }
    .validateTips { border: 1px solid transparent; padding: 0.3em; }
</style>
<script type = "text/javascript" src="./js/jquery-3.6.0.js"><</script>
<script type = "text/javascript" src="./js/jquery-ui.js"><</script>
<script type="text/javascript">
	$( document).ready(function(){
		let seq = 1;
		
		$('#dialog-form').dialog({
			autoOpen: false,
			model: true,
			width: 500,
			height: 600,
			resizable: false,
			buttons: {
				'취소':function(){
					$(this).dialog('close');
				},
				'확인':function(){
					let html = '';
					html += '<h3>' +$('#title').val() + '</h3>';
					html += '<div>ㆍ ' +$('#name').val()  
					html += '<br />ㆍ ' +$('#email').val();
					//html += '<td>' +$('#password').val() + '</td>';
					html += '<br />ㆍ ' +$('#content').val();
					html += '<div style="float:right"><button seq=' + seq + '>수정</button>';
					html += '<button seq=' + seq + '>삭제</button></div>';
					html += '</div>';
					$('#accordion').append(html);				
					$('#accordion').accordion('refresh');
					
					++seq;
					$(this).dialog('close');
				},
			}
			
		});
		
		$('#btn').button().on('click',function(){
			$('#dialog-form').dialog('open');

		});
		
		$( function() {
		    var icons = {
		      header: "ui-icon-circle-arrow-e",
		      activeHeader: "ui-icon-circle-arrow-s"
		    };
		    $( "#accordion" ).accordion({
		      icons: icons
		    });
		    $( "#toggle" ).button().on( "click", function() {
		      if ( $( "#accordion" ).accordion( "option", "icons" ) ) {
		        $( "#accordion" ).accordion( "option", "icons", null );
		      } else {
		        $( "#accordion" ).accordion( "option", "icons", icons );
		      }
		    });
		  } );

	});

</script>
</head>
<body>
<div align=right><button id="btn" >글쓰기</button></div>

<div id="dialog-form" title="글쓰기">
  <form>
    <fieldset>
      
      <label for="title">제 목</label>
      <input type="text" name="title" id="title" value="" class="text ui-widget-content ui-corner-all">
      <label for="name">이  름</label>
      <input type="text" name="name" id="name" value="" class="text ui-widget-content ui-corner-all">
      <label for="email">메  일</label>
      <input type="text" name="email" id="email" value="" class="text ui-widget-content ui-corner-all">
      <label for="password">비밀 번호</label>
      <input type="password" name="password" id="password" value="" class="text ui-widget-content ui-corner-all">
      <label for="content">본  문</label>
      <input type="text" name="content" id="content" value="" style="height:100px;" class="text ui-widget-content ui-corner-all">
      <input type="submit" tabindex="-1" style="position:absolute; top:-1000px">
    </fieldset>
  </form>
</div>
<br /><hr /><br />

<div id="accordion"/>
 

</body>
</html>