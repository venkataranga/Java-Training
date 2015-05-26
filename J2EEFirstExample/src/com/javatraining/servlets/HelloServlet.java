package com.javatraining.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String welcomeUser = "Hello, "+req.getParameter("yourname");
		resp.setContentType("text/html;UTF-8");
		PrintWriter out = resp.getWriter();
		out.println(welcomeUser+" Welcome to J2EE Training");
		out.println("<form action=\"welcome\" method=\"POST\">");
		out.print("Enter Your Name: <input type=\"text\" name=\"yourname\"><br/>");
		out.println("<input type=\"submit\" value=\"Submit\">");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}
}
