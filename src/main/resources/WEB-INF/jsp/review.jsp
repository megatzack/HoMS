<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="description" content="MoHS Landing Page">
    <meta name="keywords" content="review">
    <meta name="author" content="Amin Haiqal">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">  
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

    <title>HoMS</title>
</head>
<body>
    <!--Modal Area-->
    <div class="container-fluid" style="padding-top: 6vh;">
        <h4 style="color: #06605B;">Service Review</h4>

        <form class="row g-3" id="reviewForm" method="post" action="reviewController">
            <div class="col-md-6">
              <label for="inputEmail" class="form-label">Name</label>
              <input type="text" class="form-control" id="nameInput" name="name">
            </div>
            <div class="col-md-6">
              <label for="inputPassword" class="form-label">Email</label>
              <input type="email" class="form-control" id="emailInput" name="email">
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