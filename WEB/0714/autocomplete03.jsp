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
	.ui-autocomplete-loading {
    background: white url("images/ui-anim_basic_16x16.gif") right center no-repeat;
  }
</style>
<script type = "text/javascript" src="./js/jquery-3.6.0.js"><</script>
<script type = "text/javascript" src="./js/jquery-ui.js"><</script>
<script type="text/javascript">
	$(document).ready(function() {
	    $.ajax({
	      url: './data/london.json',
	      type: 'get',
	      dataType: "json",
	      success: function( json ) {
	        const datas = json.data;
			const availableTags = [];
			for(var i =0; i<datas.length; i++){
				availableTags[i] = datas[i]['name'] + ',' + datas[i]['countryname'];
			}
			console.log(availableTags);
			
			$('#tags').autocomplete({
				source: availableTags
			});
	      },
	      error: function(e){
	    	  alert('서버에러');
	    	  console.log(e.status, e.responseText);
	      }
	    });
	  });
</script>
</head>
<body>
<div class="ui-widget">
  <label for="birds">London matches: </label>
  <input id="birds">
</div>
 
<div class="ui-widget" style="margin-top:2em; font-family:Arial">
  Result:
  <div id="log" style="height: 200px; width: 300px; overflow: auto;" class="ui-widget-content"></div>
</div>
</body>
</html>