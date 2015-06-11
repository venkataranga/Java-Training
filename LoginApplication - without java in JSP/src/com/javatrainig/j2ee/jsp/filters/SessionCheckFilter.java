package com.javatrainig.j2ee.jsp.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class SessionCheckFilter
 */

public class SessionCheckFilter implements Filter {

    /**
     * Default constructor. 
     */
    public SessionCheckFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("Filter Destroyed");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("SessionCheckFilter.doFilter()");
		
		if(request instanceof HttpServletRequest){
			if(null==((HttpServletRequest)request).getSession().getAttribute("user")){
				System.out.println("From session filter: user not logged in");
				((HttpServletResponse)response).sendRedirect("login");
				return;
			}
		}
		chain.doFilter(request, response);
		System.out.println("returning from session filter");
	}	

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("Filter Initialized");
	}

}
