package com.cusat.hackathon.services;

import java.util.List;

import com.cusat.hackathon.dao.QuestionDao;
import com.cusat.hackathon.model.Question;

public class QuestionServiceImpl implements QuestionService{
	QuestionDao questionDao=new QuestionDao();
	/**
	 * 
	 */
	public List<Question> getQuestionById() {
		return questionDao.getQuestionById();
	}

}
