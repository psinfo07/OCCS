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
 * Servlet implementation class SaveQualificationform1 updated
 */
public class SaveQualificationform1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request,HELLO HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession(true);
		User currentUser=(User) session.getAttribute("user");
		String email=currentUser.getPersonalDetail().getEmailId();
		User user =new User();
		EduDetail research=new EduDetail();
		EduDetail pg=new EduDetail();
		String resProgramme =request.getParameter("resProgramme");
		String resInstitute =request.getParameter("resInstitute");
		String resDuration =request.getParameter("resDuration");
		String resYear =request.getParameter("resYear");
		float resMarks =Float.parseFloat(request.getParameter("resMarks"));
		String resCgpa=request.getParameter("resCgpa");
		
		research.setUserid(email);
		research.setProgram(resProgramme);
		research.setInstitute(resInstitute);
		research.setDuration(resDuration);
		research.setPyear(resYear);
		research.setMarks(resMarks);
		research.setCgpa(resCgpa);
		
		String pgProgramme =request.getParameter("pgProgramme");
		String pgInstitute =request.getParameter("pgInstitute");
		String pgDuration =request.getParameter("pgDuration");
		String pgYear =request.getParameter("pgYear");
		float pgMarks =Float.parseFloat(request.getParameter("pgMarks"));
		String pgCgpa=request.getParameter("pgCgpa");
		pg.setUserid(email);
		pg.setProgram(pgProgramme);
		pg.setInstitute(pgInstitute);
		pg.setDuration(pgDuration);
		pg.setPyear(pgYear);
		pg.setMarks(pgMarks);
		pg.setCgpa(pgCgpa);
		
		Set<EduDetail> eduDetails =new HashSet<EduDetail>();
		eduDetails.add(research);
		eduDetails.add(pg);
		user.setEduDetail(eduDetails); 
		
		UserService userService = new UserServiceImpl();
		boolean flag=userService.saveEduDetails1(user);
		if(flag){
			pw.print("SUCCESS");
		}else{
			pw.print("ERROR");
		}
		
	}

}
