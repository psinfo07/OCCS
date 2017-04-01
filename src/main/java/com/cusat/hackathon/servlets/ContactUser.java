package com.cusat.hackathon.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cusat.hackathon.model.PersonalDetail;
import com.cusat.hackathon.model.User;
import com.cusat.hackathon.services.UserService;
import com.cusat.hackathon.services.UserServiceImpl;

/**
 * Servlet implementation class ContactUser
 */
public class ContactUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		UserService userService = new UserServiceImpl();
		 String name = request.getParameter("name");
		 String email = request.getParameter("email");
		 String subject = request.getParameter("subject");
		 String message = request.getParameter("message");
		boolean flag =userService.saveContact( name,email,subject,message);
		
		if(flag){
			//request.setAttribute("user", user);
			//request.getRequestDispatcher("success.jsp").forward(request, response);
			response.sendRedirect("success.jsp?user="+"Thank you We will contact you soon.."); 
		}
	}

}
