<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="FitnessManagementSystem Login Screen">
    <meta name="keywords" content="LoginScreen">
    <meta name="author" content="Nur Afikah">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/Register.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Inter">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <title>Glowterx</title>
</head>

<body>
    <div class="container">
        <div class="row">
            <div class="col-md-6">
                <img src="Images/register.jpg" class="img-fluid" alt="register">
            </div>
            <div class="col-md-6 mt-5">
                <a href="/" class="text-dark text-decoration-none">
                    <h1 class="text-center logo">Glowterx</h1>
                </a>
                <p class="title text-center mt-3">Hello There !</p>
                <p class="description text-center">Please fill in the form below to set up your trainee account.</p>

                <form action="Register.html " method="post ">
                    <div class="row mt-4 ">
                        <div class="col-md-6"><label class="labels ">First Name</label><input type="text " class="form-control " placeholder="First name " name="firstname "></div>
                        <div class="col-md-6"><label class="labels ">Last Name</label><input type="text " class="form-control " placeholder="Last name " name="lastname "></div>
                    </div>
                    <div class="row mt-3 ">
                        <div class="col-md-6"><label class="labels ">Username</label><input type="text " class="form-control " placeholder="Enter Username " name="username "></div>
                        <div class="col-md-6"><label class="labels ">Password</label><input type="text " class="form-control " placeholder="Enter Password " name="password "></div>
                        <div class="col-md-12"><label class="labels ">Phone Number</label><input type="text " class="form-control " placeholder="Enter Phone Number " name="phonenum "></div>
                        <div class="col-md-12"><label class="labels ">Email</label><input type="text " class="form-control " placeholder="Enter Email " name="email "></div>
                        <div class="col-md-12">
                            <label for="gender " class="labels ">Gender</label>
                            <select name="gender " class="form-control" id="gender " required>
                                <option value="">Choose...</option>
                                <option value="Male ">Male</option>
                                <option value="Female ">Female</option>
                            </select>
                        </div>
                    </div>
                    <div class="row mt-3 ">
                        <div class="col-md-12 "><label class="labels ">Address</label><input type="text " class="form-control" placeholder="Address" name="address "></div>
                        <div class="col-md-12 "><label class="labels ">City</label><input type="text " class="form-control" placeholder="City" tname="city "></div>
                        <div class="col-md-6 "><label class="labels ">Zip Code</label><input type="text " class="form-control" placeholder="Zip Code" name="zip "></div>
                        <div class="col-md-6 ">
                            <label for="State " class="labels">State</label>
                            <select name="state " class="form-control" id="country " required>
                                <option th:value="*{state} "><span th:text="*{state} "></option>
                                <option value="Johor ">Johor</option>
                                <option value="Kedah ">Kedah</option>
                                <option value="Kelantan ">Kelantan</option>
                                <option value="Melaka ">Melaka</option>
                                <option value="Negeri Sembilan ">Negeri Sembilan</option>
                                <option value="Pahang ">Pahang</option>
                                <option value="Penang ">Penang</option>
                                <option value="Perak ">Perak</option>
                                <option value="Perlis ">Perlis</option>
                                <option value="Sabah ">Sabah</option>
                                <option value="Sarawak ">Sarawak</option>
                                <option value="Selangor ">Selangor</option>
                                <option value="Terengganu ">Terengganu</option>
                            </select>
                            <div class="invalid-feedback ">
                                Please select a valid State.
                            </div>
                        </div>
                        <div class="col-md-12 "><input type="file" name="file" value="Change Profile Pictures" class="form-control"></div>
                        <div th:if="${message}" th:text="${message}" class="alert alert-success"></div>
                    </div>
                    <div class="mt-5 text-center ">
                        <input class="btn btn-secondary profile-button " type="submit " value="Save Profile "></input>
                    </div>
                </form>

            </div>
        </div>
    </div>
</body>

</html>