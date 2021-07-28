<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- bootstrap css -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<!-- jQuery -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<!-- popper.js -->
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<!-- bootstrap js -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</head>
<body>
<style type="text/css">
	.carousel-inner img{
		width: 100%;
		height: 100%;
	}
</style>
<div class="container">
	<!-- content -->
	<div class="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
		<div class="carousel-indicators">
			<button data-bs-target="#carouselExampleControls" data-bs-slide-to="0" class="active"></button>
			<button data-bs-target="#carouselExampleControls" data-bs-slide-to="1"></button>
			<button data-bs-target="#carouselExampleControls" data-bs-slide-to="2"></button>
		</div>
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img src="https://www.w3schools.com/bootstrap4/la.jpg" />
			</div>
			
			<div class="carousel-item">
				<img src="https://www.w3schools.com/bootstrap4/chicago.jpg" />
			</div>
			
			<div class="carousel-item">
				<img src="https://www.w3schools.com/bootstrap4/ny.jpg" />
			</div>
		</div>
		<!-- button -->
		<button class="carousel-control-prev" data-bs-target="carouselExampleControls" data-bs-slide="prev">
			<span class="carousel-control-prev-icon"></span>
			<span class="visually-hidden">Previous</span>
		</button>
		<button class="carousel-control-next" data-bs-target="carouselExampleControls" data-bs-slide="next">
			<span class="carousel-control-next-icon"></span>
			<span class="visually-hidden">Next</span>
		</button>
	</div>
</div>
</body>
</html>