<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1" />
    <title>Admin Set Schedule for staff</title>

    <style>
      .menu-container {
        position: absolute;
        width: 100%;
        height: 241px;
        top: 0px;
        left: 0px;
        background-image: url("images/pattern-04.png");
      }

      .image1 {
        position: absolute;
        left: 75px;
        top: 36px;
      }

      .menu-info {
        font-family: "Poppins";
        font-style: normal;
        font-weight: 600;
        font-size: 20px;
        line-height: 30px;
        color: #ffffff;
      }

      .home {
        position: absolute;
        top: 45px;
        width: 61px;
        height: 30px;
        left: 659px;
      }

      .doctor {
        position: absolute;
        width: 68px;
        height: 30px;
        left: 770px;
        top: 45px;
      }

      .services {
        position: absolute;
        width: 86px;
        height: 30px;
        left: 888px;
        top: 45px;
      }

      .review {
        position: absolute;
        width: 72px;
        height: 30px;
        left: 1015px;
        top: 45px;
      }

      .about {
        position: absolute;
        width: 92px;
        height: 30px;
        left: 1128px;
        top: 45px;
      }

      .logout {
        position: absolute;
        width: 152px;
        height: 47px;
        left: 1285px;
        top: 33px;
        text-align: center;

        background: #ffffff;
        border-radius: 10px;
      }

      .main-title {
        position: absolute;
        width: 472px;
        height: 54px;
        left: 520px;
        top: 100px;
        text-align: center;

        font-family: "Poppins";
        font-style: normal;
        font-weight: 600;
        font-size: 36px;
        line-height: 54px;
        /* identical to box height */

        color: #ffffff;
      }

      .sub-title {
        position: absolute;
        width: 200px;
        height: 17px;
        left: 672px;
        top: 160px;
        text-align: center;

        font-family: "Inter";
        font-style: normal;
        font-weight: 500;
        font-size: 14px;
        line-height: 17px;
        /* identical to box height */

        color: #ffffff;
      }

      .content-table {
        box-sizing: border-box;

        position: absolute;
        width: 1000px;
        height: 500px;
        left: 255px;
        top: 300px;
      }

      .content {
        font-family: "Inter";
        font-style: normal;
        font-weight: 500;
        font-size: 16px;
        line-height: 19px;
      }

      .list-staff-text {
        position: absolute;
        width: 150px;
        height: 19px;
        left: 100px;
        top: 30px;
      }

      .contact-text {
        position: absolute;
        width: 150px;
        height: 19px;
        left: 570px;
        top: 30px;
      }

      .oncall-text {
        position: absolute;
        width: 150px;
        height: 19px;
        left: 100px;
        top: 150px;
      }

      .oc-timein-text {
        position: absolute;
        width: 80px;
        height: 19px;
        left: 100px;
        top: 180px;
      }

      .oc-timeout-text {
        position: absolute;
        width: 90px;
        height: 19px;
        left: 370px;
        top: 180px;
      }

      .schedule-text {
        position: absolute;
        width: 200px;
        height: 19px;
        left: 100px;
        top: 235px;
      }

      .sc-timein-text {
        position: absolute;
        width: 80px;
        height: 19px;
        left: 100px;
        top: 265px;
      }

      .sc-timeout-text {
        position: absolute;
        width: 90px;
        height: 19px;
        left: 370px;
        top: 265px;
      }

      .notes-text {
        position: absolute;
        width: 120px;
        height: 19px;
        left: 100px;
        top: 320px;
      }

      .form-control1 {
        box-sizing: border-box;

        position: absolute;
        width: 340px;
        height: 45px;
        left: 100px;
        top: 75px;

        border: 1px solid #000000;
      }

      .form-control2 {
        box-sizing: border-box;

        position: absolute;
        width: 340px;
        height: 45px;
        left: 570px;
        top: 75px;

        border: 1px solid #000000;
      }

      .form-control3 {
        box-sizing: border-box;

        position: absolute;
        width: 100px;
        height: 30px;
        left: 180px;
        top: 195px;

        border: 1px solid #000000;
      }

      .form-control4 {
        box-sizing: border-box;

        position: absolute;
        width: 100px;
        height: 30px;
        left: 470px;
        top: 195px;

        border: 1px solid #000000;
      }

      .form-control5 {
        box-sizing: border-box;

        position: absolute;
        width: 100px;
        height: 30px;
        left: 180px;
        top: 280px;

        border: 1px solid #000000;
      }

      .form-control6 {
        box-sizing: border-box;

        position: absolute;
        width: 100px;
        height: 30px;
        left: 470px;
        top: 280px;

        border: 1px solid #000000;
      }

      .form-control7 {
        box-sizing: border-box;

        position: absolute;
        width: 800px;
        height: 50px;
        left: 100px;
        top: 380px;

        border: 1px solid #000000;
      }

      .btn {
        position: absolute;
        width: 152px;
        height: 47px;
        left: 770px;
        top: 500px;

        background: #06605b;
        border-radius: 10px;
      }

      a {
        color: white;
        text-decoration: none;
      }

      a:hover {
        color: green;
      }
    </style>
  </head>
  <body>
    <!-- header content goes here -->
    <div class="menu-container">
      <div class="menu">
        <div class="image1">
          <img
            src="images/HoMS-05.png"
            alt="logo"
            width="120px"
            height="45.67px"
          />
        </div>
        <div class="menu-info">
          <div class="home"><a href="">Home</a></div>
          <div class="doctor"><a href="">Doctor</a></div>
          <div class="services"><a href="">Services</a></div>
          <div class="review"><a href="">Review</a></div>
          <div class="about"><a href="">About Us</a></div>
          <div>
            <button class="logout" onclick="location.href='/logout'">
              Log Out
            </button>
          </div>
        </div>
      </div>
      <div>
        <h1 class="main-title">Staff Schedule</h1>
        <h4 class="sub-title">HoMS Specialist Hospital</h4>
      </div>
    </div>

    <div class="content-header">
      <div class="content-table">
        <!-- main content goes here -->
        <div class="content">
          <form method="post" action="">
            <h3 class="list-staff-text">List of Staff</h3>
            <select class="form-control1" name="staff_name">
              <option>Muhammad Yusri Bin Yusoff</option>
              <option>Muhammad Syazwan Bin Sahdan</option>
              <option>Muhammad Amin Haiqal Bin Rosli</option>
              <option>Megat Irfan</option>
            </select>

            <h3 class="contact-text">Contact Number:</h3>
            <input
              class="form-control2"
              type="tel"
              name="phone"
              placeholder="012-3456789"
            /><br />

            <h3 class="oncall-text">On-Call Time</h3>

            <h3 class="oc-timein-text">Time In:</h3>
            <input
              class="form-control3"
              type="time"
              name="time"
              value="12:00"
            /><br />

            <h3 class="oc-timeout-text">Time Out:</h3>
            <input
              class="form-control4"
              type="time"
              name="time"
              value="12:00"
            /><br />

            <h3 class="schedule-text">Today Schedule</h3>
            <h3 class="sc-timein-text">Time In:</h3>
            <input
              class="form-control5"
              type="time"
              name="time"
              value="12:00"
            /><br />
            <h3 class="sc-timeout-text">Time Out:</h3>
            <input
              class="form-control6"
              type="time"
              name="time"
              value="12:00"
            /><br />

            <h3 class="notes-text">Notes</h3>
            <textarea
              class="form-control7"
              name="notes"
              placeholder="Write something here..."
              rows="4"
              cols="25"
            ></textarea>

            <input class="btn" type="submit" value="Update" />
          </form>
        </div>
      </div>
    </div>
  </body>
</html>
