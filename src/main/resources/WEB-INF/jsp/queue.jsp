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
    <link rel="stylesheet" th:href="@{/css/queue.css}">
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
    <title>HoMS</title>
</head>
<body>
  <div class="containers">
    <p class="title">You're now in our Virtual Queue</p>
    <p class="description">
      Feel free to buy drinks and sandwiches from our cafe.
      <br>
      We will notify you when it's your turn.
    </p>
  </div>
  <div class="queue-section">
    <p>Your Number: <span th:text="${queue.queueID}"></span></p>
    <p>Your status: <span th:text="${queue.queueStatus}"></span></p>
    <table>
      <tr>
        <th>Queue ID</th>
        <th>Queue Status</th>
      </tr>
      <tr th:each="queues : ${queues}">
        <td th:text="${queues.queueID}"></td>
        <td th:text="${queues.queueStatus}"></td>
      </tr>
    </table>
  </div>
</body>
</html>