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
public class CreateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean flag = false;
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		//String cpassword = request.getParameter("cpassword");
		String hqualification = request.getParameter("hqualification");
		User user = new User();
		PersonalDetail pd= new PersonalDetail();
		pd.setEmailId(email);
		pd.setName(name);
		pd.setPassword(password);
		pd.setHqualification(hqualification);
		user.setPersonalDetail(pd);
		UserService userService = new UserServiceImpl();
		 flag = userService.createUser(user);
		 if(flag){
			    request.setAttribute("key", "Registered Successfully !!! Login to Continue..."); 
				request.getRequestDispatcher("index.jsp").forward(request, response);
		 }
		 else {
			 request.setAttribute("key", "User already exists !!!"); 
				request.getRequestDispatcher("index.jsp").forward(request, response);
		 }
		 
	}

}
