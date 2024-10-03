<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ page import="java.sql.*" %>
<body>

<%

String url="jdbc:mysql://localhost:3306/college";
String username="root";
String password="root";
Connection con=null;
Statement stm=null;
ResultSet rs=null;
try
{

	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection(url,username,password);
	stm=con.createStatement();
	String qry="select * from employee_details;";
	 rs=stm.executeQuery(qry);
	out.println("<table border='1'><tr><th>ID</th><th>Username</th><th>Email</th></tr>");
    while (rs.next()) {
        out.println("<tr><td>" + rs.getInt("id") + "</td><td>" + rs.getString("first_name") + "</td><td>" + rs.getString("last_name") + "</td></tr>");
    }
    out.println("</table>");
} catch (Exception e) {
    e.printStackTrace();
} finally {
    if (rs != null) try { rs.close(); } catch (SQLException ignore) {}
    if (stm != null) try { stm.close(); } catch (SQLException ignore) {}
    if (con != null) try { con.close(); } catch (SQLException ignore) {}
}
%>

</body>
</html>