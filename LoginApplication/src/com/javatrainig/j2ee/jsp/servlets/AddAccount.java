package com.javatrainig.j2ee.jsp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javatrainig.j2ee.jsp.pojo.Account;
import com.javatrainig.j2ee.jsp.pojo.User;

/**
 * Servlet implementation class AddAccount
 */
@WebServlet("/addAccount")
public class AddAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public AddAccount(){
		super();
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getSession().getAttribute("accounts")==null){
			response.sendRedirect("login");
		}else{
			request.getRequestDispatcher("/WEB-INF/addAccount.jsp").forward(request, response);
		}
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getSession().getAttribute("accounts")==null){
			response.sendRedirect("login");
		}
		if(request.getParameter("accountName")==null || request.getParameter("accountType")==null ||request.getParameter("balance")==null){
			request.getRequestDispatcher("/WEB-INF/addAccount.jsp").forward(request, response);
		}
		Account a = new Account();
		a.setAccName(request.getParameter("accountName"));
		a.setAccType(request.getParameter("accountType"));
		a.setBalance(Integer.parseInt(request.getParameter("balance")));
		User u = (User)request.getSession().getAttribute("user");
		u.addAccount(a);
		request.getRequestDispatcher("/WEB-INF/viewAccounts.jsp").forward(request, response);
	}

}
