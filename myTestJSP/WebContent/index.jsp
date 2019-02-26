<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@include file="list.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%out.println("welcometo jsp");%>
<br>
<a href='list.jsp'>go</a>
<br>
<form  action="greed.jsp">
userid<input type="text" name="userid">
<br>password<input type="password" name="password">
<br>
<input type="submit" name="button1" value="Login">
</form>
<%session.setAttribute("year",2019);%>


</body>
</html>