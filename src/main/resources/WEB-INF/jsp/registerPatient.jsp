<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1" />
    <title>Patient Registration</title>

    <style>
      .main-title {
        position: absolute;
        width: 357px;
        height: 48px;
        left: 102px;
        top: 134px;

        font-family: "Poppins";
        font-style: normal;
        font-weight: 600;
        font-size: 32px;
        line-height: 48px;
        color: #000000;
      }

      .sub-title {
        position: absolute;
        width: 241px;
        height: 17px;
        left: 106px;
        top: 178px;

        font-family: "Inter";
        font-style: normal;
        font-weight: 500;
        font-size: 14px;
        line-height: 17px;

        color: #000000;
      }

      body {
        position: relative;
        background: #ffffff;
      }

      .btn {
        position: absolute;
        width: 490px;
        height: 63px;
        left: 102px;
        top: 800px;

        background: #06605b;
        border-radius: 10px;
      }

      h2 {
        position: absolute;
        font-family: "Inter";
        font-weight: 500;
        font-size: 16px;
        line-height: 19px;
      }

      .name-text {
        width: 45px;
        height: 19px;
        left: 102px;
        top: 229px;
      }

      .email-text {
        width: 41px;
        height: 19px;
        left: 102px;
        top: 324px;
      }

      .password-text {
        width: 75px;
        height: 19px;
        left: 102px;
        top: 419px;
      }

      .patientIC-text {
        width: 75px;
        height: 19px;
        left: 102px;
        top: 550px;
      }

      .patientPhone-text {
        width: 170px;
        height: 19px;
        left: 102px;
        top: 645px;
      }

      .form-control1 {
        box-sizing: border-box;

        position: absolute;
        width: 490px;
        height: 45px;
        left: 102px;
        top: 266px;

        border: 1px solid #000000;
      }

      .form-control2 {
        box-sizing: border-box;

        position: absolute;
        width: 490px;
        height: 45px;
        left: 102px;
        top: 361px;

        border: 1px solid #000000;
      }

      .form-control3 {
        box-sizing: border-box;

        position: absolute;
        width: 490px;
        height: 45px;
        left: 102px;
        top: 456px;

        border: 1px solid #000000;
      }

      .form-control4 {
        box-sizing: border-box;

        position: absolute;
        width: 490px;
        height: 45px;
        left: 102px;
        top: 587px;

        border: 1px solid #000000;
      }

      .form-control5 {
        box-sizing: border-box;

        position: absolute;
        width: 490px;
        height: 45px;
        left: 102px;
        top: 687px;

        border: 1px solid #000000;
      }

      

      h3 {
        font-family: "Inter";
        font-style: normal;
        font-weight: 500;
        font-size: 14px;
        line-height: 17px;
      }

      .password-subtext {
        position: absolute;
        width: 271px;
        height: 17px;
        left: 102px;
        top: 505px;
        color: grey;
      }

      .login-text {
        position: absolute;
        width: 271px;
        height: 17px;
        left: 260px;
        top: 855px;
      }

      .image-1 {
        position: absolute;
        left: 102px;
        top: 56px;
      }
    </style>
  </head>

  <body>
    <div
      style="background-color: white; width: 50%; height: 800px; float: left"
    >
      <img
        class="image-1"
        src="/image/HoMS-04.png"
        alt="logo_homs"
        width="120px"
        height="45.67px"
      />

      <h1 class="main-title">Create Your Account!</h1>
      <h3 class="sub-title">Enter the field below to get started</h3>

      <form method="post" action="welcome">
        <h2 class="name-text">Name:</h2>
        <input
          class="form-control1"
          type="text"
          name="patientName"
          placeholder="insert fullname"
        /><br />

        <h2 class="email-text">Email:</h2>
        <input
          class="form-control2"
          type="text"
          name="patientEmail"
          placeholder="insert email"
        /><br />

        <h2 class="password-text">Password:</h2>
        <input
          class="form-control3"
          type="password"
          name="patientPassword"
          placeholder="insert password"
        /><br /><br /><br />

        <h3 class="password-subtext">
          *Password must be at least 8 characters
        </h3>

        <h2 class="patientIC-text">Patient IC:</h2>
        <input
          class="form-control4"
          type="text"
          name="patientIC"
          placeholder="010123456781"
        /><br />

        <h2 class="patientPhone-text">Phone number:</h2>
        <input
          class="form-control5"
          type="text"
          name="patientPhoneNo"
          placeholder="01123456698"
        /><br />

        <input class="btn" type="submit" value="Create Account" />
      </form>

      <h3 class="login-text">
        Already have an account? <a href="">Sign in</a>
      </h3>
    </div>

    <div
      style="
        background-color: lightgrey;
        width: 50%;
        height: 950px;
        float: left;
      "
    >
      <img
        src="/image/Surgeons Walking Through A Hospital Corridor by VICTOR TORRES.jpeg"
        alt="surgeon_image"
        width="100%"
        height="100%"
      />
    </div>
  </body>
</html>
