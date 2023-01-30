<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <link rel="stylesheet" href="/css/admin.css">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
    <title>Document</title>
</head>
<body>
    <div id="message">
        <h5 class="text-center">You are on Administration Page</h5>
    </div>

    <!--Ambulance Department-->
    <div class="container ">
        <div id="department">
            <h5 class="text-center">Ambulance Department</h5>
        </div>

        <div class="row row-cols-3 gy-5 d-flex justify-content-center" id="row">

            <a href="#!service/admin/ambulance_plate">
                <div class="col">
                    <div class="card shadow-sm align-items-center" id="content">
                        <img src="/image/HoMSLogo-03.png" alt="">
                        <br>
                        Choose Plate
                    </div>
                </div>
            </a>

            <a href="#!service/admin/ambulance_setschedule">
                <div class="col">
                    <div class="card shadow-sm align-items-center" id="content">
                        <img src="/image/HoMSLogo-03.png" alt="">
                        <br>
                        Set Schedule
                    </div>
                </div>
            </a>

        </div>
    </div>
</body>
</html>