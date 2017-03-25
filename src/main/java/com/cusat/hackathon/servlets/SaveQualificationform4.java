package com.cusat.hackathon.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaveQualificationform4
 */
public class SaveQualificationform4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw= response.getWriter();
		
		String subject1 =request.getParameter("subject1");
		String duration1=request.getParameter("duration1");
		String subject2 =request.getParameter("subject2");
		String duration2=request.getParameter("duration2");
		String subject3=request.getParameter("subject3");
		String duration3=request.getParameter("duration3");
		String subject4=request.getParameter("subject4");
		String duration4=request.getParameter("duration4");
		
		String foi1=request.getParameter("foi1");
		String foi2=request.getParameter("foi2");
		String foi3=request.getParameter("foi3");
		String foi4=request.getParameter("foi4");
			pw.print("SUCCESS");
			
			pw.print(duration4);
			pw.print(subject2);
			pw.print( foi1);
			
			
	}

}
