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
 * 
 * @author BHASKAR
 *
 */

public class UserAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		
		UserService userService = new UserServiceImpl();
			 User user=new User();
			 PersonalDetail personalDetail=new PersonalDetail();
			 String name = request.getParameter("Name");
			 String pass = request.getParameter("Password");
			 personalDetail.setName("Hello "+name);
			 user.setPersonalDetail(personalDetail);;
			boolean flag =userService.createUser(user);
			
			if(flag){
				request.setAttribute("user", user);
				request.getRequestDispatcher("success.jsp").forward(request, response);
				//response.sendRedirect("success.jsp?user="+user); 
			}
	
	}

}
