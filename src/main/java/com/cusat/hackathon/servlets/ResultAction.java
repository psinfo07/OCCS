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
 * @author PRAKASH
 *
 */
public class ResultAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * 
	 */
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
		
		String lSub1=result.getSub1();
		String lSub2=result.getSub2();
		String lSub3=result.getSub3();
		String lSub4=result.getSub4();
		
		request.setAttribute("lSub1",lSub1);
		request.setAttribute("lSub2",lSub2);
		request.setAttribute("lSub3",lSub3);
		request.setAttribute("lSub4",lSub4);
				
		String collegeNames = result.getCollegeNames();
		request.setAttribute("collegeNames",collegeNames);
		request.setAttribute("maxMarks",result.getMaxMarks());
		//request.setAttribute(, o);
		request.getRequestDispatcher("login_home.jsp").forward(request, response);
		
		//pw.write(String.valueOf(scoreFoi1));
		
		
		
	}

}
