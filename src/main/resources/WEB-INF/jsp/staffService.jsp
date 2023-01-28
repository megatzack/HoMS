<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Inter">
    <link rel="shortcut icon" href="https://drive.google.com/uc?id=1P0d6aIdRMr61ImxVX2uAvYFrRzKb3PQo">
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <link href="/css/service.css" rel="stylesheet" />
    
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
    
    <title>HoMS</title>
</head>
<body>
    <img id="background" src="/image/service.jpg" alt="patient Service">
    <desc>
        <h4>Our Services</h4>
        <p>HoMS Specialist Hospital</p>
    </desc>
    <!--Service Content-->
    <div class="container">
        <div class="row row-cols-3 gy-5">
            <a href="#!/service/ambulance" th:if="${staffDepartment == 'Ambulance Department'}">
                <div class="col">
                    <div class="card shadow-sm align-items-center" id="content">
                        <img src="/image/HoMSLogo-03.png" alt="">
                        <br>
                        Ambulance Department
                    </div>
                </div>
            </a>

            <div class="row row-cols-3 gy-5">
                <a href="#!/service/ambulance" th:if="${staffDepartment == 'Admin Administrator Department'}">
                    <div class="col">
                        <div class="card shadow-sm align-items-center" id="content">
                            <img src="/image/HoMSLogo-03.png" alt="">
                            <br>
                            Admin Administrator Department
                        </div>
                    </div>
                </a>

            <a href="#!/service/ambulance" th:if="${staffDepartment == 'Inventory Department'}">
                <div class="col">
                    <div class="card shadow-sm align-items-center" id="content">
                        <img src="/image/HoMSLogo-03.png" alt="">
                        <br>
                        Inventory Department
                    </div>
                </div>
            </a>

            <a href="#!/service/ambulance" th:if="${staffDepartment == 'Staff Department'}">
                <div class="col">
                    <div class="card shadow-sm align-items-center" id="content">
                        <img src="/image/HoMSLogo-03.png" alt="">
                        <br>
                        Staff Department
                    </div>
                </div>
            </a>

            <a href="#!/service/staffSchedule">
                <div class="col">
                    <div class="card shadow-sm align-items-center" id="content">
                        <img src="/image/HoMSLogo-03.png" alt="">
                        <br>
                        Staff Schedule
                    </div>
                </div>
            </a>

            <a href="#!/service/medicalReport">
                <div class="col">
                    <div class="card shadow-sm align-items-center" id="content">
                        <img src="/image/HoMSLogo-03.png" alt="">
                        <br>
                        Patient Medical Report
                    </div>
                </div>
            </a>
        </div>  
    </div>
</body>
</html>