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
 * @author PRAKASH
 *
 */
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		User user =new User();
		PersonalDetail pd = new PersonalDetail();
		pd.setEmailId(email);
		pd.setPassword(password);
		user.setPersonalDetail(pd); 
		UserService userService= new UserServiceImpl();
		user = userService.userLogin(user);
		request.setAttribute("user", user);
		if(null!=user){
			request.getRequestDispatcher("login_home.jsp").forward(request, response);
		}else{
			request.setAttribute("key", "Invalid UserName/Password !!!"); 
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	
	}

}
