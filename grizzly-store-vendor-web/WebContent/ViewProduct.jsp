<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.model.*"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
  <html>
  <head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<style>  
  .vl {
  border-left: 6px solid black;
  height: 500px;
}
.bb {
  background-color: grey;
  color: white;
  padding: 4px 18px;
  text-align: center; 
  text-decoration: none;
  display: inline-block;
  border-radius: 30px;
}

.bb,a:hover{	
 color: blue;
}
.ac{
background:grey;
}


.card {
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
  max-width: 300px;
  margin: auto;
  text-align: center;
  font-family: arial;
}

.title {
  color: grey;
  font-size: 18px;
}

.button {
  border: none;
  outline: 0;
  display: inline-block;
  padding: 8px;
  color: white;
  background-color: #3498DB;
  text-align: center;
  cursor: pointer;
  width: 100%;
  font-size: 13px;
}

a {
  text-decoration: none;
  font-size: 12px;
  color: black;
}

button:hover, a:hover {
  opacity: 0.7;
}



</style>
<body>
<%Login l=(Login)session.getAttribute("userList");%>
<div>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#"><img src="C:/Users/768848/workspace/grizzly-store-admin-web/WebContent/images/grizz.jfif" width=30 height=30 align="left" alt="Grizzly">Grizzly Store</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
     
    </ul>
    <form class="navbar-form navbar-left" action="/action_page.php">
      <div class="form-group">
        <input type="text" class="form-control" placeholder="Search">
      </div>

      <button type="submit" class="btn btn-default" class="bb">Submit</button>
      
    </form>
  </div>
</nav>
</div>
<div class="container-fluid">

<br>
<br>

  <p><br></p>



<%Product lp=(Product)session.getAttribute("View");

%>
<br><br><br>
<p align="right">
<a href="logout" class="bb">Logout</a>
</p>
<br><br><br>
	<div align="center">
	
        <table class="table table-condensed">
        
            <tr>
                <th>Name</th>
                <th>Brand</th>
                <th>Offer</th>
                <th>Rating</th>
                <th>Price</th>
            </tr>
           <%
          
        	  Product b=lp;
        	  out.print("<tr><td>"+b.getName()+"</td><td>"+b.getBrand()+"</td><td>"+b.getOffer()+"</td><td>"+b.getRating()+"</td>");
        	 out.print("<td>"+b.getPrice()+"</td>");
           %>  
           
        </table>

      <br><br><form action="cancel"><input type="submit" value="back">
      </form>
</div>
<br><br>

</div>



</body>
  
        	
 
  </head>
  </html>  
   
       