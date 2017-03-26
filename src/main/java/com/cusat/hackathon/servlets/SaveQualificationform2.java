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
 * Servlet implementation class SaveQualificationform2
 */
public class SaveQualificationform2 extends HttpServlet {
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
		EduDetail grad=new EduDetail();
		EduDetail inter=new EduDetail();
		String gProgramme =request.getParameter("gProgramme");
		String gInstitute =request.getParameter("gInstitute");
		String gDuration =request.getParameter("gDuration");
		String gYear =request.getParameter("gYear");
		float gMarks =Float.parseFloat(request.getParameter("gMarks"));
		String gCgpa =request.getParameter("gCgpa");
		
		grad.setUserid(email);
		grad.setProgram(gProgramme);
		grad.setInstitute(gInstitute);
		grad.setPyear(gYear);
		grad.setDuration(gDuration);
		grad.setMarks(gMarks);
		grad.setCgpa(gCgpa);
		
		String interProgramme =request.getParameter("interProgramme");
		String interInstitute =request.getParameter("interInstitute");
		String interDuration =request.getParameter("interDuration");
		String interYear =request.getParameter("interYear");
		float interMarks =Float.parseFloat(request.getParameter("interMarks"));
		String interCgpa =request.getParameter("interCgpa");
		
		
		inter.setUserid(email);
		inter.setProgram(interProgramme);
		inter.setDuration(interDuration);
		inter.setInstitute(interInstitute);
		inter.setPyear(interYear);
		inter.setMarks(interMarks);;
		inter.setCgpa(interCgpa);
		
		Set<EduDetail> eduDetails =new HashSet<EduDetail>();
		eduDetails.add(grad);
		eduDetails.add(inter);
		user.setEduDetail(eduDetails); 
		
		UserService userService = new UserServiceImpl();
		boolean flag=userService.saveEduDetails2(user);
		if(flag){
			pw.print("SUCCESS");
		}else{
			pw.print("ERROR");
		}
		
	}

}
