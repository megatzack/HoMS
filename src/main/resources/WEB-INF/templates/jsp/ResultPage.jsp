<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
   <head>
      <title>Result</title>
   </head>
   <body>
   <% if ((request.getParameter("username") == "admin1") && (request.getParameter("password") == "abc")){ %>
        <h1>Welcome back admin</h1>
      <% } else if ((request.getParameter("username") == "staff1") && (request.getParameter("password") == "def")){ %>
      <p><b>Welcome back staff.</b>
      <% } %>
      
   </body>
</html>