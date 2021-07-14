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
	fieldset {
      border: 0;
      margin-left: 300px;
    }
    label {
      display: block;
      margin: 20px 0 0 0;
    }
 
    #circle {
      float: left;
      background: yellow;
      border-radius: 50%;
      width: 150px;
      height: 150px;
    
</style>
<script type = "text/javascript" src="./js/jquery-3.6.0.js"><</script>
<script type = "text/javascript" src="./js/jquery-ui.js"><</script>
<script type="text/javascript">
	$( function() {
	    var circle = $( "#circle" );
	 
	    $( "#radius" ).selectmenu({
	      change: function( event, data ) {
	        circle.css({
	          width: data.item.value,
	          height: data.item.value
	        });
	      }
	     });
	 
	    $( "#color" ).selectmenu({
	       change: function( event, data ) {
	         circle.css( "background", data.item.value );
	       }
	     });
	  } );
</script>
</head>
<body>

<div class="demo">
 
<form action="#">
 
  <div id="circle"></div>
 
  <fieldset>
    <label for="radius">Circle radius</label>
    <select name="radius" id="radius">
      <option value="50">50px</option>
      <option value="100">100px</option>
      <option value="150" selected="selected">150px</option>
      <option value="200">200px</option>
      <option value="250">250px</option>
    </select>
 
    <label for="color">Circle color</label>
    <select name="color" id="color">
      <option value="black">Black</option>
      <option value="red">Red</option>
      <option value="yellow" selected="selected">Yellow</option>
      <option value="blue">Blue</option>
      <option value="green">Green</option>
    </select>
  </fieldset>
 
</form>
 
</div>

</body>
</html>