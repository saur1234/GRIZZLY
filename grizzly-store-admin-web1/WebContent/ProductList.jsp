<%@page import="com.model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Products</title>
</head>
<body>
<a href="add" ><b><h3><center>Add New Entry</center></h3></b></a>
<form action="">
  <div align="center">
     <table border="1" cellpadding="5">
          <caption><h2>list of products</h2></caption>
           <tr>
               <th>ID</th>
               <th>Name</th>
               <th>price</th>
               <th>brand</th>
               <th>category</th>
               <th>rating</th>
           </tr>
     
 
<%ArrayList<Product> list=(ArrayList<Product>) session.getAttribute("productlist");
for(int i=0 ; i<list.size() ; i++)
{%>
<% out.print("<tr><td>"+list.get(i).getId()+"</td><td>"+list.get(i).getName()+"</td><td>"+list.get(i).getPrice()+"</td><td>"+list.get(i).getBrand_name()+"</td><td>"+list.get(i).getCategory()+"</td><td>"+list.get(i).getRating()+"</td>");
%>

<td><a href=delete?id=<%=list.get(i).getId()%>>Delete</a></td>

<% }
%> 

</table>
</div>
</form>
<div align="left">
<a href="login.jsp">Logout!</a>
</div>
</body>
</html>