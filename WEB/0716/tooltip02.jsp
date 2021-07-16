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
	 label {
	    display: inline-block; width: 5em;
	  }
	  fieldset div {
	    margin-bottom: 2em;
	  }
	  fieldset .help {
	    display: inline-block;
	  }
	  .ui-tooltip {
	    width: 210px;
	  }
</style>
<script type = "text/javascript" src="./js/jquery-3.6.0.js"><</script>
<script type = "text/javascript" src="./js/jquery-ui.js"><</script>
<script type="text/javascript">
	$( document).ready(function(){
		 var tooltips = $( "[title]" ).tooltip({
		      position: {
		        my: "left top",
		        at: "right+5 top-5",
		        collision: "none"
		      }
		    });
		    $( "<button>" )
		      .text( "Show help" )
		      .button()
		      .on( "click", function() {
		        tooltips.tooltip( "open" );
		      })
		      .insertAfter( "form" );
	});

</script>
</head>
<body>

<form>
  <fieldset>
    <div>
      <label for="firstname">Firstname</label>
      <input id="firstname" name="firstname" title="Please provide your firstname.">
    </div>
    <div>
      <label for="lastname">Lastname</label>
      <input id="lastname" name="lastname" title="Please provide also your lastname.">
    </div>
    <div>
      <label for="address">Address</label>
      <input id="address" name="address" title="Your home or work address.">
    </div>
  </fieldset>
</form>
</body>
</html>