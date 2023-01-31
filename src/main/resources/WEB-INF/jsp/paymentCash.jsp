<!DOCTYPE html>
<html>
<head>
    <title>Payment Page - Cash</title>

    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins">
    <link rel="stylesheet" href="/css/paymentpagecash.css">

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
    <div class="note">Note:</div>
    <div class="rectanglenotecontent"></div>
    <div class="notecontent">You have choosen cash as your payment method.</br>
    Your are reminded to bring sufficient amount of money to smoothen the payment process.</br></br>
    Thank you.</div>

    <div class="rectangleokay"></div>
    <button class="okay" onclick="redirect()">Okay</button>

</body>

<script>

    function redirect () {
        alert("The page will redirect to Home Page after 5 seconds");
        setTimeout(myURL, 5000);
      }

    function myURL() {
         document.location.href = 'homePage.jsp';
      }

</script>

</html>