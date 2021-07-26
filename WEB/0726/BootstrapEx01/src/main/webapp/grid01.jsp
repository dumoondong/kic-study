<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1.0,minmum-scale=1.0,maximum-scale=1.0" />
<title>Insert title here</title>
<!--  <link rel="stylesheet" href="./css/bootstrap.min.css"> -->
<!--<script type="text/javascript" src="./js/bootstrap.min.js"></script>  -->

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

<div class="container-fluid">
  <h1>Mix and Match</h1>
  <p>Resize the browser window to see the effect.</p> 
  <p>This example demonstrates a 50%/50% split on extra small devices and 75%/25% split on larger devices.</p>      
  <div class="container-fluid">     
    <div class="row">
      <div class="col-6 col-sm-9 bg-success">col-6 col-sm-9</div>
      <div class="col-6 col-sm-3 bg-warning">col-6 col-sm-3</div>
    </div>
  </div>
  <br>
  <p>This example demonstrates a 58%/42% split on extra small, small and medium devices and 66.3%/33.3% split on large and xlarge devices.</p>      
  <div class="container-fluid">     
    <div class="row">
      <div class="col-7 col-lg-8 bg-success">col-7 col-lg-8</div>
      <div class="col-5 col-lg-4 bg-warning">col-5 col-lg-4</div>
    </div>
  </div>
  <br>
  <p>This example demonstrates a 25%/75% split on small devices, a 50%/50% split on medium devices, and a 33%/66% split on large and xlarge devices. On extra small devices, it will automatically stack (100%).</p>      
  <div class="container-fluid">     
    <div class="row">
      <div class="col-sm-3 col-md-6 col-lg-4 bg-success">col-sm-3 col-md-6 col-lg-4</div>
      <div class="col-sm-9 col-md-6 col-lg-8 bg-warning">col-sm-9 col-md-6 col-lg-8</div>
    </div>
  </div>
</div>

</body>
</html>