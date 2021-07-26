<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!--  <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>-->
<link rel="stylesheet" href="./css/base/jquery-ui.css" />
<link rel="stylesheet" href="./css/sweetalert2.min.css" />
<style type="text/css">
	/*사용자 정의 CSS*/
</style>
<script type="text/javascript" src="./js/jquery-3.6.0.js"></script>
<script type="text/javascript" src="./js/jquery-ui.js"></script>
<script src="./js/sweetalert2.min.js"></script>
<link rel="stylesheet" href="./css/sweetalert2.min.css">

<script type="text/javascript">
	window.onload = function() {
		document.getElementById('btn').onclick = function() {
			Swal.fire({
				  icon: 'error',
				  title: 'Oops...',
				  text: 'Something went wrong!',
				  footer: '<a href="">Why do I have this issue?</a>'
			})
		};
	};
</script>
</head>
<body>
<button id="btn">Alert</button>

</body>
</html>