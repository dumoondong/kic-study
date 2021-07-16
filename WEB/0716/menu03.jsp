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
  <script>
  $( function() {
    $( "#menu" ).menu();
  } );
  </script>
  <style>
  .ui-menu { width: 150px; }
  </style>
</head>
<body>
<ul id="menu">
  <li>
    <div><span class="ui-icon ui-icon-disk"></span>Save</div>
  </li>
  <li>
    <div><span class="ui-icon ui-icon-zoomin"></span>Zoom In</div>
  </li>
  <li>
    <div><span class="ui-icon ui-icon-zoomout"></span>Zoom Out</div>
  </li>
  <li class="ui-state-disabled">
    <div><span class="ui-icon ui-icon-print"></span>Print...</div>
  </li>
  <li>
    <div>Playback</div>
    <ul>
      <li>
        <div><span class="ui-icon ui-icon-seek-start"></span>Prev</div>
      </li>
      <li>
        <div><span class="ui-icon ui-icon-stop"></span>Stop</div>
      </li>
      <li>
        <div><span class="ui-icon ui-icon-play"></span>Play</div>
      </li>
      <li>
        <div><span class="ui-icon ui-icon-seek-end"></span>Next</div>
      </li>
    </ul>
  </li>
  <li>
    <div>Learn more about this menu</div>
  </li>
</ul>
 
</body>
</html>