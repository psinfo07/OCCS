package com.cusat.hackathon.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		
		PrintWriter pw= response.getWriter();
		
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
			HttpSession session = request.getSession(true);
			session.setAttribute("user", user);
			pw.print("SUCCESS");
			
		}else{
			pw.print("FAILURE");
		}
		
	}

}
