package com.example;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class getpostmethods  extends HttpServlet{
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		response.setContentType("text/html");
		response.getWriter().println("<html><body>");
		response.getWriter().println("<h1> GET REQUEST DATA</h1>");
		response.getWriter().println("<p> NAME:"+name+"</p>");
		response.getWriter().println("<p> email:"+email+"</p>");
		response.getWriter().println("</body></html>");
		
	}
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        // Retrieve form data sent via POST (from request body)
//        String name = request.getParameter("name");
//        String email = request.getParameter("email");
//
//        // Set the response content type
//        response.setContentType("text/html");
//
//        // Send a simple HTML response
//        response.getWriter().println("<html><body>");
//        response.getWriter().println("<h1>POST Request Received</h1>");
//        response.getWriter().println("<p>Name: " + name + "</p>");
//        response.getWriter().println("<p>Email: " + email + "</p>");
//        response.getWriter().println("</body></html>");
//
//}
}