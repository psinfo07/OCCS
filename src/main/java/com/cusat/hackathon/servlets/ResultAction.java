package com.cusat.hackathon.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cusat.hackathon.model.Result;
import com.cusat.hackathon.model.User;
import com.cusat.hackathon.services.ResultService;
import com.cusat.hackathon.services.ResultServiceImpl;

/**
 * 
 * @author Raju
 *
 */
public class ResultAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		PrintWriter pw=response.getWriter();
		Result result=new Result();
		HttpSession session = request.getSession(true);
		User currentUser=(User) session.getAttribute("user");
		ResultService resultService= new ResultServiceImpl();
		result = resultService.fetchResult(currentUser);
		int scoreFoi1=result.getScoreFoi1();
		int scoreFoi2=result.getScoreFoi2();
		int scoreFoi3=result.getScoreFoi3();
		int scoreFoi4=result.getScoreFoi4();
		
		request.setAttribute("scoreFoi1", scoreFoi1);
		request.setAttribute("scoreFoi2", scoreFoi2); 
		request.setAttribute("scoreFoi3", scoreFoi3); 
		request.setAttribute("scoreFoi4", scoreFoi4); 
		request.getRequestDispatcher("login_home.jsp").forward(request, response);
		//pw.write(String.valueOf(scoreFoi1));
		
	}

}
