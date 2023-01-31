<!DOCTYPE html>
<html>
<head>
    <title>Payment Page - Credit Card</title>

    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins">
    <link rel="stylesheet" href="/css/paymentpagecreditcard.css">

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

    <div class="rectanglecarddetails"></div>

        <form  method="post" action="/payment/paymentCC" onsubmit="redirect()">
            <div class="carddetails">Card Details</div>
            <div class="cardnumber">Card Number</div>
            
              <input class="rectanglecardnumber" type="text" id="cardNoID" name="cardNo" maxlength="19" size="19" placeholder="**** **** **** ****" required>
            
            <div class="cvvnumber">CVV Number</div>
            
              <input class="rectanglecvvnumber" type="number" id="cvvNoID" name="cvvNo" maxlength="3" size="3" placeholder="***" required>
            
            <div class="expirydate">Expiry Date</div>
            
                <input class="rectangleexpirydate" type="text" id="expiryDateID" name="expiryDate" maxlength="5" size="5" placeholder="**/**" required>
            
            <div class="rectanglepersonalinformation"></div>
            <div class="personalinformation">Personal Information</div>
            <div class="firstname">First Name</div>

                <input class="rectanglefirstname" type="text" id="firstNameID" name="firstName" placeholder="Enter First Name" required>

            <div class="lastname">Last Name</div>

                <input class="rectanglelastname" type="text" id="lastNameID" name="lastName" placeholder="Enter Last Name" required>

            <div class="country">Country</div>

                <select class="rectanglecountry" id="countryID" name="country">
                    <option selected disabled hidden>Please choose your country</option>
                    <option>Malaysia</option>
                    <option>Singapore</option>
                    <option>Indonesia</option>
                </select>

            <div class="state">State</div>

                <select class="rectanglestate" id="stateID" name="state">
                    <option selected disabled hidden>Please choose your state</option>
                    <option>Melaka</option>
                    <option>Johor</option>
                    <option>Selangor</option>
                </select>

            <div class="city">City</div>

                <select class="rectanglecity" id="cityID" name="city">
                    <option selected disabled hidden>Please choose your city</option>
                    <option>Johor Bharu</option>
                    <option>Muar</option>
                    <option>Pasir Gudang</option>
                </select>

            <div class="postalcode">Postal Code</div>

                <input class="rectanglepostalcode" type="number" id="postalCodeID" name="postalCode" maxlength="5" size="5" placeholder="Enter Postal Code" required>

            <div class="email">Email</div>

                <input class="rectangleemail" type="email" id="emailID" name="email" placeholder="Enter Email Address here" required>

            <div class="phonenumber">Phone Number</div>

                <input class="rectanglephonenumber" type="text" id="phoneNoID" name="phoneNo" placeholder="Enter Phone Number here" required>


              <input class="rectanglepay" type="submit" value="Pay">
            
        </form> 
    
</body>

<script>

function redirect() {
        alert("Your payment is successful! The page will redirect you to Home Page");
      }

</script>

</html>