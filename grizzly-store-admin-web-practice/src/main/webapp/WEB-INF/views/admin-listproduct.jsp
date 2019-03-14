<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="styles/styles.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"> 
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
         <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
         <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
         
         <script type="text/javascript">
function handleSelect(elm)
{
window.location = elm.value;
}
</script>
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
                            <form class="mx-2 my-auto w-full">
                                <a href="logout" class="btn btn-secondary  form-rounded" >Logout
           
            </a>
                            </form>
                        </li>
                    </ul>
                        
            </nav>

<div class="container-fluid">
<hr>
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
    <picture>
        <img src="/profile.png" alt="Profile picture" width="50px"></img>
    </picture><br>
    <input id="prodId" name="userId" type="hidden" value=${user.userId}>
    <b>${pageContext.request.userPrincipal.name}</b>
<br><br>
ID: <br> ${userId}
<br><br>
Designation:<br>
${designation}
<br><br>
<address>
        Office:<br>
        ${address}
</address>
</center>
</div>
  </div>

                <div class="col-md-9 bg-light ">
            
                    <div class="btn-group col-md-12">
                        <div class="container">
                            
                            <!-- Nav tabs -->
                            <ul class="nav nav-tabs " role="tablist">
                              <li class="nav-item ">
                                <a class="nav-link active bg-dark" data-toggle="tab" href="#home" style="color:white">PRODUCTS</a>
                              </li>
                              <li class="nav-item bg-dark ">
                                <a class="nav-link bg-dark" data-toggle="tab" href="#menu1" style="color:white">INVENTORY</a>
                              </li>
                            
                            </ul>
                          
                            <!-- Tab panes -->
                            <div class="tab-content">
                              <div id="home" class="container tab-pane active"><br>
        
                        <div class="col-md-12 bg-light">
                                <form class="mx-2 my-auto d-inline w-20" action="ShowProductByCategoryServlet" method="POST">
                                        <div class="input-group">
                                                    &emsp;&nbsp;&nbsp;
                                                    <!-- <input type="text" name="category" class="form-rounded border border-right-0" placeholder="Category Name">
                                                    <span class="input-group-append">
                                                    <button class="btn btn-outline-secondary border border-left-0" type="submit">
                                                        <i class="fa fa-search"></i>                              
                                                    </button>
                                                  </span> -->
                                                  &emsp;&emsp;
                                                      <select name="select-city" onchange="location=this.value;">
<option value="">Select-Sorting Type</option>
 <option value="lowToHigh">Low To High</option>
 <option value="highToLow">High To Low</option>
 <option value="sortByCategory">By Category</option>
</select>  &emsp;&emsp;&emsp;&emsp;&emsp;
</form>
		<form class= "mx-2 my-auto w-full" action="addproduct" method="POST">
												<input id="prodId" name="userId" type="hidden" value=${user.userId}>   
                                                       <a href="addproduct" class="btn btn-dark form-rounded" >Add Product</a>
					</form>
<form>
                        </div>
    
                                     <br>     <br>                
                                     <table border="1" class="table table-bordered" style="background-color:#D4D5D5">
                                            <tr>
                                                <td>
                                                    <center><span style="color: black;font-weight:bold">List</span>
                                                </td>
                                                <td>
                                                        <center> <span style="color:black;font-weight:bold">Brand</span>
                                                    </td>
                                                    <td>
                                                            <center><span style="color:black;font-weight:bold">Category</span>
                                                        </td>
                                                        <td>
                                                            <center><span style="color:black;font-weight:bold">Price</span>
                                                        </td>
                                                        <td>
                                                                <center><span style="color: black;font-weight:bold">Rating</span>
                                                            </td>
                                                            <td>
                                                                    
                                                                </td>
                                            </tr>
						<c:forEach  var="product"  items= "${products}">
						
                        <tr>
                          <td>
                            <div class="checkbox checkbox-info checkbox-circle">
                              <input id="checkbox11" type="checkbox" >
                              <label for="checkbox11">
                                ${product.name}
                              </label>
                            </div>    
                          </td>
                          <td>
                            ${product.brand}
                          </td>
                          <td>
                            ${product.category}
                          </td>
                          <td>
                            ${product.price}
                          </td>
                          <td>
                            <span style="color: gray">${product.rating}
                            </span>
                          </td>
                          <c:url var="deleteLink" value="/product/delete">
                       <c:param name="productId" value="${product.id}"/>
                        </c:url>
                       <c:url var="viewLink" value="/product/view">
                       <c:param name="productId" value="${product.id}"/>
                        </c:url>
                          <td>
                            <center>
                              <a href="${deleteLink}" class="btn btn-secondary form-rounded"> &nbsp;Remove&nbsp; 
                              </a>&emsp;&emsp;
                             
								
                              <a  href= "${viewLink}" class="btn btn-secondary form-rounded">&nbsp;View&nbsp; 
                              </a>
                            </center>
                          </td>
                        </tr>
                       </c:forEach>                                

                                        </table>

                        </div>
               
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

           
</body>
</html>