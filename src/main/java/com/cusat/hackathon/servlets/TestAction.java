package com.cusat.hackathon.servlets;

import java.io.IOException;
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
import com.cusat.hackathon.services.UserService;
import com.cusat.hackathon.services.UserServiceImpl;

/**
 * Servlet implementation class TestAction
 */
public class TestAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*PrintWriter pw= response.getWriter();
		 Gson gson = new Gson();*/
		
		String op1="";
		String op2="";
		String op3="";
		String op4="";
		String op5="";
		
		int iPageNo=0;
		int lPageNo=5;
		int size=lPageNo-iPageNo;
		
		if(null != request.getParameter("iPageNo")){
			iPageNo =Integer.parseInt(request.getParameter("iPageNo"));
			lPageNo= Integer.parseInt(request.getParameter("lPageNo"));
			op1=request.getParameter("q"+(iPageNo+1));
			op2=request.getParameter("q"+(iPageNo+2));
			op3=request.getParameter("q"+(iPageNo+3));
			op4=request.getParameter("q"+(iPageNo+4));
			op5=request.getParameter("q"+(iPageNo+5));
			iPageNo+=size;
			lPageNo+=size;
		}
		if(lPageNo>80){
			String result="abc";
			request.setAttribute("result", result); 
			request.getRequestDispatcher("result.jsp").forward(request, response);
		}
		HttpSession session = request.getSession(true);
		User currentUser=(User) session.getAttribute("user");
		String email=currentUser.getPersonalDetail().getEmailId();
		QuestionService questionService=new QuestionServiceImpl();
		List<Question> questions=null;
		
		questions =(null!=questions)?questions.subList(iPageNo, lPageNo):questionService.getQuestionById(email).subList(iPageNo, lPageNo);
		
		
		int a1=getAnswer(questions.get(0),op1)+getAnswer(questions.get(1),op2)+getAnswer(questions.get(2),op3)+getAnswer(questions.get(3),op4)+getAnswer(questions.get(4),op5);
		if(null != request.getParameter("iPageNo")){
			String sectorCode=request.getParameter("sectorCode");
				UserService service= new UserServiceImpl();
				service.saveUserScore(currentUser, 
										currentUser.getPersonalDetail().getEmailId(),sectorCode, a1);
				
		}
		request.setAttribute("questions", questions);
		request.setAttribute("iPageNo", iPageNo); 
		request.setAttribute("lPageNo", lPageNo); 
		request.getRequestDispatcher("test_page2.jsp").forward(request, response);

	}
	
	private int getAnswer(Question question, String opt){
		
		return question.getAnswer().equals(opt)?1:0;
		
	}

}
