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
</style>
<script type = "text/javascript" src="./js/jquery-3.6.0.js"><</script>
<script type = "text/javascript" src="./js/jquery-ui.js"><</script>
<script type="text/javascript">
	$( document).ready(function(){
	    const availableTags = [
	       "ActionScript",
	       "AppleScript",
	       "Asp",
	       "BASIC",
	       "C",
	       "C++",
	       "Clojure",
	       "COBOL",
	       "ColdFusion",
	       "Erlang",
	       "Fortran",
	       "Groovy",
	       "Haskell",
	       "Java",
	       "JavaScript",
	       "Lisp",
	       "Perl",
	       "PHP",
	       "Python",
	       "Ruby",
	       "Scala",
	       "Scheme"
	     ];
	    
	    $('#tags').autocomplete({
	    	source: availableTags
	    });
	});

</script>
</head>
<body>

<label for="tag">Program Languages :</label>
<input type="text" id="tags" />



</body>
</html>