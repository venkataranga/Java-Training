package com.javatrainig.j2ee.jsp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javatrainig.j2ee.jsp.pojo.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public String someVar;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(null==username || null==password ||
				 "".equals(username.trim()) || "".equals(password.trim())){
			request.setAttribute("validationErrors", true);
			request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
			return;
		}
		if(!RegistrationServlet.database.containsKey(username)){
			request.setAttribute("userNotExists", true);
			request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
			return;
		}
		if(! password.equals(RegistrationServlet.database.get(username).getPassword())){
			request.setAttribute("invalidCredentials", true);
			request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
			return;
		}
		request.changeSessionId();
		User user = RegistrationServlet.database.get(username);
		request.getSession().setAttribute("accounts", user.getAccounts());
		request.getSession().setAttribute("user", user);
		request.setAttribute("from", "loginServlet");
		request.setAttribute("user", user);
		request.getRequestDispatcher("/WEB-INF/welcome.jsp").forward(request, response);
	}

}
