package com.javatraining.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet(urlPatterns={"/*","/hello"},
//			initParams ={@WebInitParam(name = "", value = "")})

public class HelloServlet extends HttpServlet {

	int i =10;
	@Override
	public void init() throws ServletException {
		System.out.println("Servlet Created");
	}
	
	public HelloServlet() {
		System.out.println("From Constructor");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println(this.getInitParameter("database"));
		System.out.println(req.getServletContext().getInitParameter("context"));
		String welcomeUser = "Hello, "+req.getParameter("yourname");
		resp.setContentType("text/html;UTF-8");
		PrintWriter out = resp.getWriter();
		out.println(welcomeUser+" Welcome to J2EE Training");
		out.println("<form action=\"welcome\" method=\"POST\">");
		out.print("Enter Your Name: <input type=\"text\" name=\"yourname\"><br/>");
		out.println("<input type=\"submit\" value=\"Submit\">");
		synchronized (this) {
			i =20;
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}
	
	@Override
	public void destroy() {
		System.out.println("Servlet destroyed");
	}
	
}
