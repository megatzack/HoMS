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

        <form method="post" action="paymentPage">
    
                <select class="rectanglepaymentmethod" id="paymentoptid" name="paymentopt">
                    <option selected disabled hidden>Please choose your payment method</option>
                    <option value="Online Banking">Online Banking</option>
                    <option value="Credit Card">Credit Card</option>
                    <option value="Cash">Cash</option>
                </select>

                <input class="rectanglenext" type="button" value="Next" onclick="directUser()">
        </form>
    
</body>

<script>
    function directUser(){

    var payopt=document.getElementById("paymentoptid").value;

    if (payopt == "Online Banking"){
        document.location.href="/payment/paymentOnlineBanking";
    }

    else if (payopt == "Credit Card"){
        document.location.href="/payment/paymentCC";
    }

    else if (payopt == "Cash"){
        document.location.href="/payment/paymentCash";
    }

}
</script>

</html>