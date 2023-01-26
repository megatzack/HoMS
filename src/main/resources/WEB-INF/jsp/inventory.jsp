<!--<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Model.Inventory" %>
<%@page import="java.util.ArrayList"%>-->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="description" content="MoHS Inventory Page">
    <meta name="keywords" content="Inventory">
    <meta name="author" content="Amin Haiqal">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">  
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
    <link rel="shortcut icon" href="https://drive.google.com/uc?id=1P0d6aIdRMr61ImxVX2uAvYFrRzKb3PQo">
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <link rel="stylesheet" href="/css/inventory.css">
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular-route.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
    <script> src="/js/inventory.js"</script>
    <title>HoMS</title>
</head>

<!--<%	ArrayList<Inventory> inventoryList = (ArrayList)request.getAttribute("inventory"); %>-->

<body>
     <!--Pattern
     <pattern>
        <img src="/image/pattern.png" alt="pattern">
    </pattern>-->

    <!--My Cart
    <div class="container-fluid" id="myCart">
        <div class="d-flex justify-content-between align-items-center">
            <h3 style="color: white;"><b>Medical Shop</b></h3>
            <form action="" target="_blank">
                <button type="button" class="btn btn-primary" style="background-color:#06605B;">My Cart</button>
            </form>
        </div>
    </div>-->
            <div th:each="inventoryList : ${inventoryList}">
                <p th:text="${inventoryList.getName()}"></p>
            </div>
            
    <!--<div class="container-fluid">
        <div class="row row-cols-1 row-cols-sm-2 row-cols-md-4 g-3" id="item">
        
            <% if(request.getAttribute("inventory") != null) {
               		for(Inventory inventory: inventoryList) {
            %>
            <div class="col">
            	<div class="card shadow-sm align-items-center">
                    <img alt="item" width="80%" height="50%" src=<%= inventory.getPath() %>>
                    <div class="card-body border-top">
                      <div class="card-text">
                       <h4><%= inventory.getTitle() %></h4>
                       <p><%= inventory.getDescription() %></p>
                      </div>
                      <div class="d-flex justify-content-between align-items-center">
                        <price class="text-muted">
                            <h5><b>RM<%= inventory.getPrice() %></b></h5>
                        </price>
                        <div class="btn-group">
                          <button type="button" class="btn btn-sm" style="background-color: #06605B; color: white;">Add to Cart</button>
                        </div>
                      </div>
                    </div>
                  </div>
              </div>
                  <%}
                  }
                  else {
                  %>
                  <p>Nothing to see here</p>
                  <% }%>
        </div>
    </div>-->
</body>
</html>