package com.javatrainig.j2ee.jsp.servlets;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javatrainig.j2ee.jsp.pojo.User;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet(urlPatterns={"/register"})
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public static Map<String, User> database = new HashMap<>();
	public List<User> db = new Vector<>();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet is initialized");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("Servlet is destoyed");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("RegistrationServlet.doGet()");
		request.setAttribute("test", "testing forward method");
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/register.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username,password,firstname,lastname;
		username = request.getParameter("username");
		password = request.getParameter("password");
		firstname = request.getParameter("firstname");
		lastname = request.getParameter("lastname");
		if(null==username || null==password || null==firstname|| null==lastname 
				|| "".equals(username.trim()) || "".equals(password.trim()) || "".equals(firstname.trim()) || "".equals(lastname.trim())){
			request.setAttribute("validationErrors", true);
			request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
			return;
		}
		if(database.containsKey(username)){
			request.setAttribute("userExists", true);
			request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
			return;
		}
		/*boolean userExists = false;
		for(User u : db){
			if(u.getUserId().equals(username))
				userExists = true;
		}*/
		
		User user = new User();
		user.setFirstName(firstname);
		user.setLastName(lastname);
		user.setUserId(username);
		user.setPassword(password);
		
		synchronized (this) {
			database.put(username, user);
		}
		request.setAttribute("from", "registrationServlet");
		
		request.setAttribute("user", user);
		HttpSession session = request.getSession();
		session.setAttribute("accounts", user.getAccounts());
		request.getSession().setAttribute("user", user);
		request.getRequestDispatcher("/WEB-INF/welcome.jsp").forward(request, response);
	}

}
