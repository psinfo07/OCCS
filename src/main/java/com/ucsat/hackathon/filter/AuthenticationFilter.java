package com.ucsat.hackathon.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class AuthenticationFilter
 */
public class AuthenticationFilter implements Filter {


	private ServletContext context;
	
	public void init(FilterConfig fConfig) throws ServletException {
		this.context = fConfig.getServletContext();
		this.context.log("AuthenticationFilter initialized");
	}
	
	
    public AuthenticationFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	HttpServletRequest req = (HttpServletRequest) request;
	HttpServletResponse res = (HttpServletResponse) response;
	
	String uri = req.getRequestURI();
	this.context.log("Requested Resource::"+uri);
	
	HttpSession session = req.getSession(false);
	/*
	if(404==res.getStatus()){
		res.sendRedirect("404.jsp");
	}*/
	
	if(session == null && !(uri.endsWith("jsp") || uri.endsWith("user_login"))){
		this.context.log("Unauthorized access request");
		res.sendRedirect("index.jsp");
	}else{
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}
	
	
}



}
