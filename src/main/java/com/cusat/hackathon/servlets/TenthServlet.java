package com.cusat.hackathon.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cusat.hackathon.model.EduDetail;
import com.cusat.hackathon.model.User;
import com.cusat.hackathon.services.UserService;
import com.cusat.hackathon.services.UserServiceImpl;
public class TenthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter pw= response.getWriter();
		
		HttpSession session = request.getSession(true);
		User currentUser=(User) session.getAttribute("user");
		String email=currentUser.getPersonalDetail().getEmailId();
		User user =new User();
		
		EduDetail eduTen=new EduDetail();
		
		String tenProgramme =request.getParameter("tenProgramme");
		String tenInstitute=request.getParameter("tenInstitute");
		String tenDuration=request.getParameter("tenDuration");
		String tenYear=request.getParameter("tenYear");
		String tenMarks1=request.getParameter("tenMarks");
		float tenMarks=Float.parseFloat(tenMarks1);
		String tenCgpa=request.getParameter("tenCgpa");
		
		eduTen.setUserid(email);
		eduTen.setProgram(tenProgramme);
		eduTen.setInstitute(tenInstitute);
		eduTen.setDuration(tenDuration);
		eduTen.setPyear(tenYear);
		eduTen.setMarks(tenMarks);
		eduTen.setCgpa(tenCgpa);			
		
		Set<EduDetail> eduDetails =new HashSet<EduDetail>();
		eduDetails.add(eduTen);
		user.setEduDetail(eduDetails); 
		
		UserService userService = new UserServiceImpl();
		boolean flag=userService.saveTenthDetail(user);
		if(flag){
			response.sendRedirect("login_home.jsp");
		}else{
			pw.print("ERROR");
		}
		
			

	}

}
