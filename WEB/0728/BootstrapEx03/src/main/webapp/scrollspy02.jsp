<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1,minimum-scale=1.0,maximum-scale=1.0">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
	<nav id="navbar-example3" class="navbar navbar-light bg-light flex-column align-items-stretch p-3">
	  <a class="navbar-brand" href="#">Navbar</a>
	  <nav class="nav nav-pills flex-column">
	    <a class="nav-link" href="#item-1">Item 1</a>
	    <nav class="nav nav-pills flex-column">
	      <a class="nav-link ms-3 my-1" href="#item-1-1">Item 1-1</a>
	      <a class="nav-link ms-3 my-1" href="#item-1-2">Item 1-2</a>
	    </nav>
	    <a class="nav-link" href="#item-2">Item 2</a>
	    <a class="nav-link" href="#item-3">Item 3</a>
	    <nav class="nav nav-pills flex-column">
	      <a class="nav-link ms-3 my-1" href="#item-3-1">Item 3-1</a>
	      <a class="nav-link ms-3 my-1" href="#item-3-2">Item 3-2</a>
	    </nav>
	  </nav>
	</nav>
	
	<div data-bs-spy="scroll" data-bs-target="#navbar-example3" data-bs-offset="0" tabindex="0">
	  <h4 id="item-1">Item 1</h4>
	  <p>This is some placeholder content for the scrollspy page. Note that as you scroll down the page, the appropriate navigation link is highlighted. It's repeated throughout the component example. We keep adding some more example copy here to emphasize the scrolling and highlighting.</p>
	  <h5 id="item-1-1">Item 1-1</h5>
	  <p>This is some placeholder content for the scrollspy page. Note that as you scroll down the page, the appropriate navigation link is highlighted. It's repeated throughout the component example. We keep adding some more example copy here to emphasize the scrolling and highlighting.</p>
	  <h5 id="item-1-2">Item 1-2</h5>
	  <p>This is some placeholder content for the scrollspy page. Note that as you scroll down the page, the appropriate navigation link is highlighted. It's repeated throughout the component example. We keep adding some more example copy here to emphasize the scrolling and highlighting.</p>
	  <h4 id="item-2">Item 2</h4>
	  <p>This is some placeholder content for the scrollspy page. Note that as you scroll down the page, the appropriate navigation link is highlighted. It's repeated throughout the component example. We keep adding some more example copy here to emphasize the scrolling and highlighting.</p>
	  <h4 id="item-3">Item 3</h4>
	  <p>This is some placeholder content for the scrollspy page. Note that as you scroll down the page, the appropriate navigation link is highlighted. It's repeated throughout the component example. We keep adding some more example copy here to emphasize the scrolling and highlighting.</p>
	  <h5 id="item-3-1">Item 3-1</h5>
	  <p>This is some placeholder content for the scrollspy page. Note that as you scroll down the page, the appropriate navigation link is highlighted. It's repeated throughout the component example. We keep adding some more example copy here to emphasize the scrolling and highlighting.</p>
	  <h5 id="item-3-2">Item 3-2</h5>
	  <p>This is some placeholder content for the scrollspy page. Note that as you scroll down the page, the appropriate navigation link is highlighted. It's repeated throughout the component example. We keep adding some more example copy here to emphasize the scrolling and highlighting.</p>
	</div>
</div>
</body>
</html>