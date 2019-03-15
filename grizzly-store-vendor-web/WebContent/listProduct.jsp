<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.model.Product,java.util.*,com.model.Login"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <title>Product List</title>
   <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  
<style>
.bbb {
  background-color: grey;
  color: white;
  padding: 4px 18px;
  text-align: center; 
  text-decoration: none;
  display: inline-block;
  border-radius: 20px;
}



.vl {
  border-left: 6px solid black;
  height: 500px;
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
  font-size: 12px;
}

a {
  text-decoration: none;
  font-size: 13px;
  color: black;
}

button:hover, a:hover {
  opacity: 0.7;
}
</style>
  
</head>

<body>

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

<br>

<p align="right">
<a href="logout" class="bbb">Logout</a></p>

<br>
  <br>
    <ul class="nav nav-pills nav-justified">
    <li class="active ac" ><a href="#">Products</a></li>
    <li><a href="inventory">Inventory</a></li>

  </ul>
  <br><br>
<p align="right">
<a href="new" class="bbb">Add Product</a>
</p>
<table class="table table-hover">
            <tr>
                <th scope="col">Product List</th>
                <th scope="col">ID</th>
                <th scope="col">Brand</th>
                <th scope="col">Category</th>
                <th scope="col">Offer</th>
                <th scope="col"></th>
                <th scope="col"></th>
                <th scope="col"></th>
            </tr>
       
            <c:forEach var = "i" items="${ListProducts}">
        
        	  <tr>
        	  <td scope="row">"${i.name}"</td>
        	   <td>"${i.pid}"</td>
        	  <td>"${i.brand}"</td>
        	  <td>"${i.category}"</td>
        	  <td>"${i.offer}"</td>
        	<td><p size=12><a href=view?id=${i.pid} class="bbb">View</a></td>
        	
        	<td><a href=remove?id=${i.pid} class="bbb">delete</a></td></tr></p>
           
      </c:forEach>     
        </table>
      </div>


</body>
</html>