<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<style>
body {
    font-family: "Lato", sans-serif;
}



.main-head{
    height: 150px;
    background: #FFF;
   
}

.sidenav {
    height: 100%;
    background-color: #000;
    overflow-x: hidden;
    padding-top: 20px;
}


.main {
    padding: 0px 10px;
}

@media screen and (max-height: 450px) {
    .sidenav {padding-top: 15px;}
}

@media screen and (max-width: 450px) {
    .login-form{
        margin-top: 10%;
    }

    .register-form{
        margin-top: 10%;
    }
}

@media screen and (min-width: 768px){
    .main{
        margin-left: 40%; 
    }

    .sidenav{
        width: 40%;
        position: fixed;
        z-index: 1;
        top: 0;
        left: 0;
    }

    .login-form{
        margin-top: 80%;
    }

    .register-form{
        margin-top: 20%;
    }
}


.login-main-text{
    margin-top: 20%;
    padding: 60px;
    color: #fff;
}

.login-main-text h2{
    font-weight: 300;
}

.btn-black{
    background-color: #000 !important;
    color: #fff;
}</style>
</head>


<div class="sidenav">
         <div class="login-main-text">
         <div>
         <center><img src="C:/Users/768848/Downloads/grizz.jfif" width=120 height=120></center>
         </div><br>
             <center><h2>Grizzly Store</h2><br></center>
             <center><p>Login from here to access.</p></center>
         </div>
      </div>
      <div class="main">
         <div class="col-md-6 col-sm-12">
            <div class="login-form">
               <form action="Product">
                  <div class="form-group">
                     <label><b>User Name</b></label>
                     <input type="text" class="form-control" placeholder="user" name="user" required>
                  </div>
                  <div class="form-group">
                     <label><b>Password</b></label>
                     <input type="password" class="form-control" placeholder="password" name="password" required>
                  </div>
                  <button type="submit" class="btn btn-black">Login</button>
                  
               </form>
            </div>
         </div>
      </div>

</body>
</html>