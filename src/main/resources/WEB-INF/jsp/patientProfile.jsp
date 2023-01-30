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
    <div class="navhome"><a href="">Home</a></div>
    <div class="navdoctor"><a href="">Doctor</a></div>
    <div class="navservices"><a href="">Services</a></div>
    <div class="navreview"><a href="">Review</a></div>
    <div class="navaboutus"><a href="">About Us</a></div>
    <div class="rectanglelogout"></div>
    <div class="logout"><a href="">Log Out</a></div>

    <div class="myprofile">My Profile</div>
    <div class="homsspecialisthospital">HoMS Specialist Hospital</div>

    <div class="innercircle">
        <img src="/image/patientPicture2.jpg" alt="Patient Picture" width="381px" height="418px">
    </div>
    <div class="outercircle"></div>
    
    <div th:each="item : ${p}">
        <div class="syazwansahdan" th:text="Mr ${item.getName()}" ></div>
            <div class="fullname">Full Name : </div>
                <div class="fullnamesyazwan" th:text="${item.getName()}" ></div>
            <div class="email">Email Address : </div>
                <div class="emailsyazwan" th:text="${item.getPatientEmail()}" ></div>
            <div class="phonenumber">Phone number : </div>
                <div class="phonenumbersyazwan" th:text="${item.getPhoneNO()}" ></div>
    </div>

    <div class="updateprofile">Update Profile</div>

        <form  method="post" action="patientProfile" onsubmit="alertUser()">
            <div class="updatefullname">Full Name</div>
            <div class="rectangleupdatefullname"></div>
            
              <input class="updatefullnamesyazwan" type="text" id="nameInput" name="patientName" placeholder="Insert your new full name here">
            
            <div class="updateemail">Email Address</div>
            <div class="rectangleupdateemail"></div>
            
              <input class="updateemailsyazwan" type="text" id="emailInput" name="patientEmail" placeholder="Insert your new email address here">
            
            <div class="updatephone">Phone number</div>
            <div class="rectangleupdatephone"></div>
            
                <input class="updatephonesyazwan" type="text" id="phoneNoInput" name="patientPhoneNo" placeholder="Insert your new phone number here" >
            
            <div class="rectangleupdate"></div>

              <input class="update" type="submit" value="Update">
            
        </form>

    <div class="line"></div>

</body>
<script>

function alertUser() {
  alert("Your information have been successfully updated.");
}

</script>
</html>