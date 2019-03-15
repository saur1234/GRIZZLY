<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.model.*"%>
<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<style>
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
  font-size: 12px;
}

a {
  text-decoration: none;
  font-size: 13px;
  color: black;
}

button:hover, a:hover {
  opacity: 0.7;
}</style>
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

      <button type="submit" class="btn btn-default">Submit</button>
          
    </form>
  
  </div>
</nav>

</div>
<div class="container-fluid">
  <h2><center>Product Form</center></h2>

<div class="col-sm-3">
<br><br><br>
<br>
<!--<div class="card"><br><h4><b>
<% //out.print(l.getFullname());%>
</b></h4><p class="title"><% //out.print(l.getContact());%></p><p><% //out.print(l.getAddress());%></p><div style="margin: 24px 0">

  </div>
  -->
  <p><br><br><br><br><br><br></p>
</div>
</div>
<div class="col-sm-9">

<form action="add">
 <div class="form-group">
     
      <input type="text" class="form-control" placeholder="Enter the vendor" name="vendor" required>
    </div>
  <div class="form-group">
     
      <input type="text" class="form-control" placeholder="Enter Product ID" name="id" required>
    </div>
    
<div class="form-group">

      <input type="text" class="form-control" placeholder="Enter Product category" name="category" >
    </div>
    
  
    <div class="form-group">

      <input type="text" class="form-control" placeholder="Enter Product name" name="name">
    </div>
    
    <div class="form-group">

      <input type="text" class="form-control" placeholder="Enter Product brand" name="brand">
    </div>
    
    <div class="form-group">
    <input type="text" class="form-control" placeholder="Enter Price of Product" name="price"> 
    </div>
    
       <div class="form-group">

      <input type="text" class="form-control" placeholder="Enter Total Stock" name="stock">
    </div>
    
       
    
       <div class="form-group">

      <input type="text" class="form-control" placeholder="Enter required stock" name="req">
    </div>
    
    <div class="form-group">

      <input type="text" class="form-control" placeholder="Enter Offer on Product" name="offer">
    </div>
    
    <br>
   


<br>
    <button type="submit" class="btn btn-default">Submit</button>
    
  </form>
     <br><br><form action="cancel"><input type="submit" value="back">
      </form>
  </div>
  </div>
  


</body> 
</html>