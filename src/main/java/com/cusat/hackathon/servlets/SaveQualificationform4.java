package com.cusat.hackathon.servlets;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cusat.hackathon.model.Certification;
import com.cusat.hackathon.model.FieldOfInterest;
import com.cusat.hackathon.model.User;
import com.cusat.hackathon.services.UserService;
import com.cusat.hackathon.services.UserServiceImpl;

/**
 * Servlet implementation class SaveQualificationform4
 */
public class SaveQualificationform4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		User currentUser=(User) session.getAttribute("user");
		String email=currentUser.getPersonalDetail().getEmailId();
		User user = new User();
		String subject1 =request.getParameter("subject1");
		String duration1=request.getParameter("duration1");
		String subject2 =request.getParameter("subject2");
		String duration2=request.getParameter("duration2");
		String subject3=request.getParameter("subject3");
		String duration3=request.getParameter("duration3");
		String subject4=request.getParameter("subject4");
		String duration4=request.getParameter("duration4");
		
		Certification c1 = new Certification();
		Certification c2 = new Certification();
		Certification c3 = new Certification();
		Certification c4 = new Certification();
		
		c1.setUserid(email);
	    c1.setDuration(duration1);
	    c1.setFoc(subject1);
	    
	    c2.setUserid(email);
	    c2.setDuration(duration2);
	    c2.setFoc(subject2);
	    
	    c3.setUserid(email);
	    c3.setDuration(duration3);
	    c3.setFoc(subject3);
	    
	    c4.setUserid(email);
	    c4.setDuration(duration4);
	    c4.setFoc(subject4);
	    
	     
	     Set<Certification> certifications=new HashSet<Certification>();
	     certifications.add(c1);
	     certifications.add(c2);
	     certifications.add(c3);
	     certifications.add(c4);
	     user.setCirtifications(certifications);
	     
	     String foi1=request.getParameter("foi1");
		 String foi2=request.getParameter("foi2");
		 String foi3=request.getParameter("foi3");
		 String foi4=request.getParameter("foi4");
		 FieldOfInterest f1 = new FieldOfInterest();
		 f1.setUserId(email);
		 f1.setfOInterest1(foi1);
		 f1.setfOInterest2(foi2);
		 f1.setfOInterest3(foi3);
		 f1.setfOInterest4(foi4);
		 user.setFieldOfInterest(f1);
	    UserService userService=new UserServiceImpl();
	    boolean flag1=userService.saveQualificationform4(user);
	    if(flag1){
			request.setAttribute("key", "Details Updated successfully"); 
			request.getRequestDispatcher("login_home.jsp").forward(request, response);
		}
	}
}
