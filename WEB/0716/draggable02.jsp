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
	  #draggable { width: 16em; padding: 0 1em; }
	  #draggable ul li { margin: 1em 0; padding: 0.5em 0; } * html #draggable ul li { height: 1%; }
	  #draggable ul li span.ui-icon { float: left; }
	  #draggable ul li span.count { font-weight: bold; }
</style>
<script type = "text/javascript" src="./js/jquery-3.6.0.js"><</script>
<script type = "text/javascript" src="./js/jquery-ui.js"><</script>
<script type="text/javascript">
	$( document).ready(function(){
		   var $start_counter = $( "#event-start" ),
		      $drag_counter = $( "#event-drag" ),
		      $stop_counter = $( "#event-stop" ),
		      counts = [ 0, 0, 0 ];
		 
		    $( "#draggable" ).draggable({
		      start: function() {
		        counts[ 0 ]++;
		        updateCounterStatus( $start_counter, counts[ 0 ] );
		      },
		      drag: function() {
		        counts[ 1 ]++;
		        updateCounterStatus( $drag_counter, counts[ 1 ] );
		      },
		      stop: function() {
		        counts[ 2 ]++;
		        updateCounterStatus( $stop_counter, counts[ 2 ] );
		      }
		    });
		 
		    function updateCounterStatus( $event_counter, new_count ) {
		      // first update the status visually...
		      if ( !$event_counter.hasClass( "ui-state-hover" ) ) {
		        $event_counter.addClass( "ui-state-hover" )
		          .siblings().removeClass( "ui-state-hover" );
		      }
		      // ...then update the numbers
		      $( "span.count", $event_counter ).text( new_count );
		    }
	});

</script>
</head>
<body>

<div id="draggable" class="ui-widget ui-widget-content">
 
  <p>Drag me to trigger the chain of events.</p>
 
  <ul class="ui-helper-reset">
    <li id="event-start" class="ui-state-default ui-corner-all"><span class="ui-icon ui-icon-play"></span>&quot;start&quot; invoked <span class="count">0</span>x</li>
    <li id="event-drag" class="ui-state-default ui-corner-all"><span class="ui-icon ui-icon-arrow-4"></span>&quot;drag&quot; invoked <span class="count">0</span>x</li>
    <li id="event-stop" class="ui-state-default ui-corner-all"><span class="ui-icon ui-icon-stop"></span>&quot;stop&quot; invoked <span class="count">0</span>x</li>
  </ul>
</div>

</body>
</html>