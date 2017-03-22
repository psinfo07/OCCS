package com.cusat.hackathon.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * 
 * @author lenovo
 *
 */
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 response.setContentType("text/html");  
		 request.setAttribute("key","You are logged out successfully !!!"); 
         request.getRequestDispatcher("index.jsp").include(request, response);  
         HttpSession session=request.getSession();  
        
         if(session != null){
        	 session.removeAttribute("user");
             session.invalidate();
         }  
         
	}

}
