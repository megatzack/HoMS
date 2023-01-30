<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="description" content="MoHS Landing Page">
    <meta name="keywords" content="HomePage">
    <meta name="author" content="Amin Haiqal">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">  
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
    <link rel="shortcut icon" href="https://drive.google.com/uc?id=1P0d6aIdRMr61ImxVX2uAvYFrRzKb3PQo">
    
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <link href="/css/homePage.css" rel="stylesheet" />
        
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
    
    <title>HoMS</title>
</head>

<body>
    <!--Content Area-->
    <div class="fluid-container">
        <img class="background" src="/image/background.jpg" alt="background" style="filter:brightness(60%)">
        <box></box>
        <img class="female" src="/image/female-doctor.png" alt="female-doctor">	
        <div class="content">
            <p id="title">Provide expert for you and your family !</p>
            <p id="description"> We take the guesswork out of location a doctor, hospital, or other medical facility in your area for you and your family.</p>
            <call class="col-lg-6 col-md-8 mx-auto">
                <a href="#" class="btn btn-success my-2" style="background-color:#06605B;">Get Doctor</a>
                <a href="#" class="btn btn-outline-light my-2">Learn More</a>
            </call>
        </div>


    </div>
    <div id="white-box"></div>
        <div class="container" id="review" th:if="${patient != null}">
          <h4 style="color: #06605B; padding-bottom: 3vh;">Service Review</h4>
  
          <form class="row g-3" id="reviewForm" method="post" action="reviewController">
              <div class="col-md-6">
                <label for="inputEmail" class="form-label">Name</label>
                <input type="text" class="form-control" id="nameInput" name="name" placeholder="Anonymous">
              </div>
              <div class="col-md-6">
                <label for="inputPassword" class="form-label">Email</label>
                <input type="email" class="form-control" id="emailInput" name="email" value="">
              </div>
              <div class="col-12">
                  <label for="exampleFormControlTextarea1">Review</label>
                  <textarea class="form-control" id="exampleFormControlTextarea1" rows="5" placeholder="write your review here..." name="review"></textarea>
              </div>
              
              <div class="col-12">
                <button type="submit" class="btn btn-primary" style="background-color:#06605B; margin-top: 2vh; width: 7rem;">Submit</button>
              </div>
            </form>
        </div>
</body>
</html>