<!DOCTYPE html>
<html>
<head>
    <title>Payment Page - Online Banking</title>

    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins">
    <link rel="stylesheet" href="/css/paymentpageonlinebanking.css">

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

    <div class="paymentpage">Payment Page</div>
    <div class="homsspecialisthospital">HoMS Specialist Hospital</div>

    <div class="rectangle"></div>
    <div class="bankissue">Bank Issue</div>
    <div class="rectangleselectbank"></div>

    <form method="post" action="/payment/paymentPage">
        <select class="selectbank" id="bankoptID"name="bankopt">
            <option>Maybank2U</option>
            <option>Cimb Clicks</option>
            <option>RHB Online Banking</option>
        </select>

        <div class="rectanglenext"></div>
        <input class="next" type="button" value="Next" onclick="directUser()">
    </form>

    <div class="redirectnotice">You will be redirected to online banking login page...</div>
    
</body>

<script>

function directUser(){

    var bank=document.getElementById("bankoptID").value;
    
    if (bank == "Maybank2U"){
        window.location.assign("https://www.maybank2u.com.my/")
    }

    else if (bank == "Cimb Clicks"){
        window.location.assign("https://www.cimbclicks.com.my/")
    }

    else if (bank == "RHB Online Banking"){
        window.location.assign("https://onlinebanking.rhbgroup.com/my/login")
    }

}

</script>

</html>