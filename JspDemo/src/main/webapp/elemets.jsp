<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.util.Date" %>
<%
int num=10;
out.println("number:" + num);
%>
<br>
<%!
int c=10;
public int getc()
{
	return c++;
}
%>
<%= getc()%><br>
<%=  new Date()  %>



</body>
</html>