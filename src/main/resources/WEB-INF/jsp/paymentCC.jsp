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
    <div class="navhome"><a href="">Home</a></div>
    <div class="navdoctor"><a href="">Doctor</a></div>
    <div class="navservices"><a href="">Services</a></div>
    <div class="navreview"><a href="">Review</a></div>
    <div class="navaboutus"><a href="">About Us</a></div>
    <div class="rectanglelogout"></div>
    <div class="logout"><a href="">Log Out</a></div>

    <div class="paymentpage">Payment Page</div>
    <div class="homsspecialisthospital">HoMS Specialist Hospital</div>

    <div class="rectanglecarddetails"></div>

        <form  method="post" action="paymentCC" onsubmit="redirect()">
            <div class="carddetails">Card Details</div>
            <div class="cardnumber">Card Number</div>
            <div class="rectanglecardnumber"></div>
            
              <input class="cardnumbercontent" type="text" id="cardNoID" name="cardNo" maxlength="19" size="19" placeholder="**** **** **** ****" required>
            
            <div class="cvvnumber">CVV Number</div>
            <div class="rectanglecvvnumber"></div>
            
              <input class="cvvnumbercontent" type="number" id="cvvNoID" name="cvvNo" maxlength="3" size="3" placeholder="***" required>
            
            <div class="expirydate">Expiry Date</div>
            <div class="rectangleexpirydate"></div>
            
                <input class="expirydatecontent" type="text" id="expiryDateID" name="expiryDate" maxlength="5" size="5" placeholder="**/**" required>
            
            <div class="rectanglepersonalinformation"></div>
            <div class="personalinformation">Personal Information</div>
            <div class="firstname">First Name</div>
            <div class="rectanglefirstname"></div>

                <input class="firstnamecontent" type="text" id="firstNameID" name="firstName" placeholder="Enter First Name" required>

            <div class="lastname">Last Name</div>
            <div class="rectanglelastname"></div>

                <input class="lastnamecontent" type="text" id="lastNameID" name="lastName" placeholder="Enter Last Name" required>

            <div class="country">Country</div>
            <div class="rectanglecountry"></div>

                <select class="countrycontent" id="countryID" name="country">
                    <option>Malaysia</option>
                    <option>Singapore</option>
                    <option>Indonesia</option>
                </select>

            <div class="state">State</div>
            <div class="rectanglestate"></div>

                <select class="statecontent" id="stateID" name="state">
                    <option>Melaka</option>
                    <option>Johor</option>
                    <option>Selangor</option>
                </select>

            <div class="city">City</div>
            <div class="rectanglecity"></div>

                <select class="citycontent" id="cityID" name="city">
                    <option>Johor Bharu</option>
                    <option>Muar</option>
                    <option>Pasir Gudang</option>
                </select>

            <div class="postalcode">Postal Code</div>
            <div class="rectanglepostalcode"></div>

                <input class="postalcodecontent" type="number" id="postalCodeID" name="postalCode" maxlength="5" size="5" placeholder="Enter Postal Code" required>

            <div class="email">Email</div>
            <div class="rectangleemail"></div>

                <input class="emailcontent" type="text" id="emailID" name="email" placeholder="Enter Email Address here" required>

            <div class="phonenumber">Phone Number</div>
            <div class="rectanglephonenumber"></div>

                <input class="phonenumbercontent" type="text" id="phoneNoID" name="phoneNo" placeholder="Enter Phone Number here" required>

             <div class="rectanglepay"></div>

              <input class="pay" type="submit" value="Pay">
            
        </form>

    
</body>

<script>

function redirect() {
        alert("Your payment is successful! The page will redirect to Home Page after 5 seconds");
        setTimeout(myURL, 5000);
         
      }

    function myURL() {
         document.location.href = 'homePage.jsp';
      }

</script>

</html>