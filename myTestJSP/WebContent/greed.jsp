 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>welcome cts</h1>
<%String str=request.getParameter("userid");%>
<%out.print(str);%>
<%out.print(new Boolean(str.equals("saur")));%>
<br>
<br>
<%!int x=5;%>
<%=x%>
<br>
<%String comp=application.getInitParameter("company");%>
<%out.print(comp);%>

<%out.print(session.getAttribute("year"));%>
<jsp:useBean id="b1" class="com.model.Book" scope="session"></jsp:useBean>
<jsp:setProperty name="b1" property="id" value="123"/>
<jsp:setProperty name="b1" property="price" value="1000"/>
<jsp:setProperty name="b1" property="title" value="MEMS"/>
<jsp:setProperty name="b1" property="author" value="ShivajiTyagi"/>
<br>
Details Are : <jsp:getProperty name="b1" property="id"/><br>
 <jsp:getProperty name="b1" property="price"/><br>
  <jsp:getProperty name="b1" property="title"/><br>
   <jsp:getProperty name="b1" property="author"/><br>
  
<c:out value="${'welcome to jstl'}"/>
<c:set var="balance" scope="session" value="${35000*2}"/>
<c:if test="${balance>10000}"/>
<p>your decent salary is :<c:out value="${balance}"/>
<c:choose>
<c:when test="${balance<=1000}">
  You are closer to lower limit
  </c:when>
</c:choose>
</body>
</html>