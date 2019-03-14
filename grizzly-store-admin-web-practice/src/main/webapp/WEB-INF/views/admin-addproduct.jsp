<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
      <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Admin - Add Product
    </title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js">
    </script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js">
    </script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js">
    </script>
    <link rel="stylesheet" href="styles/styles.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
        input[type="file"] {
    
         display:block;
        }
        .imageThumb {
         max-height: 75px;
         border: 2px solid;
         margin: 10px 10px 0 0;
         padding: 1px;
         }
        </style>
        <script type="text/javascript">
       $(document).ready(function() {
  if (window.File && window.FileList && window.FileReader) {
    $("#files").on("change", function(e) {
      var files = e.target.files,
        filesLength = files.length;
      for (var i = 0; i < filesLength; i++) {
        var f = files[i]
        var fileReader = new FileReader();
        fileReader.onload = (function(e) {
          var file = e.target;
          $("<span class=\"pip\">" +
            "<img class=\"imageThumb\" width=\"25%\" src=\"" + e.target.result + "\" title=\"" + file.name + "\"/>" +
            "<br/><span class=\"remove\">Remove image</span>" +
            "</span>").insertAfter("#files");
          $(".remove").click(function(){
            $(this).parent(".pip").remove();
          });
        
          
        });
        fileReader.readAsDataURL(f);
      }
    });
  } else {
    alert("Your browser doesn't support to File API")
  }
});
        </script>  

</head>
  <body>
    <nav class="navbar navbar-expand-md bg-dark navbar-dark">
      <a class="navbar-brand" href="#">
        <img src="images/smlogo.png" alt="logo">
      </a>
     <h3 class="mx-2 my-auto d-inline w-20" style="color:white">GRIZZLY STORE </h3>
      <ul class="navbar-nav ml-auto">
        <li class="nav-item">
          <a class="nav-link" href="#">
            <span class="fa fa-bell">
            </span>
          </a>
        </li>
        <li class="nav-item">
          <span class="navbar-text">
            Welcome, ${pageContext.request.userPrincipal.name}
            
          </span>
        </li>
      </ul>
      <ul class="navbar-nav ml-auto">
        <li class="nav-item">
          <form class= "mx-2 my-auto w-full" method="GET">
            <a href="LogoutServlet" class="btn btn-secondary  form-rounded" >Logout
            
            </a>
          </form>
        </li>
      </ul>
    </nav>
    <div class="container-clearfix">
      <hr>
    </div>
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
          <div style="background-color:#D4D5D5">
          <center>
            <img src="images/profile.png" alt="Profile Picture" width="50%">
            <br>
            <br>
            <b> ${userName}
            </b>
            <br>
            <br>
            ID:  ${userId}
            <br> 
            <br>
            <br>
            Designation:
            <br>
             ${designation}
            <br>
            <br>
            Office:
            <br>
             ${address}
          </center>
          </div>
        </div>
        <div class="col-md-6" >
          <div class="container">
            <ul class="nav nav-tabs" role="tablist">
              <li class="nav-item">
                <a class="nav-link active  bg-dark" data-toggle="tab" href="#home" style="color:white">PRODUCTS
                </a>
              </li>
              <li class="nav-item">
                <a class="nav-link  bg-dark" data-toggle="tab" href="#menu1" style="color:white">VENDORS
                </a>
              </li>
            </ul>
            <!-- Tab panes -->
            <div class="tab-content" style="border:2px #636669">
              <div id="home" class="container tab-pane active" style="background-color:#D6D7D9">
                <br>
                <br>
                <br>
               
                <div class="container-fluid"  >
                  <div class="row">
                    <div class="col-md-8" >
                         <picture>
                        <center>
                          <br>
                          <br>
                          <br>
                          <label for="files">
                            <img src="images/add.png"/>
                        </label>
                          <input type="file" id="files" name="files[]" multiple hidden />
                          <br>
                          <br>
                          <br>
                          <b>Add Images
                          </b>
                          <br>
                          <br>
                        </center>
                      </picture>
                    </div>
                    
                    <div class="col-md-4" style="background-color:#D4D5D">
                      <form class= "mx-2 my-auto w-full" action="saveProduct" method="POST" modelAttribute="product">
                       
                       <select name="Category">
    <option value="Personal Care">Personal Care</option>
    <option value="Art Supplies">Art Supplies</option>
    <option value="Clothing">Clothing</option>
    <option value="Eatables">Eatables</option>
                         </select>
                         <br><br>
                        <input type="text" name="name" placeholder="Name" required>
                          <br><br><input type="text" placeholder="Enter Product Decription" name="description" required>
                        <br><br><input type="text" placeholder="Enter Product Price" name="price" required>
                          <br><br><input type="text" placeholder="Enter Product Brand" name="brand" required>
                         
                          <br><br><input type="text" placeholder="Enter Product Rating" name="rating" required>
                                  
                       <input id="prodId" name="userId" type="hidden" value=${user.userId}>
                       <span style="color:red"><b>${productError}</b></span>
                                   </div>
                  </div>   
                </div>
              </div>
              <div id="menu1" class="container tab-pane fade">
                <br>
              </div>
            </div>
            <!--tab ends here-->
          </div>
        </div>
        <div class="col-md-3">
          <button type ="submit" class="btn btn-dark form-rounded" style="width:30%; position: absolute; bottom: 50px; right: 20px;">Add
          </button>
          <br>
          <a href="list" class="btn btn-secondary form-rounded" style="width:30%;  position: absolute; bottom: 0; right: 20px;" >Cancel
         </a>
        </form>
        </div>
      </div>
      
      </body>
    </html>