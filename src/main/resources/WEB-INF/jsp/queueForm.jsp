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

    <link rel="stylesheet" th:href="@{/css/queueForm.css}">
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
    <title>HoMS</title>
</head>
<body>
    <div class="container" >
      <h1 class="title">Medical Background Form</h1>
      <form action="/EnterQueue" method="post">
        <div class="row">
          <div class="col">
            <p class="category">Medical History</p>
            <div class="form-group">
              <label for="diabetes">Diabetes
                <input type="checkbox" name="diabetes" value="True">
              </label>
            </div>
            <div class="form-group">
              <label for="asthma">Asthma
                <input type="checkbox" name="asthma" value="True">
              </label>
            </div>
            <div class="form-group">
              <label for="heart">Heart Disease
                <input type="checkbox" name="heart" value="True">
              </label>
            </div>
            <div class="form-group">
              <label for="cancer">Cancer
                <input type="checkbox" name="cancer" value="True">
              </label>
            </div>
          </div>
          <div class="col">
            <p class="category">Surgical History</p>
            <br>
            <label for="surgery_date">Surgery Date</label>
            <input type="date" name="surgery_date">
            <label for="surgery_type">Surgery Type</label>
            <select name="surgery_type">
              <option value="heart">Heart</option>
              <option value="brain">Brain</option>
              <option value="orthopedic">Orthopedic</option>
            </select>
            <br>
          </div>
          <div class="col">
            <p class="category">Guardian tagging along</p>
            <label for="guardian">Guardian</label>
            <select name="guardian">
                <option value="father">Father</option>
                <option value="mother">Mother</option>
                <option value="sister">Sister</option>
                <option value="brother">Brother</option>
                <option value="grandfather">Grandfather</option>
                <option value="grandmother">Grandmother</option>
                <option value="uncle">Uncle</option>
                <option value="aunt">Aunt</option>
                <option value="cousin">Cousin</option>
                <option value="other">Other</option>
            </select>
          </div>
          <button type="submit" class="btn btn-primary">Submit</button>
        </div>
      </form>
    </div>
</body>
</html>