package com.cusat.hackathon.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cusat.hackathon.model.Result;
import com.cusat.hackathon.model.User;
import com.cusat.hackathon.services.ResultService;
import com.cusat.hackathon.services.ResultServiceImpl;


public class ResultAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		PrintWriter pw=response.getWriter();
		Result result=new Result();
		User user = new User();
		ResultService resultService= new ResultServiceImpl();
		result = resultService.fetchResult(user);
		int scoreFoi1=result.getScoreFoi1();
		int scoreFoi2=result.getScoreFoi2();
		int scoreFoi3=result.getScoreFoi3();
		int scoreFoi4=result.getScoreFoi4();
		pw.write(String.valueOf(scoreFoi1));
		
	}

}
