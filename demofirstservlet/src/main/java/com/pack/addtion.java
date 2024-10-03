package com.pack;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class addtion extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		PrintWriter out =res.getWriter(); 
		int a=Integer.parseInt(req.getParameter("n1"));
		int b=Integer.parseInt(req.getParameter("n2"));
		int ans=a+b;
		System.out.println(ans);
		out.println("answer Is :" + ans);
	}

}
