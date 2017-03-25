package com.cusat.hackathon.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		String gProgramme =request.getParameter("gProgramme");
		String gInstitute =request.getParameter("gInstitute");
		String gDuration =request.getParameter("gDuration");
		String gYear =request.getParameter("gYear");
		Double gMarks =Double.parseDouble(request.getParameter("gMarks"));
		String gCgpa =request.getParameter("gCgpa");
		
		String interProgramme =request.getParameter("interProgramme");
		String interInstitute =request.getParameter("interInstitute");
		String interDuration =request.getParameter("interDuration");
		String interYear =request.getParameter("interYear");
		Double interMarks =Double.parseDouble(request.getParameter("interMarks"));
		String interCgpa =request.getParameter("interCgpa");

		pw.print(gCgpa);
		pw.print(gProgramme);
		pw.print(interProgramme);
		pw.print(interCgpa);

		pw.print("SUCCESS");
		
	}

}
