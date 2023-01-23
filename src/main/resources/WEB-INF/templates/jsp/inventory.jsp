<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="description" content="MoHS Inventory Page">
    <meta name="keywords" content="Inventory">
    <meta name="author" content="Amin Haiqal">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">  
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
    <link rel="shortcut icon" href="https://drive.google.com/uc?id=1P0d6aIdRMr61ImxVX2uAvYFrRzKb3PQo">
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <link rel="stylesheet" href="inventory.css">
    <link rel="stylesheet" href="/Navigation/navigation.css">
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
    <title>HoMS</title>
</head>
<body>
    <!--Navigation-->
    <nav class="container-fluid bg-light">
        <header class="d-flex flex-wrap justify-content-center py-3 mb-4 border-bottom">
          <a href="/" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-dark text-decoration-none">
            <img  class="logo" src="/Image/HoMS-04.png" alt="HoMS logo" style="height: 5vh;">
          </a>
    
          <ul class="nav col-12 col-md-auto mb-2 justify-content-center mb-md-0">
            <li><a href="#" class="nav-link px-2 link-dark" aria-current="page">Home</a></li>
            <li><a href="#" class="nav-link px-2 link-dark">Doctor</a></li>
            <li><a href="#" class="nav-link px-2 link-secondary">Service</a></li>
            <li><a href="javascript:window.open('/Review/review.html', 'Review', 'width=881,height=440');" class="nav-link px-2 link-dark">Review</a></li>
            <li><a href="#" class="nav-link px-2 link-dark">About Us</a></li>
            <li><button type="button" class="btn btn-primary" style="background-color:#06605B;">Log Out</button></li>
          </ul>
        </header>
    </nav>

     <!--Pattern-->
     <pattern>
        <img src="/Image/pattern.png" alt="pattern">
    </pattern>

    <!--My Cart-->
    <div class="container-fluid" id="myCart">
        <div class="d-flex justify-content-between align-items-center">
            <h3 style="color: white;"><b>Medical Shop</b></h3>
            <form action="" target="_blank">
                <button type="button" class="btn btn-primary" style="background-color:#06605B;">My Cart</button>
            </form>
        </div>
    </div>
    
    <!--List Item-->
    <div class="container-fluid">
        <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3" id="item">
            <!--Item#01-->
            <div class="col">
                <div class="card shadow-sm">
                    <svg class="bd-placeholder-img card-img-top" width="100%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">Thumbnail</text></svg>
        
                    <div class="card-body">
                      <div class="card-text">
                       <h4>Item #01</h4>
                       <p>Lorem ipsum dolor sit amet, consectur adipiscing elit. sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                      </div>
                      <div class="d-flex justify-content-between align-items-center">
                        <price class="text-muted">
                            <h5><b>RM297.00</b></h5>
                        </price>
                        <div class="btn-group">
                          <button type="button" class="btn btn-sm" style="background-color: #06605B; color: white;">Add to Cart</button>
                        </div>
                      </div>
                    </div>
                  </div>
            </div>

            <!--Item#02-->
            <div class="col">
                <div class="card shadow-sm">
                    <svg class="bd-placeholder-img card-img-top" width="100%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">Thumbnail</text></svg>
        
                    <div class="card-body">
                      <div class="card-text">
                       <h4>Item #02</h4>
                       <p>Lorem ipsum dolor sit amet, consectur adipiscing elit. sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                      </div>
                      <div class="d-flex justify-content-between align-items-center">
                        <price class="text-muted">
                            <h5><b>RM297.00</b></h5>
                        </price>
                        <div class="btn-group">
                          <button type="button" class="btn btn-sm" style="background-color: #06605B; color: white;">Add to Cart</button>
                        </div>
                      </div>
                    </div>
                  </div>
            </div>

            <!--Item#03-->
            <div class="col">
                <div class="card shadow-sm">
                    <svg class="bd-placeholder-img card-img-top" width="100%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">Thumbnail</text></svg>
        
                    <div class="card-body">
                      <div class="card-text">
                       <h4>Item #03</h4>
                       <p>Lorem ipsum dolor sit amet, consectur adipiscing elit. sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                      </div>
                      <div class="d-flex justify-content-between align-items-center">
                        <price class="text-muted">
                            <h5><b>RM297.00</b></h5>
                        </price>
                        <div class="btn-group">
                          <button type="button" class="btn btn-sm" style="background-color: #06605B; color: white;">Add to Cart</button>
                        </div>
                      </div>
                    </div>
                  </div>
            </div>

            <!--Item#04-->
            <div class="col">
                <div class="card shadow-sm">
                    <svg class="bd-placeholder-img card-img-top" width="100%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">Thumbnail</text></svg>
        
                    <div class="card-body">
                      <div class="card-text">
                       <h4>Item #04</h4>
                       <p>Lorem ipsum dolor sit amet, consectur adipiscing elit. sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                      </div>
                      <div class="d-flex justify-content-between align-items-center">
                        <price class="text-muted">
                            <h5><b>RM297.00</b></h5>
                        </price>
                        <div class="btn-group">
                          <button type="button" class="btn btn-sm" style="background-color: #06605B; color: white;">Add to Cart</button>
                        </div>
                      </div>
                    </div>
                  </div>
            </div>

            <!--Item#05-->
            <div class="col">
                <div class="card shadow-sm">
                    <svg class="bd-placeholder-img card-img-top" width="100%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">Thumbnail</text></svg>
        
                    <div class="card-body">
                      <div class="card-text">
                       <h4>Item #05</h4>
                       <p>Lorem ipsum dolor sit amet, consectur adipiscing elit. sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                      </div>
                      <div class="d-flex justify-content-between align-items-center">
                        <price class="text-muted">
                            <h5><b>RM297.00</b></h5>
                        </price>
                        <div class="btn-group">
                          <button type="button" class="btn btn-sm" style="background-color: #06605B; color: white;">Add to Cart</button>
                        </div>
                      </div>
                    </div>
                  </div>
            </div>

            <!--Item#06-->
            <div class="col">
                <div class="card shadow-sm">
                    <svg class="bd-placeholder-img card-img-top" width="100%" height="225" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: Thumbnail" preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title><rect width="100%" height="100%" fill="#55595c"/><text x="50%" y="50%" fill="#eceeef" dy=".3em">Thumbnail</text></svg>
        
                    <div class="card-body">
                      <div class="card-text">
                       <h4>Item #06</h4>
                       <p>Lorem ipsum dolor sit amet, consectur adipiscing elit. sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                      </div>
                      <div class="d-flex justify-content-between align-items-center">
                        <price class="text-muted">
                            <h5><b>RM297.00</b></h5>
                        </price>
                        <div class="btn-group">
                          <button type="button" class="btn btn-sm" style="background-color: #06605B; color: white;">Add to Cart</button>
                        </div>
                      </div>
                    </div>
                  </div>
            </div>
        </div>
    </div>
</body>
</html>