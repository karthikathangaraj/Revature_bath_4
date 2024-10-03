package com.disp;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class forward extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		
		String name =request.getParameter("name");
		request.setAttribute("name", name);
		RequestDispatcher rd=request.getRequestDispatcher("d1");
		rd.forward(request, response);
		
	}

}
