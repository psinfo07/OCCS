package com.cusat.hackathon.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cusat.hackathon.model.Question;
import com.cusat.hackathon.services.QuestionService;
import com.cusat.hackathon.services.QuestionServiceImpl;

/**
 * Servlet implementation class TestAction
 */
public class TestAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
  		PrintWriter pw= response.getWriter();
		QuestionService questionService=new QuestionServiceImpl();
		List<Question> questions =questionService.getQuestionById();
		
		pw.print(questions);

	}

}
