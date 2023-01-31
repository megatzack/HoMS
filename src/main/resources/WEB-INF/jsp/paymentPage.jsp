<!DOCTYPE html>
<html>
<head>
    <title>Payment Page</title>

    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins">
    <link rel="stylesheet" href="/css/paymentpage.css">

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
    <div class="paymentmethod">List of Payment Methods</div>
    <div class="rectanglepaymentmethod"></div>

        <form method="post" action="/payment/paymentPage">
    
                <select class="selectpaymentmethod" name="paymentopt">
                    <option>Online Banking</option>
                    <option>Credit Card</option>
                    <option>Cash</option>
                </select>

                <div class="rectanglenext"></div>
                <input class="next" type="submit" value="Next">
        </form>
    
</body>

</html>