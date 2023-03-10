<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Staff view schedule</title>

<style>
.menu-container{
position: absolute;
width: 100%;
height: 241px;
top: 0px;
left: 0px;
background-image:url('/image/pattern-04.png');
}

.image1{
position: absolute;
left:75px;
top:36px;
}

.menu-info{
font-family: 'Poppins';
font-style: normal;
font-weight: 600;
font-size: 20px;
line-height: 30px;
color: #FFFFFF;
}

.home{
position: absolute;
top: 45px;
width: 61px;
height: 30px;
left: 659px;
}

.doctor{
position: absolute;
width: 68px;
height: 30px;
left: 770px;
top: 45px;
}

.services{
position: absolute;
width: 86px;
height: 30px;
left: 888px;
top: 45px;
}

.review{
position: absolute;
width: 72px;
height: 30px;
left: 1015px;
top: 45px;
}

.about{
position: absolute;
width: 92px;
height: 30px;
left: 1128px;
top: 45px;
}

.logout{
position: absolute;
width: 152px;
height: 47px;
left: 1285px;
top: 33px;
text-align:center;

background: #FFFFFF;
border-radius: 10px;
}

.main-title{
position: absolute;
width: 472px;
height: 54px;
left: 520px;
top: 100px;
text-align:center;

font-family: 'Poppins';
font-style: normal;
font-weight: 600;
font-size: 36px;
line-height: 54px;
/* identical to box height */


color: #FFFFFF;

}

.sub-title{
position: absolute;
width: 200px;
height: 17px;
left: 672px;
top: 160px;
text-align:center;

font-family: 'Inter';
font-style: normal;
font-weight: 500;
font-size: 14px;
line-height: 17px;
/* identical to box height */


color: #FFFFFF;
}

.content-table{
box-sizing: border-box;

position: absolute;
width: 1000px;
height: 500px;
left: 255px;
top: 300px;

}

.content{
font-family: 'Inter';
font-style: normal;
font-weight: 500;
font-size: 16px;
line-height: 19px;
}

.staff-text{
position: absolute;
width: 150px;
height: 19px;
left: 100px;
top: 30px;

}

.contact-text{
position: absolute;
width: 150px;
height: 19px;
left: 570px;
top: 30px;
}

.oncall-text{
position: absolute;
width: 150px;
height: 19px;
left: 100px;
top: 150px;
}

.oc-timein-text{
position: absolute;
width: 80px;
height: 19px;
left: 100px;
top: 180px;
}

.oc-timeout-text{
position: absolute;
width: 90px;
height: 19px;
left: 370px;
top: 180px;
}

.schedule-text{
position: absolute;
width: 200px;
height: 19px;
left: 100px;
top: 235px;
}

.sc-timein-text{
position: absolute;
width: 80px;
height: 19px;
left: 100px;
top: 265px;
}

.sc-timeout-text{
position: absolute;
width: 90px;
height: 19px;
left: 370px;
top: 265px;
}

.notes-text{
position: absolute;
width: 120px;
height: 19px;
left: 100px;
top: 320px;
}

.form-control1{
box-sizing: border-box;

position: absolute;
width: 340px;
height: 45px;
left: 100px;
top: 75px;

border: 1px solid #000000;
}

.form-control2{
box-sizing: border-box;

position: absolute;
width: 340px;
height: 45px;
left: 570px;
top: 75px;

border: 1px solid #000000;
}

.form-control3{
box-sizing: border-box;

position: absolute;
width: 100px;
height: 30px;
left: 180px;
top: 195px;

border: 1px solid #000000;
}

.form-control4{
box-sizing: border-box;

position: absolute;
width: 100px;
height: 30px;
left: 470px;
top: 195px;

border: 1px solid #000000;
}

.form-control5{
box-sizing: border-box;

position: absolute;
width: 100px;
height: 30px;
left: 180px;
top: 280px;

border: 1px solid #000000;
}

.form-control6{
box-sizing: border-box;

position: absolute;
width: 100px;
height: 30px;
left: 470px;
top: 280px;

border: 1px solid #000000;
}

.form-control7{
box-sizing: border-box;

position: absolute;
width: 800px;
height: 50px;
left: 100px;
top: 380px;

border: 1px solid #000000;
}

.btn{
position: absolute;
width: 152px;
height: 47px;
left: 770px;
top: 500px;

background: #06605B;
border-radius: 10px;
}

a {
  color: white;
  text-decoration: none;
  
}

a:hover{
	color: green;
}
</style>

</head>
<body>

<!-- header content goes here -->
    <div class = 'menu-container'>
        <div class ='menu'>
         <div class ='image1'><img src="/image/HoMS-05.png" alt="logo" width=120px height=45.67px/></div>
          <div class = 'menu-info'>
            <div class ='home'><a href="">Home</a></div>
            <div class ='doctor'><a href="">Doctor</a></div>
            <div class ='services'><a href="">Services</a></div>
            <div class ='review'><a href="">Review</a></div>
            <div class ='about'><a href="">About Us</a></div>
            <div><button class ='logout' onclick="location.href='/logout'">Log Out</button></div>
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
    	<div class ="content">
    	
    	<form method="post" action="">

  			<h3 class="staff-text">Staff Names</h3>
  			<input class="form-control1" type="text" name="fullname" placeholder="insert fullname" th:value="${schedule.getName()}" readonly>
   
   			<h3 class="oncall-text">On-Call Time</h3>
   
   			<h3 class="oc-timein-text">Time In:</h3> <input class="form-control3" type="text" name="ocInTime" th:value="${schedule.getOcInTime()}" readonly><br>
   
   			<h3 class="oc-timeout-text">Time Out:</h3> <input class="form-control4" type="text" name="ocOutTime" th:value="${schedule.getOcOutTime()}" readonly><br>

			<h3 class ="schedule-text">Today Schedule</h3>
			<h3 class = "sc-timein-text">Time In:</h3> <input class="form-control5" type="text" name="tcInTime" th:value="${schedule.getTcInTime()}" readonly><br>
			<h3 class="sc-timeout-text">Time Out:</h3> <input class="form-control6" type="text" name="tcOutTime" th:value="${schedule.getTcOutTime()}" readonly><br>
	
			<h3 class="notes-text">Notes</h3>
			<input class="form-control7" name="notes" th:value="${schedule.getNotes()}" readonly>
	
			<input class="btn " type="submit" value="done">
		</form>
		</div>
 
 	</div>
 
 </div>
      
</body>
</html>