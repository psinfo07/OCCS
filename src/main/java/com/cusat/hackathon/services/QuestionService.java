package com.cusat.hackathon.services;

import java.util.List;

import com.cusat.hackathon.model.Question;

public interface QuestionService {//Question services
	List<Question> getQuestionById(String userid);
}
