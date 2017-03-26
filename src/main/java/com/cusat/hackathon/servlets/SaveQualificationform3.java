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

/**
 * Servlet implementation class SaveQualificationform3
 */
public class SaveQualificationform3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw= response.getWriter();
		
		HttpSession session = request.getSession(true);
		User currentUser=(User) session.getAttribute("user");
		String email=currentUser.getPersonalDetail().getEmailId();
		User user =new User();
		EduDetail eduOther=new EduDetail();
		String otherProgramme =request.getParameter("otherProgramme");
		String otherInstitute=request.getParameter("otherInstitute");
		String otherDuration=request.getParameter("otherDuration");
		String otherYear=request.getParameter("otherYear");
		String otherMarks1=request.getParameter("otherMarks");
		float otherMarks=Float.parseFloat(otherMarks1);
		String otherCgpa=request.getParameter("otherCgpa");
		
		eduOther.setUserid(email);
		eduOther.setProgram(otherProgramme);
		eduOther.setInstitute(otherInstitute);
		eduOther.setDuration(otherDuration);
		eduOther.setPyear(otherYear);
		eduOther.setMarks(otherMarks);
		eduOther.setCgpa(otherCgpa);
		
		
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
		eduDetails.add(eduOther);
		user.setEduDetail(eduDetails); 
		
		UserService userService = new UserServiceImpl();
		boolean flag=userService.saveEduDetails3(user);
		if(flag){
			pw.print("SUCCESS");
		}else{
			pw.print("ERROR");
		}
		
			
	}

}
