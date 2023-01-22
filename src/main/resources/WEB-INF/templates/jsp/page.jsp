<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="description" content="MoHS Landing Page">
    <meta name="keywords" content="Page">
    <meta name="author" content="Amin Haiqal">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">  
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
    <link rel="shortcut icon" href="https://drive.google.com/uc?id=1P0d6aIdRMr61ImxVX2uAvYFrRzKb3PQo">
    
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <link href="/css/navigation.css" rel="stylesheet" />
        
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular-route.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script src="/js/page.js"></script>
    
    <title>HoMS</title>
</head>

<body ng-app="HoMS-Facility">
    
    <!--Navigation-->
        <header class="container-fluid d-flex flex-wrap justify-content-center py-3 border-bottom">
          <a href="/" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-dark text-decoration-none">
            <img  class="logo" src="/image/HoMS-04.png" alt="HoMS logo" style="height: 5vh;">
          </a>
    
          <ul class="nav col-12 col-md-auto mb-2 justify-content-center mb-md-0">
            <li><a href="#!homepage" class="nav-link px-2 link-secondary" aria-current="page">Home</a></li>
            <li><a href="doctor" class="nav-link px-2 link-dark">Doctor</a></li>
            <li><a href="service" class="nav-link px-2 link-dark">Service</a></li>
            <li><a href="#!review" class="nav-link px-2 link-dark">Review</a></li>
            <li><a href="about" class="nav-link px-2 link-dark">About Us</a></li>
            <li><button type="button" class="btn btn-primary" style="background-color:#06605B;">Log Out</button></li>
          </ul>
        </header>
        <div ng-view>
            <p>Content Area...</p>
        </div>
</body>
</html>
