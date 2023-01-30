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
    <link rel="stylesheet" href="/css/mainPage.css">
    <link rel="stylesheet" href="/css/profile.css">

    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
	<title>HoMS</title> 
</head>

<body>
    
    <div class="container-fluid" id="container">
        <div>
            <h4 id="title">Account Settings</h4>
        </div>
        <div id="content" th:if="${staff != null}">
            <div id="profile">
                <img src="/image/unknown.png" alt="profile-picture" id="picture">
                <p><b th:text="${staff.getStaffName()}"></b> <br>
                <small th:text="${staff.getStaffEmail()}"></small></p>
            </div>
            <div id="profile-detail" class="input-group flex-nowrap">
                <h5 id="my-profile">My Profile</h5>
                <form action="/staff/staffupdate" method="post">
                    <div class="input-group mb-3">
                        <span class="input-group-text" id="basic-addon1">Name</span>
                        <input type="text" class="form-control" placeholder="Username" aria-label="Username"
                            aria-describedby="basic-addon1" th:value="${staff.getStaffName()}" id="input" name="name">
                    </div>
        
                    <div class="input-group mb-3">
                        <span class="input-group-text" id="basic-addon1">Email</span>
                        <input type="text" class="form-control" placeholder="Recipient's email" aria-label="Recipient's email"
                            aria-describedby="basic-addon1" th:value="${staff.getStaffEmail()}" id="input" name="email" readonly>
                    </div>
        
                    <div class="input-group mb-3">
                        <span class="input-group-text" id="basic-addon1">Department</span>
                        <input type="text" class="form-control" placeholder="Recipient's department"
                            aria-label="Recipient's department" aria-describedby="basic-addon1" th:value="${staff.getStaffDepartment()}" id="input" readonly>
                    </div>
                    <h5 id="profile-picture">Profile Picture</h5>
                    <div class="input-group mb-3">
                        <input type="file" class="form-control" id="inputGroupFile02" accept="image/*" name="picture">
                        <label class="input-group-text" for="inputGroupFile02">Upload</label>
                    </div>

                    <div class="d-grid gap-2 d-md-block" id="button">
                    <button class="btn btn-primary" type="submit" id="update">Update</button>
                    <button class="btn btn-light" type="reset">Cancel</button>
                </div>
                </form>
            </div>
        </div>
        
        <div id="content" th:if="${patient != null}">
            <div id="profile">
                <img src="/image/unknown.png" alt="profile-picture" id="picture">
                <p><b th:text="${patient.getPatientName()}"></b> <br>
                <small th:text="${patient.getPatientEmail()}"></small></p>
            </div>
            <div id="profile-detail" class="input-group flex-nowrap">
                <h5 id="my-profile">My Profile</h5>
                <form action="/Patient/update" method="post">
                    <div class="input-group mb-3">
                        <span class="input-group-text" id="basic-addon1">Name</span>
                        <input type="text" class="form-control" placeholder="Username" aria-label="Username"
                            aria-describedby="basic-addon1" th:value="${patient.getPatientName()}" id="input" name="name">
                    </div>
        
                    <div class="input-group mb-3">
                        <span class="input-group-text" id="basic-addon1">Email</span>
                        <input type="text" class="form-control" placeholder="Recipient's email" aria-label="Recipient's email"
                            aria-describedby="basic-addon1" th:value="${patient.getPatientEmail()}" id="input" name="email" readonly>
                    </div>
        
                    <div class="input-group mb-3">
                        <span class="input-group-text" id="basic-addon1">NRIC</span>
                        <input type="text" class="form-control" placeholder="Recipient's Identity Card Number"
                            aria-label="Recipient's department" aria-describedby="basic-addon1" th:value="${patient.getPatientIC()}" id="input" readonly>
                    </div>

                    <div class="input-group mb-3">
                        <span class="input-group-text" id="basic-addon1">Phone No.</span>
                        <input type="text" class="form-control" placeholder="Recipient's Phone Number"
                            aria-label="Recipient's department" aria-describedby="basic-addon1" th:value="${patient.getPatientPhoneNO()}" name="phoneNo" id="input">
                    </div>

                    <h5 id="profile-picture">Profile Picture</h5>
                    <div class="input-group mb-3">
                        <input type="file" class="form-control" id="inputGroupFile02" accept="image/*" name="picture">
                        <label class="input-group-text" for="inputGroupFile02">Upload</label>
                    </div>

                    <div class="d-grid gap-2 d-md-block" id="button">
                    <button class="btn btn-primary" type="submit" id="update">Update</button>
                    <button class="btn btn-light" type="reset">Cancel</button>
                </div>
                </form>
            </div>
        </div>
    </div>
</body>
</html>