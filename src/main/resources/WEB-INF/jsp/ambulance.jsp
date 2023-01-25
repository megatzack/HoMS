<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Assign Ambulance</title>
<style>

.menu-container{
position: absolute;
width: 100%;
height: 241px;
top: 0px;
left: 0px;
background-image:url('images/pattern-04.png');
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
width: 168px;
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
width: 1215px;
height: 444px;
left: 155px;
top: 330px;

border: 4px solid #D9D9D9;
}

.content{
font-family: 'Inter';
font-style: normal;
font-weight: 500;
font-size: 16px;
line-height: 19px;
}

.ambulance{
position: absolute;
width: 86px;
height: 19px;
left: 55px;
top: 25px;
}

.select_ambulance{
box-sizing: border-box;

position: absolute;
width: 340px;
height: 45px;
left: 55px;
top: 65px;

border: 1px solid #000000;
}

.name{
position: absolute;
width: 140px;
height: 19px;
left: 55px;
top: 120px;
}

.form-control1{
box-sizing: border-box;

position: absolute;
width: 340px;
height: 45px;
left: 55px;
top: 160px;

border: 1px solid #000000;
}

.contact{
position: absolute;
width: 230px;
height: 19px;
left: 500px;
top: 120px;
}

.form-control2{
box-sizing: border-box;

position: absolute;
width: 340px;
height: 45px;
left: 500px;
top: 160px;

border: 1px solid #000000;
}

.status{
position: absolute;
width: 180px;
height: 19px;
left: 1000px;
top: 120px;
}


.form-control3{
box-sizing: border-box;

position: absolute;
width: 150px;
height: 45px;
left: 1000px;
top: 160px;

border: 1px solid #000000;
}

.location{
position: absolute;
width: 66px;
height: 19px;
left: 55px;
top: 215px;
}

.form-control4{
box-sizing: border-box;

position: absolute;
width: 340px;
height: 45px;
left: 55px;
top: 255px;

border: 1px solid #000000;
}

.date{
position: absolute;
width: 66px;
height: 19px;
left: 500px;
top: 215px;
}

.form-control5{
box-sizing: border-box;

position: absolute;
width: 340px;
height: 45px;
left: 500px;
top: 255px;

border: 1px solid #000000;
}

.time{
position: absolute;
width: 150px;
height: 19px;
left: 1000px;
top: 215px;
}

.form-control6{
box-sizing: border-box;

position: absolute;
width: 150px;
height: 45px;
left: 1000px;
top: 255px;

border: 1px solid #000000;
}

.btn{
position: absolute;
width: 152px;
height: 47px;
left: 1020px;
top: 360px;

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
         <div class ='image1'><img src="images/HoMS-05.png" alt="logo" width=120px height=45.67px/></div>
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
        	<h1 class="main-title">Ambulance Management</h1>
        	<h4 class="sub-title">HoMS Specialist Hospital</h4>
        </div>
    </div>
  
  <div class="content-header">
  	<div class="content-table">
  
    <!-- main content goes here -->
    	<div class ="content">
    		<form method="post" action="">
 
			<td><h3 class="ambulance">Ambulance</h3>
        	<select class="select_ambulance" name="select_ambulance">
          		<option>WAV 333</option>
          		<option>WVU 6753</option>
          		<option>VMW 3245</option>
          		<option>PGK 3332</option>
        	</select>
      		</td>
 
   			<h3 class="name">Name: (locked)</h3>
   			<input class="form-control1" type="text" name="fullname" placeholder="insert fullname" disabled><br>
   
   			<h3 class="contact">Contact Number: (locked)</h3>
   			<input class="form-control2" type="tel" name="phone" placeholder="012-3456789" disabled><br>
   
   			<h3 class="status">Status: (locked)</h3>
  			<input class="form-control3" type="text" name="status" placeholder="insert availability" disabled><br>
  
   			<h3 class="location">Location:</h3>
  			<input class="form-control4" type="text" name="location" placeholder="insert location"><br>
  
   			<h3 class="date">Date:</h3>
  			<input class="form-control5" type="date" name="date" placeholder="Date"><br>
  
   			<h3 class="time">Time:</h3>
  			<input class="form-control6" type="time" name="time" value="12:00" ><br>
   
   			<input class="btn " type="submit" value="Update">
 			</form>
 		</div>
 
 	</div>
 
 </div>

 

</body>
</html>