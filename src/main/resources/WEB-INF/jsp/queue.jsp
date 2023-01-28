<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="description" content="MoHS Landing Page">
    <meta name="keywords" content="queue">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">  
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
    <link rel="shortcut icon" href="https://drive.google.com/uc?id=1P0d6aIdRMr61ImxVX2uAvYFrRzKb3PQo">
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <link rel="stylesheet" th:href="@{/css/index.css}">
    <link rel="stylesheet" th:href="@{/css/navigation.css}">

    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
    <title>HoMS</title>
</head>
<body>
    <img class="background" src="/Image/background.jpg" alt="background" style="filter:brightness(60%)">
    <box></box>
    <img class="female" src="/Image/female-doctor.png" alt="female-doctor">
    
    <!--Navigation-->
    <nav class="container-fluid">
        <header class="d-flex flex-wrap justify-content-center py-3 mb-4 border-bottom">
          <a href="/" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-dark text-decoration-none">
            <img  class="logo" src="/Image/HoMS-04.png" alt="HoMS logo" style="height: 5vh;">
          </a>
    
          <ul class="nav col-12 col-md-auto mb-2 justify-content-center mb-md-0">
            <li><a href="#" class="nav-link px-2 link-secondary" aria-current="page">Home</a></li>
            <li><a href="#" class="nav-link px-2 link-dark">About Us</a></li>
            <li><a href="/login" class="btn btn-primary" style="background-color:#06605B;">Sign In</a></li>
          </ul>
        </header>
    </nav>
    <!--Text-->
    <text>
        <div class="container">
            <p id="title">You're now in our Virtual Queue</p>
            <p id="description">
              Feel free to buy drinks and sandwiches from our cafe.
              We will notify you when it's your turn.
            </p>
        </div>
    </text>
</body>
</html>