<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.model.*"%>
<!DOCTYPE html>
<%@page import="com.model.Product"%>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Book Form</h2>
  <form action="addDatabase">
  

    <div class="form-group">
      <label for="ID">Product ID:</label>
      <input type="text" class="form-control" placeholder="ID" name="ID"  readonly> 
    </div>
    <div class="form-group">
      <label for="Name">Enter the Product Name:</label>
      <input type="text" class="form-control" placeholder="Enter name" name="name" > 
    </div>
    <div class="form-group">
      <label for="price">Enter the Price</label>
      <input type="text" class="form-control" placeholder="Enter price" name="price" >
    </div>
    <div class="brand">
      <label>Enter the brand of product</label><input type="text" class="form-control" placeholder="Enter brand of product" name="brand"> 
    </div>
    <div class="category">
      <label>Enter the category of product</label><input type="text" class="form-control" placeholder="Enter cateogry of product" name="category"> 
    </div>
    <div class="rating">
      <label>Enter the rating of product</label><input type="text" class="form-control" placeholder="Enter rating of product" name="rating"> 
    </div>
    <button type="submit" class="btn btn-default">Submit</button>
  </form>
</div>

</body> 
</html>