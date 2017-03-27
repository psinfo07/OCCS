package com.cusat.hackathon.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cusat.hackathon.model.Question;
import com.cusat.hackathon.model.User;
import com.cusat.hackathon.services.QuestionService;
import com.cusat.hackathon.services.QuestionServiceImpl;
import com.google.gson.Gson;

/**
 * Servlet implementation class TestAction
 */
public class TestAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw= response.getWriter();
		 Gson gson = new Gson();
		HttpSession session = request.getSession(true);
		User currentUser=(User) session.getAttribute("user");
		String email=currentUser.getPersonalDetail().getEmailId();
		//User user =new User();
		QuestionService questionService=new QuestionServiceImpl();
		List<Question> questions =questionService.getQuestionById(email);
		
		String questionsJson = gson.toJson(questions);
		
		pw.print(questionsJson);

	}

}
