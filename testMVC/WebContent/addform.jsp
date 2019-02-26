<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.model.*"%>
<!DOCTYPE html>
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
  <form action="update">
  
  <%Book b=(Book)request.getAttribute("book");%>
    <div class="form-group">
      <label for="ID">Enter the Book ID:</label>
      <input type="text" class="form-control" placeholder="ID" name="ID" value=<%=b.getId()%> readonly> 
    </div>
    <div class="form-group">
      <label for="Title">Enter the Book Title:</label>
      <input type="text" class="form-control" placeholder="Enter Title" name="title" value=<%=b.getTitle()%>> 
    </div>
    <div class="form-group">
      <label for="author">Enter the Book Author:</label>
      <input type="text" class="form-control" placeholder="Enter Author" name="author" value=<%=b.getAuthor()%>>
    </div>
    <div class="price">
      <label>Enter the price of book</label><input type="text" class="form-control" placeholder="Enter Price of Book" name="price" value=<%=b.getPrice()%>> 
    </div>
    <button type="submit" class="btn btn-default">Submit</button>
  </form>
</div>

</body> 
</html>