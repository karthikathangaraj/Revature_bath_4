<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--
DIRECTIVES
@page : import lib of java 
@include: jsp file
@taglab :external jar 
 --%>
 
 
 <%--  
 
 SYNTAX :
 <%@ page attribute="" value="">
 <%@ include ="" {Header,Footer} %>
 
  --%>
 <%@ page import ="java.util.*" %>
 <%@ page import="java.lang.*" %>
<%@ include file="header.jsp" %>

 <div>
 
 <p>TODAY:<%= new Date() %></p>
 <%
 String name="karthika Thangaraj";
 String upp=name.toUpperCase();
 %>
 <%=  name  %>
 </div>
 
 
 
 
 <%@ include file="Footer.jsp" %>
</body>
</html>