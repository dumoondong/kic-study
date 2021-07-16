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
	body	{font-size: 80%}
	.ui-menu { width: 200px; }
</style>
<script type = "text/javascript" src="./js/jquery-3.6.0.js"><</script>
<script type = "text/javascript" src="./js/jquery-ui.js"><</script>
<script type="text/javascript">
	$( function() {
	    $( "#menu" ).menu({
	      items: "> :not(.ui-widget-header)"
	    });
	  } );
	  </script>
	  <style>
	  .ui-menu { width: 200px; }
	  .ui-widget-header { padding: 0.2em; }
	  </style>
</script>
</head>
<body>
<ul id="menu">
  <li class="ui-widget-header"><div>Category 1</div></li>
  <li><div>Option 1</div></li>
  <li><div>Option 2</div></li>
  <li><div>Option 3</div></li>
  <li class="ui-widget-header"><div>Category 2</div></li>
  <li><div>Option 4</div></li>
  <li><div>Option 5</div></li>
  <li><div>Option 6</div></li>
</ul>
</body>
</html>