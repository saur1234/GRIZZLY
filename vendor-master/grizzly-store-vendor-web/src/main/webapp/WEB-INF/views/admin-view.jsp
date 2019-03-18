 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
  <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="en">
<head> <title>View Products</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="styles/styles.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"> 
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
         <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
         <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
</head>
<body>
        <nav class="navbar navbar-expand-md  bg-dark navbar-dark">
                <img src="images/smlogo.png"></img>
                                 
                     <h3 class="mx-2 my-auto d-inline w-20" style="color:white">GRIZZLY STORE </h3>

               <ul class="navbar-nav ml-auto">
                   <li class="nav-item">
                       <a class="nav-link" href="#"><span class="fa fa-bell"></span></a>
                   </li>
                   <li class="nav-item">
                       <span class="navbar-text">
                           Welcome, ${pageContext.request.userPrincipal.name}
                       </span>
                   </li>
                   </ul>
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item">
                            <form class="mx-2 my-auto w-full" action="logout">
                                <button class="btn btn-secondary form-rounded" type="submit">Logout</button>
                            </form>
                        </li>
                    </ul>
                        
            </nav>
<hr>
<div class="container-fluid">
    <div class="row">
            <div class="col-md-3 bg-light">
                <nav class="navbar navbar-expand-md navbar-dark bg-secondary">
                    <span class="navbar-text navbar-">PROFILE</span>
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item">
                            <a href="" style="color: aliceblue">Edit</a>
                        </li>
                    </ul>
                </nav>

<br>
<div style="background-color:#D4D5D5"><center>
    <picture>
        <img src="images/profile.png" alt="Profile picture" width="50px"></img>
    </picture><br>
    <b>${pageContext.request.userPrincipal.name}</b>
<br><br>
ID:<br> ${user.id}
<br><br>
Designation:<br>
${user.designation}
<br><br>
<address>
        Office:<br>
        ${user.address}
</address>
</center>
</div>
  </div>

                <div class="col-md-6 bg-light">
            
                    <div class="btn-group col-md-12">
                        <div class="container">
                            
                            <!-- Nav tabs -->
                            <ul class="nav nav-tabs" role="tablist">
                              <li class="nav-item">
                                <a class="nav-link active bg-dark" data-toggle="tab" href="#home" style="color:white">PRODUCTS</a>
                              </li>
                              <li class="nav-item">
                                <a class="nav-link bg-dark" data-toggle="tab" href="#menu1" style="color:white">VENDORS</a>
                              </li>
                            
                            </ul>
                          
                            <!-- Tab panes -->
                            <div class="tab-content">
                              <div id="home" class="container tab-pane active"><br>
                                
                                        <div class="container-fluid">
                                    <div class="row">
        
                        <div class="col-md-8 ">
                                <span><h3>${product.name} by <b>${product.brand} </b></h3></span>
                            
                                <br><br><br><br>
                                <div id="demo" class="carousel slide" data-ride="carousel">

                                    <!-- Indicators -->
                                    <ul class="carousel-indicators">
                                      <li data-target="#demo" data-slide-to="0" class="active"></li>
                                      <li data-target="#demo" data-slide-to="1"></li>
                                      <li data-target="#demo" data-slide-to="2"></li>
                                    </ul>
                                  
                                    <!-- The slideshow -->
                                    <div class="carousel-inner">
                                      <div class="carousel-item active">
                                        <img src="images/1.jpg" alt="Picture 1" width="50%">
                                      </div>
                                      <div class="carousel-item">
                                        <img src="images/logo.png" alt="Picture 2">
                                      </div>
                                      <div class="carousel-item">
                                        <img src="images/logo.png" alt="Picture 3">
                                      </div>
                                    </div>
                                  
                                    <!-- Left and right controls -->
                                    <a class="carousel-control-prev" href="#demo" data-slide="prev">
                                      <span class="carousel-control-prev-icon"></span>
                                    </a>
                                    <a class="carousel-control-next" href="#demo" data-slide="next">
                                      <span class="carousel-control-next-icon"></span>
                                    </a>
                                  
                                  </div>
                            </div>
        
        
                        <div class="col-md-4 "> 
                                     <br>  <br> <br>          <br>  
                                     <span style="color:gray"><h4>Description</h4></span>   
                                     <br><br>                 
        <span style="color: gray"><b>${product.description}</b></span>
       
                
        </textarea>

                        </div>
        
                        
                </div></div>
                              </div>
                              <div id="menu1" class="container tab-pane fade"><br>
                                <p>
                                    VENDOR SIDE
                                    </p>
                              </div>
                            </div>
                          </div>
                    </div>
                    <br>
    </div>    
<div class="col-md-3">
    <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
            
            &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
            <a href="list" class="btn btn-secondary form-rounded" >Back</button>
    
    </div>
           
</body>
</html>