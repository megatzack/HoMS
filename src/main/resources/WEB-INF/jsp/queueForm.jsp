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

    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
    <title>HoMS</title>
</head>
<body>
    <img class="background" src="/Image/background.jpg" alt="background" style="filter:brightness(60%)">
    
    <div class="container">
      <form action="EnterQueue" method="post">
          <label for="queueStatus">Queue Status:</label>
          <input type="text" id="queueStatus" name="queueStatus"><br><br>
          <label for="queueTime">Queue Time:</label>
          <input type="datetime-local" id="queueTime" name="queueTime"><br><br>
          <input type="submit" value="Submit">
      </form>
  </div>  
</body>
</html>