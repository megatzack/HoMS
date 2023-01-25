<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Staff Registration</title>

  <style>

    .main-title{
    position: absolute;
    width: 357px;
    height: 48px;
    left: 102px;
    top: 114px;
    
    font-family: 'Poppins';
    font-style: normal;
    font-weight: 600;
    font-size: 32px;
    line-height: 48px;
    color: #000000;
    }
    
    .sub-title{
    position: absolute;
    width: 360px;
    height: 17px;
    left: 106px;
    top: 180px;
    
    font-family: 'Inter';
    font-style: normal;
    font-weight: 500;
    font-size: 14px;
    line-height: 17px;
    
    color: #000000;
    }
    
    body{
    position: relative;
    background: #FFFFFF;
    }
    
    .btn{
    
    position: absolute;
    width: 490px;
    height:63px;
    left: 102px;
    top:749px;
    
    background: #06605B;
    border-radius:10px;
    }
    
    h2{
    position:absolute;
    font-family: 'Inter';
    font-weight: 500;
    font-size: 16px;
    line-height: 19px;
    }
    
    .name-text{
    width: 45px;
    height: 19px;
    left: 102px;
    top: 293px;
    }
    
    .email-text{
    width: 41px;
    height: 19px;
    left: 102px;
    top: 388px;
    }
    
    
    .password-text{
    width: 75px;
    height: 19px;
    left: 102px;
    top: 483px;
    }
    
    .department-text{
    position: absolute;
    width: 92px;
    height: 19px;
    left: 102px;
    top: 606px;
    }
    
    .form-control1{
    box-sizing: border-box;
    
    position: absolute;
    width: 490px;
    height: 45px;
    left: 102px;
    top: 330px;
    
    border: 1px solid #000000;
    }
    
    .form-control2{
    box-sizing: border-box;
    
    position: absolute;
    width: 490px;
    height: 45px;
    left: 102px;
    top: 425px;
    
    border: 1px solid #000000;
    }
    
    .form-control3{
    box-sizing: border-box;
    
    position: absolute;
    width: 490px;
    height: 45px;
    left: 102px;
    top: 520px;
    
    border: 1px solid #000000;
    }
    
    .form-control4{
    box-sizing: border-box;
    
    position: absolute;
    width: 490px;
    height: 45px;
    left: 102px;
    top: 643px;
    
    border: 1px solid #000000;
    }
    
    
    h3{
    font-family: 'Inter';
    font-style: normal;
    font-weight: 500;
    font-size: 14px;
    line-height: 17px;
    }
    
    .password-subtext{
    position: absolute;
    width: 271px;
    height: 17px;
    left: 102px;
    top: 555px;
    color:grey;
    }
    
    .image-1{
    position: absolute;
    left: 102px;
    top: 56px;
    }
    
    
    
    </style>
    
  </head>
    <body>
    
     <div style="background-color: white; width: 50%; height: 800px; float:left;">
     
     <img class="image-1" src="/image/HoMS-04.png" alt="logo_homs" width="120px" height="45.67px"/>
     
     <h1 class="main-title">Create New Staff Profile!</h1>
     <h3 class="sub-title">Please fill in the form to register a new staff member</h3>
     
    <form method="post" action="createStaff">
       <h2 class="name-text">Name:</h2>
       <input class="form-control1" type="text" name="staffName" placeholder="insert fullname"><br>
       
       <h2 class="email-text">Email:</h2>
       <input class="form-control2" type="text" name="staffEmail" placeholder="insert email"><br>
       
       <h2 class="password-text">Password:</h2>
       <input class="form-control3" type="password" name="staffPassword" placeholder="insert password"><br>
       <h3 class="password-subtext">*Password must be at least 8 characters</h3>
       
       <td><h2 class="department-text">Department</h2>
            <select class="form-control4" name="staffDepartment">
              <option>Ambulance Department</option>
              <option>Admin Administrator Department</option>
              <option>Inventory Department</option>
              <option>Staff Department</option>
            </select>
          </td><br><br><br>
       
       <input class="btn " type="submit" value="Create Account">
     </form>
     
     </div>
    
     <div style="background-color: lightgrey; width:50%; height: 820px; float:left;">
       <img src="/image/Surgeons Walking Through A Hospital Corridor by VICTOR TORRES.jpeg" alt="surgeon_image" width="100%" height="100%"/>
     </div>

</body>
</html>