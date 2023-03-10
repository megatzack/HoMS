
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ambulance staff view</title>
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

border: 4px solid #D9D9D9;
}

.content{
font-family: 'Inter';
font-style: normal;
font-weight: 500;
font-size: 16px;
line-height: 19px;
}

.image-input{
position: absolute;
width: 1215px;
height: 444px;
left: 155px;
top: 300px;
text-align: center;
}

.rounded-image{
	border: 5px solid grey;
    border-radius: 50%;
    width: 200px;
    height: 200px;
}

h3{
font-family: 'Inter';
font-style: normal;
font-weight: 500;
font-size: 16px;
line-height: 19px;
}

.staff-text{
position: absolute;
width: 86px;
height: 19px;
left: 30px;
top: 30px;
}

.contact-text{
position: absolute;
width: 86px;
height: 19px;
left: 500px;
top: 30px;
}

.location-text{
position: absolute;
width: 240px;
height: 19px;
left: 30px;
top: 150px;
}

.status-text{
position: absolute;
width: 190px;
height: 19px;
left: 500px;
top: 150px;
}

.ambulance-text{
position: absolute;
width: 190px;
height: 19px;
left: 30px;
top: 270px;
}

.date-text{
position: absolute;
width: 190px;
height: 19px;
left: 500px;
top: 270px;
}

.form-control1{
box-sizing: border-box;

position: absolute;
width: 340px;
height: 45px;
left: 30px;
top: 75px;

border: 1px solid #000000;
}

.form-control2{
box-sizing: border-box;

position: absolute;
width: 340px;
height: 45px;
left: 500px;
top: 75px;

border: 1px solid #000000;
}

.form-control3{
box-sizing: border-box;

position: absolute;
width: 340px;
height: 45px;
left: 30px;
top: 195px;

border: 1px solid #000000;
}

.form-control4{
box-sizing: border-box;

position: absolute;
width: 340px;
height: 45px;
left: 500px;
top: 195px;

border: 1px solid #000000;
}

.form-control5{
box-sizing: border-box;

position: absolute;
width: 340px;
height: 45px;
left: 30px;
top: 316px;

border: 1px solid #000000;
}

.form-control6{
box-sizing: border-box;

position: absolute;
width: 340px;
height: 45px;
left: 500px;
top: 316px;

border: 1px solid #000000;
}

.btn{
position: absolute;
width: 152px;
height: 47px;
left: 800px;
top: 380px;

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
        	<h1 class="main-title">Ambulance Management</h1>
        	<h4 class="sub-title">Ambulance Department Staff View</h4>
        </div>
    </div>

<div class="content-header">
  	
  	<div class="content-table">

    <!-- main content goes here -->
    	<div class ="content">

			<form method="post" action="updateMyProfile">

   			<h3 class="staff-text">Name:</h3>
   			<input class="form-control1" type="text" name="name" placeholder="insert fullname" th:value="${ambulance.getName()}" readonly><br>
   
   			<h3 class="contact-text">Contact:</h3>
   			<input class="form-control2" type="tel" name="contact" placeholder="012-3456789" th:value="${ambulance.getContact()}"><br>
   
    		<h3 class="location-text">Pickup Location Address: (locked)</h3>
   			<input class="form-control3" type="text" name="location" placeholder="4 Jalan Selayang,68100 Batu Caves" th:value="${ambulance.getLocation()}" readonly><br>

			<td><h3 class="status-text">Status</h3>
        		<select class="form-control4" name="status">
          		<option>Available</option>
          		<option>Busy</option>
        		</select>
      		</td> 
      		
      		<td><h3 class="ambulance-text">Ambulance</h3>
        	<select class="form-control5" name="ambulancePlate">
				<option>WAV333</option>
				<option>WVU6753</option>
				<option>VMW3245</option>
				<option>PGK3332</option>
			  	<option>WVY3334</option>
			  	<option>KEK2022</option>
			  	<option>KAM4302</option>
        	</select>
      		</td>

			
      
      		<input class="btn " type="submit" value="Update">
			</form>     
				
		</div>
 
 	</div>
 
 </div>
      

</body>
</html>