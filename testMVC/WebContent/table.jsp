<%@page import="com.model.Book"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book</title>
</head>
<body>
<a href="New" ><b><h3><center>Add New Entry</center></h3></b></a>
<form action="">
  <div align="center">
     <table border="1" cellpadding="5">
          <caption><h2>list of books</h2></caption>
           <tr>
               <th>ID</th>
               <th>Title</th>
               <th>Author</th>
               <th>price</th>
               <th>update</th>
               <th>Delete</th>
           </tr>
     
 
<%ArrayList<Book> list=(ArrayList<Book>) session.getAttribute("booklist");
for(int i=0 ; i<list.size() ; i++)
{%>
<% out.print("<tr><td>"+list.get(i).getId()+"</td><td>"+list.get(i).getTitle()+"</td><td>"+list.get(i).getAuthor()+"</td><td>"+list.get(i).getPrice());
%>
<td><a href=edit?id=<%=list.get(i).getId()%>>Edit</a></td>
<td><a href=delete?id=<%=list.get(i).getId()%>>Delete</a></td>
<% }
%> 
</table>
</div>
</form>
</body>
</html>