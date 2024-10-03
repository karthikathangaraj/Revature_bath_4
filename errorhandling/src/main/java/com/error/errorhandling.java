package com.error;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class errorhandling extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{	
		
		res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        try
        {
		int numerator=Integer.parseInt(req.getParameter("num1"));
		int denominator=Integer.parseInt(req.getParameter("num2"));
		int res1=numerator/denominator;
		out.println("<h1>RESULT:  </h1>" +res1);
        }catch(ArithmeticException e) {
        	out.println("<h1>Error:arithmatic Exception </h1>");
        }catch (NumberFormatException e) {
            // Handle invalid number format
            out.println("<h1>Error: Please enter valid integers.</h1>");
        } catch (Exception e) {
            // Handle any other exceptions
            out.println("<h1>Error: An unexpected error occurred.</h1>");
        } finally {
            out.close();
        }
        }

}
