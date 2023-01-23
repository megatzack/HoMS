<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1" />
    <title>Staff Registration</title>

    <style>
      /* Use CSS variables to store common values */
      :root {
        --main-color: #06605b;
        --main-font-family: "Inter";
        --main-font-weight: 500;
        --main-font-size: 14px;
        --main-line-height: 17px;
        --main-border-color: #000000;
        --sub-color: gray;
      }

      /* Use CSS classes to group similar selectors */
      .main-title {
        font-family: "Poppins";
        font-weight: 600;
        font-size: 32px;
        line-height: 48px;
        color: #000000;
      }

      .sub-title {
        font-family: var(--main-font-family);
        font-weight: var(--main-font-weight);
        font-size: var(--main-font-size);
        line-height: var(--main-line-height);
        color: var(--main-color);
      }

      /* Use common CSS classes for similar elements */
      .form-control {
        box-sizing: border-box;
        width: 490px;
        height: 45px;
        border: 1px solid var(--main-border-color);
      }

      /* Use CSS shorthand properties */
      h2 {
        font: var(--main-font-weight) var(--main-font-size)/var(--main-line-height) var(--main-font-family);
      }
      h3 {
        font: var(--main-font-weight) var(--main-font-size)/var(--main-line-height) var(--main-font-family);
      }

      /* Use CSS Grid Layout to position elements */
      body {
        display: grid;
        grid-template-columns: 2fr 1fr;
        grid-template-rows: repeat(7, 1fr);
        grid-template-areas: 
          "header header"
          "title title"
          "subtitle subtitle"
          "name name"
          "email email"
          "password password"
          "department department"
          "button button";
      }

      .main-title {
        grid-area: title;
        justify-self: center;
        align-self: center;
      }

      .sub-title {
        grid-area: subtitle;
        justify-self: center;
        align-self: center;
      }

      /* Use semantic HTML tags */
      header {
        grid-area: header;
        background-color: white;
      }

      form {
        grid-template-columns: 1fr;
        grid-template-rows: repeat(6, 1fr);
        grid-template-areas: 
          "name"
          "email"
          "password"
          "department"
          "subtext"
          "button";
      }

      .name-text {
        grid-area: name;
        }

        .email-text {
          grid-area: email;
        }
      
        .password-text {
          grid-area: password;
        }
      
        .department-text {
          grid-area: department;
        }
      
        .form-control1 {
          grid-area: name;
        }
      
        .form-control2 {
          grid-area: email;
        }
      
        .form-control3 {
          grid-area: password;
        }
      
        .form-control4 {
          grid-area: department;
        }
      
        .password-subtext {
          grid-area: subtext;
          color: var(--sub-color);
        }
      
        .btn {
          grid-area: button;
          background: var(--main-color);
          border-radius: 10px;
        }
      
        .image-1 {
          grid-area: header;
        }
      </style>
      
    </head>
    <body>
      <header>
        <img class="image-1" src="image/HoMS-04.png" alt="logo_homs" width="120px" height="45px">
      </header>
      <div class="main-title">Staff Registration</div>
      <div class="sub-title">Please fill in the form to register as a staff member</div>
      <form method="post" action="registerStaff">
        <h2 class="name-text">Name:</h2>
        <input type="text" class="form-control form-control1" name="staffName">
        <h2 class="email-text">Email:</h2>
        <input type="email" class="form-control form-control2" name="staffEmail">
        <h2 class="password-text">Password:</h2>
        <input type="password" class="form-control form-control3" name="staffPassword">
        <h3 class="password-subtext">Password must be at least 8 characters long</h3>
        <h2 class="department-text">Department:</h2>
        <input type="text" class="form-control form-control4" name="staffDepartment">
        <button class="btn">Register</button>
      </form>
    </body>
  </html>