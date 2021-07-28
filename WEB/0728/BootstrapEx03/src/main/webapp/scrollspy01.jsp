<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1,minimum-scale=1.0,maximum-scale=1.0">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<style type="text/css">
	.scrollspy-example{
		position: relative;
		height: 200px;
		overflow: auto;
	}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
	<nav id="navbar-example2" class="navbar navbar-light bg-light px-3">
		<a href="#" class="navbar-brand">Navbar</a>
		<ul class="nav nav-pills">
			<li class="nav-item"><a href="#heading1" class="nav-link">First</a></li>
			<li class="nav-item"><a href="#heading2" class="nav-link">Second</a></li>
			<li class="nav-item"><a href="#heading3" class="nav-link">Third</a></li>
			<li class="nav-item"><a href="#heading4" class="nav-link">Fourth</a></li>
			<li class="nav-item"><a href="#heading5" class="nav-link">Fifth</a></li>
		</ul>
	</nav>
	<div class="scrollspy-example" data-bs-spy="scroll" data-bs-target="#navbar-example2" data-bs-offset="0">
		<h4 id="heading1">First Heading</h4>
		<p>Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!</p>
		<br /><br />
		<h4 id="heading2">Second Heading</h4>
		<p>Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!</p>
		<br /><br />
		<h4 id="heading3">Third Heading</h4>
		<p>Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!</p>
		<br /><br />
		<h4 id="heading4">Fourth Heading</h4>
		<p>Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!</p>
		<br /><br />
		<h4 id="heading5">Fifth Heading</h4>
		<p>Try to scroll this section and look at the navigation bar while scrolling! Try to scroll this section and look at the navigation bar while scrolling!</p>
		<br /><br />
	</div>
</div>
</body>
</html>