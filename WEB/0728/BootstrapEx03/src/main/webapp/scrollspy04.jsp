<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1.0,minumum-scale=1.0,maximum-scale=1.0" />
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<style type="text/css">
	position: relative; 
	}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</head>
<body data-spy="scroll" data-target=".navbar" data-offset="50">
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark fixed-top">  
	  <ul class="navbar-nav">
	    <li class="nav-item">
	      <a class="nav-link" href="#section1">Section 1</a>
	    </li>
	    <li class="nav-item">
	      <a class="nav-link" href="#section2">Section 2</a>
	    </li>
	    <li class="nav-item">
	      <a class="nav-link" href="#section3">Section 3</a>
	    </li>
	    <li class="nav-item dropdown">
	      <a class="nav-link dropdown-bs-toggle" href="#" id="navbardrop" data-bs-toggle="dropdown">
	        Section 4
	      </a>
	      <div class="dropdown-menu">
	        <a class="dropdown-item" href="#section41">Link 1</a>
	        <a class="dropdown-item" href="#section42">Link 2</a>
	      </div>
	    </li>
	  </ul>
	</nav>
	
	<div id="section1" class="container-fluid bg-success" style="padding-top:70px;padding-bottom:70px">
	  <h1>Section 1</h1>
	  <p>Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!</p>
	  <p>Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!</p>
	</div>
	<div id="section2" class="container-fluid bg-warning" style="padding-top:70px;padding-bottom:70px">
	  <h1>Section 2</h1>
	  <p>Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!</p>
	  <p>Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!</p>
	</div>
	<div id="section3" class="container-fluid bg-secondary" style="padding-top:70px;padding-bottom:70px">
	  <h1>Section 3</h1>
	  <p>Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!</p>
	  <p>Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!</p>
	</div>
	<div id="section41" class="container-fluid bg-danger" style="padding-top:70px;padding-bottom:70px">
	  <h1>Section 4 Submenu 1</h1>
	  <p>Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!</p>
	  <p>Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!</p>
	</div>
	<div id="section42" class="container-fluid bg-info" style="padding-top:70px;padding-bottom:70px">
	  <h1>Section 4 Submenu 2</h1>
	  <p>Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!</p>
	  <p>Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!</p>
	</div>
</body>
</html>





