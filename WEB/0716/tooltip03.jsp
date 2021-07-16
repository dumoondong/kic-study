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
	  .ui-tooltip, .arrow:after {
	    background: black;
	    border: 2px solid white;
	  }
	  .ui-tooltip {
	    padding: 10px 20px;
	    color: white;
	    border-radius: 20px;
	    font: bold 14px "Helvetica Neue", Sans-Serif;
	    text-transform: uppercase;
	    box-shadow: 0 0 7px black;
	  }
	  .arrow {
	    width: 70px;
	    height: 16px;
	    overflow: hidden;
	    position: absolute;
	    left: 50%;
	    margin-left: -35px;
	    bottom: -16px;
	  }
	  .arrow.top {
	    top: -16px;
	    bottom: auto;
	  }
	  .arrow.left {
	    left: 20%;
	  }
	  .arrow:after {
	    content: "";
	    position: absolute;
	    left: 20px;
	    top: -20px;
	    width: 25px;
	    height: 25px;
	    box-shadow: 6px 5px 9px -9px black;
	    -webkit-transform: rotate(45deg);
	    -ms-transform: rotate(45deg);
	    transform: rotate(45deg);
	  }
	  .arrow.top:after {
	    bottom: -20px;
	    top: auto;
	  }
</style>
<script type = "text/javascript" src="./js/jquery-3.6.0.js"><</script>
<script type = "text/javascript" src="./js/jquery-ui.js"><</script>
<script type="text/javascript">
	$( document).ready(function(){
		$( document ).tooltip({
		      position: {
		        my: "center bottom-20",
		        at: "center top",
		        using: function( position, feedback ) {
		          $( this ).css( position );
		          $( "<div>" )
		            .addClass( "arrow" )
		            .addClass( feedback.vertical )
		            .addClass( feedback.horizontal )
		            .appendTo( this );
		        }
		      }
		    });
	});

</script>
</head>
<body>

<p><a href="#" title="That&apos;s what this widget is">Tooltips</a> can be attached to any element. When you hover
the element with your mouse, the title attribute is displayed in a little box next to the element, just like a native tooltip.</p>
<p>But as it&apos;s not a native tooltip, it can be styled. Any themes built with
<a href="http://jqueryui.com/themeroller/" title="ThemeRoller: jQuery UI&apos;s theme builder application">ThemeRoller</a>
will also style tooltips accordingly.</p>
<p>Tooltips are also useful for form elements, to show some additional information in the context of each field.</p>
<p><label for="age">Your age:</label> <input id="age" title="We ask for your age only for statistical purposes."></p>
<p>Hover the field to see the tooltip.</p>
</body>
</html>