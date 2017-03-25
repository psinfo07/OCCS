package com.cusat.hackathon.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaveQualificationform1
 */
public class SaveQualificationform1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request,HELLO HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw= response.getWriter();
		String resProgramme =request.getParameter("resProgramme");
		String resInstitute =request.getParameter("resInstitute");
		String resDuration =request.getParameter("resDuration");
		String resYear =request.getParameter("resYear");
		Double resMarks =Double.parseDouble(request.getParameter("resMarks"));
		String resCgpa=request.getParameter("resCgpa");
		
		String pgProgramme =request.getParameter("pgProgramme");
		String pgInstitute =request.getParameter("pgInstitute");
		String pgDuration =request.getParameter("pgDuration");
		String pgYear =request.getParameter("pgYear");
		Double pgMarks =Double.parseDouble(request.getParameter("pgMarks"));
		String pgCgpa=request.getParameter("pgCgpa");
		
		
			pw.print("SUCCESS");
			
		
	}

}
