<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Patient Profile</title>

    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins">
    <link rel="stylesheet" href="/css/patientprofile.css">

</head>

<body>

    <div class="headerbg"></div>
    <div class="logo"></div>
    <div class="HoMS">HoMS</div>
    <div class="navhome"><a href="/homepage">Home</a></div>
    <div class="navdoctor"><a href="/doctor">Doctor</a></div>
    <div class="navservices"><a href="/service">Services</a></div>
    <div class="navreview"><a href="/review">Review</a></div>
    <div class="navaboutus"><a href="">About Us</a></div>
    <div class="rectanglelogout"></div>
    <div class="logout"><a href="/logout">Log Out</a></div>

    <div class="myprofile">My Profile</div>
    <div class="homsspecialisthospital">HoMS Specialist Hospital</div>

    <div class="innercircle">
        <img src="/image/patientPicture2.jpg" alt="Patient Picture" width="150px" height="150px">
    </div>
    <div class="outercircle"></div>
    

        <div class="syazwansahdan"></div>
            <div class="fullname">Full Name : </div>
                <div class="fullnamesyazwan">Muhammad Syazwan bin Sahdan</div>
            <div class="email">Email Address : </div>
                <div class="emailsyazwan">muhammadsyazwan64@gmail.com</div>
            <div class="phonenumber">Phone number : </div>
                <div class="phonenumbersyazwan">+60194809626</div>


    <div class="updateprofile">Update Profile</div>

        <form  method="post" action="/Patient/updatePatientProfile" onsubmit="alertUser()">
            <div class="updatefullname">Full Name</div>
            
              <input class="rectangleupdatefullname" type="text" id="nameInput" name="Name" value="Muhammad Syazwan bin Sahdan" readonly> 
            
            <div class="updateemail">Email Address</div>
            
              <input class="rectangleupdateemail" type="text" id="emailInput" name="patientEmail" placeholder="Insert your new email address here">
            
            <div class="updatephone">Phone number</div>
            
                <input class="rectangleupdatephone" type="text" id="phoneNoInput" name="phoneNO" placeholder="Insert your new phone number here" >

              <input class="rectangleupdate" type="submit" value="Update">
            
        </form>

    <div class="line"></div>

</body>
<script>

function alertUser() {
  alert("Your information have been successfully updated.");
}

</script>
</html>